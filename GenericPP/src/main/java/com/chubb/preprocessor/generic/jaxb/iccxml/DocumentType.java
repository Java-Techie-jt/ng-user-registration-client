
package com.chubb.preprocessor.generic.jaxb.iccxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = { "filename", "otherref","originator", "ingestion_info", "ingestion_user", "ingestion_date", "ingestion_time",
		"doc_description", "file_code", "folder_type_code", "doc_type_code", "docdate", "doc_producer", "uwyear", "acknowledged_date", "actioned_date" })
public class DocumentType {

	@XmlElement(name = "filename", required = true)
	protected String filename;
	@XmlElement(name = "otherref", required = true)
	protected String otherref;
	@XmlElement(name = "originator", required = true)
	protected String originator;
	@XmlElement(name = "ingestion_info", required = true)
	protected String ingestion_info;
	@XmlElement(name = "ingestion_user", required = true)
	protected String ingestion_user;
	@XmlElement(name = "ingestion_date", required = true)
	protected String ingestion_date;
	@XmlElement(name = "ingestion_time", required = true)
	protected String ingestion_time;
	@XmlElement(name = "doc_description", required = true)
	protected String doc_description;
	@XmlElement(name = "file_code", required = true)
	protected int file_code;
	@XmlElement(name = "folder_type_code", required = true)
	protected int folder_type_code;
	@XmlElement(name = "doc_type_code", required = true)
	protected int doc_type_code;
	@XmlElement(name = "Docdate", required = true)
	protected String docdate;
	@XmlElement(name = "doc_producer", required = true)
	protected String doc_producer;
	@XmlElement(name = "uwyear", required = true)
	protected String uwyear;
	@XmlElement(name = "acknowledged_date", required = true)
	protected String acknowledged_date;
	@XmlElement(name = "actioned_date", required = true)
	protected String actioned_date;
	

	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getOtherref() {
		return otherref;
	}
	public void setOtherref(String otherref) {
		this.otherref = otherref;
	}
	public String getOriginator() {
		return originator;
	}
	public void setOriginator(String originator) {
		this.originator = originator;
	}
	public String getIngestion_info() {
		return ingestion_info;
	}
	public void setIngestion_info(String ingestion_info) {
		this.ingestion_info = ingestion_info;
	}
	public String getIngestion_user() {
		return ingestion_user;
	}
	public void setIngestion_user(String ingestion_user) {
		this.ingestion_user = ingestion_user;
	}
	public String getIngestion_date() {
		return ingestion_date;
	}
	public void setIngestion_date(String ingestion_date) {
		this.ingestion_date = ingestion_date;
	}
	public String getIngestion_time() {
		return ingestion_time;
	}
	public void setIngestion_time(String ingestion_time) {
		this.ingestion_time = ingestion_time;
	}
	public String getDoc_description() {
		return doc_description;
	}
	public void setDoc_description(String doc_description) {
		this.doc_description = doc_description;
	}
	public int getFile_code() {
		return file_code;
	}
	public void setFile_code(int file_code) {
		this.file_code = file_code;
	}
	public int getFolder_type_code() {
		return folder_type_code;
	}
	public void setFolder_type_code(int folder_type_code) {
		this.folder_type_code = folder_type_code;
	}
	public int getDoc_type_code() {
		return doc_type_code;
	}
	public void setDoc_type_code(int doc_type_code) {
		this.doc_type_code = doc_type_code;
	}
	public String getDocdate() {
		return docdate;
	}
	public void setDocdate(String docdate) {
		this.docdate = docdate;
	}
	public String getDoc_producer() {
		return doc_producer;
	}
	public void setDoc_producer(String doc_producer) {
		this.doc_producer = doc_producer;
	}
	public String getUwyear() {
		return uwyear;
	}
	public void setUwyear(String uwyear) {
		this.uwyear = uwyear;
	}
	public String getAcknowledged_date() {
		return acknowledged_date;
	}
	public void setAcknowledged_date(String acknowledged_date) {
		this.acknowledged_date = acknowledged_date;
	}
	public String getActioned_date() {
		return actioned_date;
	}
	public void setActioned_date(String actioned_date) {
		this.actioned_date = actioned_date;
	}
	
	
}
