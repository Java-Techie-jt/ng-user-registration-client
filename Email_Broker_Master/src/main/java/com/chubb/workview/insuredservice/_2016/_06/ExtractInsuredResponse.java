
package com.chubb.workview.insuredservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtractInsuredResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtractInsuredResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtractInsuredResponse" type="{http://Chubb.com/WorkView/InsuredService/2016/06}ArrayOfExtractInsuredResponseDetail" minOccurs="0"/>
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
@XmlType(name = "ExtractInsuredResponse", propOrder = {
    "extractInsuredResponse",
    "overallResult"
})
public class ExtractInsuredResponse {

    @XmlElementRef(name = "ExtractInsuredResponse", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExtractInsuredResponseDetail> extractInsuredResponse;
    @XmlElement(name = "OverallResult")
    protected Boolean overallResult;

    /**
     * Gets the value of the extractInsuredResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExtractInsuredResponseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfExtractInsuredResponseDetail> getExtractInsuredResponse() {
        return extractInsuredResponse;
    }

    /**
     * Sets the value of the extractInsuredResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExtractInsuredResponseDetail }{@code >}
     *     
     */
    public void setExtractInsuredResponse(JAXBElement<ArrayOfExtractInsuredResponseDetail> value) {
        this.extractInsuredResponse = value;
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
