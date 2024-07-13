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
 *         &lt;element ref="{}gf_number"/>
 *         &lt;element ref="{}ent_code"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"gfNumber", "entCode"})
@XmlRootElement(name = "generalfile")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
public class Generalfile {

    @XmlElement(name = "gf_number", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String gfNumber;
    @XmlElement(name = "ent_code", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String entCode;

    /**
     * Gets the value of the gfNumber property.
     *
     * @return possible object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getGfNumber() {
        return gfNumber;
    }

    /**
     * Sets the value of the gfNumber property.
     *
     * @param value allowed object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGfNumber(String value) {
        this.gfNumber = value;
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
