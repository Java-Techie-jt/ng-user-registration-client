
package com.chubb.workview.insuredservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeridianExtractInsuredResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeridianExtractInsuredResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeridianExtractInsuredResponse" type="{http://Chubb.com/WorkView/InsuredService/2016/06}ArrayOfMeridianExtractInsuredResponseDetail" minOccurs="0"/>
 *         &lt;element name="OverallResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeridianExtractInsuredResponse", propOrder = {
    "meridianExtractInsuredResponse",
    "overallResult"
})
public class MeridianExtractInsuredResponse {

    @XmlElementRef(name = "MeridianExtractInsuredResponse", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMeridianExtractInsuredResponseDetail> meridianExtractInsuredResponse;
    @XmlElement(name = "OverallResult")
    protected Boolean overallResult;

    /**
     * Gets the value of the meridianExtractInsuredResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMeridianExtractInsuredResponseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMeridianExtractInsuredResponseDetail> getMeridianExtractInsuredResponse() {
        return meridianExtractInsuredResponse;
    }

    /**
     * Sets the value of the meridianExtractInsuredResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMeridianExtractInsuredResponseDetail }{@code >}
     *     
     */
    public void setMeridianExtractInsuredResponse(JAXBElement<ArrayOfMeridianExtractInsuredResponseDetail> value) {
        this.meridianExtractInsuredResponse = value;
    }

    /**
     * Gets the value of the overallResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverallResult() {
        return overallResult;
    }

    /**
     * Sets the value of the overallResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverallResult(Boolean value) {
        this.overallResult = value;
    }

}
