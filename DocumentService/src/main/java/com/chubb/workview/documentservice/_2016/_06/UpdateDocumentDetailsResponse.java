
package com.chubb.workview.documentservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdateDocumentDetailsResult" type="{http://chubb.com/WorkView/DocumentService/2016/06}UpdateDocumentDetailsResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateDocumentDetailsResult"
})
@XmlRootElement(name = "UpdateDocumentDetailsResponse")
public class UpdateDocumentDetailsResponse {

    @XmlElementRef(name = "UpdateDocumentDetailsResult", namespace = "http://chubb.com/Workview/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<com.chubb.workview.documentservice.UpdateDocumentDetailsResponse> updateDocumentDetailsResult;

    /**
     * Gets the value of the updateDocumentDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.chubb.workview.documentservice.UpdateDocumentDetailsResponse }{@code >}
     *     
     */
    public JAXBElement<com.chubb.workview.documentservice.UpdateDocumentDetailsResponse> getUpdateDocumentDetailsResult() {
        return updateDocumentDetailsResult;
    }

    /**
     * Sets the value of the updateDocumentDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.chubb.workview.documentservice.UpdateDocumentDetailsResponse }{@code >}
     *     
     */
    public void setUpdateDocumentDetailsResult(JAXBElement<com.chubb.workview.documentservice.UpdateDocumentDetailsResponse> value) {
        this.updateDocumentDetailsResult = value;
    }

}
