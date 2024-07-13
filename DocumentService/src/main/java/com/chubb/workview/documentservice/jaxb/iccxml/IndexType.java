
package com.chubb.workview.documentservice.jaxb.iccxml;

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
@XmlType(name = "IndexType", propOrder = { "bpuCode", "ctryCode" })
public class IndexType {

	@XmlElement(name = "bpu_code", required = true)
	protected String bpuCode;
	@XmlElement(name = "ctry_code", required = true)
	protected String ctryCode;
	

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

}
