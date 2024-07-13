
package com.chubb.preprocessor.generic.jaxb.iccxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexType", propOrder = { "lobgroup_code", "ctry_code", "entity_type", "fileNumber", "ingestion_file_number", 
		"ent_code", "ingestionmethod"})
public class IndexType {

	@XmlElement(name = "lobgroup_code", required = true)
	protected String lobgroup_code;
	@XmlElement(name = "ctry_code", required = true)
	protected int ctry_code;
	@XmlElement(name = "entity_type", required = true)
	protected int entity_type;
	@XmlElement(name = "fileNumber", required = true)
	protected String fileNumber;
	@XmlElement(name = "ingestion_file_number", required = true)
	protected String ingestion_file_number;
	@XmlElement(name = "ent_code", required = true)
	protected String ent_code;
	@XmlElement(name = "ingestionmethod", required = true)
	protected String ingestionmethod;
	
	public String getFileNumber() {
		return fileNumber;
	}
	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}
	public String getIngestion_file_number() {
		return ingestion_file_number;
	}
	public void setIngestion_file_number(String ingestion_file_number) {
		this.ingestion_file_number = ingestion_file_number;
	}
	public String getLobgroup_code() {
		return lobgroup_code;
	}
	public void setLobgroup_code(String lobgroup_code) {
		this.lobgroup_code = lobgroup_code;
	}
	public int getCtry_code() {
		return ctry_code;
	}
	public void setCtry_code(int ctry_code) {
		this.ctry_code = ctry_code;
	}
	public int getEntity_type() {
		return entity_type;
	}
	public void setEntity_type(int entity_type) {
		this.entity_type = entity_type;
	}
	public String getEnt_code() {
		return ent_code;
	}
	public void setEnt_code(String ent_code) {
		this.ent_code = ent_code;
	}
	public String getIngestionmethod() {
		return ingestionmethod;
	}
	public void setIngestionmethod(String ingestionmethod) {
		this.ingestionmethod = ingestionmethod;
	}
	
}
