
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
 *         &lt;element name="UpdateYearlyPremiumResult" type="{http://Chubb.com/WorkView/InsuredService/2016/06}YearlyPremiumResponse" minOccurs="0"/>
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
    "updateYearlyPremiumResult"
})
@XmlRootElement(name = "UpdateYearlyPremiumResponse")
public class UpdateYearlyPremiumResponse {

    @XmlElementRef(name = "UpdateYearlyPremiumResult", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<YearlyPremiumResponse> updateYearlyPremiumResult;

    /**
     * Gets the value of the updateYearlyPremiumResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YearlyPremiumResponse }{@code >}
     *     
     */
    public JAXBElement<YearlyPremiumResponse> getUpdateYearlyPremiumResult() {
        return updateYearlyPremiumResult;
    }

    /**
     * Sets the value of the updateYearlyPremiumResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YearlyPremiumResponse }{@code >}
     *     
     */
    public void setUpdateYearlyPremiumResult(JAXBElement<YearlyPremiumResponse> value) {
        this.updateYearlyPremiumResult = value;
    }

}
