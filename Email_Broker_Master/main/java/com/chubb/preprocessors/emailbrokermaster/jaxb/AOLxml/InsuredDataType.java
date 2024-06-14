package com.chubb.preprocessors.emailbrokermaster.jaxb.AOLxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuredDataType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="InsuredDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="M_INS_REF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MN_PREFIX_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CT_COMPANY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CT_TITLE_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="CT_FORENAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CT_SURNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FLOORBUILDING" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CT_ADDR1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CT_ADDR2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CT_CITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CT_COUNTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CT_POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CT_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CT_TEL_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CT_TEL_NUMBER_OTHER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CT_FAX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CT_EMAIL_ADDR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuredDataType", propOrder = {
        "minsref",
        "mnprefixid",
        "ctcompany",
        "cttitleid",
        "ctforename",
        "ctsurname",
        "floorbuilding",
        "ctaddr1",
        "ctaddr2",
        "ctcity",
        "ctcounty",
        "ctpostcode",
        "ctcountry",
        "cttelnumber",
        "cttelnumberother",
        "ctfaxnumber",
        "ctemailaddr"
})
public class InsuredDataType {

    @XmlElement(name = "M_INS_REF", required = true)
    protected String minsref;
    @XmlElement(name = "MN_PREFIX_ID", required = true)
    protected String mnprefixid;
    @XmlElement(name = "CT_COMPANY", required = true)
    protected String ctcompany;
    @XmlElement(name = "CT_TITLE_ID")
    protected byte cttitleid;
    @XmlElement(name = "CT_FORENAME", required = true, nillable = true)
    protected String ctforename;
    @XmlElement(name = "CT_SURNAME", required = true)
    protected String ctsurname;
    @XmlElement(name = "FLOORBUILDING", required = true)
    protected String floorbuilding;
    @XmlElement(name = "CT_ADDR1", required = true)
    protected String ctaddr1;
    @XmlElement(name = "CT_ADDR2", required = true)
    protected String ctaddr2;
    @XmlElement(name = "CT_CITY", required = true)
    protected String ctcity;
    @XmlElement(name = "CT_COUNTY", required = true)
    protected String ctcounty;
    @XmlElement(name = "CT_POSTCODE", required = true)
    protected String ctpostcode;
    @XmlElement(name = "CT_COUNTRY")
    protected int ctcountry;
    @XmlElement(name = "CT_TEL_NUMBER", required = true)
    protected String cttelnumber;
    @XmlElement(name = "CT_TEL_NUMBER_OTHER", required = true)
    protected String cttelnumberother;
    @XmlElement(name = "CT_FAX_NUMBER", required = true)
    protected String ctfaxnumber;
    @XmlElement(name = "CT_EMAIL_ADDR", required = true, nillable = true)
    protected String ctemailaddr;

    /**
     * Gets the value of the minsref property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMINSREF() {
        return minsref;
    }

    /**
     * Sets the value of the minsref property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMINSREF(String value) {
        this.minsref = value;
    }

    /**
     * Gets the value of the mnprefixid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMNPREFIXID() {
        return mnprefixid;
    }

    /**
     * Sets the value of the mnprefixid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMNPREFIXID(String value) {
        this.mnprefixid = value;
    }

    /**
     * Gets the value of the ctcompany property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCTCOMPANY() {
        return ctcompany;
    }

    /**
     * Sets the value of the ctcompany property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCTCOMPANY(String value) {
        this.ctcompany = value;
    }

    /**
     * Gets the value of the cttitleid property.
     */
    public byte getCTTITLEID() {
        return cttitleid;
    }

    /**
     * Sets the value of the cttitleid property.
     */
    public void setCTTITLEID(byte value) {
        this.cttitleid = value;
    }

    /**
     * Gets the value of the ctforename property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCTFORENAME() {
        return ctforename;
    }

    /**
     * Sets the value of the ctforename property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCTFORENAME(String value) {
        this.ctforename = value;
    }

    /**
     * Gets the value of the ctsurname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCTSURNAME() {
        return ctsurname;
    }

    /**
     * Sets the value of the ctsurname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCTSURNAME(String value) {
        this.ctsurname = value;
    }

    /**
     * Gets the value of the floorbuilding property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFLOORBUILDING() {
        return floorbuilding;
    }

    /**
     * Sets the value of the floorbuilding property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFLOORBUILDING(String value) {
        this.floorbuilding = value;
    }

    /**
     * Gets the value of the ctaddr1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCTADDR1() {
        return ctaddr1;
    }

    /**
     * Sets the value of the ctaddr1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCTADDR1(String value) {
        this.ctaddr1 = value;
    }

    /**
     * Gets the value of the ctaddr2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCTADDR2() {
        return ctaddr2;
    }

    /**
     * Sets the value of the ctaddr2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCTADDR2(String value) {
        this.ctaddr2 = value;
    }

    /**
     * Gets the value of the ctcity property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCTCITY() {
        return ctcity;
    }

    /**
     * Sets the value of the ctcity property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCTCITY(String value) {
        this.ctcity = value;
    }

    /**
     * Gets the value of the ctcounty property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCTCOUNTY() {
        return ctcounty;
    }

    /**
     * Sets the value of the ctcounty property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCTCOUNTY(String value) {
        this.ctcounty = value;
    }

    /**
     * Gets the value of the ctpostcode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCTPOSTCODE() {
        return ctpostcode;
    }

    /**
     * Sets the value of the ctpostcode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCTPOSTCODE(String value) {
        this.ctpostcode = value;
    }

    /**
     * Gets the value of the ctcountry property.
     */
    public int getCTCOUNTRY() {
        return ctcountry;
    }

    /**
     * Sets the value of the ctcountry property.
     */
    public void setCTCOUNTRY(int value) {
        this.ctcountry = value;
    }

    /**
     * Gets the value of the cttelnumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCTTELNUMBER() {
        return cttelnumber;
    }

    /**
     * Sets the value of the cttelnumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCTTELNUMBER(String value) {
        this.cttelnumber = value;
    }

    /**
     * Gets the value of the cttelnumberother property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCTTELNUMBEROTHER() {
        return cttelnumberother;
    }

    /**
     * Sets the value of the cttelnumberother property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCTTELNUMBEROTHER(String value) {
        this.cttelnumberother = value;
    }

    /**
     * Gets the value of the ctfaxnumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCTFAXNUMBER() {
        return ctfaxnumber;
    }

    /**
     * Sets the value of the ctfaxnumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCTFAXNUMBER(String value) {
        this.ctfaxnumber = value;
    }

    /**
     * Gets the value of the ctemailaddr property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCTEMAILADDR() {
        return ctemailaddr;
    }

    /**
     * Sets the value of the ctemailaddr property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCTEMAILADDR(String value) {
        this.ctemailaddr = value;
    }

}
