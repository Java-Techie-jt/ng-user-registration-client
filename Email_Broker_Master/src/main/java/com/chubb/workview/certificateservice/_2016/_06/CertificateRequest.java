
package com.chubb.workview.certificateservice._2016._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertificateInfoRequest" type="{http://Chubb.com/WorkView/CertificateService/2016/06}CertificateInfoRequest"/>
 *         &lt;element name="CorrespondentInfoRequest" type="{http://Chubb.com/WorkView/CertificateService/2016/06}CorrespondentRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateRequest", propOrder = {
    "certificateInfoRequest",
    "correspondentInfoRequest"
})
public class CertificateRequest {

    @XmlElement(name = "CertificateInfoRequest", required = true, nillable = true)
    protected CertificateInfoRequest certificateInfoRequest;
    @XmlElement(name = "CorrespondentInfoRequest", required = true, nillable = true)
    protected CorrespondentRequest correspondentInfoRequest;

    /**
     * Gets the value of the certificateInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateInfoRequest }
     *     
     */
    public CertificateInfoRequest getCertificateInfoRequest() {
        return certificateInfoRequest;
    }

    /**
     * Sets the value of the certificateInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateInfoRequest }
     *     
     */
    public void setCertificateInfoRequest(CertificateInfoRequest value) {
        this.certificateInfoRequest = value;
    }

    /**
     * Gets the value of the correspondentInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondentRequest }
     *     
     */
    public CorrespondentRequest getCorrespondentInfoRequest() {
        return correspondentInfoRequest;
    }

    /**
     * Sets the value of the correspondentInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondentRequest }
     *     
     */
    public void setCorrespondentInfoRequest(CorrespondentRequest value) {
        this.correspondentInfoRequest = value;
    }

}
