package com.chubb.workview.policyservice._2016._06;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.soap.AddressingFeature;

import org.apache.log4j.Logger;
import com.chubb.preprocessors.emailbrokermaster.beans.EmailBean;
import com.chubb.preprocessors.emailbrokermaster.dao.PreProcessorDAO;
import com.chubb.preprocessors.emailbrokermaster.preprocessor.ResourceLoader;
import com.chubb.preprocessors.emailbrokermaster.service.DBConnectionError;
import com.chubb.preprocessors.emailbrokermaster.service.ProgramException;
import java.math.BigDecimal;


public class PolicyServiceConnection {
	
	 static final Logger LOG = Logger.getLogger(PolicyServiceConnection.class);
	    final ResourceLoader resources = ResourceLoader.getResources();
	    protected EmailBean emailbean;
	    JAXBElement<Request> request=null;
	    public EmailBean PolicyWebServiceConnection(EmailBean emailbean) {
	      
	  	    try {
                request = PolicyWebServiceRequest(emailbean);
          
	       Response eventResponse = null;

	       CreateOrUpdatePolicyElement gugf = new CreateOrUpdatePolicyElement();
	        
	       
	        gugf.setRequest(request);
            PolicyService_Service gfs = null;
	         gfs = new PolicyService_Service(new URL(resources.getConnectionproperties().getProperty("IGNITE_Policy_WebService")), new QName("http://chubb.com/WorkView/PolicyService/2016/06", "PolicyService"));
					
	         gfs.setHandlerResolver(new JaxWsHandlerResolver());
	         LOG.debug("Policy WS  WSDL initialised successfully.");
	                LOG.info("About to call over https");
	                PolicyService  gf = null;
	              
	                    gf = gfs.getWSHttpBindingPolicyService(new AddressingFeature(true,true));
	                
	                if (gf != null) {
	                 
	                    eventResponse = gf.createOrUpdatePolicy(request.getValue());
	                    LOG.info("Request POsted Successfully");
	                   createSoapResponse(eventResponse);
	                     }
	        } catch (ProgramException | DBConnectionError | MalformedURLException e1) {
               
                LOG.error("Error occured while creating request for Policy WS "+e1);
            }
	      return emailbean;
	

}

		private JAXBElement<Request> PolicyWebServiceRequest(EmailBean emailbean) throws ProgramException, DBConnectionError{
			
			this.emailbean = emailbean;
			Request rt = new Request();
			ObjectFactory ob=new ObjectFactory();
			EnvironmentData env = new EnvironmentData();
			PolicyInfo polInfo = new PolicyInfo();
			PolicyRequest ar=new PolicyRequest();
			
		    
   
		       polInfo.setPolicyNumber(ob.createPolicyInfoPolicyNumber(this.emailbean.getRiskEnvelopeType().getRiskIndex().getPOLNUMBER()));
		       polInfo.setPolicySite(ob.createPolicyInfoPolicySite(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPOLSITE()));
		       if (null != Integer.toString(this.emailbean.getRiskEnvelopeType().getRiskIndex().getENTCODE())) {
		       polInfo.setEntityCode(ob.createPolicyInfoEntityCode(Integer.toString(this.emailbean.getRiskEnvelopeType().getRiskIndex().getENTCODE())));
		       }
		       else{
		    	   polInfo.setEntityCode(ob.createPolicyInfoEntityCode(""));
		       }
		     
		       polInfo.setIsSensitive(this.emailbean.getRiskEnvelopeType().getSubmissionData().getISSENSITIVE());
		       polInfo.setPrimaryLimit(new BigDecimal(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPRIMARYLIMIT()));
		       polInfo.setCommissionPercentEL(new BigDecimal(this.emailbean.getRiskEnvelopeType().getSubmissionData().getCOMMISSIONPCTEL()));
		       polInfo.setCommissionPercentOther(new BigDecimal(this.emailbean.getRiskEnvelopeType().getSubmissionData().getCOMMISSIONPCTOTHER()));
		       polInfo.setSignedLine(new BigDecimal(this.emailbean.getRiskEnvelopeType().getSubmissionData().getSIGNEDLINE()));
		       polInfo.setRiskReferenceNo(ob.createPolicyInfoRiskReferenceNo(this.emailbean.getRiskEnvelopeType().getSubmissionData().getRISKREFERENCENO()));
		     
		   
		   
		   polInfo.setCountryofRiskID(this.emailbean.getRiskEnvelopeType().getSubmissionData().getCOUNTRYOFRISKID());
		   polInfo.setBusinessDescription(ob.createPolicyInfoBusinessDescription(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getBUSINESSDESC())));
		   polInfo.setSegmentID(this.emailbean.getRiskEnvelopeType().getSubmissionData().getSEGMENTID());
		   polInfo.setStandardIndustrialClassificationID(this.emailbean.getRiskEnvelopeType().getSubmissionData().getSICCODEID());
		   polInfo.setTotalLine(new BigDecimal(this.emailbean.getRiskEnvelopeType().getSubmissionData().getTOTALLINE()));
		   polInfo.setTotalExposure(new BigDecimal(this.emailbean.getRiskEnvelopeType().getSubmissionData().getTOTALEXPOSURE()));
		  
		  polInfo.setQuotedDate(this.emailbean.getRiskEnvelopeType().getSubmissionData().getQUOTEDDATE());
		  polInfo.setNotTakenupDeclineReason(this.emailbean.getRiskEnvelopeType().getSubmissionData().getNTUDECLINEREASON());
		 polInfo.setBillingMethod(this.emailbean.getRiskEnvelopeType().getSubmissionData().getBILLINGMETHOD());
		 polInfo.setHistoricalReference(ob.createPolicyInfoHistoricalReference(this.emailbean.getRiskEnvelopeType().getSubmissionData().getHISTORICALREF()));
		 polInfo.setDepartmentID(this.emailbean.getRiskEnvelopeType().getSubmissionData().getDEPTID());
		 polInfo.setExclusiveFlagID(this.emailbean.getRiskEnvelopeType().getSubmissionData().getEXCLFLAGID());
		 polInfo.setProgrammeType(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPROGTYPEID());
		 polInfo.setCoverage(ob.createPolicyInfoCoverage(this.emailbean.getRiskEnvelopeType().getSubmissionData().getCOVERAGE()));
		 polInfo.setLeader(ob.createPolicyInfoLeader(this.emailbean.getRiskEnvelopeType().getSubmissionData().getLEADER()));
		 polInfo.setFieldOfficeID(this.emailbean.getRiskEnvelopeType().getSubmissionData().getFIELDOFFICEID());
		 polInfo.setPolicyStartDate(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPERIODFROMDT());
		 polInfo.setPolicyEndDate(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPERIODTODT());
		 polInfo.setBrokerID(this.emailbean.getRiskEnvelopeType().getSubmissionData().getBROKERID());
		 polInfo.setPolicyQuoteNumber(ob.createPolicyInfoPolicyQuoteNumber(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPOLQUOTENUMBER()));
		 polInfo.setBrokerReference(ob.createPolicyInfoBrokerReference(this.emailbean.getRiskEnvelopeType().getSubmissionData().getBROKERREFERENCE()));
		polInfo.setFreedomofServicesFlagCode(ob.createPolicyInfoFreedomofServicesFlagCode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getFOSFLAGID())));
		polInfo.setInsuredID(Integer.parseInt(this.emailbean.getInsuredId()));

		polInfo.setProductID(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPRODUCTID());
		polInfo.setProgrammeTypeCode(ob.createPolicyInfoProgrammeTypeCode(Integer.toString(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPROGTYPEID())));
		polInfo.setStateID(this.emailbean.getRiskEnvelopeType().getSubmissionData().getSTATEID());

	
            env.setCountryCode(ob.createEnvironmentDataCountryCode(PreProcessorDAO.getDAOObject().getcountryAlpha(this.emailbean.getCountryCode())));
        

	env.setSourceSystem(ob.createEnvironmentDataSourceSystem(resources.getConstantproperties().getProperty("IGNITE_SourceSystem")));
	env.setMessageGUID(ob.createEnvironmentDataMessageGUID(""));
	env.setWorkViewEnvironment(ob.createEnvironmentDataSourceSystem(resources.getConnectionproperties().getProperty("IGNITE_WorkViewEnvironment")));
	env.setWorkViewLogonID(ob.createEnvironmentDataWorkViewLogonID(resources.getConnectionproperties().getProperty("IGNITE_WorkViewLogonID")));
	     
        rt.setEnvironmentData(ob.createEnvironmentData(env));
           
			
		
		   ar.getPolicyInfo().add(polInfo);
		      
		     rt.setPolicyRequest(ob.createArrayOfPolicyInfo(ar));
		     
		       JAXBElement<Request> request = ob.createRequest(rt);
		       
		       return request;
		       
		      
		}
		 private boolean createSoapResponse(Response soapResponse) {

		        if (null !=soapResponse && null !=   soapResponse.getOverAllResult().getValue() && "Success".equalsIgnoreCase(soapResponse.getOverAllResult().getValue())) {

		        	if(soapResponse.getPolicyResponse().getValue().getPolicyResponse().size()!=1){
		        		LOG.info("Unexpected Response form Server");
		        		return false;
		        	}else{
		        	if(!"".equalsIgnoreCase(soapResponse.getPolicyResponse().getValue().getPolicyResponse().get(0).getPolicyNumber())){
		            this.emailbean.setPolicyId(soapResponse.getPolicyResponse().getValue().getPolicyResponse().get(0).getPolicyNumber());
		        	}
		        	else{
		        		
		        		this.emailbean.setPolicyId("");
		        	}
		            this.emailbean.setQuoteNumber(soapResponse.getPolicyResponse().getValue().getPolicyResponse().get(0).getQuoteNumber());
		        	
		            return true;
		        	}
		        } else {
		            LOG.info("Null Response from the server");
		            return false;
		        }


		    }
		}
