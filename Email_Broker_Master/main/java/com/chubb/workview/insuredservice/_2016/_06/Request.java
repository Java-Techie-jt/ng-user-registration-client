
package com.chubb.workview.insuredservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuredRequest" type="{http://Chubb.com/WorkView/InsuredService/2016/06}InsuredRequest" minOccurs="0"/>
 *         &lt;element name="EnvironmentData" type="{http://Chubb.com/WorkView/InsuredService/2016/06}EnvironmentData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "insuredRequest",
    "environmentData"
})
public class Request {

    @XmlElementRef(name = "InsuredRequest", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<InsuredRequest> insuredRequest;
    @XmlElementRef(name = "EnvironmentData", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<EnvironmentData> environmentData;

    /**
     * Gets the value of the insuredRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsuredRequest }{@code >}
     *     
     */
    public JAXBElement<InsuredRequest> getInsuredRequest() {
        return insuredRequest;
    }

    /**
     * Sets the value of the insuredRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsuredRequest }{@code >}
     *     
     */
    public void setInsuredRequest(JAXBElement<InsuredRequest> value) {
        this.insuredRequest = value;
    }

    /**
     * Gets the value of the environmentData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     *     
     */
    public JAXBElement<EnvironmentData> getEnvironmentData() {
        return environmentData;
    }

    /**
     * Sets the value of the environmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     *     
     */
    public void setEnvironmentData(JAXBElement<EnvironmentData> value) {
        this.environmentData = value;
    }

}
