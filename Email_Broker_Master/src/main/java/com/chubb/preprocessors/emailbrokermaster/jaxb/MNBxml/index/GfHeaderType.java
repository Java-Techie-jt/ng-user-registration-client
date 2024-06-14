package com.chubb.preprocessors.emailbrokermaster.jaxb.MNBxml.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gf_headerType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="gf_headerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gf_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gf_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gf_security_policy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gf_headerType", propOrder = {
        "gfNumber",
        "gfType",
        "gfSecurityPolicy"
})
public class GfHeaderType {

    @XmlElement(name = "gf_number", required = true)
    protected String gfNumber;
    @XmlElement(name = "gf_type", required = true)
    protected String gfType;
    @XmlElement(name = "gf_security_policy", required = true)
    protected String gfSecurityPolicy;

    /**
     * Gets the value of the gfNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGfNumber() {
        return gfNumber;
    }

    /**
     * Sets the value of the gfNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGfNumber(String value) {
        this.gfNumber = value;
    }

    /**
     * Gets the value of the gfType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGfType() {
        return gfType;
    }

    /**
     * Sets the value of the gfType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGfType(String value) {
        this.gfType = value;
    }

    /**
     * Gets the value of the gfSecurityPolicy property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGfSecurityPolicy() {
        return gfSecurityPolicy;
    }

    /**
     * Sets the value of the gfSecurityPolicy property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGfSecurityPolicy(String value) {
        this.gfSecurityPolicy = value;
    }

}
