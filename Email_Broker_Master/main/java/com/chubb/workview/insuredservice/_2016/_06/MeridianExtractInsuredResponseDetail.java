
package com.chubb.workview.insuredservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MeridianExtractInsuredResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeridianExtractInsuredResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Policyholdercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAFCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiretCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COTEExpertCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COTEExpertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PreviousCOTECode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeridianExtractInsuredResponseDetail", propOrder = {
    "entity",
    "policyholdercode",
    "nafCode",
    "siretCode",
    "coteExpertCode",
    "coteExpertDate",
    "previousCOTECode"
})
public class MeridianExtractInsuredResponseDetail {

    @XmlElementRef(name = "Entity", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entity;
    @XmlElementRef(name = "Policyholdercode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholdercode;
    @XmlElementRef(name = "NAFCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nafCode;
    @XmlElementRef(name = "SiretCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siretCode;
    @XmlElementRef(name = "COTEExpertCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coteExpertCode;
    @XmlElementRef(name = "COTEExpertDate", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> coteExpertDate;
    @XmlElementRef(name = "PreviousCOTECode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousCOTECode;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntity(JAXBElement<String> value) {
        this.entity = value;
    }

    /**
     * Gets the value of the policyholdercode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyholdercode() {
        return policyholdercode;
    }

    /**
     * Sets the value of the policyholdercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyholdercode(JAXBElement<String> value) {
        this.policyholdercode = value;
    }

    /**
     * Gets the value of the nafCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAFCode() {
        return nafCode;
    }

    /**
     * Sets the value of the nafCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAFCode(JAXBElement<String> value) {
        this.nafCode = value;
    }

    /**
     * Gets the value of the siretCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiretCode() {
        return siretCode;
    }

    /**
     * Sets the value of the siretCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiretCode(JAXBElement<String> value) {
        this.siretCode = value;
    }

    /**
     * Gets the value of the coteExpertCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOTEExpertCode() {
        return coteExpertCode;
    }

    /**
     * Sets the value of the coteExpertCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOTEExpertCode(JAXBElement<String> value) {
        this.coteExpertCode = value;
    }

    /**
     * Gets the value of the coteExpertDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCOTEExpertDate() {
        return coteExpertDate;
    }

    /**
     * Sets the value of the coteExpertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCOTEExpertDate(JAXBElement<XMLGregorianCalendar> value) {
        this.coteExpertDate = value;
    }

    /**
     * Gets the value of the previousCOTECode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousCOTECode() {
        return previousCOTECode;
    }

    /**
     * Sets the value of the previousCOTECode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousCOTECode(JAXBElement<String> value) {
        this.previousCOTECode = value;
    }

}
