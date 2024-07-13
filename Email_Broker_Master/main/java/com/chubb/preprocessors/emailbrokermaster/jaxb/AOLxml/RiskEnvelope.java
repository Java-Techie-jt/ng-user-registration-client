package com.chubb.preprocessors.emailbrokermaster.jaxb.AOLxml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACEOnlineVersion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RiskIndex">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POL_NUMBER" type="{}String64"/>
 *                   &lt;element name="ENT_CODE" type="{}String8"/>
 *                   &lt;element name="BPU_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InsuredData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="M_INS_REF" type="{}String16"/>
 *                   &lt;element name="MN_PREFIX_ID" type="{}String12"/>
 *                   &lt;element name="CT_COMPANY" type="{}String255"/>
 *                   &lt;element name="CT_TITLE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="CT_FORENAME" type="{}String64"/>
 *                   &lt;element name="CT_SURNAME" type="{}String255"/>
 *                   &lt;element name="FLOORBUILDING" type="{}String39"/>
 *                   &lt;element name="CT_ADDR1" type="{}String64"/>
 *                   &lt;element name="CT_ADDR2" type="{}String64"/>
 *                   &lt;element name="CT_CITY" type="{}String30"/>
 *                   &lt;element name="CT_COUNTY" type="{}String50"/>
 *                   &lt;element name="CT_POSTCODE" type="{}String15"/>
 *                   &lt;element name="CT_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="CT_TEL_NUMBER" type="{}String20"/>
 *                   &lt;element name="CT_TEL_NUMBER_OTHER" type="{}String20"/>
 *                   &lt;element name="CT_FAX_NUMBER" type="{}String20"/>
 *                   &lt;element name="CT_EMAIL_ADDR" type="{}String255"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubmissionData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BILLING_METHOD" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="BROKER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="BROKER_REFERENCE" type="{}String9"/>
 *                   &lt;element name="BUSINESS_DESC" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="COMMISSION_PCT_EL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="COMMISSION_PCT_OTHER" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="COUNTRY_OF_RISK_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="COVERAGE" type="{}String25"/>
 *                   &lt;element name="DEPT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="EXCL_FLAG_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="FIELD_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="FOS_FLAG_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="HISTORICAL_REF" type="{}String255"/>
 *                   &lt;element name="IS_SENSITIVE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="LEADER" type="{}String10"/>
 *                   &lt;element name="NTU_DECLINE_REASON" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="ORIG_INCEPT_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="PERIOD_FROM_DT" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="PERIOD_TO_DT" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="POL_MASTER_POL" type="{}String64"/>
 *                   &lt;element name="POL_QUOTE_NUMBER" type="{}String64"/>
 *                   &lt;element name="POL_SITE" type="{}String255"/>
 *                   &lt;element name="PRIMARY_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="PRODUCT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="PROG_TYPE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="PTYP_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="QUOTED_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="RISK_REFERENCE_NO" type="{}String16"/>
 *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="SIC_CODE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="SIGNED_LINE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="SIGNED_ORDER" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="STATE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="TOTAL_EXPOSURE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="TOTAL_LINE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="WRITTEN_LINE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AttachmentIndex" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DOC_PRODUCER" type="{}String25"/>
 *                   &lt;element name="FTYP_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="DOC_TYP_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="DOC_DESCRIPTION" type="{}String255"/>
 *                   &lt;element name="SCAN_INFO" type="{}String255"/>
 *                   &lt;element name="AIN" type="{}String255"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "aceOnlineVersion",
        "riskIndex",
        "insuredData",
        "submissionData",
        "attachmentIndex"
})
@XmlRootElement(name = "RiskEnvelope")
public class RiskEnvelope {

    @XmlElement(name = "ACEOnlineVersion", required = true)
    protected BigDecimal aceOnlineVersion;
    @XmlElement(name = "RiskIndex", required = true)
    protected RiskEnvelope.RiskIndex riskIndex;
    @XmlElement(name = "InsuredData", required = true)
    protected RiskEnvelope.InsuredData insuredData;
    @XmlElement(name = "SubmissionData", required = true)
    protected RiskEnvelope.SubmissionData submissionData;
    @XmlElement(name = "AttachmentIndex")
    protected List<RiskEnvelope.AttachmentIndex> attachmentIndex;

    /**
     * Gets the value of the aceOnlineVersion property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getACEOnlineVersion() {
        return aceOnlineVersion;
    }

    /**
     * Sets the value of the aceOnlineVersion property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setACEOnlineVersion(BigDecimal value) {
        this.aceOnlineVersion = value;
    }

    /**
     * Gets the value of the riskIndex property.
     *
     * @return possible object is
     * {@link RiskEnvelope.RiskIndex }
     */
    public RiskEnvelope.RiskIndex getRiskIndex() {
        return riskIndex;
    }

    /**
     * Sets the value of the riskIndex property.
     *
     * @param value allowed object is
     *              {@link RiskEnvelope.RiskIndex }
     */
    public void setRiskIndex(RiskEnvelope.RiskIndex value) {
        this.riskIndex = value;
    }

    /**
     * Gets the value of the insuredData property.
     *
     * @return possible object is
     * {@link RiskEnvelope.InsuredData }
     */
    public RiskEnvelope.InsuredData getInsuredData() {
        return insuredData;
    }

    /**
     * Sets the value of the insuredData property.
     *
     * @param value allowed object is
     *              {@link RiskEnvelope.InsuredData }
     */
    public void setInsuredData(RiskEnvelope.InsuredData value) {
        this.insuredData = value;
    }

    /**
     * Gets the value of the submissionData property.
     *
     * @return possible object is
     * {@link RiskEnvelope.SubmissionData }
     */
    public RiskEnvelope.SubmissionData getSubmissionData() {
        return submissionData;
    }

    /**
     * Sets the value of the submissionData property.
     *
     * @param value allowed object is
     *              {@link RiskEnvelope.SubmissionData }
     */
    public void setSubmissionData(RiskEnvelope.SubmissionData value) {
        this.submissionData = value;
    }

    /**
     * Gets the value of the attachmentIndex property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentIndex property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentIndex().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskEnvelope.AttachmentIndex }
     */
    public List<RiskEnvelope.AttachmentIndex> getAttachmentIndex() {
        if (attachmentIndex == null) {
            attachmentIndex = new ArrayList<RiskEnvelope.AttachmentIndex>();
        }
        return this.attachmentIndex;
    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DOC_PRODUCER" type="{}String25"/>
     *         &lt;element name="FTYP_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="DOC_TYP_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="DOC_DESCRIPTION" type="{}String255"/>
     *         &lt;element name="SCAN_INFO" type="{}String255"/>
     *         &lt;element name="AIN" type="{}String255"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "docproducer",
            "ftypcode",
            "doctypcode",
            "docdescription",
            "scaninfo",
            "ain"
    })
    public static class AttachmentIndex {

        @XmlElement(name = "DOC_PRODUCER", required = true)
        protected String docproducer;
        @XmlElement(name = "FTYP_CODE", required = true, nillable = true)
        protected BigInteger ftypcode;
        @XmlElement(name = "DOC_TYP_CODE", required = true, nillable = true)
        protected BigInteger doctypcode;
        @XmlElement(name = "DOC_DESCRIPTION", required = true)
        protected String docdescription;
        @XmlElement(name = "SCAN_INFO", required = true)
        protected String scaninfo;
        @XmlElement(name = "AIN", required = true)
        protected String ain;

        /**
         * Gets the value of the docproducer property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getDOCPRODUCER() {
            return docproducer;
        }

        /**
         * Sets the value of the docproducer property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDOCPRODUCER(String value) {
            this.docproducer = value;
        }

        /**
         * Gets the value of the ftypcode property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getFTYPCODE() {
            return ftypcode;
        }

        /**
         * Sets the value of the ftypcode property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setFTYPCODE(BigInteger value) {
            this.ftypcode = value;
        }

        /**
         * Gets the value of the doctypcode property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getDOCTYPCODE() {
            return doctypcode;
        }

        /**
         * Sets the value of the doctypcode property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setDOCTYPCODE(BigInteger value) {
            this.doctypcode = value;
        }

        /**
         * Gets the value of the docdescription property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getDOCDESCRIPTION() {
            return docdescription;
        }

        /**
         * Sets the value of the docdescription property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDOCDESCRIPTION(String value) {
            this.docdescription = value;
        }

        /**
         * Gets the value of the scaninfo property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getSCANINFO() {
            return scaninfo;
        }

        /**
         * Sets the value of the scaninfo property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSCANINFO(String value) {
            this.scaninfo = value;
        }

        /**
         * Gets the value of the ain property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getAIN() {
            return ain;
        }

        /**
         * Sets the value of the ain property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAIN(String value) {
            this.ain = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="M_INS_REF" type="{}String16"/>
     *         &lt;element name="MN_PREFIX_ID" type="{}String12"/>
     *         &lt;element name="CT_COMPANY" type="{}String255"/>
     *         &lt;element name="CT_TITLE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="CT_FORENAME" type="{}String64"/>
     *         &lt;element name="CT_SURNAME" type="{}String255"/>
     *         &lt;element name="FLOORBUILDING" type="{}String39"/>
     *         &lt;element name="CT_ADDR1" type="{}String64"/>
     *         &lt;element name="CT_ADDR2" type="{}String64"/>
     *         &lt;element name="CT_CITY" type="{}String30"/>
     *         &lt;element name="CT_COUNTY" type="{}String50"/>
     *         &lt;element name="CT_POSTCODE" type="{}String15"/>
     *         &lt;element name="CT_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="CT_TEL_NUMBER" type="{}String20"/>
     *         &lt;element name="CT_TEL_NUMBER_OTHER" type="{}String20"/>
     *         &lt;element name="CT_FAX_NUMBER" type="{}String20"/>
     *         &lt;element name="CT_EMAIL_ADDR" type="{}String255"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
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
    public static class InsuredData {

        @XmlElement(name = "M_INS_REF", required = true)
        protected String minsref;
        @XmlElement(name = "MN_PREFIX_ID", required = true, nillable = true)
        protected String mnprefixid;
        @XmlElement(name = "CT_COMPANY", required = true, nillable = true)
        protected String ctcompany;
        @XmlElement(name = "CT_TITLE_ID", required = true, nillable = true)
        protected BigInteger cttitleid;
        @XmlElement(name = "CT_FORENAME", required = true, nillable = true)
        protected String ctforename;
        @XmlElement(name = "CT_SURNAME", required = true, nillable = true)
        protected String ctsurname;
        @XmlElement(name = "FLOORBUILDING", required = true, nillable = true)
        protected String floorbuilding;
        @XmlElement(name = "CT_ADDR1", required = true, nillable = true)
        protected String ctaddr1;
        @XmlElement(name = "CT_ADDR2", required = true, nillable = true)
        protected String ctaddr2;
        @XmlElement(name = "CT_CITY", required = true, nillable = true)
        protected String ctcity;
        @XmlElement(name = "CT_COUNTY", required = true, nillable = true)
        protected String ctcounty;
        @XmlElement(name = "CT_POSTCODE", required = true, nillable = true)
        protected String ctpostcode;
        @XmlElement(name = "CT_COUNTRY", required = true, nillable = true)
        protected BigInteger ctcountry;
        @XmlElement(name = "CT_TEL_NUMBER", required = true, nillable = true)
        protected String cttelnumber;
        @XmlElement(name = "CT_TEL_NUMBER_OTHER", required = true, nillable = true)
        protected String cttelnumberother;
        @XmlElement(name = "CT_FAX_NUMBER", required = true, nillable = true)
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
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getCTTITLEID() {
            return cttitleid;
        }

        /**
         * Sets the value of the cttitleid property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setCTTITLEID(BigInteger value) {
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
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getCTCOUNTRY() {
            return ctcountry;
        }

        /**
         * Sets the value of the ctcountry property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setCTCOUNTRY(BigInteger value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="POL_NUMBER" type="{}String64"/>
     *         &lt;element name="ENT_CODE" type="{}String8"/>
     *         &lt;element name="BPU_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "polnumber",
            "entcode",
            "bpucode"
    })
    public static class RiskIndex {

        @XmlElement(name = "POL_NUMBER", required = true, nillable = true)
        protected String polnumber;
        @XmlElement(name = "ENT_CODE", required = true)
        protected String entcode;
        @XmlElement(name = "BPU_CODE", required = true, nillable = true)
        protected BigInteger bpucode;

        /**
         * Gets the value of the polnumber property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getPOLNUMBER() {
            return polnumber;
        }

        /**
         * Sets the value of the polnumber property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPOLNUMBER(String value) {
            this.polnumber = value;
        }

        /**
         * Gets the value of the entcode property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getENTCODE() {
            return entcode;
        }

        /**
         * Sets the value of the entcode property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setENTCODE(String value) {
            this.entcode = value;
        }

        /**
         * Gets the value of the bpucode property.
         *
         * @return possible object is
         * {@link BigInteger }
         */
        public BigInteger getBPUCODE() {
            return bpucode;
        }

        /**
         * Sets the value of the bpucode property.
         *
         * @param value allowed object is
         *              {@link BigInteger }
         */
        public void setBPUCODE(BigInteger value) {
            this.bpucode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BILLING_METHOD" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="BROKER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="BROKER_REFERENCE" type="{}String9"/>
     *         &lt;element name="BUSINESS_DESC" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="COMMISSION_PCT_EL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="COMMISSION_PCT_OTHER" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="COUNTRY_OF_RISK_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="COVERAGE" type="{}String25"/>
     *         &lt;element name="DEPT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="EXCL_FLAG_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="FIELD_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="FOS_FLAG_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="HISTORICAL_REF" type="{}String255"/>
     *         &lt;element name="IS_SENSITIVE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="LEADER" type="{}String10"/>
     *         &lt;element name="NTU_DECLINE_REASON" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="ORIG_INCEPT_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="PERIOD_FROM_DT" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="PERIOD_TO_DT" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="POL_MASTER_POL" type="{}String64"/>
     *         &lt;element name="POL_QUOTE_NUMBER" type="{}String64"/>
     *         &lt;element name="POL_SITE" type="{}String255"/>
     *         &lt;element name="PRIMARY_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="PRODUCT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="PROG_TYPE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="PTYP_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="QUOTED_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="RISK_REFERENCE_NO" type="{}String16"/>
     *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="SIC_CODE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="SIGNED_LINE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="SIGNED_ORDER" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="STATE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="TOTAL_EXPOSURE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="TOTAL_LINE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="WRITTEN_LINE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "content"
    })
    public static class SubmissionData {

        @XmlElementRefs({
                @XmlElementRef(name = "COVERAGE", type = JAXBElement.class),
                @XmlElementRef(name = "SIGNED_LINE", type = JAXBElement.class),
                @XmlElementRef(name = "IS_SENSITIVE", type = JAXBElement.class),
                @XmlElementRef(name = "BRANCH_CODE", type = JAXBElement.class),
                @XmlElementRef(name = "BROKER_REFERENCE", type = JAXBElement.class),
                @XmlElementRef(name = "ORIG_INCEPT_DATE", type = JAXBElement.class),
                @XmlElementRef(name = "HISTORICAL_REF", type = JAXBElement.class),
                @XmlElementRef(name = "POL_MASTER_POL", type = JAXBElement.class),
                @XmlElementRef(name = "COUNTRY_OF_RISK_ID", type = JAXBElement.class),
                @XmlElementRef(name = "FIELD_OFFICE_ID", type = JAXBElement.class),
                @XmlElementRef(name = "WRITTEN_LINE", type = JAXBElement.class),
                @XmlElementRef(name = "PERIOD_TO_DT", type = JAXBElement.class),
                @XmlElementRef(name = "QUOTED_DATE", type = JAXBElement.class),
                @XmlElementRef(name = "PRODUCT_ID", type = JAXBElement.class),
                @XmlElementRef(name = "RISK_REFERENCE_NO", type = JAXBElement.class),
                @XmlElementRef(name = "BROKER_ID", type = JAXBElement.class),
                @XmlElementRef(name = "POL_SITE", type = JAXBElement.class),
                @XmlElementRef(name = "POL_QUOTE_NUMBER", type = JAXBElement.class),
                @XmlElementRef(name = "PRIMARY_LIMIT", type = JAXBElement.class),
                @XmlElementRef(name = "SEGMENT_ID", type = JAXBElement.class),
                @XmlElementRef(name = "EXCL_FLAG_ID", type = JAXBElement.class),
                @XmlElementRef(name = "PTYP_ID", type = JAXBElement.class),
                @XmlElementRef(name = "DEPT_ID", type = JAXBElement.class),
                @XmlElementRef(name = "PROG_TYPE_ID", type = JAXBElement.class),
                @XmlElementRef(name = "SIGNED_ORDER", type = JAXBElement.class),
                @XmlElementRef(name = "NTU_DECLINE_REASON", type = JAXBElement.class),
                @XmlElementRef(name = "LEADER", type = JAXBElement.class),
                @XmlElementRef(name = "STATE_ID", type = JAXBElement.class),
                @XmlElementRef(name = "BUSINESS_DESC", type = JAXBElement.class),
                @XmlElementRef(name = "TOTAL_LINE", type = JAXBElement.class),
                @XmlElementRef(name = "FOS_FLAG_ID", type = JAXBElement.class),
                @XmlElementRef(name = "SIC_CODE_ID", type = JAXBElement.class),
                @XmlElementRef(name = "COMMISSION_PCT_OTHER", type = JAXBElement.class),
                @XmlElementRef(name = "TOTAL_EXPOSURE", type = JAXBElement.class),
                @XmlElementRef(name = "BILLING_METHOD", type = JAXBElement.class),
                @XmlElementRef(name = "PERIOD_FROM_DT", type = JAXBElement.class),
                @XmlElementRef(name = "COMMISSION_PCT_EL", type = JAXBElement.class)
        })
        @XmlMixed
        protected List<Serializable> content;

        /**
         * Gets the value of the content property.
         * <p>
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * <p>
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * <p>
         * <p>
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         * {@link String }
         * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
         * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

    }

}
