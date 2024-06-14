package com.chubb.workview.insuredservice._2016._06;


import com.chubb.preprocessors.emailbrokermaster.beans.EmailBean;
import com.chubb.preprocessors.emailbrokermaster.dao.PreProcessorDAO;
import com.chubb.preprocessors.emailbrokermaster.preprocessor.ResourceLoader;
import com.chubb.preprocessors.emailbrokermaster.service.DBConnectionError;
import com.chubb.preprocessors.emailbrokermaster.service.ProgramException;
import org.apache.log4j.Logger;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import javax.xml.ws.soap.AddressingFeature;

import java.net.MalformedURLException;
import java.net.URL;

public class InsuredWebServiceConnection {
    static final Logger log = Logger.getLogger(InsuredWebServiceConnection.class);
    final ResourceLoader resources = ResourceLoader.getResources();
    protected EmailBean emailbean;
    JAXBElement<Request> request;
    public EmailBean InsuredwebserviceConnection(EmailBean emailbean) throws ProgramException, DBConnectionError {
   
	try {
		request = InsuredWebServiceRequest(emailbean);
	      Response eventResponse = null;
      CreateOrUpdateInsured gugf = new CreateOrUpdateInsured();
         gugf.setRequest(request);
         InsuredService_Service gfs = null;
         gfs = new InsuredService_Service(new URL(resources.getConnectionproperties().getProperty("IGNITE_Insured")), new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredService"));
		  gfs.setHandlerResolver(new JaxWsHandlerResolver());
                log.debug("Insured WSDL initialised successfully.");
             
           
                log.info("About to call over https");
                InsuredService gf = null;
                if (gfs != null) {
                	
                    gf = gfs.getWSHttpBindingInsuredService(new AddressingFeature(true,true));
                    }
                if (gf != null) {
                	
                	eventResponse = gf.createOrUpdateInsured(request.getValue());
                    log.info("Request POsted Successfully");
                    if(createSoapResponse(eventResponse)){
                    	
                    }
                  }
           
	} catch (NumberFormatException |MalformedURLException e1) {
		log.error("Error occured while creating request for Insured WS "+e1);
	}

        
        return emailbean;

    }
  
    private boolean createSoapResponse(Response soapResponse) {
     
          
        if (null !=soapResponse && null !=   soapResponse.getOverallResult().getValue() && soapResponse.getOverallResult().getValue().equalsIgnoreCase("Success")) {
if(soapResponse.getInsuredResponse().getValue().getInsuredResponse()!=null){
            
            this.emailbean.setInsuredId(soapResponse.getInsuredResponse().getValue().getInsuredResponse().get(0).getInsuredIntID());
          
}
        } else {
            log.info("Fail Response from the server");
            return false;
        }
        return true;
    }


    public JAXBElement<Request> InsuredWebServiceRequest(EmailBean emailbean) throws NumberFormatException, ProgramException, DBConnectionError{


        Request rt = new Request();
        ObjectFactory obj = new ObjectFactory();
        InsuredInfoRequest insuredInfoRequest = new InsuredInfoRequest();
        CorrespondentDetails ce=new CorrespondentDetails();
        InsuredDetails id=new InsuredDetails();
        
        InsuredRequest t = new InsuredRequest();
        EnvironmentData env = new EnvironmentData();
        
        
        this.emailbean=emailbean;
     
        
       env.setMessageGUID(this.emailbean.getPackageID().replaceAll("[\\\\/:*?\"<>|]",""));
       env.setCountryCode(PreProcessorDAO.getDAOObject().getcountryAlpha(this.emailbean.getCountryCode()));
        
        env.setSourceSystem(resources.getConstantproperties().getProperty("IGNITE_SourceSystem"));
        env.setWorkViewEnvironment(resources.getConnectionproperties().getProperty("IGNITE_WorkViewEnvironment"));
        env.setWorkViewLogonID(resources.getConnectionproperties().getProperty("IGNITE_WorkViewLogonID"));
        
      
        insuredInfoRequest.setEntityCode(obj.createInsuredInfoRequestEntityCode(Integer.toString(this.emailbean.getRiskEnvelopeType().getRiskIndex().getENTCODE())));
        insuredInfoRequest.setInsuredCode(obj.createInsuredInfoRequestInsuredCode(this.emailbean.getRiskEnvelopeType().getInsuredData().getMINSREF()));
        insuredInfoRequest.setMNPrefixID(obj.createInsuredInfoRequestMNPrefixID(this.emailbean.getRiskEnvelopeType().getInsuredData().getMNPREFIXID()));
       
        insuredInfoRequest.setRiskCategory(obj.createInsuredInfoRequestRiskCategory(this.emailbean.getRiskEnvelopeType().getInsuredData().getPortfoliosegment()));
        insuredInfoRequest.setDunnsnumber(obj.createInsuredInfoRequestDunnsNumber(this.emailbean.getRiskEnvelopeType().getSubmissionData().getDunnsnumber()));
        ce.setEntityCode(Integer.toString(this.emailbean.getRiskEnvelopeType().getRiskIndex().getENTCODE()));
        ce.setAddress1(obj.createCorrespondentDetailsAddress1(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTADDR1()));
        ce.setAddress2(obj.createCorrespondentDetailsAddress2(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTADDR2()));
        ce.setForename(obj.createCorrespondentDetailsForename(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTFORENAME()));
        ce.setSurname(obj.createCorrespondentDetailsSurname(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTSURNAME()));
        ce.setCity(obj.createCorrespondentDetailsCity(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTCITY()));
        ce.setCountry(obj.createCorrespondentDetailsCountry(Integer.toString(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTCOUNTRY())));
        ce.setCounty(obj.createCorrespondentDetailsCounty(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTCOUNTY()));
        ce.setPostCode(obj.createCorrespondentDetailsPostCode(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTPOSTCODE()));
        ce.setTelephoneNumber(obj.createCorrespondentDetailsTelephoneNumber(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTTELNUMBER()));
        ce.setFaxNumber(obj.createCorrespondentDetailsFaxNumber(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTFAXNUMBER()));
        ce.setEmailID(obj.createCorrespondentDetailsEmailID(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTEMAILADDR()));
        ce.setBuildingFloor(obj.createCorrespondentDetailsBuildingFloor(this.emailbean.getRiskEnvelopeType().getInsuredData().getFLOORBUILDING()));
        ce.setTitle(obj.createCorrespondentDetailsTitle(Byte.toString(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTTITLEID())));
        ce.setCorrespondentCompany(obj.createCorrespondentDetailsCorrespondentCompany(this.emailbean.getRiskEnvelopeType().getInsuredData().getCTCOMPANY()));
        
        id.setInsuredInfoRequest(obj.createInsuredInfoRequest(insuredInfoRequest));
        id.setCorrespondentDetails(obj.createCorrespondentDetails(ce));
       
        
        t.getInsuredDetails().add(id);
        
            rt.setInsuredRequest(obj.createArrayOfInsuredDetails(t));
            rt.setEnvironmentData(obj.createEnvironmentData(env));

                JAXBElement<Request> request = obj.createRequest(rt);
        return request;
    }


}