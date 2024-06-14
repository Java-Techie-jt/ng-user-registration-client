package com.chubb.workview.generalfileservice._2016._06;


import com.chubb.preprocessors.emailbrokermaster.beans.EmailBean;
import com.chubb.preprocessors.emailbrokermaster.dao.PreProcessorDAO;
import com.chubb.preprocessors.emailbrokermaster.preprocessor.ResourceLoader;
import com.chubb.preprocessors.emailbrokermaster.service.DBConnectionError;
import com.chubb.preprocessors.emailbrokermaster.service.ProgramException;
import org.apache.log4j.Logger;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.soap.AddressingFeature;

import java.net.URL;

public class GeneralWebServiceConnection {
    private static final Logger LOG = Logger.getLogger(GeneralWebServiceConnection.class);
    final ResourceLoader resources = ResourceLoader.getResources();
    protected EmailBean emailbean;
    JAXBElement<Request> request;
    
    public EmailBean generalwebserviceConnection(EmailBean emailbean) throws DBConnectionError, ProgramException  {
   
	
	request = generalWebServiceRequest(emailbean);
	
       Response eventResponse = null;

        CreateOrUpdateGeneralFile gugf = new CreateOrUpdateGeneralFile();
    
        gugf.setRequest(request);

        try {

            GeneralFile_Service gfs = null;
           
                gfs = new GeneralFile_Service(new URL(resources.getConnectionproperties().getProperty("MNB_WebService")), new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "GeneralFile"));
         gfs.setHandlerResolver(new JaxWsHandlerResolver());
                LOG.debug("General Files WSDL initialised successfully.");
           
                LOG.info("About to call over https");
                GeneralFile gf = null;
                if (gfs != null) {
                    gf = gfs.getWSHttpBindingGeneralFile(new AddressingFeature(true,true));
                }
                if (gf != null) {
                	eventResponse = gf.createOrUpdateGeneralFile(request.getValue());
                    LOG.info("Request POsted Successfully");
                    if(createSoapResponse(eventResponse)){
                    	
                    }
                  
                }
        } catch (Exception e) {
                LOG.error(" Request failed", e);
               
            }


       
        return emailbean;

    }

        
     
    private boolean createSoapResponse(Response soapResponse) {
       if (null !=soapResponse && null !=   soapResponse.getOverAllResult().getValue() && "Success".equalsIgnoreCase(soapResponse.getOverAllResult().getValue())) {

            
            this.emailbean.setGfNumber(soapResponse.getGeneralFileResponse().getValue().getGeneralFileNumber().getValue());
            return true;
        } else {
            LOG.info("Null Response from the server");
            return false;
        }


    }


    public JAXBElement<Request> generalWebServiceRequest(EmailBean emailbean)  throws DBConnectionError, ProgramException  {


        Request rt = new Request();
        ObjectFactory obj = new ObjectFactory();
        GeneralFileRequestDetails generalFileRequestDetails = new GeneralFileRequestDetails();
        ArrayOfGeneralFileRequestDetails t = new ArrayOfGeneralFileRequestDetails();
        EnvironmentData env = new EnvironmentData();
        this.emailbean=emailbean;
     
        
       env.setMessageGUID(this.emailbean.getPackageID().replaceAll("[\\\\/:*?\"<>|]",""));
       
       env.setCountryCode(PreProcessorDAO.getDAOObject().getcountryAlpha(this.emailbean.getCountryCode()));
       
               
        env.setSourceSystem(resources.getConstantproperties().getProperty("MNB_SourceSystem"));
        env.setWorkViewEnvironment(resources.getConnectionproperties().getProperty("MNB_WorkViewEnvironment"));
        env.setWorkViewLogonID(resources.getConnectionproperties().getProperty("MNB_WorkViewLogonID"));
        
        rt.setEnvironmentData(env);

        generalFileRequestDetails.setFileType(Integer.parseInt(resources.getConstantproperties().getProperty("FileType")));
      String fileSubTypeCode=PreProcessorDAO.getDAOObject().checkExistence("FILE_SUBTYPE_CODE",Integer.toString(generalFileRequestDetails.getFileType()));
             
       if(!"false".equalsIgnoreCase(fileSubTypeCode)){
    	   generalFileRequestDetails.setFileSubType(Integer.parseInt(fileSubTypeCode));
       }else{
    	   generalFileRequestDetails.setFileSubType(0);
       }
    	 
        generalFileRequestDetails.setCountryCode(obj.createGeneralFileRequestDetailsCountryCode(this.emailbean.getCountryCode()));
        generalFileRequestDetails.setDescription(obj.createGeneralFileRequestDetailsDescription(this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getAttachmentIndex().get(0).getDocDescription()));
      
        if (this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getGfHeader().getGfNumber() != null && this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getGfHeader().getGfNumber() !="") {
            generalFileRequestDetails.setFileNumber(obj.createGeneralFileRequestDetailsFileNumber(this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getGfHeader().getGfNumber()));
        } else {
            generalFileRequestDetails.setFileNumber(obj.createGeneralFileRequestDetailsFileNumber(""));
        }
    
        generalFileRequestDetails.setBookingPeriod(obj.createGeneralFileRequestDetailsBookingPeriod(this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getGfFields().getGfField().get(2)));
        generalFileRequestDetails.setBordereauxPeriod(obj.createGeneralFileRequestDetailsBordereauxPeriod(this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getGfFields().getGfField().get(1)));
        generalFileRequestDetails.setCompanyType(obj.createGeneralFileRequestDetailsCompanyType(this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getGfFields().getGfField().get(0)));
        generalFileRequestDetails.setWeekNumber(obj.createGeneralFileRequestDetailsWeekNumber(this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getGfFields().getGfField().get(3)));
      
        
        generalFileRequestDetails.setStatus(obj.createGeneralFileRequestDetailsStatus(resources.getConstantproperties().getProperty("Status")));
        if("APAC".equalsIgnoreCase(resources.getConstantproperties().getProperty("MNB.DETECT"))){
        	      generalFileRequestDetails.setDocumentTypeCode(obj.createGeneralFileRequestDetailsDocumentTypeCode(this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getGfFields().getGfField().get(5)));
        }else if("EMEA".equalsIgnoreCase(resources.getConstantproperties().getProperty("MNB.DETECT"))){
        generalFileRequestDetails.setDocumentTypeCode(obj.createGeneralFileRequestDetailsDocumentTypeCode(this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getGfFields().getGfField().get(4)));
        
        }
               t.getGeneralFileRequestDetails().add(generalFileRequestDetails);
            rt.setGeneralFileRequest(t);

        return obj.createRequest(rt);
    }


}