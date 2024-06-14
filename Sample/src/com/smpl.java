package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class smpl {

	public static void main(String[] args) throws SAXException {
		// TODO Auto-generated method stub
		File file[] = new File("C:\\Preprocess\\GenericPP\\Input\\PRIMA").listFiles();
		for(int j = 0; j<file.length; j++){
			try {
				InputStream is = new FileInputStream(file[j]);
				byte[] byteArray;
					byteArray = IOUtils.toByteArray((InputStream) is);
				String xml = new String(byteArray, "UTF-8");
				is.close();
				InputStream xsd = null;
				xsd = new FileInputStream(new File("C:\\Preprocessor\\GenericPP\\Properties\\Local\\PRIMA.xsd"));
				if (validateAgainstXSD(IOUtils.toInputStream(xml, "UTF-8"), xsd)) {
					DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
					DocumentBuilder db = dbf.newDocumentBuilder();
					Document xmldoc = db.parse(file[j]);
					xmldoc.getDocumentElement().normalize();
					NodeList nodeList = xmldoc.getElementsByTagName("*");
					for (int i = 0; i < nodeList.getLength(); i++) {
						
						Element element = (Element) nodeList.item(i);
						if(element.getNodeName().equalsIgnoreCase("item")){
//						System.out.println("element:"+element.getNodeName());
						System.out.println("Attribute:"+element.getAttribute("name"));
//						System.out.println("Value:"+element.getTextContent());
						}
						if(element.getNodeName().equalsIgnoreCase("value")){
						System.out.println("element:"+element.getNodeName());
//						System.out.println("Attribute:"+element.getAttribute("name"));
						System.out.println("Value:"+element.getTextContent());
						}
						
					}
				}
			}
				catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	private static boolean validateAgainstXSD(InputStream xml, InputStream xsd) {
		try {
			if (xsd != null) {
				Schema schema = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
						.newSchema(new StreamSource(xsd));
				Validator validator = schema.newValidator();
				validator.validate(new StreamSource(xml));
				System.out.println("Validation Successful");
				return true;
			} else {
				return false;
			}
		} catch (SAXException e) {
			System.out.println("validateAgainstXSD SAXException While validating the XML aganist schema, Message - " + e);
			return false;
		} catch (IOException e) {
			System.out.println("validateAgainstXSD Exception While validating the XML aganist schema, Message - " + e);
		}
		return false;
	}
	
	

}
