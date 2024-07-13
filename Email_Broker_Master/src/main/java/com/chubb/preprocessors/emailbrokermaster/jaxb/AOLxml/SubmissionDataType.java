package com.chubb.preprocessors.emailbrokermaster.jaxb.AOLxml;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubmissionDataType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="SubmissionDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BILLING_METHOD" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BROKER_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="BROKER_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BUSINESS_DESC" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="COMMISSION_PCT_EL" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="COMMISSION_PCT_OTHER" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="COUNTRY_OF_RISK_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="COVERAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEPT_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="EXCL_FLAG_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="FIELD_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="FOS_FLAG_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="HISTORICAL_REF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IS_SENSITIVE" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="LEADER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NTU_DECLINE_REASON" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ORIG_INCEPT_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PERIOD_FROM_DT" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PERIOD_TO_DT" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="POL_MASTER_POL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POL_QUOTE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POL_SITE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRIMARY_LIMIT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="PRODUCT_ID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="PROG_TYPE_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="PTYP_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="QUOTED_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="RISK_REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="SIC_CODE_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="SIGNED_LINE" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="SIGNED_ORDER" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="STATE_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="TOTAL_EXPOSURE" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="TOTAL_LINE" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="WRITTEN_LINE" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="EXPACESHARE" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="DISTRIBUTION_CHANNEL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmissionDataType", propOrder = {
        "billingmethod",
        "branchcode",
        "brokerid",
        "brokerreference",
        "businessdesc",
        "commissionpctel",
        "commissionpctother",
        "countryofriskid",
        "coverage",
        "deptid",
        "exclflagid",
        "fieldofficeid",
        "fosflagid",
        "historicalref",
        "issensitive",
        "leader",
        "ntudeclinereason",
        "originceptdate",
        "periodfromdt",
        "periodtodt",
        "polmasterpol",
        "polquotenumber",
        "polsite",
        "primarylimit",
        "productid",
        "progtypeid",
        "ptypid",
        "quoteddate",
        "riskreferenceno",
        "segmentid",
        "siccodeid",
        "signedline",
        "signedorder",
        "stateid",
        "totalexposure",
        "totalline",
        "writtenline",
        "expaceshare",
        "distributionchannel",
        "dunnsnumber",
        "naiccode",
        "naicextension"
        
})
public class SubmissionDataType {

    @XmlElement(name = "BILLING_METHOD")
    protected int billingmethod;
    @XmlElement(name = "BRANCH_CODE")
    protected int branchcode;
    @XmlElement(name = "BROKER_ID")
    protected int brokerid;
    @XmlElement(name = "BROKER_REFERENCE", required = true)
    protected String brokerreference;
    @XmlElement(name = "BUSINESS_DESC")
    protected int businessdesc;
    @XmlElement(name = "COMMISSION_PCT_EL")
    protected int commissionpctel;
    @XmlElement(name = "COMMISSION_PCT_OTHER")
    protected Float commissionpctother;
    @XmlElement(name = "COUNTRY_OF_RISK_ID")
    protected int countryofriskid;
    @XmlElement(name = "COVERAGE", required = true)
    protected String coverage;
    @XmlElement(name = "DEPT_ID")
    protected int deptid;
    @XmlElement(name = "EXCL_FLAG_ID")
    protected int exclflagid;
    @XmlElement(name = "FIELD_OFFICE_ID")
    protected int fieldofficeid;
    @XmlElement(name = "FOS_FLAG_ID")
    protected int fosflagid;
    @XmlElement(name = "HISTORICAL_REF", required = true)
    protected String historicalref;
    @XmlElement(name = "IS_SENSITIVE")
    protected int issensitive;
    @XmlElement(name = "LEADER", required = true)
    protected String leader;
    @XmlElement(name = "NTU_DECLINE_REASON")
    protected int ntudeclinereason;
    @XmlElement(name = "ORIG_INCEPT_DATE", required = true, nillable = true)
    protected String originceptdate;
    @XmlElement(name = "PERIOD_FROM_DT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodfromdt;
    @XmlElement(name = "PERIOD_TO_DT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodtodt;
    @XmlElement(name = "POL_MASTER_POL", required = true)
    protected String polmasterpol;
    @XmlElement(name = "POL_QUOTE_NUMBER", required = true)
    protected String polquotenumber;
    @XmlElement(name = "POL_SITE", required = true)
    protected String polsite;
    @XmlElement(name = "PRIMARY_LIMIT")
    protected int  primarylimit;
    @XmlElement(name = "PRODUCT_ID")
    protected int productid;
    @XmlElement(name = "PROG_TYPE_ID")
    protected int progtypeid;
    @XmlElement(name = "PTYP_ID")
    protected byte ptypid;
    @XmlElement(name = "QUOTED_DATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar quoteddate;
    @XmlElement(name = "RISK_REFERENCE_NO", required = true)
    protected String riskreferenceno;
    @XmlElement(name = "SEGMENT_ID")
    protected int segmentid;
    @XmlElement(name = "SIC_CODE_ID")
    protected int siccodeid;
    @XmlElement(name = "SIGNED_LINE")
    protected int signedline;
    @XmlElement(name = "SIGNED_ORDER")
    protected byte signedorder;
    @XmlElement(name = "STATE_ID")
    protected int stateid;
    @XmlElement(name = "TOTAL_EXPOSURE")
    protected int totalexposure;
    @XmlElement(name = "TOTAL_LINE")
    protected int totalline;
    @XmlElement(name = "WRITTEN_LINE")
    protected byte writtenline; 
    @XmlElement(name = "EXPACESHARE")
    protected Float expaceshare;
    @XmlElement(name = "DISTRIBUTION_CHANNEL")
    protected int distributionchannel;
    @XmlElement(name = "DUNNS_CODE")
    protected String dunnsnumber;
    @XmlElement(name = "NAIC_CODE")
    protected int naiccode;
    @XmlElement(name = "NAIC_EXTENSION")
    protected String naicextension;
    
    
    public int getNaiccode() {
		return naiccode;
	}

	public void setNaiccode(int naiccode) {
		this.naiccode = naiccode;
	}

	public String getNaicextension() {
		return naicextension;
	}

	public void setNaicextension(String naicextension) {
		this.naicextension = naicextension;
	}

	public String getDunnsnumber() {
		return dunnsnumber;
	}

	public void setDunnsnumber(String dunnsnumber) {
		this.dunnsnumber = dunnsnumber;
	}
    
    /**
     * Gets the value of the billingmethod property.
     */
    public int getBILLINGMETHOD() {
        return billingmethod;
    }

    /**
     * Sets the value of the billingmethod property.
     */
    public void setBILLINGMETHOD(int value) {
        this.billingmethod = value;
    }

    /**
     * Gets the value of the branchcode property.
     */
    public int getBRANCHCODE() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     */
    public void setBRANCHCODE(int value) {
        this.branchcode = value;
    }

    /**
     * Gets the value of the brokerid property.
     */
    public int getBROKERID() {
        return brokerid;
    }

    /**
     * Sets the value of the brokerid property.
     */
    public void setBROKERID(int value) {
        this.brokerid = value;
    }

    /**
     * Gets the value of the brokerreference property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBROKERREFERENCE() {
        return brokerreference;
    }

    /**
     * Sets the value of the brokerreference property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBROKERREFERENCE(String value) {
        this.brokerreference = value;
    }

    /**
     * Gets the value of the businessdesc property.
     */
    public int getBUSINESSDESC() {
        return businessdesc;
    }

    /**
     * Sets the value of the businessdesc property.
     */
    public void setBUSINESSDESC(int value) {
        this.businessdesc = value;
    }

    /**
     * Gets the value of the commissionpctel property.
     */
    public int  getCOMMISSIONPCTEL() {
        return commissionpctel;
    }

    /**
     * Sets the value of the commissionpctel property.
     */
    public void setCOMMISSIONPCTEL(int value) {
        this.commissionpctel = value;
    }

    /**
     * Gets the value of the commissionpctother property.
     */
    public Float getCOMMISSIONPCTOTHER() {
        return commissionpctother;
    }

    /**
     * Sets the value of the commissionpctother property.
     */
    public void setCOMMISSIONPCTOTHER(Float value) {
        this.commissionpctother = value;
    }

    /**
     * Gets the value of the countryofriskid property.
     */
    public int getCOUNTRYOFRISKID() {
        return countryofriskid;
    }

    /**
     * Sets the value of the countryofriskid property.
     */
    public void setCOUNTRYOFRISKID(int value) {
        this.countryofriskid = value;
    }

    /**
     * Gets the value of the coverage property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCOVERAGE() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCOVERAGE(String value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the deptid property.
     */
    public int getDEPTID() {
        return deptid;
    }

    /**
     * Sets the value of the deptid property.
     */
    public void setDEPTID(int value) {
        this.deptid = value;
    }

    /**
     * Gets the value of the exclflagid property.
     */
    public int getEXCLFLAGID() {
        return exclflagid;
    }

    /**
     * Sets the value of the exclflagid property.
     */
    public void setEXCLFLAGID(int value) {
        this.exclflagid = value;
    }

    /**
     * Gets the value of the fieldofficeid property.
     */
    public int getFIELDOFFICEID() {
        return fieldofficeid;
    }

    /**
     * Sets the value of the fieldofficeid property.
     */
    public void setFIELDOFFICEID(int value) {
        this.fieldofficeid = value;
    }

    /**
     * Gets the value of the fosflagid property.
     */
    public int getFOSFLAGID() {
        return fosflagid;
    }

    /**
     * Sets the value of the fosflagid property.
     */
    public void setFOSFLAGID(int value) {
        this.fosflagid = value;
    }

    /**
     * Gets the value of the historicalref property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHISTORICALREF() {
        return historicalref;
    }

    /**
     * Sets the value of the historicalref property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHISTORICALREF(String value) {
        this.historicalref = value;
    }

    /**
     * Gets the value of the issensitive property.
     */
    public int getISSENSITIVE() {
        return issensitive;
    }

    /**
     * Sets the value of the issensitive property.
     */
    public void setISSENSITIVE(int value) {
        this.issensitive = value;
    }

    /**
     * Gets the value of the leader property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLEADER() {
        return leader;
    }

    /**
     * Sets the value of the leader property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLEADER(String value) {
        this.leader = value;
    }

    /**
     * Gets the value of the ntudeclinereason property.
     */
    public int getNTUDECLINEREASON() {
        return ntudeclinereason;
    }

    /**
     * Sets the value of the ntudeclinereason property.
     */
    public void setNTUDECLINEREASON(int value) {
        this.ntudeclinereason = value;
    }

    /**
     * Gets the value of the originceptdate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getORIGINCEPTDATE() {
        return originceptdate;
    }

    /**
     * Sets the value of the originceptdate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setORIGINCEPTDATE(String value) {
        this.originceptdate = value;
    }

    /**
     * Gets the value of the periodfromdt property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getPERIODFROMDT() {
        return periodfromdt;
    }

    /**
     * Sets the value of the periodfromdt property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setPERIODFROMDT(XMLGregorianCalendar value) {
        this.periodfromdt = value;
    }

    /**
     * Gets the value of the periodtodt property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getPERIODTODT() {
        return periodtodt;
    }

    /**
     * Sets the value of the periodtodt property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setPERIODTODT(XMLGregorianCalendar value) {
        this.periodtodt = value;
    }

    /**
     * Gets the value of the polmasterpol property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPOLMASTERPOL() {
        return polmasterpol;
    }

    /**
     * Sets the value of the polmasterpol property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPOLMASTERPOL(String value) {
        this.polmasterpol = value;
    }

    /**
     * Gets the value of the polquotenumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPOLQUOTENUMBER() {
        return polquotenumber;
    }

    /**
     * Sets the value of the polquotenumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPOLQUOTENUMBER(String value) {
        this.polquotenumber = value;
    }

    /**
     * Gets the value of the polsite property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPOLSITE() {
        return polsite;
    }

    /**
     * Sets the value of the polsite property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPOLSITE(String value) {
        this.polsite = value;
    }

    /**
     * Gets the value of the primarylimit property.
     */
    public int getPRIMARYLIMIT() {
        return primarylimit;
    }

    /**
     * Sets the value of the primarylimit property.
     */
    public void setPRIMARYLIMIT(int value) {
        this.primarylimit = value;
    }

    /**
     * Gets the value of the productid property.
     */
    public int getPRODUCTID() {
        return productid;
    }

    /**
     * Sets the value of the productid property.
     */
    public void setPRODUCTID(int value) {
        this.productid = value;
    }

    /**
     * Gets the value of the progtypeid property.
     */
    public int getPROGTYPEID() {
        return progtypeid;
    }

    /**
     * Sets the value of the progtypeid property.
     */
    public void setPROGTYPEID(int value) {
        this.progtypeid = value;
    }

    /**
     * Gets the value of the ptypid property.
     */
    public byte getPTYPID() {
        return ptypid;
    }

    /**
     * Sets the value of the ptypid property.
     */
    public void setPTYPID(byte value) {
        this.ptypid = value;
    }

    /**
     * Gets the value of the quoteddate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getQUOTEDDATE() {
        return quoteddate;
    }

    /**
     * Sets the value of the quoteddate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setQUOTEDDATE(XMLGregorianCalendar value) {
        this.quoteddate = value;
    }

    /**
     * Gets the value of the riskreferenceno property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRISKREFERENCENO() {
        return riskreferenceno;
    }

    /**
     * Sets the value of the riskreferenceno property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRISKREFERENCENO(String value) {
        this.riskreferenceno = value;
    }

    /**
     * Gets the value of the segmentid property.
     */
    public int getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     */
    public void setSEGMENTID(int value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the siccodeid property.
     */
    public int getSICCODEID() {
        return siccodeid;
    }

    /**
     * Sets the value of the siccodeid property.
     */
    public void setSICCODEID(int value) {
        this.siccodeid = value;
    }

    /**
     * Gets the value of the signedline property.
     */
    public int getSIGNEDLINE() {
        return signedline;
    }

    /**
     * Sets the value of the signedline property.
     */
    public void setSIGNEDLINE(int value) {
        this.signedline = value;
    }

    /**
     * Gets the value of the signedorder property.
     */
    public byte getSIGNEDORDER() {
        return signedorder;
    }

    /**
     * Sets the value of the signedorder property.
     */
    public void setSIGNEDORDER(byte value) {
        this.signedorder = value;
    }

    /**
     * Gets the value of the stateid property.
     */
    public int getSTATEID() {
        return stateid;
    }

    /**
     * Sets the value of the stateid property.
     */
    public void setSTATEID(int value) {
        this.stateid = value;
    }

    /**
     * Gets the value of the totalexposure property.
     */
    public int getTOTALEXPOSURE() {
        return totalexposure;
    }

    /**
     * Sets the value of the totalexposure property.
     */
    public void setTOTALEXPOSURE(int value) {
        this.totalexposure = value;
    }

    /**
     * Gets the value of the totalline property.
     */
    public int getTOTALLINE() {
        return totalline;
    }

    /**
     * Sets the value of the totalline property.
     */
    public void setTOTALLINE(int value) {
        this.totalline = value;
    }

    /**
     * Gets the value of the writtenline property.
     */
    public byte getWRITTENLINE() {
        return writtenline;
    }

    /**
     * Sets the value of the writtenline property.
     */
    public void setWRITTENLINE(byte value) {
        this.writtenline = value;
    }
    
    public Float getExpaceshare() {
		return expaceshare;
	}

	public void setExpaceshare(Float expaceshare) {
		this.expaceshare = expaceshare;
	}

	public int getDistributionchannel() {
		return distributionchannel;
	}

	public void setDistributionchannel(int distributionchannel) {
		this.distributionchannel = distributionchannel;
	}  
	

}
