
package com.chubb.workview.insuredservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YearlyPremiumRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YearlyPremiumRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YearlyPremium" type="{http://Chubb.com/WorkView/InsuredService/2016/06}ArrayOfYearlyPremiumDetails" minOccurs="0"/>
 *         &lt;element name="EnvironmentData" type="{http://Chubb.com/WorkView/InsuredService/2016/06}EnvironmentData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YearlyPremiumRequest", propOrder = {
    "yearlyPremium",
    "environmentData"
})
public class YearlyPremiumRequest {

    @XmlElementRef(name = "YearlyPremium", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfYearlyPremiumDetails> yearlyPremium;
    @XmlElementRef(name = "EnvironmentData", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<EnvironmentData> environmentData;

    /**
     * Gets the value of the yearlyPremium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfYearlyPremiumDetails }{@code >}
     *     
     */
    public JAXBElement<ArrayOfYearlyPremiumDetails> getYearlyPremium() {
        return yearlyPremium;
    }

    /**
     * Sets the value of the yearlyPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfYearlyPremiumDetails }{@code >}
     *     
     */
    public void setYearlyPremium(JAXBElement<ArrayOfYearlyPremiumDetails> value) {
        this.yearlyPremium = value;
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
