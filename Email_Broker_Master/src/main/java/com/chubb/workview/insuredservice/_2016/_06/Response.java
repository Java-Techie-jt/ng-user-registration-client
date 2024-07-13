
package com.chubb.workview.insuredservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OverallResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuredResponse" type="{http://Chubb.com/WorkView/InsuredService/2016/06}ArrayOfInsuredResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "overallResult",
    "insuredResponse"
})
public class Response {

    @XmlElementRef(name = "OverallResult", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overallResult;
    @XmlElementRef(name = "InsuredResponse", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInsuredResponse> insuredResponse;

    /**
     * Gets the value of the overallResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverallResult() {
        return overallResult;
    }

    /**
     * Sets the value of the overallResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverallResult(JAXBElement<String> value) {
        this.overallResult = value;
    }

    /**
     * Gets the value of the insuredResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInsuredResponse }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInsuredResponse> getInsuredResponse() {
        return insuredResponse;
    }

    /**
     * Sets the value of the insuredResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInsuredResponse }{@code >}
     *     
     */
    public void setInsuredResponse(JAXBElement<ArrayOfInsuredResponse> value) {
        this.insuredResponse = value;
    }

}
