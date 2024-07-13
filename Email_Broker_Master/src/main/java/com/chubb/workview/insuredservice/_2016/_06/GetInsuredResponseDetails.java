
package com.chubb.workview.insuredservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInsuredResponseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInsuredResponseDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetInsuredDetails" type="{http://Chubb.com/WorkView/InsuredService/2016/06}ArrayOfGetInsuredDetail" minOccurs="0"/>
 *         &lt;element name="OverallResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInsuredResponseDetails", propOrder = {
    "getInsuredDetails",
    "overallResult",
    "errorText"
})
public class GetInsuredResponseDetails {

    @XmlElementRef(name = "GetInsuredDetails", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetInsuredDetail> getInsuredDetails;
    @XmlElement(name = "OverallResult")
    protected Boolean overallResult;
    @XmlElement(name = "ErrorText", required = true, nillable = true)
    protected String errorText;

    /**
     * Gets the value of the getInsuredDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetInsuredDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetInsuredDetail> getGetInsuredDetails() {
        return getInsuredDetails;
    }

    /**
     * Sets the value of the getInsuredDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetInsuredDetail }{@code >}
     *     
     */
    public void setGetInsuredDetails(JAXBElement<ArrayOfGetInsuredDetail> value) {
        this.getInsuredDetails = value;
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

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

}
