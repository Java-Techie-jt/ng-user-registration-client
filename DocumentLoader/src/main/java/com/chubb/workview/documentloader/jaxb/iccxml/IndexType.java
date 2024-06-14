
package com.chubb.workview.documentloader.jaxb.iccxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for IndexType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="IndexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bpu_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ctry_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Entity_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FileNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cl_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cert_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pol_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ent_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IngestionMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexType", propOrder = { "bpuCode", "ctryCode", "entityType", "fileNumber", "clNumber", "certNumber",
		"polNumber", "entCode", "ingestionMethod" })
public class IndexType {

	@XmlElement(name = "bpu_code", required = true)
	protected String bpuCode;
	@XmlElement(name = "ctry_code", required = true)
	protected String ctryCode;
	@XmlElement(name = "Entity_Type", required = true)
	protected String entityType;
	@XmlElement(name = "FileNumber", required = true)
	protected String fileNumber;
	@XmlElement(name = "cl_number", required = true)
	protected String clNumber;
	@XmlElement(name = "cert_number", required = true)
	protected String certNumber;
	@XmlElement(name = "pol_number", required = true)
	protected String polNumber;
	@XmlElement(name = "ent_code", required = true)
	protected String entCode;
	@XmlElement(name = "IngestionMethod", required = true)
	protected String ingestionMethod;

	/**
	 * Gets the value of the bpuCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBpuCode() {
		return bpuCode;
	}

	/**
	 * Sets the value of the bpuCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBpuCode(String value) {
		this.bpuCode = value;
	}

	/**
	 * Gets the value of the ctryCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCtryCode() {
		return ctryCode;
	}

	/**
	 * Sets the value of the ctryCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCtryCode(String value) {
		this.ctryCode = value;
	}

	/**
	 * Gets the value of the entityType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEntityType() {
		return entityType;
	}

	/**
	 * Sets the value of the entityType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEntityType(String value) {
		this.entityType = value;
	}

	/**
	 * Gets the value of the fileNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileNumber() {
		return fileNumber;
	}

	/**
	 * Sets the value of the fileNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileNumber(String value) {
		this.fileNumber = value;
	}

	/**
	 * Gets the value of the clNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClNumber() {
		return clNumber;
	}

	/**
	 * Sets the value of the clNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClNumber(String value) {
		this.clNumber = value;
	}

	/**
	 * Gets the value of the certNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCertNumber() {
		return certNumber;
	}

	/**
	 * Sets the value of the certNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCertNumber(String value) {
		this.certNumber = value;
	}

	/**
	 * Gets the value of the polNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPolNumber() {
		return polNumber;
	}

	/**
	 * Sets the value of the polNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPolNumber(String value) {
		this.polNumber = value;
	}

	/**
	 * Gets the value of the entCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEntCode() {
		return entCode;
	}

	/**
	 * Sets the value of the entCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEntCode(String value) {
		this.entCode = value;
	}

	/**
	 * Gets the value of the ingestionMethod property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIngestionMethod() {
		return ingestionMethod;
	}

	/**
	 * Sets the value of the ingestionMethod property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIngestionMethod(String value) {
		this.ingestionMethod = value;
	}

}
