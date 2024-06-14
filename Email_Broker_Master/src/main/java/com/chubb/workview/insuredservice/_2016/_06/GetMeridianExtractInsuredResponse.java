
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
 *         &lt;element name="GetMeridianExtractInsuredResult" type="{http://Chubb.com/WorkView/InsuredService/2016/06}MeridianInsuredExtractResponse" minOccurs="0"/>
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
    "getMeridianExtractInsuredResult"
})
@XmlRootElement(name = "GetMeridianExtractInsuredResponse")
public class GetMeridianExtractInsuredResponse {

    @XmlElementRef(name = "GetMeridianExtractInsuredResult", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<MeridianInsuredExtractResponse> getMeridianExtractInsuredResult;

    /**
     * Gets the value of the getMeridianExtractInsuredResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeridianInsuredExtractResponse }{@code >}
     *     
     */
    public JAXBElement<MeridianInsuredExtractResponse> getGetMeridianExtractInsuredResult() {
        return getMeridianExtractInsuredResult;
    }

    /**
     * Sets the value of the getMeridianExtractInsuredResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeridianInsuredExtractResponse }{@code >}
     *     
     */
    public void setGetMeridianExtractInsuredResult(JAXBElement<MeridianInsuredExtractResponse> value) {
        this.getMeridianExtractInsuredResult = value;
    }

}
