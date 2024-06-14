
package com.chubb.workview.documentservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.chubb.workview.documentservice.IndexDocumentResponse;


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
 *         &lt;element name="ExecuteIndexDocumentResult" type="{http://chubb.com/WorkView/DocumentService/2016/06}IndexDocumentResponse" minOccurs="0"/&gt;
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
    "executeIndexDocumentResult"
})
@XmlRootElement(name = "ExecuteIndexDocumentResponse")
public class ExecuteIndexDocumentResponse {

    @XmlElementRef(name = "ExecuteIndexDocumentResult", namespace = "http://chubb.com/Workview/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<IndexDocumentResponse> executeIndexDocumentResult;

    /**
     * Gets the value of the executeIndexDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndexDocumentResponse }{@code >}
     *     
     */
    public JAXBElement<IndexDocumentResponse> getExecuteIndexDocumentResult() {
        return executeIndexDocumentResult;
    }

    /**
     * Sets the value of the executeIndexDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndexDocumentResponse }{@code >}
     *     
     */
    public void setExecuteIndexDocumentResult(JAXBElement<IndexDocumentResponse> value) {
        this.executeIndexDocumentResult = value;
    }

}
