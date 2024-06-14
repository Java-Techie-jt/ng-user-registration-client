
package com.chubb.preprocessor.emailbrokermaster.policywebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoverageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveragePolicyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CoverageResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoverageSequenceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CoverageStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageResponse", propOrder = {
    "coverageDescription",
    "coveragePolicyID",
    "coverageResult",
    "coverageSequenceID",
    "coverageStatus"
})
public class CoverageResponse {

    @XmlElementRef(name = "CoverageDescription", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coverageDescription;
    @XmlElement(name = "CoveragePolicyID")
    protected Integer coveragePolicyID;
    @XmlElementRef(name = "CoverageResult", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coverageResult;
    @XmlElement(name = "CoverageSequenceID")
    protected Integer coverageSequenceID;
    @XmlElement(name = "CoverageStatus")
    protected Boolean coverageStatus;

    /**
     * Gets the value of the coverageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoverageDescription() {
        return coverageDescription;
    }

    /**
     * Sets the value of the coverageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoverageDescription(JAXBElement<String> value) {
        this.coverageDescription = value;
    }

    /**
     * Gets the value of the coveragePolicyID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCoveragePolicyID() {
        return coveragePolicyID;
    }

    /**
     * Sets the value of the coveragePolicyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCoveragePolicyID(Integer value) {
        this.coveragePolicyID = value;
    }

    /**
     * Gets the value of the coverageResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoverageResult() {
        return coverageResult;
    }

    /**
     * Sets the value of the coverageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoverageResult(JAXBElement<String> value) {
        this.coverageResult = value;
    }

    /**
     * Gets the value of the coverageSequenceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCoverageSequenceID() {
        return coverageSequenceID;
    }

    /**
     * Sets the value of the coverageSequenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCoverageSequenceID(Integer value) {
        this.coverageSequenceID = value;
    }

    /**
     * Gets the value of the coverageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoverageStatus() {
        return coverageStatus;
    }

    /**
     * Sets the value of the coverageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoverageStatus(Boolean value) {
        this.coverageStatus = value;
    }

}
