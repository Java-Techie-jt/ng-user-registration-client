
package com.chubb.workview.certificateservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkViewEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkViewLogonID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentData", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", propOrder = {
    "countryCode",
    "messageGUID",
    "sourceSystem",
    "workViewEnvironment",
    "workViewLogonID"
})
public class EnvironmentData {

    @XmlElementRef(name = "CountryCode", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "MessageGUID", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageGUID;
    @XmlElementRef(name = "SourceSystem", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSystem;
    @XmlElementRef(name = "WorkViewEnvironment", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workViewEnvironment;
    @XmlElementRef(name = "WorkViewLogonID", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workViewLogonID;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<String> value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the messageGUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageGUID() {
        return messageGUID;
    }

    /**
     * Sets the value of the messageGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageGUID(JAXBElement<String> value) {
        this.messageGUID = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystem(JAXBElement<String> value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the workViewEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkViewEnvironment() {
        return workViewEnvironment;
    }

    /**
     * Sets the value of the workViewEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkViewEnvironment(JAXBElement<String> value) {
        this.workViewEnvironment = value;
    }

    /**
     * Gets the value of the workViewLogonID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkViewLogonID() {
        return workViewLogonID;
    }

    /**
     * Sets the value of the workViewLogonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkViewLogonID(JAXBElement<String> value) {
        this.workViewLogonID = value;
    }

}
