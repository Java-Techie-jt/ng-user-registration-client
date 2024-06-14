package com.chubb.preprocessor.emailbrokermaster.policywebservice;

//RiskReferenceNo QuotedDate SignedLine SignedCODE
import com.chubb.preprocessors.emailbrokermaster.beans.EmailBean;
import com.chubb.preprocessors.emailbrokermaster.dao.PreProcessorDAO;
import com.chubb.preprocessors.emailbrokermaster.preprocessor.ResourceLoader;
import com.chubb.preprocessors.emailbrokermaster.service.DBConnectionError;
import com.chubb.preprocessors.emailbrokermaster.service.ProgramException;
import com.chubb.preprocessors.emailbrokermaster.utilities.FileUtilities;
import org.apache.log4j.Logger;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class PolicyConnection {
	private static final Logger LOG = Logger.getLogger(PolicyConnection.class);
    final ResourceLoader resources = ResourceLoader.getResources();
    protected EmailBean emailbean;

    public EmailBean createPolicyConnection(EmailBean emailbean) throws DBConnectionError, ProgramException {
        this.emailbean = emailbean;
       
            SOAPConnectionFactory soapConnectionFactory;
			try {
				soapConnectionFactory = SOAPConnectionFactory.newInstance();
		
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            String url = resources.getConnectionproperties().getProperty("IGNITE_Policy_WebService");
            
            SOAPMessage soapRequest;
              soapRequest = createSoapRequest();
           
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            soapRequest.writeTo(out);
            LOG.info("OUTBOUND MESSAGE\n");
            LOG.info(out.toString());
            //hit soapRequest to the server to get response
            SOAPMessage soapResponse = soapConnection.call(soapRequest, url);

            LOG.info("SOAP Call succesfull.");
            if (createSoapResponse(soapResponse)) {
                soapConnection.close();
                return this.emailbean;
            } else {
                LOG.info("SOAP Call failed.");
                
                return this.emailbean;
            }
			} catch (UnsupportedOperationException | SOAPException | IOException e) {
				
				return this.emailbean;
				
			} 
        }
       
    
    private SOAPMessage createSoapRequest() throws SOAPException, ProgramException, DBConnectionError   {

        MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);


        SOAPMessage soapMessage = messageFactory.createMessage();

      
        SOAPPart soapPart = soapMessage.getSOAPPart();


        SOAPEnvelope soapEnvelope = soapPart.getEnvelope();

        soapEnvelope.addNamespaceDeclaration("ns", "http://chubb.com/WorkView/PolicyService/2016/06");
        soapEnvelope.addNamespaceDeclaration("ns1", "http://Chubb.com/WorkView/PolicyService/2016/06");
        soapEnvelope.addNamespaceDeclaration("chub", "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts");


        SOAPHeader header = soapEnvelope.getHeader();
        
        header.addNamespaceDeclaration("wsa", "http://www.w3.org/2005/08/addressing");


        SOAPElement headerElement = header.addChildElement("Action", "wsa");
       
        headerElement.addTextNode("http://chubb.com/WorkView/PolicyService/2016/06/PolicyService/CreateOrUpdatePolicy");
        SOAPElement headerElement1 = header.addChildElement("To", "wsa");
        headerElement1.addTextNode(resources.getConstantproperties().getProperty("IGNITE_Policy_To"));

        SOAPBody soapBody = soapEnvelope.getBody();

        SOAPElement soapElement = soapBody.addChildElement("CreateOrUpdatePolicy", "ns");


        SOAPElement element1 = soapElement.addChildElement("request", "ns");

        SOAPElement element2 = element1.addChildElement("PolicyRequest", "ns1");
        SOAPElement element3 = element1.addChildElement("EnvironmentData", "ns1");

        SOAPElement element4 = element2.addChildElement("PolicyInfo", "ns1");
        SOAPElement element8 = element4.addChildElement("PolicyNumber", "ns1");
        element8.addTextNode(this.emailbean.getRiskEnvelopeType().getRiskIndex().getPOLNUMBER());


        SOAPElement element30 = element4.addChildElement("PolicySite", "ns1");
        if (null != this.emailbean.getRiskEnvelopeType().getSubmissionData().getPOLSITE()) {
            element30.addTextNode(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPOLSITE());
        } else {
            element30.addTextNode("");

        }
        SOAPElement element53 = element4.addChildElement("EntityCode", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getRiskIndex().getENTCODE())) {
            element53.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getRiskIndex().getENTCODE()));
        } else 
            element53.addTextNode("");

            SOAPElement element56 = element4.addChildElement("MasterPolicyNumber", "ns1");
            if (null != this.emailbean.getRiskEnvelopeType().getSubmissionData().getPOLMASTERPOL()) {
                element56.addTextNode(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPOLMASTERPOL());
            } else {
                element56.addTextNode("");

            
      
            
            }         SOAPElement element23 = element4.addChildElement("IsSensitive", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getISSENSITIVE())) {
            element23.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getISSENSITIVE()));
        } else {
            element23.addTextNode("");
        }

        SOAPElement element31 = element4.addChildElement("PrimaryLimit", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPRIMARYLIMIT())) {
            element31.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPRIMARYLIMIT()));
        } else {
            element31.addTextNode("");

        }
        SOAPElement element14 = element4.addChildElement("CommissionPercentEL", "ns1");
        if (null !=Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getCOMMISSIONPCTEL())) {
            element14.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getCOMMISSIONPCTEL()));
        } else {
            element14.addTextNode("");
        }

        SOAPElement element15 = element4.addChildElement("CommissionPercentOther", "ns1");
        if (null != Float.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getCOMMISSIONPCTOTHER())) {
            element15.addTextNode(Float.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getCOMMISSIONPCTOTHER()));
        } else {
            element15.addTextNode("");
        }


		


        SOAPElement element39 = element4.addChildElement("SignedLine", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getSIGNEDLINE())) {
            element39.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getSIGNEDLINE()));
        } else {
            element39.addTextNode("");

        }
        if (null != this.emailbean.getRiskEnvelopeType().getSubmissionData().getORIGINCEPTDATE()) {
        SOAPElement element40 = element4.addChildElement("InceptionDate", "ns1");
      
     
        element40.addTextNode(this.emailbean.getRiskEnvelopeType().getSubmissionData().getORIGINCEPTDATE()); 
        }
        
        SOAPElement element36 = element4.addChildElement("RiskReferenceNo", "ns1");
        if (null != this.emailbean.getRiskEnvelopeType().getSubmissionData().getRISKREFERENCENO()) {
            element36.addTextNode(this.emailbean.getRiskEnvelopeType().getSubmissionData().getRISKREFERENCENO());
        } else {
            element36.addTextNode("");

        }
        SOAPElement element16 = element4.addChildElement("CountryofRiskID", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getCOUNTRYOFRISKID())) {
            element16.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getCOUNTRYOFRISKID()));
        } else {
            element16.addTextNode("");
        }
        SOAPElement element13 = element4.addChildElement("BusinessDescription", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getBUSINESSDESC())) {
            element13.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getBUSINESSDESC()));
        } else {
            element13.addTextNode("");
        }


        SOAPElement element37 = element4.addChildElement("SegmentID", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getSEGMENTID())) {
            element37.addTextNode(String.valueOf(this.emailbean.getRiskEnvelopeType().getSubmissionData().getSEGMENTID()));

        } else {
            element37.addTextNode("");

        }


        SOAPElement element38 = element4.addChildElement("StandardIndustrialClassificationCode", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getSICCODEID())) {
            element38.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getSICCODEID()));
        } else {
            element38.addTextNode("");

        }

        SOAPElement element43 = element4.addChildElement("TotalLine", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getTOTALLINE())) {
            element43.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getTOTALLINE()));
        } else {
            element43.addTextNode("");

        }

        SOAPElement element42 = element4.addChildElement("TotalExposure", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getTOTALEXPOSURE())) {
            element42.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getTOTALEXPOSURE()));
        } else {
            element42.addTextNode("");

        }
        SOAPElement element35 = element4.addChildElement("QuotedDate", "ns1");

        if (null != this.emailbean.getRiskEnvelopeType().getSubmissionData().getQUOTEDDATE()) {
            element35.addTextNode(FileUtilities.calenderToString("yyyy-MM-dd", this.emailbean.getRiskEnvelopeType().getSubmissionData().getQUOTEDDATE().toGregorianCalendar()));
        } else {
            element35.addTextNode("");

        }
        SOAPElement element25 = element4.addChildElement("NotTakenupDeclineReason", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getNTUDECLINEREASON())) {
            element25.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getNTUDECLINEREASON()));
        } else {
            element25.addTextNode("");
        }


        SOAPElement element9 = element4.addChildElement("BillingMethod", "ns1");
        element9.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getBILLINGMETHOD()));

        SOAPElement element22 = element4.addChildElement("HistoricalReference", "ns1");
        if (null != this.emailbean.getRiskEnvelopeType().getSubmissionData().getHISTORICALREF()) {
            element22.addTextNode(this.emailbean.getRiskEnvelopeType().getSubmissionData().getHISTORICALREF());
        } else {
            element22.addTextNode("");
        }

        SOAPElement element18 = element4.addChildElement("DepartmentID", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getDEPTID())) {
            element18.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getDEPTID()));
        } else {
            element18.addTextNode("");
        }

        SOAPElement element19 = element4.addChildElement("ExclusiveFlagID", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getEXCLFLAGID())) {
            element19.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getEXCLFLAGID()));
        } else {
            element19.addTextNode("");
        }

        SOAPElement element34 = element4.addChildElement("ProgrammeType", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPROGTYPEID())) {
            element34.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPROGTYPEID()));
        } else {
            element34.addTextNode("");
            
            

        }
        SOAPElement element17 = element4.addChildElement("Coverage", "ns1");
        if (null != this.emailbean.getRiskEnvelopeType().getSubmissionData().getCOVERAGE()) {
            element17.addTextNode(this.emailbean.getRiskEnvelopeType().getSubmissionData().getCOVERAGE());
        } else {
            element17.addTextNode("");
        }

        SOAPElement element24 = element4.addChildElement("Leader", "ns1");
        if (null != this.emailbean.getRiskEnvelopeType().getSubmissionData().getLEADER()) {
            element24.addTextNode(this.emailbean.getRiskEnvelopeType().getSubmissionData().getLEADER());
        } else {
            element24.addTextNode("");
        }
        
        SOAPElement element46 = element4.addChildElement("PolicyType", "ns1");
        if (null != Integer.toString( this.emailbean.getRiskEnvelopeType().getSubmissionData().getPTYPID())) {
            element46.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPTYPID()));
        } else {
            element46.addTextNode("");
        }
        

        SOAPElement element20 = element4.addChildElement("FieldOfficeID", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getFIELDOFFICEID())) {
            element20.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getFIELDOFFICEID()));
        } else {
            element20.addTextNode("");
        }

        SOAPElement element21 = element4.addChildElement("PolicyStartDate", "ns1");

        element21.addTextNode(FileUtilities.calenderToString("yyyy-MM-dd", this.emailbean.getRiskEnvelopeType().getSubmissionData().getPERIODFROMDT().toGregorianCalendar()));

        SOAPElement element45 = element4.addChildElement("PolicyEndDate", "ns1");

        element45.addTextNode(FileUtilities.calenderToString("yyyy-MM-dd", this.emailbean.getRiskEnvelopeType().getSubmissionData().getPERIODTODT().toGregorianCalendar()));


        SOAPElement element11 = element4.addChildElement("BrokerID", "ns1");
        element11.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getBROKERID()));

        SOAPElement element29 = element4.addChildElement("PolicyQuoteNumber", "ns1");
        if (null != this.emailbean.getRiskEnvelopeType().getSubmissionData().getPOLQUOTENUMBER()) {
            element29.addTextNode(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPOLQUOTENUMBER());
        } else {
            element29.addTextNode("");

        }


        SOAPElement element60 = element4.addChildElement("BrokerReference", "ns1");
        if (null != this.emailbean.getRiskEnvelopeType().getSubmissionData().getBROKERREFERENCE()) {
            element60.addTextNode(this.emailbean.getRiskEnvelopeType().getSubmissionData().getBROKERREFERENCE());
        } else {
            element60.addTextNode("");

        }
        
        
        SOAPElement element61 = element4.addChildElement("BranchCode", "ns1");
       
            element61.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getBRANCHCODE()));
         
        
        

        SOAPElement element47 = element4.addChildElement("FreedomofServicesFlag", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getFOSFLAGID())) {
            element47.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getFOSFLAGID()));
        } else {
            element47.addTextNode("");
        }


        SOAPElement element54 = element4.addChildElement("InsuredID", "ns1");
        if (null != this.emailbean.getInsuredId()) {

            element54.addTextNode(this.emailbean.getInsuredId());

        } else {
            element54.addTextNode("");

        }

        SOAPElement element32 = element4.addChildElement("ProductID", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPRODUCTID())) {
            element32.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPRODUCTID()));
        } else {
            element32.addTextNode("");

        }


      
        SOAPElement element41 = element4.addChildElement("StateID", "ns1");
        if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getSTATEID())) {
            element41.addTextNode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getSTATEID()));
        } else 
            element41.addTextNode("");

        
       

        SOAPElement element48 = element3.addChildElement("CountryCode", "chub");
        
        element48.addTextNode(PreProcessorDAO.getDAOObject().getcountryAlpha(this.emailbean.getCountryCode()));
       

        SOAPElement element49 = element3.addChildElement("MessageGUID", "chub");
        element49.addTextNode(this.emailbean.getPackageID().replaceAll("[\\\\/:*?\"<>|]",""));
        SOAPElement element50 = element3.addChildElement("SourceSystem", "chub");
        element50.addTextNode(resources.getConstantproperties().getProperty("IGNITE_SourceSystem"));
        SOAPElement element51 = element3.addChildElement("WorkViewEnvironment", "chub");
        element51.addTextNode(resources.getConnectionproperties().getProperty("IGNITE_WorkViewEnvironment"));
        SOAPElement element52 = element3.addChildElement("WorkViewLogonID", "chub");
        element52.addTextNode(resources.getConnectionproperties().getProperty("IGNITE_WorkViewLogonID"));


        soapMessage.saveChanges();

       
         return soapMessage;
       }

    private boolean createSoapResponse(SOAPMessage soapResponse) {
    	 ByteArrayOutputStream out = new ByteArrayOutputStream();
         Response rt = null;
                try {
            StringBuilder sb = new StringBuilder();
            if (soapResponse.getSOAPBody().hasFault()) {
                LOG.error("Webservice threw an exception while creating Policy, Exiting processing.");
                SOAPElement exceptionDetail = (SOAPElement) soapResponse.getSOAPBody().getFault().getDetail().getDetailEntries().next();
                if (null != exceptionDetail.getChildNodes().item(1)) {
                    NodeList nl = exceptionDetail.getChildNodes().item(1).getChildNodes();

                    sb.append("Message :" + nl.item(2).getTextContent());
                    sb.append("Stack trace : " + nl.item(3).getTextContent());
                    sb.append("Type " + nl.item(4).getTextContent());

                }
                LOG.error(sb.toString());
                return false;
            }


        } catch (SOAPException e) {
            LOG.error(e);
        }
        try {
        	soapResponse.writeTo(out);
        	 LOG.info("INBOUND MESSAGE\n");
        	LOG.info(out);
            JAXBContext jc = JAXBContext.newInstance(CreateOrUpdatePolicyResponseElement.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            JAXBElement<CreateOrUpdatePolicyResponseElement> createOrupdatepolicyresponse;

            createOrupdatepolicyresponse = unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument(), CreateOrUpdatePolicyResponseElement.class);


            CreateOrUpdatePolicyResponseElement value = createOrupdatepolicyresponse.getValue();
            JAXBElement<Response> response = value.getCreateOrUpdatePolicyResult();
            rt = response.getValue();

        } catch (JAXBException | SOAPException e) {
            LOG.error("Marshalling failed", e);
        } catch (IOException e) {
			LOG.error(e);
		}

        if (null != rt && null != rt.getOverAllResult().getValue() && "Success".equalsIgnoreCase(rt.getOverAllResult().getValue())) {
        	
        	if(emailbean.getRiskEnvelopeType().getRiskIndex().getPOLNUMBER()!=null&& emailbean.getRiskEnvelopeType().getRiskIndex().getPOLNUMBER().length()!=0){
        		
        		int length=emailbean.getRiskEnvelopeType().getRiskIndex().getPOLNUMBER().length();
        		this.emailbean.setPolicyId(emailbean.getRiskEnvelopeType().getRiskIndex().getPOLNUMBER().substring(0,length-3));
        		
        		
        	}
        	if(emailbean.getRiskEnvelopeType().getSubmissionData().getPOLQUOTENUMBER()!=null&& emailbean.getRiskEnvelopeType().getSubmissionData().getPOLQUOTENUMBER()!=""){
        		
        		this.emailbean.setQuoteNumber(emailbean.getRiskEnvelopeType().getSubmissionData().getPOLQUOTENUMBER());
        		
        		
        	}
        	
        	
        	
       
      
            return true;
        } else {
            LOG.info("Fail Response from the server");
            return false;
        }


    }


}
