package com.chubb.preprocessor.generic.bean;

public class DocumentBean {
	
	private String docDescription;
	private String countryCode;
	private String entityCode;
	private String entityType;
	private String lobGrpCode;
	private String filetypCode;
	private String otherref;
	private String ingMethodCode;
	private String fileNumber;
	private boolean indexingStatus;
	
	public boolean isIndexingStatus() {
		return indexingStatus;
	}
	public void setIndexingStatus(boolean indexingStatus) {
		this.indexingStatus = indexingStatus;
	}
	public String getFileNumber() {
		return fileNumber;
	}
	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}
	public String getDocDescription() {
		return docDescription;
	}
	public void setDocDescription(String docDescription) {
		this.docDescription = docDescription;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getEntityCode() {
		return entityCode;
	}
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public String getLobGrpCode() {
		return lobGrpCode;
	}
	public void setLobGrpCode(String lobGrpCode) {
		this.lobGrpCode = lobGrpCode;
	}
	public String getFiletypCode() {
		return filetypCode;
	}
	public void setFiletypCode(String filetypCode) {
		this.filetypCode = filetypCode;
	}
	public String getOtherref() {
		return otherref;
	}
	public void setOtherref(String otherref) {
		this.otherref = otherref;
	}
	public String getIngMethodCode() {
		return ingMethodCode;
	}
	public void setIngMethodCode(String ingMethodCode) {
		this.ingMethodCode = ingMethodCode;
	}
	
}
