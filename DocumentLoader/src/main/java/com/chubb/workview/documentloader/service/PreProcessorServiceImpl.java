package com.chubb.workview.documentloader.service;

import com.chubb.workview.documentloader.bean.DocumentBean;
import com.chubb.workview.documentloader.dao.PreProcessorDAO;
import com.chubb.workview.documentloader.jaxb.iccxml.DocumentType;
import com.chubb.workview.documentloader.jaxb.iccxml.IndexType;
import com.chubb.workview.documentloader.jaxb.iccxml.ScannedImageType;
import com.chubb.workview.documentloader.main.ResourceLoader;
import com.chubb.workview.documentloader.utils.FileUtilities;
import com.chubb.workview.documentloader.service.DBConnectionError;
import com.chubb.workview.documentloader.service.ProcessingFailedException;

import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by sxgonn on 08/03/2016. This Class is the actual Implementation for
 * all Preprocessor service Tasks. This takes the Country_code as parameter to
 * determine the actual folder location
 */

public class PreProcessorServiceImpl implements IPreProcessorService {

	static final Logger LOG = Logger.getLogger(PreProcessorServiceImpl.class);
	static final String INPUT_SHARED_LOCATION = "input.folder.location";
	static final String ERROR_SHARED_LOCATION = "error.folder.location";
	static final String ICC_SHARED_LOCATION = "ICC.folder.location";
	static final String QUERY_CERTIFICATE = "certquery";
	static final String QUERY_POLICY = "polquery";
	static final String QUERY_TYPECODE = "filefolderdoctype";

	static final String FILE_CODE = "FILE_CODE";

	private ResourceLoader resources = ResourceLoader.getResources();

	public void initProcess(String countryCode) {
		LOG.info("Document Loader preProcessorServiceImpl : InitProcess() : Execution Started for Country - "
				+ countryCode);
		LOG.info("Document Loader preProcessorServiceImpl : InitProcess() : Checking for New Content");
		String fileName = "";
		try {
			String path = resources.getConnectionproperties().getProperty(INPUT_SHARED_LOCATION);
			if (!path.isEmpty()) {

				path = resources.getConnectionproperties().getProperty(INPUT_SHARED_LOCATION) + countryCode;
				List<Path> docPath = new ArrayList<Path>();
				File[] file1 = new File(path).listFiles();
				if (file1 != null) {
					try (Stream<Path> filePathStream = Files.walk(Paths.get(path))) {
						filePathStream.forEach(filePath -> {
							try {
								if (Files.isRegularFile(filePath) && (!Files.isHidden(filePath))) {
									docPath.add(filePath);
								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								LOG.error("check for hidden document failed"+ e);
							}
						});
					} catch (Exception e) {
						LOG.error("error while extracting files " + e);
					}

				} else {
					LOG.info("no documents available for country :" + countryCode);
				}

				LOG.info("Document Loader preProcessorServiceImpl : InitProcess() : " + docPath.size()
						+ " - New documents Found for Country - " + countryCode);
				for (Path documentPath : docPath) {

					DocumentBean documentBean = new DocumentBean();
					try {
						String[] country = countryCode.split("_");
						documentBean.setCountryName(country[1]);

						documentBean.setRandomNum(UUID.randomUUID().toString());
						LOG.debug(
								"Document Loader preProcessorServiceImpl : InitProcess():Entering the ProceessDocument Method ");
						fileName = documentPath.getFileName().toString();
						LOG.info("Process started for "+fileName);
						documentBean = this.processDocument(documentPath, documentBean, country);
						
						if (documentBean.getFilenumber() != null && documentBean.getValidDocumentName()) {
							if (!PreProcessorDAO.getDAOObject().insertDocDetais(documentBean)) {
								throw new ProcessingFailedException(
										"PreProcessorServiceImpl : InitProcess() : Error :Invalid document");
							}

							Boolean success = this.populateBean(documentBean);
							// Move document to destination folder

							if (success) {

								LOG.info(
										"Document Loader preProcessorServiceImpl :: InitProcess :: Processing for document - "
												+ documentPath.toString() + " is completed successfully.");
								if (!FileUtilities.fileMove(documentPath.toString(),
										resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION)
												+ documentBean.getCountryName() + File.separator
												+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
												+ documentBean.getFilenumber() + "-" + documentBean.getCountryName()
												+ "-" + documentBean.getRandomNum()
												+ documentPath.getFileName().toString().substring(
														documentPath.getFileName().toString().lastIndexOf(".")))) {
									LOG.warn(
											"Document Loader preProcessorServiceImpl :: InitProcess :: Unable to move document - "
													+ documentPath.toString() + "  to ICC destination Folder");
								} else {
									LOG.info(
											"Document Loader preProcessorServiceImpl :: InitProcess :: Moved document successfully to  ICC destination Folder.");
								}
							}
							// Move to Error Folder
							else {
								LOG.warn(
										"Document Loader preProcessorServiceImpl :: InitProcess :: Error occurred while creating and copying files to ICC. Moving the document - "
												+ documentPath.toString() + " to Error Folder");
								if (!FileUtilities.fileMove(documentPath.toString(),
										resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
												+ documentBean.getCountryName() + File.separator
												+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
												+ documentBean.getParentfilefolder() + File.separator
												//+ documentBean.getFiletypefolder() + File.separator
												//+documentBean.getFodlertypefolder()+File.separator
												//+ documentBean.getDocumenttypefolder() + File.separator 
												+ fileName)) {
									LOG.warn(
											"Document Loader preProcessorServiceImpl :: InitProcess :: Unable to move document -"
													+ documentPath.toString() + " to Error Folder");
								} else {
									LOG.info(
											"Document Loader preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze LOGs and retry    :   "
											+resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
											+ documentBean.getCountryName() + File.separator
											+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
											+ documentBean.getParentfilefolder() + File.separator
											//+ documentBean.getFiletypefolder() + File.separator
											//+documentBean.getFodlertypefolder()+File.separator
											//+ documentBean.getDocumenttypefolder() + File.separator 
											+ fileName);
								}
							}

						} else {

							if (!FileUtilities.fileMove(documentPath.toString(),
									resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
											+ documentBean.getCountryName() + File.separator
											+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
											+ documentBean.getParentfilefolder() + File.separator
											//+ documentBean.getFiletypefolder() + File.separator
											//+documentBean.getFodlertypefolder()+File.separator
											//+ documentBean.getDocumenttypefolder() + File.separator 
											+ fileName)) {
								LOG.warn(
										"Document Loader preProcessorServiceImpl :: InitProcess :: Unable to move document -"
												+ documentPath.toString() + " to Error Folder");
							} else {
								LOG.info(
										"Document Loader preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze LOGs and retry    :   "+resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
											+ documentBean.getCountryName() + File.separator
											+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
											+ documentBean.getParentfilefolder() + File.separator
											//+ documentBean.getFiletypefolder() + File.separator
											//+documentBean.getFodlertypefolder()+File.separator
											//+ documentBean.getDocumenttypefolder() + File.separator 
											+ fileName);
							}

						}

						// Catch all exceptions and swallow it, So that control
						// proceeds to next File.
					} catch (Exception | DBConnectionError e) {
						LOG.warn(e);

						LOG.info(
								"Document Loader preProcessorServiceImpl :: InitProcess :: Unhandled Error occurred while processing document. Skipping the document : "
										+ documentPath.toString());

						if (!FileUtilities.fileMove(documentPath.toString(),
								resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
										+ documentBean.getCountryName() + File.separator
										+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
										+ documentBean.getParentfilefolder() + File.separator
										+ documentBean.getFiletypefolder() + File.separator
										+documentBean.getFodlertypefolder()+File.separator
										+ documentBean.getDocumenttypefolder() + File.separator + fileName)) {
							LOG.warn(
									"Document Loader preProcessorServiceImpl :: InitProcess :: Unable to move document - "
											+ documentPath.toString() + " to Error Folder");
						} else {
							LOG.info(
									"Document Loader preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze logs and retry    :   "
											+resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
											+ documentBean.getCountryName() + File.separator
											+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
											+ documentBean.getParentfilefolder() + File.separator
											+ documentBean.getFiletypefolder() + File.separator
											+documentBean.getFodlertypefolder()+File.separator
											+ documentBean.getDocumenttypefolder() + File.separator + fileName);
						}

					}

					LOG.info("Completed processing documents for Country - " + countryCode);

				}
			} else {
				LOG.info("Input Shared folder Path is not specified in Connection.Propertie file");
			}

		} catch (

		Exception e) {
			LOG.fatal(
					"Document Loader preProcessorServiceImpl :: InitProcess :: Unhandled exception occurred in the program. Exiting execution for Country : "
							+ countryCode + ". Error : " + e.getMessage(),
					e);
		}
		
	}

	private DocumentBean processDocument(Path file, DocumentBean documentBean, String[] country) {

		String path = file.getParent().toString();
		String separator = "\\";
		String[] pathSplit = path.replaceAll(Pattern.quote(separator), "\\\\").split("\\\\");
		String fileName = file.getFileName().toString();
		String[] docInfo = fileName.split("-");
		String[] timeNext = docInfo[docInfo.length - 1].split("\\.");
		String[] filetype = pathSplit[pathSplit.length - 3].split("_");
		String[] foldertype = pathSplit[pathSplit.length - 2].split("_");
		String[] doctype = pathSplit[pathSplit.length - 1].split("_");
		
		try {
			documentBean.setFiletypefolder(pathSplit[pathSplit.length - 3]);
			documentBean.setFodlertypefolder(pathSplit[pathSplit.length - 2]);
			documentBean.setDocumenttypefolder(pathSplit[pathSplit.length - 1]);
			String[] parentType = pathSplit[pathSplit.length - 4].split("_");
			documentBean.setParentfilefolder(pathSplit[pathSplit.length - 4]);
			documentBean.setFileCode(filetype[0]);
			documentBean.setFtypCode(foldertype[0]);
			documentBean.setDoctypeCode(doctype[0]);
			documentBean.setCountryCode(country[0]);
			
			if (docInfo.length == 4) {
				documentBean.setValidDocumentName(true);
				documentBean.setDocDescription(docInfo[0].trim());
				if (timeNext[1] != null) {
					documentBean.setDocType("extension: " + timeNext[1]);
					documentBean.setDocDescription(docInfo[0]+"."+timeNext[1].trim());
				}
				documentBean.setDocName(fileName);
				documentBean.setTime(timeNext[0].trim());
				documentBean.setOtherref(generateOtherref());

				if (parentType[1].equalsIgnoreCase("Policy")) {
					documentBean.setParentFileType("1");
					documentBean.setPolNumber(docInfo[docInfo.length - 3].trim());
					documentBean.setFilenumber(documentBean.getPolNumber());
				} else {
					documentBean.setParentFileType("13");
					documentBean.setCertNumber(docInfo[docInfo.length - 3].trim());
					documentBean.setFilenumber(documentBean.getCertNumber());
				}
				//documentBean.setDate(docInfo[docInfo.length - 2].trim());
				
				documentBean.setDate(docInfo[docInfo.length - 2].trim().substring(4, 8)+docInfo[docInfo.length - 2].trim().substring(2, 4)+docInfo[docInfo.length - 2].trim().substring(0, 2));

				if (documentBean.getFilenumber() != null) {
					List<String> tmpList = new ArrayList<>();
					tmpList = this.getAppData(documentBean);

					if (!tmpList.isEmpty()) {
						if (tmpList.get(0) != null) {
							documentBean.setPolNumber(tmpList.get(0));

						}
						if (tmpList.get(1) != null) {
							documentBean.setEntityCode(tmpList.get(1));
						}
					} else {
						LOG.info("File not exist : " + documentBean.getFilenumber());
					}

				}

			}else if (docInfo.length==1 && (!fileName.isEmpty()) && (!"".equalsIgnoreCase(fileName))){
				String[] splitFilename=fileName.split("_");
				if(splitFilename.length==1){
					LOG.info("Document with filenumber.ext has received : "+fileName);
					documentBean.setValidDocumentName(true);
					documentBean.setDocDescription(fileName.trim());
					timeNext=fileName.split("\\.");
					if (timeNext[1] != null) {
						documentBean.setDocType("extension: " + timeNext[1]);
					}
					documentBean.setDocName(fileName);
					documentBean.setTime(null);
					documentBean.setOtherref(generateOtherref());
					
					if (parentType[1].equalsIgnoreCase("Policy")) {
						documentBean.setParentFileType("1");
						documentBean.setPolNumber(timeNext[0].trim());
						documentBean.setFilenumber(documentBean.getPolNumber());
					} else {
						documentBean.setParentFileType("13");
						documentBean.setCertNumber(timeNext[0].trim());
						documentBean.setFilenumber(documentBean.getCertNumber());
					}
					documentBean.setDate(null);
					//documentBean.setDocDate(null);
				}
				if(splitFilename.length==2){
					LOG.info("Document with filenumber_CONDate.ext has received : "+fileName);
					documentBean.setValidDocumentName(true);
					timeNext=splitFilename[1].split("\\.");
					if (timeNext[1] != null) {
						documentBean.setDocType("extension: " + timeNext[1].trim());
					}
					documentBean.setDocDescription(splitFilename[0]+"."+timeNext[1].trim());
					documentBean.setDocName(fileName.trim());
					documentBean.setTime(null);
					documentBean.setOtherref(generateOtherref());
					if(timeNext[0].substring(timeNext[0].length()-8, timeNext[0].length())!=null){
						documentBean.setDate(timeNext[0].substring(timeNext[0].length()-8, timeNext[0].length()));
						//documentBean.setDocDate(timeNext[0].substring(timeNext[0].length()-8, timeNext[0].length()));
					}
					
					if (parentType[1].equalsIgnoreCase("Policy")) {
						documentBean.setParentFileType("1");
						documentBean.setPolNumber(splitFilename[0]);
						documentBean.setFilenumber(documentBean.getPolNumber());
					} else {
						documentBean.setParentFileType("13");
						documentBean.setCertNumber(splitFilename[0]);
						documentBean.setFilenumber(documentBean.getCertNumber());
					}
					
				}
				
				if (documentBean.getFilenumber() != null) {
					List<String> tmpList = new ArrayList<>();
					tmpList = this.getAppData(documentBean);

					if (!tmpList.isEmpty()) {
						if (tmpList.get(0) != null) {
							documentBean.setPolNumber(tmpList.get(0));

						}
						if (tmpList.get(1) != null) {
							documentBean.setEntityCode(tmpList.get(1));
						}
					} else {
						LOG.info("File not exist : " + documentBean.getFilenumber());
					}

				}
				
				
			} else {
				/*
				 * String docname = ""; for (int i = 0; i <= docInfo.length - 4;
				 * i++) { docname = docname + docInfo[i] + " "; }
				 * documentBean.setDocDescription(docname);
				 */
				documentBean.setValidDocumentName(false);
			}

		} catch (Exception e) {
			LOG.error(" PreProcessorServiceImpl :: processDocument error while processing document bean" + e);
		} catch (DBConnectionError e) {
			// TODO Auto-generated catch block
			LOG.error("  PreProcessorServiceImpl :: processDocument error while check file number exist in DB : " + e);
		}
		return documentBean;
	}

	private String generateOtherref() {
		return FileUtilities.dateToString("ddMMyyyyss", new Date()) + ":" + String.valueOf(new Random().nextLong());

	}

	private Boolean populateBean(DocumentBean documentBean) throws ProcessingFailedException {

		String xml = "";
		ScannedImageType iccxml = new ScannedImageType();
		IndexType inx = new IndexType();
		DocumentType dib = new DocumentType();
		
		try {

			if ((resources.getConstantproperties().getProperty(
					documentBean.getCountryName() + "_" + documentBean.getDocType() + "_BPUCODE")) != null) {

				inx.setBpuCode(resources.getConstantproperties()
						.getProperty(documentBean.getCountryName() + "_" + documentBean.getDocType() + "_BPUCODE"));
			} else {
				inx.setBpuCode("");
			}
			inx.setCtryCode(documentBean.getCountryCode());
			if (documentBean.getParentFileType().equalsIgnoreCase("1")) {
				inx.setEntityType("POLICY");
				inx.setFileNumber(documentBean.getPolNumber());
			} else {
				inx.setEntityType("CERTIFICATE");
				inx.setFileNumber(documentBean.getCertNumber());
			}

			inx.setClNumber("");
			inx.setCertNumber(documentBean.getCertNumber());
			inx.setPolNumber(documentBean.getPolNumber());
			inx.setEntCode(documentBean.getEntityCode());
			inx.setIngestionMethod(resources.getConstantproperties().getProperty("INGESTION_METHOD"));
			dib.setFileName(documentBean.getDocName());
			dib.setOtherref(documentBean.getOtherref());
			dib.setScanInfo(resources.getConstantproperties().getProperty("SCAN_INFO"));
			dib.setScanop(resources.getConstantproperties().getProperty("SCAN_OP"));
			dib.setScantime(FileUtilities.dateToString("HH:mm:ss", new Date()));
			dib.setDocDescription(documentBean.getDocDescription());
			dib.setFileCode(documentBean.getFileCode());

			dib.setFtypCode(documentBean.getFtypCode());
			dib.setDocTypeCode(documentBean.getDoctypeCode());
			
			
			if(!(documentBean.getDate()==null)){
				dib.setDocdate(documentBean.getDate());
			}else{
				dib.setDocdate("");
			}
			dib.setScandate(FileUtilities.dateToString("yyyyMMdd", new Date()));

			dib.setDocProducer(resources.getConstantproperties().getProperty("DOC_PRODUCER"));

			iccxml.setIndex(inx);
			iccxml.setDocument(dib);
			xml = jaxbObjectToXML(iccxml);

			if (resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION) != null) {
				String destination = resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION)
						+ File.separator + documentBean.getCountryName() + File.separator
						+ FileUtilities.dateToString("ddMMyyyy", new Date());
				File destinationFile = new File(destination);
				if (!(destinationFile.exists() && destinationFile.isDirectory())) {
					destinationFile.mkdirs();
				}
				Boolean fc = new File(destinationFile + File.separator + documentBean.getFilenumber() + "-"
						+ documentBean.getCountryName() + "-" + documentBean.getRandomNum() + ".xml").createNewFile();
				if (fc) {
					File file = new File(destinationFile + File.separator + documentBean.getFilenumber() + "-"
							+ documentBean.getCountryName() + "-" + documentBean.getRandomNum() + ".xml");
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(xml);
					bw.close();
				} else {
					LOG.debug("File already in the file system." + destinationFile + File.separator
							+ documentBean.getFilenumber() + "-" + documentBean.getCountryName() + ".xml");
				}
			} else {
				throw new ProcessingFailedException(
						"ICC Destination Path is not available in Connection.Propertie file");

			}

		} catch (Exception e) {
			LOG.error( "PreProcessorServiceImpl :: populateBean - "+e);
			throw new ProcessingFailedException(
					"PreProcessorServiceImpl : populateBean() : Error :Policy Number is not present in database");
		}

		return true;
	}

	private List<String> getAppData(DocumentBean documentBean) throws DBConnectionError, ProcessingFailedException {

		List<String> tmpList = new ArrayList<>();
		try {
			LOG.info("PreProcessorServiceImpl : getAppData() : " + "Try to connecting database");

			// This executeQuery method part of a preProcessorDAO class take
			// query as a parameter and will return the Resultset.
			if (documentBean.getPolNumber() != null) {

				tmpList = PreProcessorDAO.getDAOObject().executeQuery(
						resources.getConstantproperties().getProperty(QUERY_POLICY), documentBean.getPolNumber(),
						documentBean.getCountryCode());
			} else {
				tmpList = PreProcessorDAO.getDAOObject().executeQuery(
						resources.getConstantproperties().getProperty(QUERY_CERTIFICATE), documentBean.getCertNumber(),
						documentBean.getCountryCode());
			}

			LOG.info("PreProcessorDAO: executeQuery()Query Executed Successfully");

		} catch (Exception e) {
			LOG.error("PreProcessorServiceImpl :: getAppData -  "+e);
			

			throw new ProcessingFailedException(
					"PreProcessorServiceImpl : getAppData() : Error :No  records selected " + e.getMessage());

		}
		return tmpList;
	}

	private String jaxbObjectToXML(ScannedImageType iccxml) throws ProcessingFailedException {

		StringWriter writer = new StringWriter();
		try {

			JAXBContext context = JAXBContext.newInstance(ScannedImageType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(iccxml, writer);

		} catch (Exception e) {
			throw new ProcessingFailedException("Exception occurred in JaxbObjectToXML()", e);
		}
		LOG.debug("XML CONTENT : " + writer.toString());
		return writer.toString();
	}
}