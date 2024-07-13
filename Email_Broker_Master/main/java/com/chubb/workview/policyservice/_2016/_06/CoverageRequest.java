
package com.chubb.workview.policyservice._2016._06;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveragCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LimitAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="POCULL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POCUPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyAnnualPremium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PremiumAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PremiumCurrencyCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectionDetailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectionDetailTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubSectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageRequest", propOrder = {
    "attachmentPoint",
    "coveragCode",
    "currency",
    "currencyCode",
    "entityShortName",
    "exchangeRate",
    "limit",
    "limitAmount",
    "pocull",
    "pocupr",
    "policyAnnualPremium",
    "policyNumber",
    "premiumAmount",
    "premiumCurrencyCD",
    "sectionCode",
    "sectionDetailID",
    "sectionDetailTitle",
    "sectionName",
    "subSectionCode"
})
public class CoverageRequest {

    @XmlElementRef(name = "AttachmentPoint", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attachmentPoint;
    @XmlElementRef(name = "CoveragCode", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coveragCode;
    @XmlElement(name = "Currency")
    protected Integer currency;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "EntityShortName", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityShortName;
    @XmlElement(name = "ExchangeRate")
    protected BigDecimal exchangeRate;
    @XmlElementRef(name = "Limit", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> limit;
    @XmlElement(name = "LimitAmount")
    protected BigDecimal limitAmount;
    @XmlElementRef(name = "POCULL", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pocull;
    @XmlElementRef(name = "POCUPR", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pocupr;
    @XmlElementRef(name = "PolicyAnnualPremium", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyAnnualPremium;
    @XmlElementRef(name = "PolicyNumber", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNumber;
    @XmlElement(name = "PremiumAmount")
    protected BigDecimal premiumAmount;
    @XmlElementRef(name = "PremiumCurrencyCD", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> premiumCurrencyCD;
    @XmlElementRef(name = "SectionCode", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectionCode;
    @XmlElementRef(name = "SectionDetailID", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectionDetailID;
    @XmlElementRef(name = "SectionDetailTitle", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectionDetailTitle;
    @XmlElementRef(name = "SectionName", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectionName;
    @XmlElementRef(name = "SubSectionCode", namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subSectionCode;

    /**
     * Gets the value of the attachmentPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttachmentPoint() {
        return attachmentPoint;
    }

    /**
     * Sets the value of the attachmentPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttachmentPoint(JAXBElement<String> value) {
        this.attachmentPoint = value;
    }

    /**
     * Gets the value of the coveragCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoveragCode() {
        return coveragCode;
    }

    /**
     * Sets the value of the coveragCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoveragCode(JAXBElement<String> value) {
        this.coveragCode = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrency(Integer value) {
        this.currency = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the entityShortName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityShortName() {
        return entityShortName;
    }

    /**
     * Sets the value of the entityShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityShortName(JAXBElement<String> value) {
        this.entityShortName = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimit(JAXBElement<String> value) {
        this.limit = value;
    }

    /**
     * Gets the value of the limitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    /**
     * Sets the value of the limitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimitAmount(BigDecimal value) {
        this.limitAmount = value;
    }

    /**
     * Gets the value of the pocull property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOCULL() {
        return pocull;
    }

    /**
     * Sets the value of the pocull property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOCULL(JAXBElement<String> value) {
        this.pocull = value;
    }

    /**
     * Gets the value of the pocupr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOCUPR() {
        return pocupr;
    }

    /**
     * Sets the value of the pocupr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOCUPR(JAXBElement<String> value) {
        this.pocupr = value;
    }

    /**
     * Gets the value of the policyAnnualPremium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyAnnualPremium() {
        return policyAnnualPremium;
    }

    /**
     * Sets the value of the policyAnnualPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyAnnualPremium(JAXBElement<String> value) {
        this.policyAnnualPremium = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyNumber(JAXBElement<String> value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the premiumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPremiumAmount() {
        return premiumAmount;
    }

    /**
     * Sets the value of the premiumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPremiumAmount(BigDecimal value) {
        this.premiumAmount = value;
    }

    /**
     * Gets the value of the premiumCurrencyCD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPremiumCurrencyCD() {
        return premiumCurrencyCD;
    }

    /**
     * Sets the value of the premiumCurrencyCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPremiumCurrencyCD(JAXBElement<String> value) {
        this.premiumCurrencyCD = value;
    }

    /**
     * Gets the value of the sectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectionCode() {
        return sectionCode;
    }

    /**
     * Sets the value of the sectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectionCode(JAXBElement<String> value) {
        this.sectionCode = value;
    }

    /**
     * Gets the value of the sectionDetailID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectionDetailID() {
        return sectionDetailID;
    }

    /**
     * Sets the value of the sectionDetailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectionDetailID(JAXBElement<String> value) {
        this.sectionDetailID = value;
    }

    /**
     * Gets the value of the sectionDetailTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectionDetailTitle() {
        return sectionDetailTitle;
    }

    /**
     * Sets the value of the sectionDetailTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectionDetailTitle(JAXBElement<String> value) {
        this.sectionDetailTitle = value;
    }

    /**
     * Gets the value of the sectionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectionName() {
        return sectionName;
    }

    /**
     * Sets the value of the sectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectionName(JAXBElement<String> value) {
        this.sectionName = value;
    }

    /**
     * Gets the value of the subSectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubSectionCode() {
        return subSectionCode;
    }

    /**
     * Sets the value of the subSectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubSectionCode(JAXBElement<String> value) {
        this.subSectionCode = value;
    }

}
