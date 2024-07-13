package com.chubb.workview.documentservice.docwebservice;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;

import org.apache.commons.codec.binary.Base64;

import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.w3c.dom.NodeList;
import javax.xml.bind.Unmarshaller;

import com.chubb.workview.documentservice.main.ResourceLoader; 
import com.chubb.workview.documentservice.jaxb.iccxml.DocumentType;
import com.chubb.workview.documentservice.jaxb.iccxml.IndexType;
import com.chubb.workview.documentservice.jaxb.iccxml.ScannedImageType;
import com.chubb.workview.documentservice.ArrayOfWorkViewDocument;
import com.chubb.workview.documentservice.SpecificDocumentResponse;
import com.chubb.workview.documentservice.WorkViewDocument;
import com.chubb.workview.documentservice._2016._06.GetSpecificDocumentResponse;
import com.chubb.workview.documentservice.main.DBConnectionError;
import com.chubb.workview.documentservice.main.DocumentServiceMain;
import com.chubb.workview.documentservice.main.FileUtilities;
import com.chubb.workview.documentservice.main.ProgramException;

public class DocumentConnection {
	static final Logger LOG = Logger.getLogger(DocumentServiceMain.class);
	final ResourceLoader resources = ResourceLoader.getResources();
	protected Documentbean docbean;
	
	public Documentbean createDocConnection(Documentbean docbean) throws DBConnectionError, ProgramException {
        this.docbean = docbean;
            SOAPConnectionFactory soapConnectionFactory;
			try {
				soapConnectionFactory = SOAPConnectionFactory.newInstance();
		
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            String url = resources.getConnectionproperties().getProperty("ACTURIS_Document_WebService");
            
            SOAPMessage soapRequest;
              soapRequest = createSoapRequest();
           
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            soapRequest.writeTo(out);
            System.out.println("request:"+out.toString());
            LOG.info("OUTBOUND MESSAGE\n");
            LOG.info(out.toString());
            //hit soapRequest to the server to get response
            SOAPMessage soapResponse = soapConnection.call(soapRequest, url);
//            System.out.println("soapResponse:"+soapResponse.getSOAPBody());
            LOG.info("SOAP Call succesfull.");
            if (createSoapResponse(soapResponse)) {
                soapConnection.close();
                return this.docbean;
            } else {
                LOG.info("SOAP Call failed.");
                
                return this.docbean;
            }
			} catch (UnsupportedOperationException | SOAPException | IOException e) {
				LOG.error(e);
				e.printStackTrace();
				return this.docbean;
				
			} 
        }
	
	private SOAPMessage createSoapRequest() throws SOAPException, ProgramException, DBConnectionError   {

        MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);


        SOAPMessage soapMessage = messageFactory.createMessage();

      
        SOAPPart soapPart = soapMessage.getSOAPPart();


        SOAPEnvelope soapEnvelope = soapPart.getEnvelope();


        soapEnvelope.addNamespaceDeclaration("ns", "http://chubb.com/Workview/DocumentService/2016/06");
        soapEnvelope.addNamespaceDeclaration("ns1", "http://chubb.com/WorkView/DocumentService/2016/06");
        
       
        SOAPHeader header = soapEnvelope.getHeader();
        
        header.addNamespaceDeclaration("wsa", "http://www.w3.org/2005/08/addressing");
        
        SOAPElement headerElement = header.addChildElement("Action", "wsa");        
        headerElement.addTextNode("http://chubb.com/Workview/DocumentService/2016/06/DocumentService/GetSpecificDocument");
        
        SOAPElement headerElement1 = header.addChildElement("To", "wsa");
        headerElement1.addTextNode(resources.getConstantproperties().getProperty("Doc_Service_To"));
        
                
        SOAPBody soapBody = soapEnvelope.getBody();

        SOAPElement soapElement = soapBody.addChildElement("GetSpecificDocument", "ns");

        SOAPElement element1 = soapElement.addChildElement("request", "ns");

        SOAPElement element2 = element1.addChildElement("DocumentGUID", "ns1");
        element2.addTextNode(this.docbean.getDocid());
        
        SOAPElement element3 = element1.addChildElement("EnvironmentData", "ns1");
        
        SOAPElement element5 = element3.addChildElement("MessageGUID","ns1");
        element5.addTextNode(this.docbean.getMsgid());
        
        SOAPElement element6 = element3.addChildElement("CountryCode","ns1");
        element6.addTextNode(this.docbean.getCountrycode());
        
        SOAPElement element7 = element3.addChildElement("SourceSystem","ns1");
        element7.addTextNode("ACTURIS");
        
        SOAPElement element8 = element3.addChildElement("WorkViewLogonID", "ns1");
        element8.addTextNode(resources.getConnectionproperties().getProperty("ACTURIS_WorkViewLogonID"));
        
        SOAPElement element9 = element3.addChildElement("WorkViewEnvironment", "ns1");
        element9.addTextNode(resources.getConnectionproperties().getProperty("ACTURIS_WorkViewEnvironment"));

        soapMessage.saveChanges();

         return soapMessage;
       }

    private boolean createSoapResponse(SOAPMessage soapResponse) {
    	 ByteArrayOutputStream out = new ByteArrayOutputStream();
    	 SpecificDocumentResponse rt = null;
//         Response rt = null;
//                try {
//            StringBuilder sb = new StringBuilder();
//            if (soapResponse.getSOAPBody().hasFault()) {
//                LOG.error("Webservice threw an exception while fetching Document.");
//                SOAPElement exceptionDetail = (SOAPElement) soapResponse.getSOAPBody().getFault().getDetail().getDetailEntries().next();
//                if (null != exceptionDetail.getChildNodes().item(1)) {
//                    NodeList nl = exceptionDetail.getChildNodes().item(1).getChildNodes();
//
//                    sb.append("Message :" + nl.item(2).getTextContent());
//                    sb.append("Stack trace : " + nl.item(3).getTextContent());
//                    sb.append("Type " + nl.item(4).getTextContent());
//
//                }
//                LOG.error(sb.toString());
//                return false;
//            }
//
//
//        } catch (SOAPException e) {
//            LOG.error(e);
//        }
        try {
        	
//        	System.out.println("Soap respnse:"+soapResponse.getSOAPBody());
//        	System.out.println("Soap content:"+soapResponse.getSOAPBody().extractContentAsDocument());
        	soapResponse.writeTo(out);
        	 LOG.info("INBOUND MESSAGE\n");
//        	 System.out.println("Response:"+out);
        	LOG.info(out);
//        	 System.out.println("before marshalling");
//            JAXBContext jc = JAXBContext.newInstance(GetSpecificDocumentResponseElement.class);
            JAXBContext jc = JAXBContext.newInstance(GetSpecificDocumentResponse.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            
            JAXBElement<GetSpecificDocumentResponse> getdocumentresponse;
//            System.out.println("After marshallingfasdf:"+unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument(), GetSpecificDocumentResponse.class));
            getdocumentresponse = unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument(), GetSpecificDocumentResponse.class);
//            System.out.println("After marshalling  dsaf:"+getdocumentresponse);
//            System.out.println("After marshalling:"+unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument(), GetSpecificDocumentResponse.class));
//            createOrupdatedocumentresponse = unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument(), GetSpecificDocumentResponseElement.class);

            GetSpecificDocumentResponse value = getdocumentresponse.getValue();
            JAXBElement<SpecificDocumentResponse> response = value.getGetSpecificDocumentResult();
//            GetSpecificDocumentResponseElement value = createOrupdatedocumentresponse.getValue();
//            JAXBElement<Response> response = value.getGetSpecificDocumentResult();
            rt = response.getValue();
            
//            System.out.println("Status"+rt.getWorkViewDocument());

        } catch (JAXBException | SOAPException e) {
            LOG.error("Marshalling failed", e);
        } catch (IOException e) {
			LOG.error(e);
		}

        if (null != rt && null != rt.getOverallResult().getValue()) {
        	System.out.println("value:"+rt.getOverallResult());
        	ArrayOfWorkViewDocument wvresponse = rt.getWorkViewDocument().getValue().getAttachments().getValue();
        	String str = rt.getWorkViewDocument().getValue().getDocumentData().getValue();
        	
        	File file;
			String destinationPath = resources.getConnectionproperties().getProperty("ICC.shared.location")
					+ File.separator + this.docbean.getCountrycode() + File.separator
					+ FileUtilities.dateToString("ddMMyyyy", new Date());
			File destination = new File(destinationPath);
			if (!(destination.exists() && destination.isDirectory())) {
				destination.mkdirs();
			}
			Boolean fc;
			try {
				/*
				fc = new File(destination + File.separator + 
						rt.getWorkViewDocument().getValue().getDocumentDescription().getValue() 
						+ ".xml" ).createNewFile();
				if (fc) {
					file = new File(destination + File.separator + 
							rt.getWorkViewDocument().getValue().getDocumentDescription().getValue().toString() 
							+ ".xml"); 
				}
				try (FileOutputStream fis = new FileOutputStream(file)) {
					fis.write(generateXML.get(counter).getBytes());

				}
				*/
				
				fc = new File(destination + File.separator + 
						rt.getWorkViewDocument().getValue().getDocumentDescription().getValue() 
						+ "." + rt.getWorkViewDocument().getValue().getMimeType().getValue()).createNewFile();
			
			byte[] decodedBytes = Base64.decodeBase64(str);
			if (fc) {
				file = new File(destination + File.separator + 
						rt.getWorkViewDocument().getValue().getDocumentDescription().getValue().toString() 
						+ "." + rt.getWorkViewDocument().getValue().getMimeType().getValue()); 
				
        	
        	// Note the try-with-resources block here, to close the stream automatically
        	try (OutputStream stream = new FileOutputStream(file)) {
        	    stream.write(decodedBytes);
        	} 
			}
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String xml="";
	    	ScannedImageType iccxml=new ScannedImageType();
	    	IndexType inx=new IndexType();
	    	DocumentType dib=new DocumentType();
	    	
	    	inx.setBpuCode(this.docbean.getCountrycode());
	    	inx.setCtryCode(this.docbean.getCountrycode());
	    	
	    	dib.setDocDescription(rt.getWorkViewDocument().getValue().getDocumentDescription().getValue());
	    	dib.setFileName(rt.getWorkViewDocument().getValue().getDocumentDescription().getValue() 
	    			+ "" + rt.getWorkViewDocument().getValue().getMimeType().getValue() );
	    	dib.setGuId(rt.getWorkViewDocument().getValue().getDocumentGUID().getValue());
	    	dib.setMimeType(rt.getWorkViewDocument().getValue().getMimeType().getValue());
        	
	    	iccxml.setDocument(dib);
	    	iccxml.setIndex(inx);
	    	try {
				xml = jaxbObjectToXML(iccxml);
				
				fc = new File(destination + File.separator + 
						rt.getWorkViewDocument().getValue().getDocumentDescription().getValue() 
						+ ".xml" ).createNewFile();
				if (fc) {
					file = new File(destination + File.separator + 
							rt.getWorkViewDocument().getValue().getDocumentDescription().getValue().toString() 
							+ ".xml"); 
				
				try (FileOutputStream fis = new FileOutputStream(file)) {
					fis.write(xml.getBytes());

				}
				}
//				File f = new File("C:\\vijay\\sample.xml");
//				 FileWriter fw=new FileWriter(f.getAbsoluteFile());
//		           BufferedWriter bw=new BufferedWriter(fw);
//		             bw.write(xml);
//		             bw.close();
				
			} catch (ProgramException e) {
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
	    	System.out.print("Document Creation process completed");
	    	List WorkViewDocument = wvresponse.getWorkViewDocument();
//        	System.out.println("Attachment count:"+WorkViewDocument.size());
            return true;
        } else {
            LOG.info("Fail Response from the server");
            return false;
        }


    }
    
   /*
    private String generateXML() throws ProgramException {
    	String xml="";
    	ScannedImageType iccxml=new ScannedImageType();
    	IndexType inx=new IndexType();
    	DocumentType dib=new DocumentType();
    	
    	inx.setBpuCode(this.docbean.getCountrycode());
    	inx.setCtryCode(this.docbean.getCountrycode());
    	
    	dib.setDocDescription(rt.getWorkViewDocument().getValue().getDocumentDescription().getValue());
    	dib.setFileName(rt.getWorkViewDocument().getValue().getDocumentDescription().getValue() 
    			+ "" + rt.getWorkViewDocument().getValue().getMimeType().getValue() );
    	dib.setGuId(rt.getWorkViewDocument().getValue().getDocumentGUID().getValue());
    	dib.setMimeType(rt.getWorkViewDocument().getValue().getMimeType().getValue());
    	
    	iccxml.setDocument(dib);
    	iccxml.setIndex(inx);
    	try {
			xml = jaxbObjectToXML(iccxml);
    }
    */
    
    private String jaxbObjectToXML(ScannedImageType iccxml) throws ProgramException {

    	StringWriter writer = new StringWriter();
        try {
        	
            JAXBContext context = JAXBContext.newInstance(ScannedImageType.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(iccxml, writer);
          
          
         
        } catch (Exception e) {
            throw new ProgramException("Exception occurred in JaxbObjectToXML()",e);
        }
        LOG.debug("XML CONTENT : " + writer.toString());
        return writer.toString();
    }


}
