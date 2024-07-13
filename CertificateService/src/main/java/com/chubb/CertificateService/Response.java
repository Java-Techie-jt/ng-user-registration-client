
package com.chubb.CertificateService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="OverAllResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CertificateResponseDetails" type="{}ArrayOfCertificateResponse"/>
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
    "overAllResult",
    "certificateResponseDetails"
})
public class Response {

    @XmlElement(name = "OverAllResult", required = true, nillable = true)
    protected String overAllResult;
    @XmlElement(name = "CertificateResponseDetails", required = true, nillable = true)
    protected ArrayOfCertificateResponse certificateResponseDetails;

    /**
     * Gets the value of the overAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverAllResult() {
        return overAllResult;
    }

    /**
     * Sets the value of the overAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverAllResult(String value) {
        this.overAllResult = value;
    }

    /**
     * Gets the value of the certificateResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCertificateResponse }
     *     
     */
    public ArrayOfCertificateResponse getCertificateResponseDetails() {
        return certificateResponseDetails;
    }

    /**
     * Sets the value of the certificateResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCertificateResponse }
     *     
     */
    public void setCertificateResponseDetails(ArrayOfCertificateResponse value) {
        this.certificateResponseDetails = value;
    }

}
