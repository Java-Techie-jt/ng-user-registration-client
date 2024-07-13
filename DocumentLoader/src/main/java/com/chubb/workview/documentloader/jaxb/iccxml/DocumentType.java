
package com.chubb.workview.documentloader.jaxb.iccxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DocumentType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scan_info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Scanop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scandate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scantime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doc_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="file_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ftyp_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doc_type_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Docdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doc_producer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = { "fileName", "otherref", "scanInfo", "scanop", "scandate", "scantime",
		"docDescription", "fileCode", "ftypCode", "docTypeCode", "docdate", "docProducer" })
public class DocumentType {

	@XmlElement(name = "FileName", required = true)
	protected String fileName;
	@XmlElement(name = "Otherref", required = true)
	protected String otherref;

	@XmlElement(name = "scan_info", required = true)
	protected String scanInfo;
	@XmlElement(name = "Scanop", required = true)
	protected String scanop;
	@XmlElement(required = true)
	protected String scandate;
	@XmlElement(required = true)
	protected String scantime;
	@XmlElement(name = "doc_description", required = true)
	protected String docDescription;
	@XmlElement(name = "file_code", required = true)
	protected String fileCode;
	@XmlElement(name = "ftyp_code", required = true)
	protected String ftypCode;
	@XmlElement(name = "doc_type_code", required = true)
	protected String docTypeCode;
	@XmlElement(name = "Docdate", required = true)
	protected String docdate;
	@XmlElement(name = "doc_producer", required = true)
	protected String docProducer;

	/**
	 * Gets the value of the fileName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Sets the value of the fileName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileName(String value) {
		this.fileName = value;
	}

	/**
	 * Gets the value of the fileName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOtherref() {
		return otherref;
	}

	/**
	 * Sets the value of the property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOtherref(String value) {
		this.otherref = value;
	}

	/**
	 * Gets the value of the scanInfo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getScanInfo() {
		return scanInfo;
	}

	/**
	 * Sets the value of the scanInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setScanInfo(String value) {
		this.scanInfo = value;
	}

	/**
	 * Gets the value of the scanop property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getScanop() {
		return scanop;
	}

	/**
	 * Sets the value of the scanop property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setScanop(String value) {
		this.scanop = value;
	}

	/**
	 * Gets the value of the scandate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getScandate() {
		return scandate;
	}

	/**
	 * Sets the value of the scandate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setScandate(String value) {
		this.scandate = value;
	}

	/**
	 * Gets the value of the scantime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getScantime() {
		return scantime;
	}

	/**
	 * Sets the value of the scantime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setScantime(String value) {
		this.scantime = value;
	}

	/**
	 * Gets the value of the docDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocDescription() {
		return docDescription;
	}

	/**
	 * Sets the value of the docDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocDescription(String value) {
		this.docDescription = value;
	}

	/**
	 * Gets the value of the fileCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileCode() {
		return fileCode;
	}

	/**
	 * Sets the value of the fileCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileCode(String value) {
		this.fileCode = value;
	}

	/**
	 * Gets the value of the ftypCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFtypCode() {
		return ftypCode;
	}

	/**
	 * Sets the value of the ftypCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFtypCode(String value) {
		this.ftypCode = value;
	}

	/**
	 * Gets the value of the docTypeCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocTypeCode() {
		return docTypeCode;
	}

	/**
	 * Sets the value of the docTypeCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocTypeCode(String value) {
		this.docTypeCode = value;
	}

	/**
	 * Gets the value of the docdate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocdate() {
		return docdate;
	}

	/**
	 * Sets the value of the docdate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocdate(String value) {
		this.docdate = value;
	}

	/**
	 * Gets the value of the docProducer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocProducer() {
		return docProducer;
	}

	/**
	 * Sets the value of the docProducer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocProducer(String value) {
		this.docProducer = value;
	}

}
