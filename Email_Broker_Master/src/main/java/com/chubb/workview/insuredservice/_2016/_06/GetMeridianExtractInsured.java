
package com.chubb.workview.insuredservice._2016._06;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extractRequest" type="{http://Chubb.com/WorkView/InsuredService/2016/06}ExtractInsuredRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extractRequest"
})
@XmlRootElement(name = "GetMeridianExtractInsured")
public class GetMeridianExtractInsured {

    @XmlElementRef(name = "extractRequest", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtractInsuredRequest> extractRequest;

    /**
     * Gets the value of the extractRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtractInsuredRequest }{@code >}
     *     
     */
    public JAXBElement<ExtractInsuredRequest> getExtractRequest() {
        return extractRequest;
    }

    /**
     * Sets the value of the extractRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtractInsuredRequest }{@code >}
     *     
     */
    public void setExtractRequest(JAXBElement<ExtractInsuredRequest> value) {
        this.extractRequest = value;
    }

}
