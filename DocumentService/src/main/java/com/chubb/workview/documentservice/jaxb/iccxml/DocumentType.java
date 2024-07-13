
package com.chubb.workview.documentservice.jaxb.iccxml;

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
@XmlType(name = "DocumentType", propOrder = { "fileName", "docDescription", "guId", "mimeType" })
public class DocumentType {

	@XmlElement(name = "FileName", required = true)
	protected String fileName;
	@XmlElement(name = "doc_description", required = true)
	protected String docDescription;
	@XmlElement(name = "guId", required = true)
	protected String guId;
	@XmlElement(name = "mimeType", required = true)
	protected String mimeType;

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
	 * @return the docDescription
	 */
	public String getDocDescription() {
		return docDescription;
	}

	/**
	 * @param docDescription the docDescription to set
	 */
	public void setDocDescription(String docDescription) {
		this.docDescription = docDescription;
	}

	/**
	 * @return the guId
	 */
	public String getGuId() {
		return guId;
	}

	/**
	 * @param guId the guId to set
	 */
	public void setGuId(String guId) {
		this.guId = guId;
	}

	/**
	 * @return the mimeType
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * @param mimeType the mimeType to set
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}


}
