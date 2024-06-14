package com.chubb.workview.certificateservice._2016._06;

import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;
import javax.xml.ws.soap.AddressingFeature;
import javax.xml.ws.WebServiceException;
import org.apache.log4j.Logger;
import com.chubb.preprocessors.emailbrokermaster.beans.EmailBean;
import com.chubb.preprocessors.emailbrokermaster.preprocessor.ResourceLoader;
import com.chubb.preprocessors.emailbrokermaster.service.DBConnectionError;
import com.chubb.preprocessors.emailbrokermaster.service.ProgramException;
import com.chubb.preprocessors.emailbrokermaster.dao.PreProcessorDAO;


public class CertificateWebServiceConnection {

	private static final Logger LOG = Logger.getLogger(CertificateWebServiceConnection.class);
	final ResourceLoader resources = ResourceLoader.getResources();
	protected EmailBean emailbean;


	JAXBElement<Request> request;
	public EmailBean CertificateConnection(EmailBean emailbean) throws ProgramException, DBConnectionError {
		this.emailbean = emailbean;

		Response eventResponse = null;

		CreateOrUpdateCertificate gugf = new CreateOrUpdateCertificate();
		try {
			request=CertificateWebServiceRequest(this.emailbean);

			gugf.setRequest(request);

			CertificateService_Service gfs = null;

			gfs = new CertificateService_Service(new URL(resources.getConnectionproperties().getProperty("Certificate_WebService")), 
					new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CertificateService"));
			
			gfs.setHandlerResolver(new JaxWsHandlerResolver());
			
			LOG.debug("Certificate Files WSDL initialised successfully.");

			LOG.info("About to call over https");
			CertificateService gf = null;
			
			if (gfs != null) {
				gf = gfs.getWSHttpBindingCertificateService(new AddressingFeature(true,true));
			}
			
			if (gf != null) {
				eventResponse = gf.createOrUpdateCertificate(request.getValue());
				LOG.info("Request Posted Successfully");
				
				if(createSoapResponse(eventResponse)){
					this.emailbean.setCertCreated(true);
				}

			}
		} catch (DatatypeConfigurationException | MalformedURLException | WebServiceException e1) {
			LOG.error("Error occured while creating Certificate request"+ e1);
		} 
		
		return this.emailbean;
	}

	private boolean createSoapResponse(Response soapResponse) {

		if (null !=soapResponse && null !=soapResponse.getOverAllResult() && "success".equalsIgnoreCase(soapResponse.getOverAllResult())) {
			return true;
		} else {
			LOG.info("Fail Response from the server");
			return false;
		}

	}

	private JAXBElement<Request> CertificateWebServiceRequest(EmailBean emailbean) throws DatatypeConfigurationException, ProgramException, DBConnectionError  {

		Request rt = new Request();
		ObjectFactory obj = new ObjectFactory();
		CertificateInfoRequest certificateInfoRequestRequestDetails = new CertificateInfoRequest();
		ArrayOfCertificateRequest t = new ArrayOfCertificateRequest();

		EnvironmentData env = new EnvironmentData();
		this.emailbean=emailbean;
		CorrespondentRequest correspondentRequest=new CorrespondentRequest();
		GregorianCalendar gregory=null;
		CertificateRequest cr=new CertificateRequest();

		certificateInfoRequestRequestDetails.setCertificateNumber(obj.createCertificateInfoRequestCertificateNumber(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertNumber()));
		certificateInfoRequestRequestDetails.setPolicyNumber(obj.createCertificateInfoRequestPolicyNumber(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getPolNumber()));
		certificateInfoRequestRequestDetails.setCertificateName(obj.createCertificateInfoRequestCertificateName(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertName()));
		certificateInfoRequestRequestDetails.setEntityCode(obj.createCertificateInfoRequestEntityCode(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getEntCode()));

		gregory = new GregorianCalendar();
		gregory.setTime(new Date());

		certificateInfoRequestRequestDetails.setCreatedDate(obj.createCertificateInfoRequestCreatedDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory)));
		correspondentRequest.setCorrespondentName(obj.createCorrespondentRequestCorrespondentName(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertName()));
		correspondentRequest.setContactName(obj.createCorrespondentRequestContactName(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertName()));
		env.setCountryCode(obj.createEnvironmentDataCountryCode(PreProcessorDAO.getDAOObject().getcountryAlpha(this.emailbean.getCountryCode())));

		env.setMessageGUID(obj.createEnvironmentDataMessageGUID(this.emailbean.getPackageID().replaceAll("[\\\\/:*?\"<>|]","")));
		env.setSourceSystem(obj.createEnvironmentDataSourceSystem("ACRS"));
		env.setWorkViewEnvironment(obj.createEnvironmentDataWorkViewEnvironment(resources.getConnectionproperties().getProperty("ACRS_WorkViewEnvironment")));
		env.setWorkViewLogonID(obj.createEnvironmentDataWorkViewLogonID(resources.getConnectionproperties().getProperty("ACRS_WorkViewLogonID")));

		cr.setCertificateInfoRequest(certificateInfoRequestRequestDetails);
		cr.setCorrespondentInfoRequest(correspondentRequest);
		t.getCertificateRequest().add(cr);
		rt.setCertificateDetails(t);
		rt.setEnvironmentData(obj.createRequestEnvironmentData(env));

		JAXBElement<Request> request = obj.createRequest(rt);
		return request;
	}


}
