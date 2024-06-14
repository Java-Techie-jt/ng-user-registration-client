
package com.chubb.workview.insuredservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuredRelationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuredRelationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuredRelation" type="{http://Chubb.com/WorkView/InsuredService/2016/06}ArrayOfInsuredRelationInfo" minOccurs="0"/>
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
@XmlType(name = "InsuredRelationResponse", propOrder = {
    "insuredRelation",
    "overAllResult"
})
public class InsuredRelationResponse {

    @XmlElementRef(name = "InsuredRelation", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInsuredRelationInfo> insuredRelation;
    @XmlElementRef(name = "OverAllResult", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overAllResult;

    /**
     * Gets the value of the insuredRelation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInsuredRelationInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInsuredRelationInfo> getInsuredRelation() {
        return insuredRelation;
    }

    /**
     * Sets the value of the insuredRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInsuredRelationInfo }{@code >}
     *     
     */
    public void setInsuredRelation(JAXBElement<ArrayOfInsuredRelationInfo> value) {
        this.insuredRelation = value;
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
