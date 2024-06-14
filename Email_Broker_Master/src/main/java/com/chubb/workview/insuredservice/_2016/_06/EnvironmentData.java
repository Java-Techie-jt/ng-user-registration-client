
package com.chubb.workview.insuredservice._2016._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MessageGUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkViewEnvironment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkViewLogonID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentData", propOrder = {
    "countryCode",
    "messageGUID",
    "sourceSystem",
    "workViewEnvironment",
    "workViewLogonID"
})
public class EnvironmentData {

    @XmlElement(name = "CountryCode", required = true, nillable = true)
    protected String countryCode;
    @XmlElement(name = "MessageGUID", required = true, nillable = true)
    protected String messageGUID;
    @XmlElement(name = "SourceSystem", required = true, nillable = true)
    protected String sourceSystem;
    @XmlElement(name = "WorkViewEnvironment", required = true, nillable = true)
    protected String workViewEnvironment;
    @XmlElement(name = "WorkViewLogonID", required = true, nillable = true)
    protected String workViewLogonID;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the messageGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageGUID() {
        return messageGUID;
    }

    /**
     * Sets the value of the messageGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageGUID(String value) {
        this.messageGUID = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the workViewEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkViewEnvironment() {
        return workViewEnvironment;
    }

    /**
     * Sets the value of the workViewEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkViewEnvironment(String value) {
        this.workViewEnvironment = value;
    }

    /**
     * Gets the value of the workViewLogonID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkViewLogonID() {
        return workViewLogonID;
    }

    /**
     * Sets the value of the workViewLogonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkViewLogonID(String value) {
        this.workViewLogonID = value;
    }

}
