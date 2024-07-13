
package com.chubb.preprocessor.emailbrokermaster.policywebservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPolicyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPolicyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyResponse" type="{http://Chubb.com/WorkView/PolicyService/2016/06}PolicyResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPolicyResponse", namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", propOrder = {
    "policyResponse"
})
public class ArrayOfPolicyResponse {

    @XmlElement(name = "PolicyResponse", nillable = true)
    protected List<PolicyResponse> policyResponse;

    /**
     * Gets the value of the policyResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyResponse }
     * 
     * 
     */
    public List<PolicyResponse> getPolicyResponse() {
        if (policyResponse == null) {
            policyResponse = new ArrayList<PolicyResponse>();
        }
        return this.policyResponse;
    }

}
