package com.chubb.CertificateService;


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

import com.chubb.CertificateService.bean.CertificateBean;
import com.chubb.CertificateService.main.ResourceLoader;
import com.chubb.CertificateService.Utilities.ProgramException;

public class CertificateWebServiceConnection {

	private static final Logger LOG = Logger.getLogger(CertificateWebServiceConnection.class);
	final ResourceLoader resources = ResourceLoader.getResources();
	protected CertificateBean cb;


	JAXBElement<Request> request;
	public CertificateBean CertificateConnection(CertificateBean cb) throws ProgramException {
		

		Response eventResponse = null;

		CreateOrUpdateCertificate gugf = new CreateOrUpdateCertificate();
		try {
			request=CertificateWebServiceRequest(cb);

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
					cb.setCertCreated(true);
				}

			}
		} catch (DatatypeConfigurationException | MalformedURLException | WebServiceException e1) {
			LOG.error("Error occured while creating Certificate request"+ e1);
		} 
		
		return cb;
	}

	private boolean createSoapResponse(Response soapResponse) {

		if (null !=soapResponse && null !=soapResponse.getOverAllResult() && "success".equalsIgnoreCase(soapResponse.getOverAllResult())) {
			return true;
		} else {
			LOG.info("Fail Response from the server");
			return false;
		}

	}

	private JAXBElement<Request> CertificateWebServiceRequest(CertificateBean cb) throws DatatypeConfigurationException, ProgramException  {

		Request rt = new Request();
		ObjectFactory obj = new ObjectFactory();
		CertificateInfoRequest certificateInfoRequestRequestDetails = new CertificateInfoRequest();
		ArrayOfCertificateRequest t = new ArrayOfCertificateRequest();

		EnvironmentData env = new EnvironmentData();
		
		CorrespondentRequest correspondentRequest=new CorrespondentRequest();
		GregorianCalendar gregory=null;
		CertificateRequest cr=new CertificateRequest();

		certificateInfoRequestRequestDetails.setCertificateNumber(obj.createCertificateInfoRequestCertificateNumber(cb.getCertificateNumber()));
		certificateInfoRequestRequestDetails.setPolicyNumber(obj.createCertificateInfoRequestPolicyNumber(cb.getPolicyNumber()));
		certificateInfoRequestRequestDetails.setCertificateName(obj.createCertificateInfoRequestCertificateName(cb.getCertificateName()));
		certificateInfoRequestRequestDetails.setEntityCode(obj.createCertificateInfoRequestEntityCode(cb.getEntityCode()));

		gregory = new GregorianCalendar();
		gregory.setTime(new Date());

		certificateInfoRequestRequestDetails.setCreatedDate(obj.createCertificateInfoRequestCreatedDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory)));
		correspondentRequest.setCorrespondentName(obj.createCorrespondentRequestCorrespondentName(cb.getCertificateName()));
		correspondentRequest.setContactName(obj.createCorrespondentRequestContactName(cb.getCertificateName()));
		env.setCountryCode(obj.createEnvironmentDataCountryCode(cb.getCountryAlpha()));

		env.setMessageGUID(obj.createEnvironmentDataMessageGUID(cb.getPackageID().replaceAll("[\\\\/:*?\"<>|]","")));
		env.setSourceSystem(obj.createEnvironmentDataSourceSystem(cb.getSourceSystem()));
		env.setWorkViewEnvironment(obj.createEnvironmentDataWorkViewEnvironment(resources.getConnectionproperties().getProperty("WorkViewEnvironment")));
		env.setWorkViewLogonID(obj.createEnvironmentDataWorkViewLogonID(resources.getConnectionproperties().getProperty("WorkViewLogonID")));

		cr.setCertificateInfoRequest(certificateInfoRequestRequestDetails);
		cr.setCorrespondentInfoRequest(correspondentRequest);
		t.getCertificateRequest().add(cr);
		rt.setCertificateDetails(t);
		rt.setEnvironmentData(obj.createRequestEnvironmentData(env));

		JAXBElement<Request> request = obj.createRequest(rt);
		return request;
	}


}
