package com.chubb.preprocessor.acturis.documentservice;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
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

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.chubb.preprocessor.acturis.bean.DocumentBean;
import com.chubb.preprocessor.acturis.preprocessor.DBConnectionError;
import com.chubb.preprocessor.acturis.preprocessor.ProgramException;
import com.chubb.preprocessor.acturis.preprocessor.ResourceLoader;

import core.documentservice.chubb.TransferDocumentResponse;

//import datacontracts.core.documentservice.chubb._2016._03.*;
//import datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse.OutPutReferenceData;

//import unwanted.TransferDocumentResponse;
//import unwanted.TransferDocumentResponse;

public class DocumentServiceConnection {

	private static final Logger LOG = Logger.getLogger(DocumentServiceConnection.class);
	final ResourceLoader resources = ResourceLoader.getResources();
	protected DocumentBean dbean;

	public DocumentBean createDocConnection(DocumentBean dbean) throws DBConnectionError, ProgramException {
		this.dbean = dbean;
		SOAPConnectionFactory soapConnectionFactory;
		try {
			soapConnectionFactory = SOAPConnectionFactory.newInstance();

			SOAPConnection soapConnection = soapConnectionFactory.createConnection();
			String url = resources.getConnectionproperties().getProperty("ACTURIS_Document_WebService");

			SOAPMessage soapRequest;
			soapRequest = createSoapRequest();

			ByteArrayOutputStream out = new ByteArrayOutputStream();
			soapRequest.writeTo(out);
			
			if(resources.getConstantproperties().getProperty("ENABLE_SERVICE_LOG").equalsIgnoreCase("Y")){
			LOG.info("OUTBOUND MESSAGE\n"+out.toString());
			}
			// hit soapRequest to the server to get response
			SOAPMessage soapResponse = soapConnection.call(soapRequest, url);
			// System.out.println("soapResponse:"+soapResponse.getSOAPBody());
			LOG.info("SOAP Call succesfull.");
			if (createSoapResponse(soapResponse)) {
				soapConnection.close();
				return this.dbean;
			} else {
				LOG.info("SOAP Call failed.");

				return this.dbean;
			}
		} catch (UnsupportedOperationException | SOAPException | IOException e) {
			LOG.error(e);
			e.printStackTrace();
			return this.dbean;

		}
	}

	private SOAPMessage createSoapRequest() throws SOAPException, ProgramException, DBConnectionError {

		MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);

		SOAPMessage soapMessage = messageFactory.createMessage();

		SOAPPart soapPart = soapMessage.getSOAPPart();

		SOAPEnvelope soapEnvelope = soapPart.getEnvelope();

		soapEnvelope.addNamespaceDeclaration("chub", "Chubb.DocumentService.Core");
		soapEnvelope.addNamespaceDeclaration("ns", "http://Chubb.DocumentService.Core.DataContracts/2016/03");

		SOAPHeader header = soapEnvelope.getHeader();

		header.addNamespaceDeclaration("wsa", "http://www.w3.org/2005/08/addressing");

		SOAPElement headerElement = header.addChildElement("Action", "wsa");
		headerElement.addTextNode("Chubb.DocumentService.Core/IDocument/TransferDocument");

		SOAPElement headerElement1 = header.addChildElement("To", "wsa");
		headerElement1.addTextNode(resources.getConstantproperties().getProperty("Doc_Service_To"));

		SOAPBody soapBody = soapEnvelope.getBody();

		SOAPElement soapElement = soapBody.addChildElement("TransferDocument", "chub");

		SOAPElement element1 = soapElement.addChildElement("transferDocumentRequest", "chub");

		SOAPElement element2 = element1.addChildElement("DestinationSystem", "ns");


		element2.addTextNode("DMZ");

		SOAPElement element3 = element1.addChildElement("InputReferenceData", "ns");

		SOAPElement element4 = element3.addChildElement("WorkViewActurisDocumentRequest");

		SOAPElement element5 = element4.addChildElement("DocumentFilePath");
		
		if(this.dbean.getDocLocation() != null && this.dbean.getDocLocation().length() > 0){
		element5.addTextNode(this.dbean.getDocLocation());
		} else {
			element5.addTextNode("");
		}
//		element5.addTextNode("C:\\Acturisfolder\\ActurisDocumentTest.txt");

		SOAPElement element6 = element4.addChildElement("DocumentID");
		 element6.addTextNode(this.dbean.getDocId());
//		element6.addTextNode("3453");

		SOAPElement element7 = element4.addChildElement("CountryCode");
		 element7.addTextNode(this.dbean.getCountryName());
//		element7.addTextNode("GB");

		SOAPElement element8 = element4.addChildElement("SourceSystem");
		// element8.addTextNode("");
		element8.addTextNode("ACTURIS");

		SOAPElement element9 = element4.addChildElement("WorkViewLogonID");
		element9.addTextNode(resources.getConnectionproperties().getProperty("ACTURIS_WorkViewLogonID"));

		SOAPElement element10 = element4.addChildElement("WorkViewEnvironment");
		element10.addTextNode(resources.getConnectionproperties().getProperty("ACTURIS_WorkViewEnvironment"));

		SOAPElement element11 = element1.addChildElement("SourceSystem", "ns");
		element11.addTextNode("ACTURIS");

		soapMessage.saveChanges();

		return soapMessage;
	}

	private boolean createSoapResponse(SOAPMessage soapResponse) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		boolean status = true;
		try {
			soapResponse.writeTo(out);
//			LOG.info("INBOUND MESSAGE\n");
//			LOG.info(out);

			JAXBContext jc = JAXBContext.newInstance(TransferDocumentResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			JAXBElement<TransferDocumentResponse> getDocumentResponse = unmarshaller
					.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument(), TransferDocumentResponse.class);
			TransferDocumentResponse value = getDocumentResponse.getValue();

			JAXBElement<datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse> response = value
					.getTransferDocumentResult();

			datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse rt = response.getValue();

		
			if (null != rt && null != rt.isOverallResult() && rt.isOverallResult()) {
			
				JAXBElement<datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse.OutPutReferenceData> d = rt
						.getOutPutReferenceData();
				datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse.OutPutReferenceData d1 = d
						.getValue();

				Object dd1 = d1.getAny();
				org.w3c.dom.Element elem = (org.w3c.dom.Element) dd1;

				NodeList childNodes = elem.getChildNodes();
				for (int i = 0; i < childNodes.getLength(); i++) {
					Node aNode = childNodes.item(i);
					String nodeName = aNode.getNodeName();
					String txtContent = aNode.getTextContent();
					
					if (nodeName.equalsIgnoreCase("OverallStatus")){
						if("Fail".equalsIgnoreCase(txtContent)) {
						this.dbean.setStatus(false);
						} else {
							this.dbean.setStatus(true);
						}
						continue;
					}
					else if (nodeName.equalsIgnoreCase("ErrorText")) {
						LOG.info("DMZ service error message:"+txtContent);
						this.dbean.setErrorText(txtContent);
						continue;
					}
					else if (nodeName.equalsIgnoreCase("DocumentFileName")) {
//						System.out.println("DocumentFileName:" + txtContent);
						this.dbean.setDocName(txtContent);
						continue;
					}
					else if (nodeName.equalsIgnoreCase("DocumentDate")) {
//						System.out.println("DocumentDate:" + txtContent);
						this.dbean.setDocDate(txtContent);
						continue;
					}
//					else if (nodeName.equalsIgnoreCase("DocumentID")) {
//						System.out.println("DocumentID:" + txtContent);
//						continue;
//					}
					else if (nodeName.equalsIgnoreCase("DocumentData")) {
//						System.out.println("DocumentData:" + txtContent);
						this.dbean.setDocData(txtContent);
						continue;
					}
//					else if (nodeName.equalsIgnoreCase("CountryCode")) {
//						System.out.println("CountryCode:" + txtContent);
//						continue;
//					}
//					else if (nodeName.equalsIgnoreCase("SourceSystem")) {
//						System.out.println("SourceSystem:" + txtContent);
//						this.dbean.set
//						continue;
//					}
//					else if (nodeName.equalsIgnoreCase("WorkViewLogonID")) {
//						System.out.println("WorkViewLogonID:" + txtContent);
//						continue;
//					}
//					else if (nodeName.equalsIgnoreCase("WorkViewEnvironment")) {
//						System.out.println("WorkViewEnvironment:" + txtContent);
//						continue;
//					}
					
				}

			} else {
	            LOG.info("Fail Response from the server");
	            status = false;
	        }

		} catch (JAXBException | SOAPException e) {
			LOG.error("Marshalling failed", e);
			e.printStackTrace();
			status = false;
		} catch (IOException e) {
			LOG.error(e);
			e.printStackTrace();
			status = false;
		} catch (Exception e) {
			LOG.error(e);
			e.printStackTrace();
			status = false;
		}
		return status;
	}

}
