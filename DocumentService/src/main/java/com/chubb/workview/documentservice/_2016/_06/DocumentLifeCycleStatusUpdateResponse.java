
package com.chubb.workview.documentservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.chubb.workview.documentservice.StatusUpdateResponse;


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
 *         &lt;element name="DocumentLifeCycleStatusUpdateResult" type="{http://chubb.com/WorkView/DocumentService/2016/06}StatusUpdateResponse" minOccurs="0"/&gt;
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
    "documentLifeCycleStatusUpdateResult"
})
@XmlRootElement(name = "DocumentLifeCycleStatusUpdateResponse")
public class DocumentLifeCycleStatusUpdateResponse {

    @XmlElementRef(name = "DocumentLifeCycleStatusUpdateResult", namespace = "http://chubb.com/Workview/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<StatusUpdateResponse> documentLifeCycleStatusUpdateResult;

    /**
     * Gets the value of the documentLifeCycleStatusUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StatusUpdateResponse }{@code >}
     *     
     */
    public JAXBElement<StatusUpdateResponse> getDocumentLifeCycleStatusUpdateResult() {
        return documentLifeCycleStatusUpdateResult;
    }

    /**
     * Sets the value of the documentLifeCycleStatusUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StatusUpdateResponse }{@code >}
     *     
     */
    public void setDocumentLifeCycleStatusUpdateResult(JAXBElement<StatusUpdateResponse> value) {
        this.documentLifeCycleStatusUpdateResult = value;
    }

}
