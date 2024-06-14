
package com.chubb.workview.insuredservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuredDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuredDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuredInfoRequest" type="{http://Chubb.com/WorkView/InsuredService/2016/06}InsuredInfoRequest" minOccurs="0"/>
 *         &lt;element name="CorrespondentDetails" type="{http://Chubb.com/WorkView/InsuredService/2016/06}CorrespondentDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuredDetails", propOrder = {
    "insuredInfoRequest",
    "correspondentDetails"
})
public class InsuredDetails {

    @XmlElementRef(name = "InsuredInfoRequest", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<InsuredInfoRequest> insuredInfoRequest;
    @XmlElementRef(name = "CorrespondentDetails", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<CorrespondentDetails> correspondentDetails;

    /**
     * Gets the value of the insuredInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsuredInfoRequest }{@code >}
     *     
     */
    public JAXBElement<InsuredInfoRequest> getInsuredInfoRequest() {
        return insuredInfoRequest;
    }

    /**
     * Sets the value of the insuredInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsuredInfoRequest }{@code >}
     *     
     */
    public void setInsuredInfoRequest(JAXBElement<InsuredInfoRequest> value) {
        this.insuredInfoRequest = value;
    }

    /**
     * Gets the value of the correspondentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CorrespondentDetails }{@code >}
     *     
     */
    public JAXBElement<CorrespondentDetails> getCorrespondentDetails() {
        return correspondentDetails;
    }

    /**
     * Sets the value of the correspondentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CorrespondentDetails }{@code >}
     *     
     */
    public void setCorrespondentDetails(JAXBElement<CorrespondentDetails> value) {
        this.correspondentDetails = value;
    }

}
