package com.chubb.preprocessor.acturis.service;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import com.chubb.preprocessor.acturis.preprocessor.ResourceLoader;

import com.chubb.preprocessor.acturis.jaxb.iccxml.ScannedImageType;
import com.chubb.preprocessor.acturis.jaxb.iccxml.IndexType;
import com.chubb.preprocessor.acturis.jaxb.iccxml.DocumentType;
import com.chubb.preprocessor.acturis.bean.DocumentBean;
import com.chubb.preprocessor.acturis.dao.PreprocessorDAO;
import com.chubb.preprocessor.acturis.documentservice.DocumentServiceConnection;
import com.chubb.preprocessor.acturis.preprocessor.DBConnectionError;
import com.chubb.preprocessor.acturis.preprocessor.FileUtilities;
import com.chubb.preprocessor.acturis.preprocessor.ProgramException;

public class PreProcessorServiceImpl implements IPreProcessorService {

	static final Logger LOG = Logger.getLogger(PreProcessorServiceImpl.class);
	static final String ICC_SHARED_LOCATION = "ICC.shared.location";
	static final String INGESTION_METHOD = "INGESTION_METHOD";
	static final String DOC_PRODUCER = "DOC_PRODUCER";
	protected DocumentBean dbean;

	private ResourceLoader resources = ResourceLoader.getResources();

	public void initProcess(String Id, DocumentBean db, String thread, boolean isICCStatusCheck)
			throws ProgramException {
		LOG.info("Acturis PreProcessorServiceImpl : InitProcess : Execution Started for ID - " + Id);

		try {

			db.setCountryCode(PreprocessorDAO.getDAOObject().getCntryCode(db.getCountryName()));
			// isICCStatusCheck = true;
			if (isICCStatusCheck) {
				PreprocessorDAO.getDAOObject().iccStatusCheck(Integer.valueOf(Id), db.getDocId(), checkRetriable(db));
			} else {
				if (PreprocessorDAO.getDAOObject().checkExistence(db)) {
					getDocument(db, Id);
				} else {
					if (checkRetriable(db)) {
						// updateStatus("X", "Policy/Quote no not exist in APPDB", Id);
						PreprocessorDAO.getDAOObject().updateDocStatus("X", "Policy/Quote no not exists in APPDB",
								Integer.valueOf(Id));

					} else {
						// updateStatus("R", "Policy/Quote no not exist in APPDB", Id);
						PreprocessorDAO.getDAOObject().updateDocStatus("R",
								"Policy/Quote no not exists in APPDB & exceeds max retry limit", Integer.valueOf(Id));
					}
					// getDocument(db, Id);
				}
			}
			LOG.info("Acturis PreProcessorServiceImpl :: InitProcess :: Process Completed for ID ::" + Id);

		} catch (DBConnectionError e) {
			LOG.debug(
					"Acturis PreProcessorServiceImpl :: InitProcess :: Unhandled exception occurred in the program. Exiting execution for Country : "
							+ Id + ". Error : " + e.getMessage(),
					e);
		}

	}
	
	public boolean checkRetriable(DocumentBean dbean) {
		boolean retry = false;
		int days = Integer
				.valueOf("-" + ResourceLoader.getResources().getConstantproperties().getProperty("RETRY_DAYS"));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(FileUtilities.StringTodate("yyyy-MM-dd HH:mm:ss", dbean.getCurDate()));

			c.add(Calendar.DATE, days);
			Date addDate = sdf.parse(sdf.format(c.getTime()));

			if (addDate.before(FileUtilities.StringTodate("yyyy-MM-dd HH:mm:ss", dbean.getRecCrDate()))) {
				retry = true;
			}

		} catch (ParseException e) {
			retry = true;
			LOG.debug("Acturis PreProcessorServiceImpl :: checkRetriable :: Date Parsing exception :" + e.getMessage(),
					e);
		}
		return retry;
	}

	public void getDocument(DocumentBean dbean, String Id) throws DBConnectionError, ProgramException {

		try {
			DocumentServiceConnection dsc = new DocumentServiceConnection();
			DocumentBean docbean = dsc.createDocConnection(dbean);
//			LOG.info("Got soap response");
			// docbean.setOtherref(generateOtherref()); /*Aurnn Adviced to change to dbean.getDocId();*/
			docbean.setOtherref(dbean.getDocId());

			if (docbean.getStatus() && docbean.getDocName() != null && docbean.getDocData() != null) {
				if (docbean.getPolNumber() != null) {
					docbean.setFilenumber(docbean.getPolNumber());
				} else {
					docbean.setFilenumber(docbean.getQuoteNumber());
				}
				
				/*Extract Zip content*/
				byte[] decodedBytes = Base64.decodeBase64(docbean.getDocData());
				

				ByteArrayInputStream bais = new ByteArrayInputStream(decodedBytes);
				ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
				ZipEntry entry = null;
				try (ZipInputStream zis = new ZipInputStream(bais)) {
					entry  = zis.getNextEntry();
//					LOG.info("Entry Name:"+entry.getName());
					docbean.setDocName(entry.getName());
					byte[] buf = new byte[1024];
					int len = zis.read(buf);
					while (len > 0) {
						baos.write(buf, 0, len);
						len = zis.read(buf);
					}
				}

				if (!PreprocessorDAO.getDAOObject().insertDocDetais(docbean)) {
					LOG.info("PreProcessorServiceImpl : InitProcess() : Error : While inserting Doc details in APPDB");
					throw new ProgramException("PreProcessorServiceImpl : InitProcess() : Error :Invalid document");

				} else {
					if (generateXML(docbean)) { 
						File file;
						String destinationPath = resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION)
								+ File.separator + docbean.getCountryCode() + File.separator
								+ FileUtilities.dateToString("ddMMyyyy", new Date());
						File destination = new File(destinationPath);
						
//						String zipdestinationPath = destinationPath + File.separator + "ZipFileFolder";
//						File zipdestination = new File(zipdestinationPath);
						
						if (!(destination.exists() && destination.isDirectory() )) {
							destination.mkdirs();
						}
						
					
//						if (!(destination.exists() && destination.isDirectory() && zipdestination.exists() && zipdestination.isDirectory())) {
//							destination.mkdirs();
//							zipdestination.mkdirs();
//						}
						
						Boolean fc;
						try {

							fc = new File(destination + File.separator + docbean.getOtherref() +docbean.getDocName()).createNewFile();
							
							if (fc) {
								file = new File(destination + File.separator + docbean.getOtherref() + docbean.getDocName());
								
								// Note the try-with-resources block here, to
								// close the stream automatically
								try (OutputStream stream = new FileOutputStream(file)) {
									stream.write(baos.toByteArray());
//									updateStatus("M", "Moved To ICC", Id);
									PreprocessorDAO.getDAOObject().updateDocStatus("M", "Moved To ICC Input folder", Integer.valueOf(Id));
								}
							} else {
								LOG.info("File already in the file system." + destination + File.separator + docbean.getOtherref() +docbean.getDocName());
								PreprocessorDAO.getDAOObject().updateDocStatus("R", "File already in the ICC folder", Integer.valueOf(Id));
							}
						} catch (FileNotFoundException e) {
							e.printStackTrace();
//							updateStatus("R", "Error while copying files to ICC folder", Id);
							PreprocessorDAO.getDAOObject().updateDocStatus("R", "Error while creating documents in ICC folder", Integer.valueOf(Id));
							LOG.error(
									"Acturis PreProcessorServiceImpl :: GetDocument :: Error occurred while creating files to Folder",
									e);
							throw new ProgramException(
									"Acturis PreProcessorServiceImpl :: GetDocument :: Error occurred while creating files to Folder",
									e);
						} catch (IOException e) {
							e.printStackTrace();
//							updateStatus("R", "Error while copying files to ICC folder", Id);
							PreprocessorDAO.getDAOObject().updateDocStatus("R", "Error while creating documents in ICC folder", Integer.valueOf(Id));
							LOG.error(
									"Acturis PreProcessorServiceImpl :: GetDocument :: Error occurred while creating the file to ICC Folder",
									e);
							throw new ProgramException(
									"Acturis PreProcessorServiceImpl :: GetDocument :: Error occurred while creating the files to ICC Folder",
									e);
						}
					} else {
						PreprocessorDAO.getDAOObject().updateDocStatus("R", "Error while creating documents in ICC folder", Integer.valueOf(Id));
						LOG.error(
								"Acturis PreProcessorServiceImpl :: GetDocument :: Error occurred while creating and copying files to ICC.");
						throw new ProgramException();
					}
				}
			} else {
//				updateStatus("R", docbean.getErrorText(), Id);
				PreprocessorDAO.getDAOObject().updateDocStatus("R", docbean.getErrorText(), Integer.valueOf(Id));
				LOG.info("Acturis PreProcessorServiceImpl :: GetDocument :: Error :: Document Web Service Exception"
						+ docbean.getErrorText());
				throw new ProgramException();
			}

		} catch (Exception e) {
			LOG.debug("Acturis PreporcessorServiceImpl :: GetDocument :: Exception:" + e);
		}
	}
	

	/* Not in use */
	public void updateStatus(String status, String message, String id) throws ProgramException, DBConnectionError {
		PreprocessorDAO.getDAOObject().updateDocStatus(status, message, Integer.valueOf(id));

	}

	/* Not in use */
	public Map<String, DocumentBean> getActurisData(String countryCode, Map<String, DocumentBean> masterList,
			boolean isICCStatusCheck) throws ProgramException, DBConnectionError {
		try {
//			LOG.info("PreProcessorServiceImpl : getActurisData() : " + "Try to connecting database" + countryCode);
			masterList = PreprocessorDAO.getDAOObject().getActurisDocDetails(isICCStatusCheck);
		} catch (Exception e) {
			LOG.debug("Acturis PreProcessorServiceImpl :: getActurisData :: Exception occured in program");
		}
		return masterList;
	}

	private Boolean generateXML(DocumentBean documentBean) throws ProgramException {
//		System.out.println("Inside generate XML");
		String xml = "";
		ScannedImageType iccxml = new ScannedImageType();
		IndexType inx = new IndexType();
		DocumentType dib = new DocumentType();

		try {

			inx.setBpuCode("");
			inx.setCtryCode(documentBean.getCountryCode());
			inx.setEntityType("");
			if (documentBean.getPolNumber() != null) {
				inx.setFileNumber(documentBean.getPolNumber());
			} else {
				inx.setFileNumber(documentBean.getQuoteNumber());
			}
			inx.setQuoteNumber(documentBean.getQuoteNumber());
			inx.setClNumber("");
			// inx.setCertNumber(documentBean.getCertNumber());
			inx.setCertNumber("");
			inx.setPolNumber(documentBean.getPolNumber());
			// inx.setEntCode(documentBean.getEntityCode());
			inx.setEntCode("");
			inx.setIngestionMethod(resources.getConstantproperties().getProperty(INGESTION_METHOD));
			dib.setFileName(documentBean.getDocName());
			dib.setOtherref(documentBean.getDocId());
			dib.setScanInfo(resources.getConstantproperties().getProperty("SCAN_INFO"));
			dib.setScanop(resources.getConstantproperties().getProperty("SCAN_OP"));
			// dib.setScantime(FileUtilities.dateToString("HH:mm:ss", new
			// Date()));
			dib.setScantime(new SimpleDateFormat("HH:mm:ss").format(new Date()));
			dib.setDocDescription(documentBean.getDocName());
			// dib.setFileCode(documentBean.getFileCode());
			dib.setFileCode("1");
			dib.setFtypCode(documentBean.getFtypCode());
			dib.setDocTypeCode(documentBean.getDoctypeCode());

			if (!(documentBean.getDocDate() == null)) {
				// dib.setDocdate(documentBean.getDocDate());
				Date docdate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(documentBean.getDocDate());
				dib.setDocdate(new SimpleDateFormat("yyyyMMdd").format(docdate));
			} else {
				dib.setDocdate("");
			}
			// dib.setScandate(FileUtilities.dateToString("yyyyMMdd", new
			// Date()));
			dib.setScandate(new SimpleDateFormat("yyyyMMdd").format(new Date()));
			dib.setDocProducer(resources.getConstantproperties().getProperty(DOC_PRODUCER));

			iccxml.setIndex(inx);
			iccxml.setDocument(dib);
			xml = jaxbObjectToXML(iccxml);

			if (resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION) != null) {
				String destination = resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION)
						+ File.separator + documentBean.getCountryCode() + File.separator
						+ FileUtilities.dateToString("ddMMyyyy", new Date());
				File destinationFile = new File(destination);
				if (!(destinationFile.exists() && destinationFile.isDirectory())) {
					destinationFile.mkdirs();
				}

				// Boolean fc = new File(destinationFile + File.separator +
				// documentBean.getDocName() + ".xml").createNewFile();
				Boolean fc = new File(destinationFile + File.separator + documentBean.getOtherref()
						+ FileUtilities.removeExtension(documentBean.getDocName()) + ".xml").createNewFile();
				if (fc) {
					// File file = new File(destinationFile + File.separator +
					// documentBean.getDocName() + ".xml");
					File file = new File(destinationFile + File.separator + documentBean.getOtherref()
							+ FileUtilities.removeExtension(documentBean.getDocName()) + ".xml");
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(xml);
					bw.close();
				} else {
					LOG.debug("File already in the file system." + destinationFile + File.separator
							+ documentBean.getOtherref() + FileUtilities.removeExtension(documentBean.getDocName()) + ".xml");
				}
			} else {
				throw new ProgramException("ICC Destination Path is not available in Connection.Propertie file");

			}

		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("PreProcessorServiceImpl :: generateXML - " + e);
			// updateStatus("R", "Error while generating XML", Id);
			throw new ProgramException(
					"PreProcessorServiceImpl : generateXML() : Error :Policy Number is not present in database");
		}
		return true;

	}

	/* Not in use */
	private String generateOtherref() {
		return FileUtilities.dateToString("ddMMyyyyss", new Date()) + ":" + String.valueOf(new Random().nextLong());
	}

	private String jaxbObjectToXML(ScannedImageType iccxml) throws ProgramException {

		StringWriter writer = new StringWriter();
		try {

			JAXBContext context = JAXBContext.newInstance(ScannedImageType.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(iccxml, writer);

		} catch (Exception e) {
			throw new ProgramException("Exception occurred in JaxbObjectToXML()", e);
		}
		LOG.debug("XML CONTENT : " + writer.toString());
		return writer.toString();
	}

}
