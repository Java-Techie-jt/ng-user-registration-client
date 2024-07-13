package com.chubb.preprocessors.emailbrokermaster.jaxb.bodyxml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *       &lt;choice>
 *         &lt;element ref="{}policy"/>
 *         &lt;element ref="{}claim"/>
 *         &lt;element ref="{}certificate"/>
 *         &lt;element ref="{}generalfile"/>
 *         &lt;element ref="{}quote"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"policy", "claim", "certificate", "generalfile", "quote"})
@XmlRootElement(name = "index")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
public class Index {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Policy policy;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Claim claim;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Certificate certificate;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Generalfile generalfile;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Quote quote;

    /**
     * Gets the value of the policy property.
     *
     * @return possible object is {@link Policy }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public Policy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     *
     * @param value allowed object is {@link Policy }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPolicy(Policy value) {
        this.policy = value;
    }

    /**
     * Gets the value of the claim property.
     *
     * @return possible object is {@link Claim }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public Claim getClaim() {
        return claim;
    }

    /**
     * Sets the value of the claim property.
     *
     * @param value allowed object is {@link Claim }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setClaim(Claim value) {
        this.claim = value;
    }

    /**
     * Gets the value of the certificate property.
     *
     * @return possible object is {@link Certificate }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public Certificate getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     *
     * @param value allowed object is {@link Certificate }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCertificate(Certificate value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the generalfile property.
     *
     * @return possible object is {@link Generalfile }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public Generalfile getGeneralfile() {
        return generalfile;
    }

    /**
     * Sets the value of the generalfile property.
     *
     * @param value allowed object is {@link Generalfile }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGeneralfile(Generalfile value) {
        this.generalfile = value;
    }

    /**
     * Gets the value of the quote property.
     *
     * @return possible object is {@link Quote }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public Quote getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     *
     * @param value allowed object is {@link Quote }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setQuote(Quote value) {
        this.quote = value;
    }

    @Override
    public String toString() {
        return policy != null ? "POLICY"
                : claim != null ? "CLAIM"
                : quote != null ? "QUOTE"
                : certificate != null ? "CERTIFICATE" : generalfile != null ? "GENERALFILE" : "ERROR";
    }

}
