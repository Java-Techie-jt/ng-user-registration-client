
package com.chubb.workview.insuredservice._2016._06;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MeridianInsuredExtractResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeridianInsuredExtractResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACTIONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LASTDATEOFCHANGE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EMPLOYEENUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECORDTYPEV21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUSINESSENTITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POLICYHOLDERCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POLICYHOLDERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POLICYHOLDERSTREET1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POLICYHOLDERSTREET2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POLICYHOLDERCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POLICYHOLDERZIPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POLICYHOLDERPOLITICALSUBDIVISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POLICYHOLDERCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UFIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POLICYHOLDERSALPHACODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UFIL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANKACCOUNTNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANKROUTINGNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MULTINATIONALPREFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MULTINATIONALCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UFIL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAXCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UFIL4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TITLECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UFIL5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LETTERSEQUENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BLOCKINGINDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRANSACTIONEVENTTAG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DUNBRADSTREETRATING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNBRADSTREETNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENDOFRECORDMARKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeridianInsuredExtractResponseDetail", propOrder = {
    "actioncode",
    "lastdateofchange",
    "employeenumber",
    "recordtypev21",
    "businessentity",
    "policyholdercode",
    "policyholdername",
    "policyholderstreet1",
    "policyholderstreet2",
    "policyholdercity",
    "policyholderzipcode",
    "policyholderpoliticalsubdivision",
    "policyholdercountry",
    "ufil1",
    "policyholdersalphacode",
    "ufil2",
    "bankaccountnumber",
    "bankroutingnumber",
    "multinationalprefix",
    "multinationalcode",
    "ufil3",
    "taxcode",
    "ufil4",
    "titlecode",
    "ufil5",
    "lettersequence",
    "blockingindicator",
    "transactioneventtag",
    "dunbradstreetrating",
    "dunbradstreetnumber",
    "endofrecordmarker"
})
public class MeridianInsuredExtractResponseDetail {

    @XmlElementRef(name = "ACTIONCODE", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actioncode;
    @XmlElementRef(name = "LASTDATEOFCHANGE", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastdateofchange;
    @XmlElementRef(name = "EMPLOYEENUMBER", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeenumber;
    @XmlElementRef(name = "RECORDTYPEV21", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordtypev21;
    @XmlElementRef(name = "BUSINESSENTITY", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessentity;
    @XmlElementRef(name = "POLICYHOLDERCODE", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholdercode;
    @XmlElementRef(name = "POLICYHOLDERNAME", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholdername;
    @XmlElementRef(name = "POLICYHOLDERSTREET1", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderstreet1;
    @XmlElementRef(name = "POLICYHOLDERSTREET2", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderstreet2;
    @XmlElementRef(name = "POLICYHOLDERCITY", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholdercity;
    @XmlElementRef(name = "POLICYHOLDERZIPCODE", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderzipcode;
    @XmlElementRef(name = "POLICYHOLDERPOLITICALSUBDIVISION", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholderpoliticalsubdivision;
    @XmlElementRef(name = "POLICYHOLDERCOUNTRY", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholdercountry;
    @XmlElementRef(name = "UFIL1", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufil1;
    @XmlElementRef(name = "POLICYHOLDERSALPHACODE", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyholdersalphacode;
    @XmlElementRef(name = "UFIL2", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufil2;
    @XmlElementRef(name = "BANKACCOUNTNUMBER", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankaccountnumber;
    @XmlElementRef(name = "BANKROUTINGNUMBER", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankroutingnumber;
    @XmlElementRef(name = "MULTINATIONALPREFIX", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> multinationalprefix;
    @XmlElementRef(name = "MULTINATIONALCODE", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> multinationalcode;
    @XmlElementRef(name = "UFIL3", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufil3;
    @XmlElementRef(name = "TAXCODE", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxcode;
    @XmlElementRef(name = "UFIL4", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufil4;
    @XmlElementRef(name = "TITLECODE", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titlecode;
    @XmlElementRef(name = "UFIL5", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufil5;
    @XmlElementRef(name = "LETTERSEQUENCE", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lettersequence;
    @XmlElementRef(name = "BLOCKINGINDICATOR", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blockingindicator;
    @XmlElementRef(name = "TRANSACTIONEVENTTAG", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> transactioneventtag;
    @XmlElementRef(name = "DUNBRADSTREETRATING", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunbradstreetrating;
    @XmlElementRef(name = "DUNBRADSTREETNUMBER", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunbradstreetnumber;
    @XmlElementRef(name = "ENDOFRECORDMARKER", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endofrecordmarker;

    /**
     * Gets the value of the actioncode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACTIONCODE() {
        return actioncode;
    }

    /**
     * Sets the value of the actioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACTIONCODE(JAXBElement<String> value) {
        this.actioncode = value;
    }

    /**
     * Gets the value of the lastdateofchange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLASTDATEOFCHANGE() {
        return lastdateofchange;
    }

    /**
     * Sets the value of the lastdateofchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLASTDATEOFCHANGE(JAXBElement<XMLGregorianCalendar> value) {
        this.lastdateofchange = value;
    }

    /**
     * Gets the value of the employeenumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMPLOYEENUMBER() {
        return employeenumber;
    }

    /**
     * Sets the value of the employeenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMPLOYEENUMBER(JAXBElement<String> value) {
        this.employeenumber = value;
    }

    /**
     * Gets the value of the recordtypev21 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRECORDTYPEV21() {
        return recordtypev21;
    }

    /**
     * Sets the value of the recordtypev21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRECORDTYPEV21(JAXBElement<String> value) {
        this.recordtypev21 = value;
    }

    /**
     * Gets the value of the businessentity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUSINESSENTITY() {
        return businessentity;
    }

    /**
     * Sets the value of the businessentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUSINESSENTITY(JAXBElement<String> value) {
        this.businessentity = value;
    }

    /**
     * Gets the value of the policyholdercode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOLICYHOLDERCODE() {
        return policyholdercode;
    }

    /**
     * Sets the value of the policyholdercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOLICYHOLDERCODE(JAXBElement<String> value) {
        this.policyholdercode = value;
    }

    /**
     * Gets the value of the policyholdername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOLICYHOLDERNAME() {
        return policyholdername;
    }

    /**
     * Sets the value of the policyholdername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOLICYHOLDERNAME(JAXBElement<String> value) {
        this.policyholdername = value;
    }

    /**
     * Gets the value of the policyholderstreet1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOLICYHOLDERSTREET1() {
        return policyholderstreet1;
    }

    /**
     * Sets the value of the policyholderstreet1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOLICYHOLDERSTREET1(JAXBElement<String> value) {
        this.policyholderstreet1 = value;
    }

    /**
     * Gets the value of the policyholderstreet2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOLICYHOLDERSTREET2() {
        return policyholderstreet2;
    }

    /**
     * Sets the value of the policyholderstreet2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOLICYHOLDERSTREET2(JAXBElement<String> value) {
        this.policyholderstreet2 = value;
    }

    /**
     * Gets the value of the policyholdercity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOLICYHOLDERCITY() {
        return policyholdercity;
    }

    /**
     * Sets the value of the policyholdercity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOLICYHOLDERCITY(JAXBElement<String> value) {
        this.policyholdercity = value;
    }

    /**
     * Gets the value of the policyholderzipcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOLICYHOLDERZIPCODE() {
        return policyholderzipcode;
    }

    /**
     * Sets the value of the policyholderzipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOLICYHOLDERZIPCODE(JAXBElement<String> value) {
        this.policyholderzipcode = value;
    }

    /**
     * Gets the value of the policyholderpoliticalsubdivision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOLICYHOLDERPOLITICALSUBDIVISION() {
        return policyholderpoliticalsubdivision;
    }

    /**
     * Sets the value of the policyholderpoliticalsubdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOLICYHOLDERPOLITICALSUBDIVISION(JAXBElement<String> value) {
        this.policyholderpoliticalsubdivision = value;
    }

    /**
     * Gets the value of the policyholdercountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOLICYHOLDERCOUNTRY() {
        return policyholdercountry;
    }

    /**
     * Sets the value of the policyholdercountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOLICYHOLDERCOUNTRY(JAXBElement<String> value) {
        this.policyholdercountry = value;
    }

    /**
     * Gets the value of the ufil1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIL1() {
        return ufil1;
    }

    /**
     * Sets the value of the ufil1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIL1(JAXBElement<String> value) {
        this.ufil1 = value;
    }

    /**
     * Gets the value of the policyholdersalphacode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOLICYHOLDERSALPHACODE() {
        return policyholdersalphacode;
    }

    /**
     * Sets the value of the policyholdersalphacode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOLICYHOLDERSALPHACODE(JAXBElement<String> value) {
        this.policyholdersalphacode = value;
    }

    /**
     * Gets the value of the ufil2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIL2() {
        return ufil2;
    }

    /**
     * Sets the value of the ufil2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIL2(JAXBElement<String> value) {
        this.ufil2 = value;
    }

    /**
     * Gets the value of the bankaccountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBANKACCOUNTNUMBER() {
        return bankaccountnumber;
    }

    /**
     * Sets the value of the bankaccountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBANKACCOUNTNUMBER(JAXBElement<String> value) {
        this.bankaccountnumber = value;
    }

    /**
     * Gets the value of the bankroutingnumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBANKROUTINGNUMBER() {
        return bankroutingnumber;
    }

    /**
     * Sets the value of the bankroutingnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBANKROUTINGNUMBER(JAXBElement<String> value) {
        this.bankroutingnumber = value;
    }

    /**
     * Gets the value of the multinationalprefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMULTINATIONALPREFIX() {
        return multinationalprefix;
    }

    /**
     * Sets the value of the multinationalprefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMULTINATIONALPREFIX(JAXBElement<String> value) {
        this.multinationalprefix = value;
    }

    /**
     * Gets the value of the multinationalcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMULTINATIONALCODE() {
        return multinationalcode;
    }

    /**
     * Sets the value of the multinationalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMULTINATIONALCODE(JAXBElement<String> value) {
        this.multinationalcode = value;
    }

    /**
     * Gets the value of the ufil3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIL3() {
        return ufil3;
    }

    /**
     * Sets the value of the ufil3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIL3(JAXBElement<String> value) {
        this.ufil3 = value;
    }

    /**
     * Gets the value of the taxcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTAXCODE() {
        return taxcode;
    }

    /**
     * Sets the value of the taxcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTAXCODE(JAXBElement<String> value) {
        this.taxcode = value;
    }

    /**
     * Gets the value of the ufil4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIL4() {
        return ufil4;
    }

    /**
     * Sets the value of the ufil4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIL4(JAXBElement<String> value) {
        this.ufil4 = value;
    }

    /**
     * Gets the value of the titlecode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTITLECODE() {
        return titlecode;
    }

    /**
     * Sets the value of the titlecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTITLECODE(JAXBElement<String> value) {
        this.titlecode = value;
    }

    /**
     * Gets the value of the ufil5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIL5() {
        return ufil5;
    }

    /**
     * Sets the value of the ufil5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIL5(JAXBElement<String> value) {
        this.ufil5 = value;
    }

    /**
     * Gets the value of the lettersequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLETTERSEQUENCE() {
        return lettersequence;
    }

    /**
     * Sets the value of the lettersequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLETTERSEQUENCE(JAXBElement<String> value) {
        this.lettersequence = value;
    }

    /**
     * Gets the value of the blockingindicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBLOCKINGINDICATOR() {
        return blockingindicator;
    }

    /**
     * Sets the value of the blockingindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBLOCKINGINDICATOR(JAXBElement<String> value) {
        this.blockingindicator = value;
    }

    /**
     * Gets the value of the transactioneventtag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRANSACTIONEVENTTAG() {
        return transactioneventtag;
    }

    /**
     * Sets the value of the transactioneventtag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRANSACTIONEVENTTAG(JAXBElement<BigDecimal> value) {
        this.transactioneventtag = value;
    }

    /**
     * Gets the value of the dunbradstreetrating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNBRADSTREETRATING() {
        return dunbradstreetrating;
    }

    /**
     * Sets the value of the dunbradstreetrating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNBRADSTREETRATING(JAXBElement<String> value) {
        this.dunbradstreetrating = value;
    }

    /**
     * Gets the value of the dunbradstreetnumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNBRADSTREETNUMBER() {
        return dunbradstreetnumber;
    }

    /**
     * Sets the value of the dunbradstreetnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNBRADSTREETNUMBER(JAXBElement<String> value) {
        this.dunbradstreetnumber = value;
    }

    /**
     * Gets the value of the endofrecordmarker property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getENDOFRECORDMARKER() {
        return endofrecordmarker;
    }

    /**
     * Sets the value of the endofrecordmarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setENDOFRECORDMARKER(JAXBElement<String> value) {
        this.endofrecordmarker = value;
    }

}
