
package com.chubb.workview.insuredservice._2016._06;

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
 *         &lt;element name="insuredRelationRequest" type="{http://Chubb.com/WorkView/InsuredService/2016/06}InsuredRelationRequest" minOccurs="0"/>
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
    "insuredRelationRequest"
})
@XmlRootElement(name = "CreateOrUpdateInsuredRelation")
public class CreateOrUpdateInsuredRelation {

    @XmlElementRef(name = "insuredRelationRequest", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<InsuredRelationRequest> insuredRelationRequest;

    /**
     * Gets the value of the insuredRelationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsuredRelationRequest }{@code >}
     *     
     */
    public JAXBElement<InsuredRelationRequest> getInsuredRelationRequest() {
        return insuredRelationRequest;
    }

    /**
     * Sets the value of the insuredRelationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsuredRelationRequest }{@code >}
     *     
     */
    public void setInsuredRelationRequest(JAXBElement<InsuredRelationRequest> value) {
        this.insuredRelationRequest = value;
    }

}
