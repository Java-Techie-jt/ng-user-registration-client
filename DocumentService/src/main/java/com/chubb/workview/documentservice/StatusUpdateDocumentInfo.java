
package com.chubb.workview.documentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusUpdateDocumentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusUpdateDocumentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentGUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocumentStatusID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusUpdateDocumentInfo", propOrder = {
    "documentGUID",
    "documentStatusID"
})
public class StatusUpdateDocumentInfo {

    @XmlElement(name = "DocumentGUID", required = true, nillable = true)
    protected String documentGUID;
    @XmlElement(name = "DocumentStatusID")
    protected int documentStatusID;

    /**
     * Gets the value of the documentGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentGUID() {
        return documentGUID;
    }

    /**
     * Sets the value of the documentGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentGUID(String value) {
        this.documentGUID = value;
    }

    /**
     * Gets the value of the documentStatusID property.
     * 
     */
    public int getDocumentStatusID() {
        return documentStatusID;
    }

    /**
     * Sets the value of the documentStatusID property.
     * 
     */
    public void setDocumentStatusID(int value) {
        this.documentStatusID = value;
    }

}
