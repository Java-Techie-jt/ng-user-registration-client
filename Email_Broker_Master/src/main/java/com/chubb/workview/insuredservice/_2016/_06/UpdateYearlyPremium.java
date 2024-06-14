
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
 *         &lt;element name="yearlyPremiumRequest" type="{http://Chubb.com/WorkView/InsuredService/2016/06}YearlyPremiumRequest" minOccurs="0"/>
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
    "yearlyPremiumRequest"
})
@XmlRootElement(name = "UpdateYearlyPremium")
public class UpdateYearlyPremium {

    @XmlElementRef(name = "yearlyPremiumRequest", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<YearlyPremiumRequest> yearlyPremiumRequest;

    /**
     * Gets the value of the yearlyPremiumRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YearlyPremiumRequest }{@code >}
     *     
     */
    public JAXBElement<YearlyPremiumRequest> getYearlyPremiumRequest() {
        return yearlyPremiumRequest;
    }

    /**
     * Sets the value of the yearlyPremiumRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YearlyPremiumRequest }{@code >}
     *     
     */
    public void setYearlyPremiumRequest(JAXBElement<YearlyPremiumRequest> value) {
        this.yearlyPremiumRequest = value;
    }

}
