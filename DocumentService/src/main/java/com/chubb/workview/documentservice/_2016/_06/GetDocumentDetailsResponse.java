
package com.chubb.workview.documentservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.chubb.workview.documentservice.DocumentDetailsResponse;


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
 *         &lt;element name="GetDocumentDetailsResult" type="{http://chubb.com/WorkView/DocumentService/2016/06}DocumentDetailsResponse" minOccurs="0"/&gt;
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
    "getDocumentDetailsResult"
})
@XmlRootElement(name = "GetDocumentDetailsResponse")
public class GetDocumentDetailsResponse {

    @XmlElementRef(name = "GetDocumentDetailsResult", namespace = "http://chubb.com/Workview/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentDetailsResponse> getDocumentDetailsResult;

    /**
     * Gets the value of the getDocumentDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentDetailsResponse }{@code >}
     *     
     */
    public JAXBElement<DocumentDetailsResponse> getGetDocumentDetailsResult() {
        return getDocumentDetailsResult;
    }

    /**
     * Sets the value of the getDocumentDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentDetailsResponse }{@code >}
     *     
     */
    public void setGetDocumentDetailsResult(JAXBElement<DocumentDetailsResponse> value) {
        this.getDocumentDetailsResult = value;
    }

}
