package com.chubb.workview.certificateservice._2016._06;

import com.chubb.preprocessors.emailbrokermaster.beans.EmailBean;


import com.chubb.preprocessors.emailbrokermaster.preprocessor.ResourceLoader;
import com.chubb.preprocessors.emailbrokermaster.utilities.FileUtilities;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;

import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import org.apache.log4j.Logger;

import org.w3c.dom.NodeList;

public class CertificateConnection
{
  static final Logger log = Logger.getLogger(CertificateConnection.class);
  final ResourceLoader resources = ResourceLoader.getResources();
  protected EmailBean emailbean;
  
  public EmailBean CreatePolicyConnection(EmailBean emailbean)
  {
    this.emailbean = emailbean;
    try
    {
      SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
      SOAPConnection soapConnection = soapConnectionFactory.createConnection();
      String url = this.resources.getConstantproperties().getProperty("Certificate_WebService");
      

      SOAPMessage soapRequest = createSoapRequest();
      
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      soapRequest.writeTo(out);
      log.info("OUTBOUND MESSAGE\n");
      log.info(out.toString());
      
      SOAPMessage soapResponse = soapConnection.call(soapRequest, url);
      
      log.debug("SOAP Call succesfull.");
      if (createSoapResponse(soapResponse))
      {
        this.emailbean.setCertCreated(true);
        
        soapConnection.close();
        return this.emailbean;
      }
      this.emailbean.setCertCreated(false);
      log.debug("SOAP Call failed.");
      return this.emailbean;
    }
    catch (Exception e)
    {
      log.error("Error occurred while creating Certificate", e);
    }
    return this.emailbean;
  }
  
  private boolean createSoapResponse(SOAPMessage soapResponse)
  {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    
    Response rt = null;
   
    try
    {
      soapResponse.writeTo(out);
      log.info("INBOUND MESSAGE\n");
      log.info(out);
      
      if (soapResponse.getSOAPBody().hasFault())
      {
        log.error("Webservice threw an exception while creating Certificate, Exiting processing.");
        return false;
        
      }
      
      JAXBContext jc = JAXBContext.newInstance(new Class[] { CreateOrUpdateCertificateResponse.class });
      Unmarshaller unmarshaller = jc.createUnmarshaller();
      

      JAXBElement<CreateOrUpdateCertificateResponse> createOrupdatepolicyresponse = unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument(), CreateOrUpdateCertificateResponse.class);
      

      CreateOrUpdateCertificateResponse value = createOrupdatepolicyresponse.getValue();
      JAXBElement<Response> response = value.getCreateOrUpdateCertificateResult();
      rt = response.getValue();
    }
    catch (JAXBException|SOAPException e)
    {
      log.error("Marshalling failed", e);
    }
    catch (IOException e)
    {
      log.error(e);
    }
    if ((null != rt) && (null != rt.getOverAllResult()) && ("Success".equalsIgnoreCase(rt.getOverAllResult()))) {
      return true;
    }
    log.info("Null Response from the server");
    return false;
  }
  
  private SOAPMessage createSoapRequest()
    throws SOAPException
  {
    MessageFactory messageFactory = MessageFactory.newInstance("SOAP 1.2 Protocol");
    

    SOAPMessage soapMessage = messageFactory.createMessage();
    

    SOAPPart soapPart = soapMessage.getSOAPPart();
    

    SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
    

    soapEnvelope.addNamespaceDeclaration("ns1", "http://Chubb.com/WorkView/CertificateService/2016/06");
    
    soapEnvelope.addNamespaceDeclaration("ns2", "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts");
    
    SOAPHeader header = soapEnvelope.getHeader();
    
    header.addNamespaceDeclaration("wsa", "http://www.w3.org/2005/08/addressing");
    

    SOAPElement headerElement = header.addChildElement("Action", "wsa");
    
    headerElement.addTextNode("CreateOrUpdateCertificate");
    

    SOAPElement headerElement1 = header.addChildElement("To", "wsa");
    headerElement1.addTextNode(this.resources.getConstantproperties().getProperty("Certificate_WebService_To"));
    
    SOAPBody soapBody = soapEnvelope.getBody();
    
    SOAPElement soapElement = soapBody.addChildElement("CreateOrUpdateCertificate", "ns1");
    

    SOAPElement element1 = soapElement.addChildElement("request", "ns1");
    


    SOAPElement element2 = element1.addChildElement("CertificateDetails", "ns1");
    SOAPElement element3 = element1.addChildElement("EnvironmentData", "ns1");
    
    SOAPElement element4 = element2.addChildElement("CertificateRequest", "ns1");
    
    SOAPElement element5 = element4.addChildElement("CertificateInfoRequest", "ns1");
    SOAPElement element15 = element4.addChildElement("CorrespondentInfoRequest", "ns1");
    
    SOAPElement element6 = element5.addChildElement("CertificateNumber", "ns1");
    if (null != this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertNumber()) {
      element6.addTextNode(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertNumber());
    } else {
      element6.addTextNode("");
    }
    SOAPElement element7 = element5.addChildElement("PolicyNumber", "ns1");
    
    element7.addTextNode(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getPolNumber());
    SOAPElement element8 = element5.addChildElement("CertificateName", "ns1");
    element8.addTextNode(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertName());
    SOAPElement element9 = element5.addChildElement("EntityCode", "ns1");
    element9.addTextNode(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getEntCode());
    SOAPElement element10 = element5.addChildElement("CreatedDate", "ns1");
    element10.addTextNode(FileUtilities.dateToString("yyyy-MM-dd", new Date()));
    
    SOAPElement element16 = element15.addChildElement("CorrespondentName", "ns1");
    element16.addTextNode(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertName());
    
    SOAPElement element17 = element15.addChildElement("ContactName", "ns1");
    element17.addTextNode(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertName());
    



    SOAPElement element11 = element3.addChildElement("CountryCode", "ns2");
    
    element11.addTextNode("PH");
    
    SOAPElement element12 = element3.addChildElement("MessageGUID", "ns2");
    element12.addTextNode("");
    

    SOAPElement element13 = element3.addChildElement("SourceSystem", "ns2");
    element13.addTextNode("ACRS");
    

    SOAPElement element51 = element3.addChildElement("WorkViewEnvironment", "ns2");
    element51.addTextNode(this.resources.getConstantproperties().getProperty("ACRS_WorkViewEnvironment"));
    SOAPElement element52 = element3.addChildElement("WorkViewLogonID", "ns2");
    element52.addTextNode(this.resources.getConstantproperties().getProperty("ACRS_WorkViewLogonID"));
    

    soapMessage.saveChanges();
    
    return soapMessage;
  }
}
