package com.chubb.CertificateService.bean;

public class CertificateBean {
	
	private String CertificateNumber;
	private String CertificateName;
	private String PolicyNumber;
	private String EntityCode;
	private String CountryCode;
	private String SourceSystem;
	private String packageID;
	private boolean isCertCreated=false;
	private String countryAlpha;
	
	public String getCountryAlpha() {
		return countryAlpha;
	}
	public void setCountryAlpha(String countryAlpha) {
		this.countryAlpha = countryAlpha;
	}
	public String getPackageID() {
		return packageID;
	}
	public void setPackageID(String packageID) {
		this.packageID = packageID;
	}
	public boolean isCertCreated() {
		return isCertCreated;
	}
	public void setCertCreated(boolean isCertCreated) {
		this.isCertCreated = isCertCreated;
	}
	
	public String getCertificateNumber() {
		return CertificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		CertificateNumber = certificateNumber;
	}
	public String getCertificateName() {
		return CertificateName;
	}
	public void setCertificateName(String certificateName) {
		CertificateName = certificateName;
	}
	public String getPolicyNumber() {
		return PolicyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		PolicyNumber = policyNumber;
	}
	public String getEntityCode() {
		return EntityCode;
	}
	public void setEntityCode(String entityCode) {
		EntityCode = entityCode;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getSourceSystem() {
		return SourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		SourceSystem = sourceSystem;
	}
	

}
