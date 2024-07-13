package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;



public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try{
//		try (InputStream stream = new FileInputStream("C:\\Preprocess\\GenericPP\\Input\\AMEX\\Sample.xml")) {
//		    XMLInputFactory inputFactory = XMLInputFactory.newFactory();
//		    inputFactory.setProperty(XMLInputFactory.IS_COALESCING, true);
//
//		    XMLStreamReader reader = inputFactory.createXMLStreamReader(stream);
//
//		    while (reader.hasNext()) {
//		        switch (reader.next()) {
//		            case XMLStreamConstants.START_ELEMENT:
//		                System.out.println("Start " + reader.getName());
//		                for (int i = 0, count = reader.getAttributeCount(); i < count; i++) {
//		                    System.out.println(reader.getAttributeName(i) + "=" + reader.getAttributeValue(i));
//		                }
//		                break;
//		            case XMLStreamConstants.END_ELEMENT:
//		                System.out.println("End " + reader.getName());
//		                break;
//		            case XMLStreamConstants.CHARACTERS:
//		            case XMLStreamConstants.SPACE:
//		                String text = reader.getText();
//		                if (!text.trim().isEmpty()) {
//		                    System.out.println("text: " + text);
//		                }
//		                break;
//		        }
//		    }
//		} catch ( IOException | XMLStreamException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		String str = "COOPENOR S.C. FORENAME Test Data COOPENOR S.C. FORENAME Test Data COOPENOR S.C. FORENAME Test Data COOPENOR S.C. FORENAME Test Data COOPENOR S.C. FORENAME Test Data COOPENOR S.C. FORENAME Test Data COOPENOR S.C. FORENAME Test Data";
		System.out.println("string len:"+str.length());
	    
			
		

//	} catch(Exception e){
//		e.printStackTrace();
//	}

	}
}

