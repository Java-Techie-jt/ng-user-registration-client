
package com.chubb.workview.insuredservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeridianInsuredExtractResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeridianInsuredExtractResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeridianInsuredExtractResponse" type="{http://Chubb.com/WorkView/InsuredService/2016/06}ArrayOfMeridianInsuredExtractResponseDetail" minOccurs="0"/>
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
@XmlType(name = "MeridianInsuredExtractResponse", propOrder = {
    "meridianInsuredExtractResponse",
    "overallResult"
})
public class MeridianInsuredExtractResponse {

    @XmlElementRef(name = "MeridianInsuredExtractResponse", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMeridianInsuredExtractResponseDetail> meridianInsuredExtractResponse;
    @XmlElement(name = "OverallResult")
    protected Boolean overallResult;

    /**
     * Gets the value of the meridianInsuredExtractResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMeridianInsuredExtractResponseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMeridianInsuredExtractResponseDetail> getMeridianInsuredExtractResponse() {
        return meridianInsuredExtractResponse;
    }

    /**
     * Sets the value of the meridianInsuredExtractResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMeridianInsuredExtractResponseDetail }{@code >}
     *     
     */
    public void setMeridianInsuredExtractResponse(JAXBElement<ArrayOfMeridianInsuredExtractResponseDetail> value) {
        this.meridianInsuredExtractResponse = value;
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
