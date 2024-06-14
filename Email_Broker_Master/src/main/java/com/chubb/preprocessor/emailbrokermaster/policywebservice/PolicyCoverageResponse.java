
package com.chubb.preprocessor.emailbrokermaster.policywebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyCoverageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyCoverageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoverageResponse" type="{http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts}ArrayOfCoverageResponse" minOccurs="0"/>
 *         &lt;element name="OverAllResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyCoverageResponse", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", propOrder = {
    "coverageResponse",
    "overAllResult"
})
public class PolicyCoverageResponse {

    @XmlElementRef(name = "CoverageResponse", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCoverageResponse> coverageResponse;
    @XmlElementRef(name = "OverAllResult", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overAllResult;

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
     * Gets the value of the overAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverAllResult() {
        return overAllResult;
    }

    /**
     * Sets the value of the overAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverAllResult(JAXBElement<String> value) {
        this.overAllResult = value;
    }

}
