package com.chubb.CertificateService.main;

import java.rmi.server.UID;

import org.apache.log4j.Logger;
import com.chubb.CertificateService.Utilities.ProgramException;
import com.chubb.CertificateService.bean.CertificateBean;
import com.chubb.CertificateService.main.ResourceLoader;
import com.chubb.CertificateService.CertificateWebServiceConnection;

public class CertificateServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger LOGGER = Logger.getLogger(CertificateServiceMain.class);
		CertificateBean cb = new CertificateBean();
		ResourceLoader resources = ResourceLoader.getResources();
		
		cb.setCertificateNumber(args[0]);
		cb.setCertificateName(args[1]);
		cb.setPolicyNumber(args[2]);
		cb.setEntityCode(args[3]);
		cb.setCountryCode(args[4]);
		cb.setCountryAlpha(args[5]);
		cb.setSourceSystem(args[6]);

		if (cb.getCertificateNumber() != null && (!cb.getCertificateNumber().isEmpty()) && cb.getPolicyNumber() != null
				&& (!cb.getPolicyNumber().isEmpty()) && cb.getCertificateName() != null
				&& (!cb.getCertificateName().isEmpty()) && cb.getEntityCode() != null && (!cb.getEntityCode().isEmpty())
				&& cb.getCountryCode() != null && (!cb.getCountryCode().isEmpty()) && cb.getEntityCode() != null
				&& (!cb.getEntityCode().isEmpty()) && cb.getSourceSystem() != null && (!cb.getSourceSystem().isEmpty())
				&& cb.getCountryAlpha() != null && (!cb.getCountryAlpha().isEmpty())) {
			LOGGER.debug("CertificateServiceMain : main - the input fields are not empty");

			try {
				
					LOGGER.info("Input Fields requested : certNum" + cb.getCertificateNumber() + " -policyNum- "
							+ cb.getPolicyNumber() + " -certiName- " + cb.getCertificateName() + " -entityCode- "
							+ cb.getEntityCode() + " -ctryCode- " + cb.getCountryCode() + " -CountryAlpha- "
							+ cb.getCountryAlpha() + " -sourceSystem- " + cb.getSourceSystem());
					LOGGER.info("into verificate to create cert");

					cb.setPackageID(new UID() + "");

					CertificateWebServiceConnection re = new CertificateWebServiceConnection();
					cb = re.CertificateConnection(cb);

					if (!cb.isCertCreated()) {
						// throw exception and email moved to error folder stop
						// processing
						throw new ProgramException("Certificate WS Exception occured");
					} else {
						LOGGER.info("certificate Created");
					}

				
			} catch (ProgramException e) {
				// TODO Auto-generated catch block
				LOGGER.error(" Program Exception for CERT : " + args[0] + "  Error message " + e);
			} 

		} else {
			LOGGER.info("One of the input field is empty : certNum : " + args[0] + " -policyNum : " + args[2]
					+ " -certName : " + args[1] + " -entityCode : " + args[3] + " -ctryCode : " + args[4]
					+ " -CountryAlpha : " + args[5] + " -sourceSystem : " + args[6]);

		}

	}

}
