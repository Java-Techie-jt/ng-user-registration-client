
package com.chubb.workview.policyservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="PolicyRequest" type="{http://Chubb.com/WorkView/PolicyService/2016/06}ArrayOfPolicyInfo" minOccurs="0"/>
 *         &lt;element name="EnvironmentData" type="{http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts}EnvironmentData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", propOrder = {
    "policyRequest",
    "environmentData"
})
public class Request {

    @XmlElementRef(name = "PolicyRequest", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<PolicyRequest> policyRequest;
    @XmlElementRef(name = "EnvironmentData", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<EnvironmentData> environmentData;

    /**
     * Gets the value of the policyRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PolicyRequest }{@code >}
     *     
     */
    public JAXBElement<PolicyRequest> getPolicyRequest() {
        return policyRequest;
    }

    /**
     * Sets the value of the policyRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PolicyRequest }{@code >}
     *     
     */
    public void setPolicyRequest(JAXBElement<PolicyRequest> value) {
        this.policyRequest = value;
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
