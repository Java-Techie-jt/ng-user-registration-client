
package com.chubb.workview.documentloader.jaxb.iccxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ScannedImageType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ScannedImageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Index" type="{}IndexType"/>
 *         &lt;element name="Document" type="{}DocumentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScannedImageType", propOrder = { "index", "document" })
@XmlRootElement(name = "ScannedImage")
public class ScannedImageType {

	@XmlElement(name = "Index", required = true)
	protected IndexType index;
	@XmlElement(name = "Document", required = true)
	protected DocumentType document;

	/**
	 * Gets the value of the index property.
	 * 
	 * @return possible object is {@link IndexType }
	 * 
	 */
	public IndexType getIndex() {
		return index;
	}

	/**
	 * Sets the value of the index property.
	 * 
	 * @param value
	 *            allowed object is {@link IndexType }
	 * 
	 */
	public void setIndex(IndexType value) {
		this.index = value;
	}

	/**
	 * Gets the value of the document property.
	 * 
	 * @return possible object is {@link DocumentType }
	 * 
	 */
	public DocumentType getDocument() {
		return document;
	}

	/**
	 * Sets the value of the document property.
	 * 
	 * @param value
	 *            allowed object is {@link DocumentType }
	 * 
	 */
	public void setDocument(DocumentType value) {
		this.document = value;
	}

}
