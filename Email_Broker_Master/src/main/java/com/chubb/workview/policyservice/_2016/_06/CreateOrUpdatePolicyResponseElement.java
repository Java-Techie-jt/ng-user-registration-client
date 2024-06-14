
package com.chubb.workview.policyservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateOrUpdatePolicyResult" type="{http://Chubb.com/WorkView/PolicyService/2016/06}Response" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createOrUpdatePolicyResult"
})
@XmlRootElement(name = "CreateOrUpdatePolicyResponse", namespace = "http://chubb.com/WorkView/PolicyService/2016/06")
public class CreateOrUpdatePolicyResponseElement {

    @XmlElementRef(name = "CreateOrUpdatePolicyResult", namespace = "http://chubb.com/WorkView/PolicyService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<Response> createOrUpdatePolicyResult;

    /**
     * Gets the value of the createOrUpdatePolicyResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Response }{@code >}
     *     
     */
    public JAXBElement<Response> getCreateOrUpdatePolicyResult() {
        return createOrUpdatePolicyResult;
    }

    /**
     * Sets the value of the createOrUpdatePolicyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Response }{@code >}
     *     
     */
    public void setCreateOrUpdatePolicyResult(JAXBElement<Response> value) {
        this.createOrUpdatePolicyResult = value;
    }

}
