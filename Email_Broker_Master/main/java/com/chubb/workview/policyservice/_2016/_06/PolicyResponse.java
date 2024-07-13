
package com.chubb.workview.policyservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CoverageResponse" type="{http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts}ArrayOfCoverageResponse" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyResponse", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", propOrder = {
    "status",
    "coverageResponse",
    "result",
    "policyNumber",
    "description",
    "quoteNumber"
})
public class PolicyResponse {

    @XmlElement(name = "Status")
    protected boolean status;
    @XmlElementRef(name = "CoverageResponse", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCoverageResponse> coverageResponse;
    @XmlElement(name = "Result", required = true, nillable = true)
    protected String result;
    @XmlElement(name = "PolicyNumber", required = true, nillable = true)
    protected String policyNumber;
    @XmlElementRef(name = "Description", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "QuoteNumber", required = true, nillable = true)
    protected String quoteNumber;

    /**
     * Gets the value of the status property.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the coverageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCoverageResponse }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCoverageResponse> getCoverageResponse() {
        return coverageResponse;
    }

    /**
     * Sets the value of the coverageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCoverageResponse }{@code >}
     *     
     */
    public void setCoverageResponse(JAXBElement<ArrayOfCoverageResponse> value) {
        this.coverageResponse = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumber(String value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the quoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNumber(String value) {
        this.quoteNumber = value;
    }

}
