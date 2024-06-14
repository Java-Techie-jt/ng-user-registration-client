package com.chubb.preprocessors.emailbrokermaster.jaxb.bodyxml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}cert_number"/>
 *         &lt;element ref="{}pol_number"/>
 *         &lt;element ref="{}cert_name"/>
 *         &lt;element ref="{}ent_code"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"certNumber", "polNumber", "certName", "entCode"})
@XmlRootElement(name = "certificate")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
public class Certificate {

    @XmlElement(name = "cert_number", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String certNumber;
    @XmlElement(name = "pol_number", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String polNumber;
    @XmlElement(name = "cert_name", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String certName;
    @XmlElement(name = "ent_code", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String entCode;

    /**
     * Gets the value of the certNumber property.
     *
     * @return possible object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCertNumber() {
        return certNumber;
    }

    /**
     * Sets the value of the certNumber property.
     *
     * @param value allowed object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCertNumber(String value) {
        this.certNumber = value;
    }

    /**
     * Gets the value of the polNumber property.
     *
     * @return possible object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPolNumber() {
        return polNumber;
    }

    /**
     * Sets the value of the polNumber property.
     *
     * @param value allowed object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPolNumber(String value) {
        this.polNumber = value;
    }

    /**
     * Gets the value of the certName property.
     *
     * @return possible object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCertName() {
        return certName;
    }

    /**
     * Sets the value of the certName property.
     *
     * @param value allowed object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCertName(String value) {
        this.certName = value;
    }

    /**
     * Gets the value of the entCode property.
     *
     * @return possible object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEntCode() {
        return entCode;
    }

    /**
     * Sets the value of the entCode property.
     *
     * @param value allowed object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEntCode(String value) {
        this.entCode = value;
    }

}
