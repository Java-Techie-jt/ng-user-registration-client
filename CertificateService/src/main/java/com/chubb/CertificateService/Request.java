
package com.chubb.CertificateService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CertificateDetails" type="{http://Chubb.com/WorkView/CertificateService/2016/06}ArrayOfCertificateRequest"/>
 *         &lt;element name="EnvironmentData" type="{http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts}EnvironmentData" minOccurs="0"/>
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
    "certificateDetails",
    "environmentData"
})
public class Request {

    @XmlElement(name = "CertificateDetails", required = true, nillable = true)
    protected ArrayOfCertificateRequest certificateDetails;
    @XmlElementRef(name = "EnvironmentData", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<EnvironmentData> environmentData;

    /**
     * Gets the value of the certificateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCertificateRequest }
     *     
     */
    public ArrayOfCertificateRequest getCertificateDetails() {
        return certificateDetails;
    }

    /**
     * Sets the value of the certificateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCertificateRequest }
     *     
     */
    public void setCertificateDetails(ArrayOfCertificateRequest value) {
        this.certificateDetails = value;
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
