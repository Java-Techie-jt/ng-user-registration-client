package com.chubb.preprocessor.generic.service;

//import java.io.BufferedWriter;s
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileWriter;
//import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
//import java.io.StringReader;
//import java.io.StringWriter;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Date;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
//import java.util.List;
import java.util.Map;
//import java.util.Objects;
import java.util.Random;
//import java.util.stream.Stream;

import javax.xml.XMLConstants;
//import javax.xml.bind.JAXB;
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.stream.XMLInputFactory;
//import javax.xml.stream.XMLStreamConstants;
//import javax.xml.stream.XMLStreamException;
//import javax.xml.stream.XMLStreamReader;
//import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
//import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
//import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.chubb.preprocessor.generic.bean.DocumentBean;
import com.chubb.preprocessor.generic.dao.PreprocessorDAO;
//import com.chubb.preprocessor.generic.jaxb.iccxml.DocumentType;
//import com.chubb.preprocessor.generic.jaxb.iccxml.IndexType;
//import com.chubb.preprocessor.generic.jaxb.iccxml.ScannedImageType;
import com.chubb.preprocessor.generic.preprocessor.DBConnectionError;
import com.chubb.preprocessor.generic.preprocessor.FileUtilities;
import com.chubb.preprocessor.generic.preprocessor.ProgramException;
import com.chubb.preprocessor.generic.preprocessor.ResourceLoader;

public class PreProcessorServiceImpl implements IPreProcessorService {

	static final Logger LOG = Logger.getLogger(PreProcessorServiceImpl.class);
	static final String INPUT_SHARED_LOCATION = "input.folder.location";
	static final String ERROR_SHARED_LOCATION = "error.folder.location";
	static final String ARCHIVE_SHARED_LOCATION = "archive.folder.location";
	static final String ICC_SHARED_LOCATION = "ICC.shared.location";

	private ResourceLoader resources = ResourceLoader.getResources();

	public void initProcess(File f, File[] files, String directory) throws ProgramException, DBConnectionError {
		try {
			/*
			 * String directory =
			 * resources.getConnectionproperties().getProperty(
			 * INPUT_SHARED_LOCATION); if (!directory.isEmpty()) {
			 * 
			 * File file = new File(directory); String[] directories =
			 * file.list(new FilenameFilter() {
			 * 
			 * @Override public boolean accept(File current, String name) {
			 * return new File(current, name).isDirectory(); }
			 * 
			 * }); LOG.info(Arrays.toString(directories));
			 * 
			 * String path = "";
			 * 
			 * for (int i = 0; i < directories.length; i++) {
			 * 
			 * path = directory + File.separator + directories[i];
			 * 
			 * List<Path> docPath = new ArrayList<Path>(); File[] files = new
			 * File(path).listFiles();
			 * 
			 * File dir = new File(path); File[] xmlfile = dir.listFiles(new
			 * FilenameFilter() { public boolean accept(File dir, String name) {
			 * return name.toLowerCase().endsWith(".xml"); } });
			 */

			// for (File f : xmlfile) {

			/*
			 * DocumentBuilderFactory dbf =
			 * DocumentBuilderFactory.newInstance(); DocumentBuilder db =
			 * dbf.newDocumentBuilder(); Document doc = db.parse(f);
			 * doc.getDocumentElement().normalize(); // System.out.println(
			 * "Root element " + doc.getDocumentElement().getNodeName());
			 * 
			 * NodeList nodeList=doc.getElementsByTagName("*");
			 * 
			 * LinkedHashMap<String, String> indexMap = new
			 * LinkedHashMap<String, String>(); LinkedHashMap<String, String>
			 * map = new LinkedHashMap<String, String>();
			 * 
			 * for (int j=0; j<nodeList.getLength(); j++) { // Get element
			 * Element element = (Element)nodeList.item(j);
			 * if(!element.getNodeName().equalsIgnoreCase("ScannedImage") &&
			 * !element.getNodeName().equalsIgnoreCase("Index") &&
			 * !element.getNodeName().equalsIgnoreCase("Document")){
			 * map.put(element.getNodeName(), element.getTextContent()); } else
			 * { map.put(element.getNodeName(), ""); } } //
			 * System.out.println("Map:"+map);
			 * 
			 * // for(Map.Entry<String, String> entry : map.entrySet()){ //
			 * if(!entry.getKey().equalsIgnoreCase("ScannedImage") &&
			 * !entry.getKey().equalsIgnoreCase("Index")){ //
			 * if(!entry.getKey().equalsIgnoreCase("Document")){ // //
			 * indexMap.put(entry.getKey(),entry.getValue()); //
			 * LOG.info("removed:"+map.entrySet().remove(entry.getKey())); //
			 * LOG.info("removed1:"+map.remove(entry.getKey())); // } else { //
			 * break; // // } // } // }
			 * 
			 * Iterator<Map.Entry<String,String>> iter =
			 * map.entrySet().iterator();
			 * 
			 * while (iter.hasNext()) { Map.Entry<String,String> entry =
			 * iter.next(); if(entry.getKey().equalsIgnoreCase("ScannedImage")
			 * || entry.getKey().equalsIgnoreCase("Index")){ iter.remove(); }
			 * else if(!entry.getKey().equalsIgnoreCase("Document")){
			 * indexMap.put(entry.getKey(),entry.getValue()); iter.remove(); }
			 * else { iter.remove(); break; } }
			 * 
			 * 
			 * System.out.println("indexMap:"+indexMap);
			 * System.out.println("map:"+map);
			 * 
			 * try {
			 * 
			 * DocumentBuilderFactory documentFactory =
			 * DocumentBuilderFactory.newInstance();
			 * 
			 * DocumentBuilder documentBuilder =
			 * documentFactory.newDocumentBuilder();
			 * 
			 * Document document = documentBuilder.newDocument();
			 * 
			 * // root element Element root =
			 * document.createElement("ScannedImage");
			 * document.appendChild(root);
			 * 
			 * // employee element Element index =
			 * document.createElement("Index");
			 * 
			 * root.appendChild(index);
			 * 
			 * Element docu = document.createElement("Document");
			 * 
			 * root.appendChild(docu);
			 * 
			 * if(indexMap!= null){ for(Map.Entry<String, String> ind :
			 * indexMap.entrySet()){ Element e = null;
			 * if(ind.getKey().equalsIgnoreCase("fileNumber")){ e =
			 * document.createElement("ingestion_file_number"); } else { e =
			 * document.createElement(ind.getKey()); }
			 * e.appendChild(document.createTextNode(ind.getValue()));
			 * index.appendChild(e);
			 * 
			 * } }
			 * 
			 * if(map!=null){ for(Map.Entry<String, String> dib :
			 * map.entrySet()){ Element e =
			 * document.createElement(dib.getKey());
			 * e.appendChild(document.createTextNode(dib.getValue()));
			 * docu.appendChild(e); } }
			 * 
			 * 
			 * 
			 * 
			 * // create the xml file //transform the DOM Object to an XML File
			 * TransformerFactory transformerFactory =
			 * TransformerFactory.newInstance(); Transformer transformer =
			 * transformerFactory.newTransformer(); DOMSource domSource = new
			 * DOMSource(document); StreamResult streamResult = new
			 * StreamResult(new File(
			 * "C:\\Preprocess\\GenericPP\\Destination\\826\\1445826099Sample_Generic.xml"
			 * ));
			 * 
			 * 
			 * 
			 * transformer.transform(domSource, streamResult);
			 * 
			 * System.out.println("Done creating XML File");
			 * 
			 * } catch (ParserConfigurationException pce) {
			 * pce.printStackTrace(); } catch (TransformerException tfe) {
			 * tfe.printStackTrace(); }
			 */

			File reqFile = findPairDoc(files, f);
			if (reqFile != null) {
				InputStream is = new FileInputStream(f);
				byte[] byteArray = IOUtils.toByteArray((InputStream) is);
				String xml = new String(byteArray, "UTF-8");
				is.close();
				InputStream xsd = null;
				xsd = new FileInputStream(new File(resources.getConstantproperties().getProperty("XSD_PATH")));
				// if
				// (validateXMLSchema(resources.getConstantproperties().getProperty("XSD_PATH"),
				// f.getAbsolutePath())) {
				if (validateAgainstXSD(IOUtils.toInputStream(xml, "UTF-8"), xsd)) {
					LOG.info(f.getName() + "is Valid XML");

					DocumentBean dBean = new DocumentBean();
					DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
					DocumentBuilder db = dbf.newDocumentBuilder();
					Document xmldoc = db.parse(f);
					xmldoc.getDocumentElement().normalize();

					NodeList nodeList = xmldoc.getElementsByTagName("*");

					LinkedHashMap<String, String> indexMap = new LinkedHashMap<String, String>();
					LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

					for (int j = 0; j < nodeList.getLength(); j++) {
						Element element = (Element) nodeList.item(j);
						if (!element.getNodeName().equalsIgnoreCase("ScannedImage")
								&& !element.getNodeName().equalsIgnoreCase("Index")
								&& !element.getNodeName().equalsIgnoreCase("Document")) {
							map.put(element.getNodeName(), element.getTextContent());
						} else {
							map.put(element.getNodeName(), "");
						}
					}

					if (map.containsKey("fileNumber")) {
						dBean.setFileNumber(map.get("fileNumber"));
					}
					if (map.containsKey("lobgroup_code")) {
						dBean.setLobGrpCode(map.get("lobgroup_code"));
					} else {
						dBean.setLobGrpCode("");
					}
					if (map.containsKey("ctry_code")) {
						dBean.setCountryCode(map.get("ctry_code"));
					} else {
						dBean.setCountryCode("");
					}
					if (map.containsKey("entity_type")) {
						dBean.setFiletypCode(map.get("entity_type"));
					} else {
						dBean.setFiletypCode("");
					}
					if (map.containsKey("ent_code")) {
						dBean.setEntityCode(map.get("ent_code"));
					} else {
						dBean.setEntityCode("");
					}
					if (map.containsKey("ingestionmethod") && !map.get("ingestionmethod").isEmpty()) {
						dBean.setIngMethodCode(map.get("ingestionmethod"));
					} else {
						dBean.setIngMethodCode(resources.getConstantproperties().getProperty("INGESTION_METHOD"));
					}
					if (map.containsKey("otherref") && !map.get("otherref").isEmpty()) {
						dBean.setOtherref(map.get("otherref"));
					} else {
						dBean.setOtherref(generateOtherref());
					}
					if (map.containsKey("doc_description")) {
						dBean.setDocDescription(map.get("doc_description"));
					} else {
						dBean.setDocDescription("");
					}
					
					if(map.containsKey("file_code") && map.containsKey("folder_type_code") && map.containsKey("doc_type_code")){
						if(map.get("file_code").isEmpty() || map.get("file_code") == null 
								|| map.get("folder_type_code").isEmpty() || map.get("folder_type_code") == null 
								|| map.get("doc_type_code").isEmpty() || map.get("doc_type_code") == null){
							dBean.setIndexingStatus(false);
						} else {
							dBean.setIndexingStatus(true);
						}
					} else {
						dBean.setIndexingStatus(false);
					}

					System.out.println("map:" + map);

					Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

					while (iter.hasNext()) {
						Map.Entry<String, String> entry = iter.next();
						if (entry.getKey().equalsIgnoreCase("ScannedImage")
								|| entry.getKey().equalsIgnoreCase("Index")) {
							iter.remove();
						} else if (!entry.getKey().equalsIgnoreCase("Document")) {
							indexMap.put(entry.getKey(), entry.getValue());
							iter.remove();
						} else {
							iter.remove();
							break;
						}
					}

//					System.out.println("indexMap:" + indexMap);
//					System.out.println("map:" + map);
					// if(PreprocessorDAO.getDAOObject().checkExistence(dBean)){

					// ScannedImageType scan = unMarshallingTheXML(f);
					// if (generateXML(scan, f.getName(), reqFile)) {
					if (!PreprocessorDAO.getDAOObject().checkExistence(dBean)) {
						LOG.info("PreProcessorServiceImpl : InitProcess() : FileName not exist in APPDB :"
								+ dBean.getFileNumber() + " Entity_Type :" + dBean.getFiletypCode());
						if (!FileUtilities.fileMove(f.getAbsolutePath(),
								resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
										// + documentBean.getCountryName()
										+ File.separator + directory + File.separator
										+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
										+ f.getName())) {

							LOG.warn("Generic preProcessorServiceImpl :: InitProcess :: Unable to move document -"
									+ f.getName() + " to Error Folder");
						} else {
							LOG.info(
									"Generic preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze LOGs and retry    :   "
											+ resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
											// + documentBean.getCountryName()
											+ File.separator + directory + File.separator
											+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
											+ f.getName());
						}
						if (!FileUtilities.fileMove(reqFile.getAbsolutePath(),
								resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
										// + documentBean.getCountryName()
										+ File.separator + directory + File.separator
										+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
										+ reqFile.getName())) {
							LOG.warn("Generic preProcessorServiceImpl :: InitProcess :: Unable to move document -"
									+ reqFile.getName() + " to Error Folder");
						} else {
							LOG.info(
									"Generic preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze LOGs and retry    :   "
											+ resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
											// + documentBean.getCountryName()
											+ File.separator + directory + File.separator
											+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
											+ reqFile.getName());
						}

					} else if (PreprocessorDAO.getDAOObject().insertDocDetais(dBean)
							&& generateXML(f, reqFile, indexMap, map, dBean)) {
						LOG.info("XML generated");
						if (!FileUtilities.fileMove(f.getAbsolutePath(),
								resources.getConnectionproperties().getProperty(ARCHIVE_SHARED_LOCATION)
										// + documentBean.getCountryName()
										+ File.separator + directory + File.separator
										+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
										+ f.getName())) {

							LOG.warn("Generic preProcessorServiceImpl :: InitProcess :: Unable to move document -"
									+ f.getName() + " to Archive Folder");
						} else {
							LOG.info(
									"Generic preProcessorServiceImpl :: InitProcess :: Moved document successfully to Archive Folder. Please analyze LOGs and retry    :   "
											+ resources.getConnectionproperties().getProperty(ARCHIVE_SHARED_LOCATION)
											// + documentBean.getCountryName()
											+ File.separator + directory + File.separator
											+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
											+ f.getName());
						}
						if (!FileUtilities.fileMove(reqFile.getAbsolutePath(),
								resources.getConnectionproperties().getProperty(ARCHIVE_SHARED_LOCATION)
										// + documentBean.getCountryName()
										+ File.separator + directory + File.separator
										+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
										+ reqFile.getName())) {
							LOG.warn("Generic preProcessorServiceImpl :: InitProcess :: Unable to move document -"
									+ reqFile.getName() + " to Archive Folder");
						} else {
							LOG.info(
									"Generic preProcessorServiceImpl :: InitProcess :: Moved document successfully to Archive Folder. Please analyze LOGs and retry    :   "
											+ resources.getConnectionproperties().getProperty(ARCHIVE_SHARED_LOCATION)
											// + documentBean.getCountryName()
											+ File.separator + directory + File.separator
											+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
											+ reqFile.getName());
						}
					} else {
						if (!FileUtilities.fileMove(f.getAbsolutePath(),
								resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
										// + documentBean.getCountryName()
										+ File.separator + directory + File.separator
										+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
										+ f.getName())) {

							LOG.warn("Generic preProcessorServiceImpl :: InitProcess :: Unable to move document -"
									+ f.getName() + " to Error Folder");
						} else {
							LOG.info(
									"Generic preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze LOGs and retry    :   "
											+ resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
											// + documentBean.getCountryName()
											+ File.separator + directory + File.separator
											+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
											+ f.getName());
						}
						if (!FileUtilities.fileMove(reqFile.getAbsolutePath(),
								resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
										// + documentBean.getCountryName()
										+ File.separator + directory + File.separator
										+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
										+ reqFile.getName())) {
							LOG.warn("Generic preProcessorServiceImpl :: InitProcess :: Unable to move document -"
									+ reqFile.getName() + " to Error Folder");
						} else {
							LOG.info(
									"Generic preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze LOGs and retry    :   "
											+ resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
											// + documentBean.getCountryName()
											+ File.separator + directory + File.separator
											+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
											+ reqFile.getName());
						}
					}

				} else {
					LOG.info(f.getName() + "is Invalid");
					LOG.info("f.getAbsolutePath()" + f.getAbsolutePath());
					LOG.info("reqFile.getAbsolutePath()" + reqFile.getAbsolutePath());
					if (!FileUtilities.fileMove(f.getAbsolutePath(),
							resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
									// + documentBean.getCountryName()
									+ File.separator + directory + File.separator
									+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
									+ f.getName())) {

						LOG.warn("Generic preProcessorServiceImpl :: InitProcess :: Unable to move document -"
								+ f.getName() + " to Error Folder");
					} else {
						LOG.info(
								"Generic preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze LOGs and retry    :   "
										+ resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
										// + documentBean.getCountryName()
										+ File.separator + directory + File.separator
										+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
										+ f.getName());
					}
					if (!FileUtilities.fileMove(reqFile.getAbsolutePath(),
							resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
									// + documentBean.getCountryName()
									+ File.separator + directory + File.separator
									+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
									+ reqFile.getName())) {
						LOG.warn("Generic preProcessorServiceImpl :: InitProcess :: Unable to move document -"
								+ reqFile.getName() + " to Error Folder");
					} else {
						LOG.info(
								"Generic preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze LOGs and retry    :   "
										+ resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
										// + documentBean.getCountryName()
										+ File.separator + directory + File.separator
										+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
										+ reqFile.getName());
					}
				}
			} else {
				LOG.info("Document pair is not available in Input folder for the document " + f.getName());
				if (!FileUtilities.fileMove(f.getAbsolutePath(),
						resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
								// + documentBean.getCountryName()
								+ File.separator + directory + File.separator
								+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator + f.getName())) {
					LOG.warn("Generic preProcessorServiceImpl :: InitProcess :: Unable to move document -" + f.getName()
							+ " to Error Folder");
				} else {
					LOG.info(
							"Generic preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. :   "
									+ resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)
									// + documentBean.getCountryName()
									+ File.separator + directory + File.separator
									+ FileUtilities.dateToString("ddMMyyyy", new Date()) + File.separator
									+ f.getName());
				}
			}

			// }
			// }

			// } else {
			// LOG.info("Input Shared folder Path is not specified in
			// connection.propertie file");
			// }

		} catch (Exception e) {
			LOG.fatal(
					"GenericPP PreProcessorServiceImpl :: InitProcess :: Unhandled exception occurred in the program. Error : "
							+ e.getMessage(),
					e);
		}
	}

	private File findPairDoc(File[] files, File xmlfile) {
		for (File fi : files) {
//			LOG.info("act doc:" + fi.getName());
//			LOG.info("xml doc:" + xmlfile.getName());
			if (FileUtilities.removeExtension(fi.getName()).equals(FileUtilities.removeExtension(xmlfile.getName()))
					&& !fi.getName().endsWith(".xml")) {
				LOG.info("xml file:" + xmlfile.getName());
				LOG.info("Required File:" + fi.getName());
				return fi;
			}

		}
		return null;

	}

	private Boolean generateXML(File xmlName, File doc, LinkedHashMap<String, String> indexMap,
			LinkedHashMap<String, String> map, DocumentBean dBean) throws ProgramException, DBConnectionError {

		try {
			/*
			 * DocumentBean dBean = new DocumentBean(); DocumentBuilderFactory
			 * dbf = DocumentBuilderFactory.newInstance(); DocumentBuilder db =
			 * dbf.newDocumentBuilder(); Document xml = db.parse(xmlName);
			 * xml.getDocumentElement().normalize();
			 * 
			 * NodeList nodeList=xml.getElementsByTagName("*");
			 * 
			 * LinkedHashMap<String, String> indexMap = new
			 * LinkedHashMap<String, String>(); LinkedHashMap<String, String>
			 * map = new LinkedHashMap<String, String>();
			 * 
			 * for (int j=0; j<nodeList.getLength(); j++) { Element element =
			 * (Element)nodeList.item(j);
			 * if(!element.getNodeName().equalsIgnoreCase("ScannedImage") &&
			 * !element.getNodeName().equalsIgnoreCase("Index") &&
			 * !element.getNodeName().equalsIgnoreCase("Document")){
			 * map.put(element.getNodeName(), element.getTextContent()); } else
			 * { map.put(element.getNodeName(), ""); } }
			 * 
			 * 
			 * if(map.containsKey("fileNumber")){
			 * dBean.setFileNumber(map.get("fileNumber")); }
			 * if(map.containsKey("lobgroup_code")){
			 * dBean.setLobGrpCode(map.get("lobgroup_code")); } else {
			 * dBean.setLobGrpCode(""); } if(map.containsKey("ctry_code")){
			 * dBean.setCountryCode(map.get("ctry_code")); } else {
			 * dBean.setCountryCode(""); } if(map.containsKey("entity_type")){
			 * dBean.setFiletypCode(map.get("entity_type")); } else {
			 * dBean.setFiletypCode(""); } if(map.containsKey("ent_code")){
			 * dBean.setEntityCode(map.get("ent_code")); } else {
			 * dBean.setEntityCode(""); }
			 * if(map.containsKey("ingestionmethod")){
			 * dBean.setIngMethodCode(map.get("ingestionmethod")); } else {
			 * dBean.setIngMethodCode(""); } if(map.containsKey("otherref")){
			 * dBean.setOtherref(map.get("otherref")); } else {
			 * dBean.setOtherref(generateOtherref()); }
			 * if(map.containsKey("doc_description")){
			 * dBean.setDocDescription(map.get("doc_description")); } else {
			 * dBean.setDocDescription(""); }
			 * 
			 * System.out.println("map:"+map);
			 */

			// if(PreprocessorDAO.getDAOObject().checkExistence(dBean)){

			/*
			 * Iterator<Map.Entry<String,String>> iter =
			 * map.entrySet().iterator();
			 * 
			 * while (iter.hasNext()) { Map.Entry<String,String> entry =
			 * iter.next(); if(entry.getKey().equalsIgnoreCase("ScannedImage")
			 * || entry.getKey().equalsIgnoreCase("Index")){ iter.remove(); }
			 * else if(!entry.getKey().equalsIgnoreCase("Document")){
			 * indexMap.put(entry.getKey(),entry.getValue()); iter.remove(); }
			 * else { iter.remove(); break; } }
			 */

			LOG.info("indexMap:" + indexMap);
			LOG.info("map:" + map);

			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

			Document document = documentBuilder.newDocument();

			// root element
			Element root = document.createElement("ScannedImage");
			document.appendChild(root);

			Element index = document.createElement("Index");

			root.appendChild(index);

			Element docu = document.createElement("Document");

			root.appendChild(docu);

			if (indexMap != null) {
				for (Map.Entry<String, String> ind : indexMap.entrySet()) {
					Element e = null;
					if (ind.getKey().equalsIgnoreCase("fileNumber")) {
						e = document.createElement("ingestion_file_number");
					} else {
						e = document.createElement(ind.getKey());
					}
					if (ind.getKey().equalsIgnoreCase("ingestionmethod") && ind.getValue().equalsIgnoreCase("")) {
						e.appendChild(document
								.createTextNode(resources.getConstantproperties().getProperty("INGESTION_METHOD")));
					} else {
						e.appendChild(document.createTextNode(ind.getValue()));
					}
					index.appendChild(e);

				}
			}

			if (map != null) {
				for (Map.Entry<String, String> dib : map.entrySet()) {
					Element e = document.createElement(dib.getKey());
					if(dib.getKey().equalsIgnoreCase("otherref") && dib.getValue().equalsIgnoreCase("")){
						e.appendChild(document.createTextNode(dBean.getOtherref()));
						LOG.info("OtherRefNo"+dBean.getOtherref());
					} else {
						e.appendChild(document.createTextNode(dib.getValue()));
					}
					docu.appendChild(e);
				}
			}
			
			Element e = document.createElement("indexingcomplete");
			
			if(dBean.isIndexingStatus()){
			e.appendChild(document.createTextNode("TRUE"));
			}
			else {
				e.appendChild(document.createTextNode("FALSE"));
			}
			docu.appendChild(e);
			if (resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION) != null) {
				String destination = resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION).toString().trim()
						+ File.separator + dBean.getCountryCode().toString().trim() + File.separator
						+ FileUtilities.dateToString("ddMMyyyy", new Date());
				LOG.info("Destination: "+destination);
				File destinationFile = new File(destination);
				LOG.info("DestinationFile Exists: "+destinationFile.exists());
//				LOG.info("DestinationFile isDirectory: "+destinationFile.isDirectory());
				if (!(destinationFile.exists() && destinationFile.isDirectory())) {
//					LOG.info("Creating Directory...");
					destinationFile.mkdirs();
//					LOG.info("Directory Created : "+destinationFile.mkdirs());
				}
				// Boolean fc = new File(destinationFile + File.separator +
				// documentBean.getDocName() + ".xml").createNewFile();
				LOG.info("File Name:"+destinationFile + File.separator + dBean.getOtherref() + ".xml");
				Boolean fc = new File(destinationFile + File.separator + dBean.getOtherref() + ".xml").createNewFile();
//				+ xmlName.getName())
						
				// + FileUtilities.removeExtension(documentBean.getDocName()) +
				// ".xml").createNewFile();

				LOG.info("File Exists:" + fc);
				if (fc) {
					// File file = new File(destinationFile + File.separator +
					// documentBean.getDocName() + ".xml");
					File file = new File(destinationFile + File.separator + dBean.getOtherref() + ".xml");
					// +
					// FileUtilities.removeExtension(documentBean.getDocName())
					 
//							+ xmlName.getName());
					// FileWriter fw = new FileWriter(file.getAbsoluteFile());
					// BufferedWriter bw = new BufferedWriter(fw);
					// bw.write(xml);
					// bw.close();
					TransformerFactory transformerFactory = TransformerFactory.newInstance();
					Transformer transformer = transformerFactory.newTransformer();
					DOMSource domSource = new DOMSource(document);
//					 StreamResult streamResult = new StreamResult(new
//					 File("C:\\Preprocess\\GenericPP\\Destination\\826\\1445826099Sample_Generic.xml"));
					StreamResult streamResult = new StreamResult(file);
					transformer.transform(domSource, streamResult);
				} else {
					LOG.info("File already in the file system." + destinationFile + File.separator + dBean.getOtherref()+ ".xml");
//							+ xmlName.getName());
					
				}

//				fc = new File(destinationFile + File.separator + dBean.getOtherref() + doc.getName()).createNewFile();
				fc = new File(destinationFile + File.separator + dBean.getOtherref() + doc.getName().toString().substring(doc.getName().toString().lastIndexOf("."))).createNewFile();
				if (fc) {

//					File file = new File(destinationFile + File.separator + dBean.getOtherref() + doc.getName());
					File file = new File(destinationFile + File.separator + dBean.getOtherref() + doc.getName().toString().substring(doc.getName().toString().lastIndexOf(".")));
					FileUtils.copyFile(doc, file);

					// FileUtilities.fileMove(doc.toString(), file.toString());
				} else {
					LOG.info("File already in the file system." + destinationFile + File.separator + dBean.getOtherref() + doc.getName().toString().substring(doc.getName().toString().lastIndexOf(".")));
//							+ doc);
					
				}
				

			} else {
				throw new ProgramException("ICC Destination Path is not available in connection.propertie file");

			}

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("PreProcessorServiceImpl :: generateXML - " + e);
			throw new ProgramException("PreProcessorServiceImpl : generateXML()");
		}
		LOG.info("XML and Document moved to ICC input folder");
		return true;

	}

	private String generateOtherref() {
		return FileUtilities.dateToString("ddMMyyyyss", new Date()) + "_" + String.valueOf(new Random().nextLong());

	}

	/*
	 * private Boolean generateXML(ScannedImageType scan, String xmlName, File
	 * doc) throws ProgramException {
	 * 
	 * String xml = ""; ScannedImageType iccxml = new ScannedImageType();
	 * IndexType inx = new IndexType(); DocumentType dib = new DocumentType();
	 * 
	 * try {
	 * 
	 * if (scan.getIndex().getLobgroup_code() != null) {
	 * inx.setLobgroup_code(scan.getIndex().getLobgroup_code()); } else {
	 * inx.setLobgroup_code(""); }
	 * inx.setCtry_code(scan.getIndex().getCtry_code());
	 * inx.setEntity_type(scan.getIndex().getEntity_type());
	 * inx.setIngestion_file_number(scan.getIndex().getFileNumber());
	 * 
	 * if (scan.getIndex().getEnt_code() != null) {
	 * inx.setEnt_code(scan.getIndex().getEnt_code()); } else {
	 * inx.setEnt_code(""); }
	 * 
	 * inx.setIngestionmethod(scan.getIndex().getIngestionmethod());
	 * 
	 * dib.setFilename(scan.getDocument().getFilename());
	 * dib.setOtherref(scan.getDocument().getOtherref());
	 * 
	 * if (scan.getDocument().getOriginator() != null) {
	 * dib.setOriginator(scan.getDocument().getOriginator()); } else {
	 * dib.setOriginator(""); }
	 * 
	 * dib.setIngestion_info(scan.getDocument().getIngestion_info());
	 * dib.setIngestion_user(scan.getDocument().getIngestion_user());
	 * dib.setIngestion_date(scan.getDocument().getIngestion_date());
	 * dib.setIngestion_time(scan.getDocument().getIngestion_time());
	 * dib.setDoc_description(scan.getDocument().getDoc_description());
	 * dib.setFile_code(scan.getDocument().getFile_code());
	 * dib.setFolder_type_code(scan.getDocument().getFolder_type_code());
	 * dib.setDoc_type_code(scan.getDocument().getDoc_type_code());
	 * dib.setDocdate(scan.getDocument().getDocdate());
	 * dib.setDoc_producer(scan.getDocument().getDoc_producer()); if
	 * (scan.getDocument().getUwyear() != null) {
	 * dib.setUwyear(scan.getDocument().getUwyear()); } else {
	 * dib.setUwyear(""); } if (scan.getDocument().getAcknowledged_date() !=
	 * null) {
	 * dib.setAcknowledged_date(scan.getDocument().getAcknowledged_date()); }
	 * else { dib.setAcknowledged_date(""); } if
	 * (scan.getDocument().getActioned_date() != null) {
	 * dib.setActioned_date(scan.getDocument().getActioned_date()); } else {
	 * dib.setActioned_date(""); }
	 * 
	 * // // dib.setScantime(FileUtilities.dateToString("HH:mm:ss", new // //
	 * Date())); // dib.setScantime(new SimpleDateFormat("HH:mm:ss").format(new
	 * // Date()));
	 * 
	 * // // if (!(documentBean.getDocDate() == null)) { // //
	 * dib.setDocdate(documentBean.getDocDate()); // Date docdate = new
	 * SimpleDateFormat("dd/MM/yyyy //
	 * HH:mm:ss").parse(documentBean.getDocDate()); // dib.setDocdate(new
	 * SimpleDateFormat("yyyyMMdd").format(docdate)); // } else { //
	 * dib.setDocdate(""); // } // //
	 * dib.setScandate(FileUtilities.dateToString("yyyyMMdd", new // //
	 * Date())); // dib.setScandate(new SimpleDateFormat("yyyyMMdd").format(new
	 * // Date()));
	 * 
	 * // iccxml.setIndex(inx); iccxml.setDocument(dib); xml =
	 * jaxbObjectToXML(iccxml);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * if (resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION)
	 * != null) { String destination =
	 * resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION) +
	 * File.separator + inx.getCtry_code() + File.separator +
	 * FileUtilities.dateToString("ddMMyyyy", new Date()); File destinationFile
	 * = new File(destination); if (!(destinationFile.exists() &&
	 * destinationFile.isDirectory())) { destinationFile.mkdirs(); }
	 * 
	 * // Boolean fc = new File(destinationFile + File.separator + //
	 * documentBean.getDocName() + ".xml").createNewFile(); Boolean fc = new
	 * File(destinationFile + File.separator + dib.getOtherref() +
	 * xmlName).createNewFile(); // +
	 * FileUtilities.removeExtension(documentBean.getDocName()) + //
	 * ".xml").createNewFile();
	 * 
	 * LOG.info("File Exists:" + fc); if (fc) { // File file = new
	 * File(destinationFile + File.separator + // documentBean.getDocName() +
	 * ".xml"); File file = new File(destinationFile + File.separator +
	 * dib.getOtherref() // + //
	 * FileUtilities.removeExtension(documentBean.getDocName()) // + ".xml"); +
	 * xmlName); FileWriter fw = new FileWriter(file.getAbsoluteFile());
	 * BufferedWriter bw = new BufferedWriter(fw); bw.write(xml); bw.close(); }
	 * else { LOG.info("File already in the file system." + destinationFile +
	 * File.separator + dib.getOtherref() + xmlName); }
	 * 
	 * fc = new File(destinationFile + File.separator + dib.getOtherref() +
	 * doc.getName()).createNewFile(); if (fc) {
	 * 
	 * File file = new File(destinationFile + File.separator + dib.getOtherref()
	 * + doc.getName()); // FileUtils.copyFile(doc, file);
	 * 
	 * FileUtilities.fileMove(doc.toString(), file.toString()); } else {
	 * LOG.info("File already in the file system." + destinationFile +
	 * File.separator + dib.getOtherref() + doc); }
	 * 
	 * } else { throw new ProgramException(
	 * "ICC Destination Path is not available in connection.propertie file");
	 * 
	 * }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); LOG.error(
	 * "PreProcessorServiceImpl :: generateXML - " + e); throw new
	 * ProgramException("PreProcessorServiceImpl : generateXML()"); } return
	 * true;
	 * 
	 * }
	 */

	/*
	 * private ScannedImageType unMarshallingTheXML(File xml) {
	 * 
	 * JAXBContext jaxbContext; ScannedImageType scan = null; try { jaxbContext
	 * = JAXBContext.newInstance(ScannedImageType.class); Unmarshaller
	 * jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	 * 
	 * scan = (ScannedImageType) jaxbUnmarshaller.unmarshal(xml);
	 * 
	 * } catch (JAXBException e) { e.printStackTrace(); }
	 * 
	 * return scan; }
	 */

	/*
	 * private String jaxbObjectToXML(ScannedImageType iccxml) throws
	 * ProgramException {
	 * 
	 * StringWriter writer = new StringWriter(); try {
	 * 
	 * JAXBContext context = JAXBContext.newInstance(ScannedImageType.class);
	 * Marshaller m = context.createMarshaller();
	 * m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	 * m.marshal(iccxml, writer);
	 * 
	 * } catch (Exception e) { throw new ProgramException(
	 * "Exception occurred in JaxbObjectToXML()", e); } LOG.debug(
	 * "XML CONTENT : " + writer.toString()); return writer.toString(); }
	 */

	/*
	 * private boolean validateXMLSchema(String xsdPath, String xmlPath) { try {
	 * SchemaFactory factory =
	 * SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); Schema
	 * schema = factory.newSchema(new File(xsdPath)); Validator validator =
	 * schema.newValidator(); validator.validate(new StreamSource(new
	 * File(xmlPath))); } catch (IOException e) { LOG.info(
	 * "Exception while validateXMLSchema" + e); return false;
	 * 
	 * } catch (SAXException e1) { LOG.info("Exception while validateXMLSchema"
	 * + e1); return false; }
	 * 
	 * return true;
	 * 
	 * }
	 */

	private boolean validateAgainstXSD(InputStream xml, InputStream xsd) throws ProgramException {
		try {
			if (xsd != null) {
				Schema schema = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
						.newSchema(new StreamSource(xsd));
				Validator validator = schema.newValidator();
				validator.validate(new StreamSource(xml));
				return true;
			} else {
				return false;
			}
		} catch (SAXException e) {
			LOG.error("validateAgainstXSD SAXException While validating the XML aganist schema, Message - " + e);
			LOG.debug(e);

			return false;
		} catch (IOException e) {
			LOG.error("validateAgainstXSD Exception While validating the XML aganist schema, Message - " + e);
			throw new ProgramException("Exception While validating the XML aganist schema, Message - " + e);
		}

	}

}
