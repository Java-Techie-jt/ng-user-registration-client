
package com.chubb.workview.documentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusUpdateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusUpdateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documents" type="{http://chubb.com/WorkView/DocumentService/2016/06}ArrayOfStatusUpdateDocumentInfo"/&gt;
 *         &lt;element name="EnvironmentData" type="{http://chubb.com/WorkView/DocumentService/2016/06}EnvironmentData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusUpdateRequest", propOrder = {
    "documents",
    "environmentData"
})
public class StatusUpdateRequest {

    @XmlElement(name = "Documents", required = true, nillable = true)
    protected ArrayOfStatusUpdateDocumentInfo documents;
    @XmlElement(name = "EnvironmentData", required = true, nillable = true)
    protected EnvironmentData environmentData;

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStatusUpdateDocumentInfo }
     *     
     */
    public ArrayOfStatusUpdateDocumentInfo getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStatusUpdateDocumentInfo }
     *     
     */
    public void setDocuments(ArrayOfStatusUpdateDocumentInfo value) {
        this.documents = value;
    }

    /**
     * Gets the value of the environmentData property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentData }
     *     
     */
    public EnvironmentData getEnvironmentData() {
        return environmentData;
    }

    /**
     * Sets the value of the environmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentData }
     *     
     */
    public void setEnvironmentData(EnvironmentData value) {
        this.environmentData = value;
    }

}
