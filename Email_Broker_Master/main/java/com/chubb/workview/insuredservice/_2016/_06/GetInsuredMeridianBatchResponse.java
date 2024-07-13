
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
 *         &lt;element name="GetInsuredMeridianBatchResult" type="{http://Chubb.com/WorkView/InsuredService/2016/06}MeridianExtractInsuredResponse" minOccurs="0"/>
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
    "getInsuredMeridianBatchResult"
})
@XmlRootElement(name = "GetInsuredMeridianBatchResponse")
public class GetInsuredMeridianBatchResponse {

    @XmlElementRef(name = "GetInsuredMeridianBatchResult", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<MeridianExtractInsuredResponse> getInsuredMeridianBatchResult;

    /**
     * Gets the value of the getInsuredMeridianBatchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeridianExtractInsuredResponse }{@code >}
     *     
     */
    public JAXBElement<MeridianExtractInsuredResponse> getGetInsuredMeridianBatchResult() {
        return getInsuredMeridianBatchResult;
    }

    /**
     * Sets the value of the getInsuredMeridianBatchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeridianExtractInsuredResponse }{@code >}
     *     
     */
    public void setGetInsuredMeridianBatchResult(JAXBElement<MeridianExtractInsuredResponse> value) {
        this.getInsuredMeridianBatchResult = value;
    }

}
