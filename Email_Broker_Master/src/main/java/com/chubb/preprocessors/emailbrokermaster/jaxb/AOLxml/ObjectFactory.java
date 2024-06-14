package com.chubb.preprocessors.emailbrokermaster.jaxb.AOLxml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.chubb.preprocessors.emailbrokermaster.jaxb.AOLxml package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private static final  QName _RiskEnvelopeSubmissionDataPERIODFROMDT_QNAME = new QName("", "PERIOD_FROM_DT");
    private static final  QName _RiskEnvelopeSubmissionDataISSENSITIVE_QNAME = new QName("", "IS_SENSITIVE");
    private static final  QName _RiskEnvelopeSubmissionDataCOMMISSIONPCTEL_QNAME = new QName("", "COMMISSION_PCT_EL");
    private static final  QName _RiskEnvelopeSubmissionDataCOVERAGE_QNAME = new QName("", "COVERAGE");
    private static final  QName _RiskEnvelopeSubmissionDataORIGINCEPTDATE_QNAME = new QName("", "ORIG_INCEPT_DATE");
    private static final  QName _RiskEnvelopeSubmissionDataFIELDOFFICEID_QNAME = new QName("", "FIELD_OFFICE_ID");
    private static final  QName _RiskEnvelopeSubmissionDataBROKERREFERENCE_QNAME = new QName("", "BROKER_REFERENCE");
    private static final  QName _RiskEnvelopeSubmissionDataPOLQUOTENUMBER_QNAME = new QName("", "POL_QUOTE_NUMBER");
    private static final  QName _RiskEnvelopeSubmissionDataHISTORICALREF_QNAME = new QName("", "HISTORICAL_REF");
    private static final  QName _RiskEnvelopeSubmissionDataNTUDECLINEREASON_QNAME = new QName("", "NTU_DECLINE_REASON");
    private static final  QName _RiskEnvelopeSubmissionDataSTATEID_QNAME = new QName("", "STATE_ID");
    private static final  QName _RiskEnvelopeSubmissionDataLEADER_QNAME = new QName("", "LEADER");
    private static final  QName _RiskEnvelopeSubmissionDataWRITTENLINE_QNAME = new QName("", "WRITTEN_LINE");
    private static final  QName _RiskEnvelopeSubmissionDataSIGNEDLINE_QNAME = new QName("", "SIGNED_LINE");
    private static final  QName _RiskEnvelopeSubmissionDataQUOTEDDATE_QNAME = new QName("", "QUOTED_DATE");
    private static final  QName _RiskEnvelopeSubmissionDataEXCLFLAGID_QNAME = new QName("", "EXCL_FLAG_ID");
    private static final  QName _RiskEnvelopeSubmissionDataBRANCHCODE_QNAME = new QName("", "BRANCH_CODE");
    private static final  QName _RiskEnvelopeSubmissionDataTOTALEXPOSURE_QNAME = new QName("", "TOTAL_EXPOSURE");
    private static final  QName _RiskEnvelopeSubmissionDataDEPTID_QNAME = new QName("", "DEPT_ID");
    private static final  QName _RiskEnvelopeSubmissionDataPERIODTODT_QNAME = new QName("", "PERIOD_TO_DT");
    private static final  QName _RiskEnvelopeSubmissionDataPRIMARYLIMIT_QNAME = new QName("", "PRIMARY_LIMIT");
    private static final  QName _RiskEnvelopeSubmissionDataSEGMENTID_QNAME = new QName("", "SEGMENT_ID");
    private static final  QName _RiskEnvelopeSubmissionDataSICCODEID_QNAME = new QName("", "SIC_CODE_ID");
    private static final  QName _RiskEnvelopeSubmissionDataPOLSITE_QNAME = new QName("", "POL_SITE");
    private static final  QName _RiskEnvelopeSubmissionDataPOLMASTERPOL_QNAME = new QName("", "POL_MASTER_POL");
    private static final  QName _RiskEnvelopeSubmissionDataPTYPID_QNAME = new QName("", "PTYP_ID");
    private static final  QName _RiskEnvelopeSubmissionDataPRODUCTID_QNAME = new QName("", "PRODUCT_ID");
    private static final  QName _RiskEnvelopeSubmissionDataRISKREFERENCENO_QNAME = new QName("", "RISK_REFERENCE_NO");
    private static final  QName _RiskEnvelopeSubmissionDataBILLINGMETHOD_QNAME = new QName("", "BILLING_METHOD");
    private static final  QName _RiskEnvelopeSubmissionDataTOTALLINE_QNAME = new QName("", "TOTAL_LINE");
    private static final  QName _RiskEnvelopeSubmissionDataFOSFLAGID_QNAME = new QName("", "FOS_FLAG_ID");
    private static final  QName _RiskEnvelopeSubmissionDataBUSINESSDESC_QNAME = new QName("", "BUSINESS_DESC");
    private static final  QName _RiskEnvelopeSubmissionDataPROGTYPEID_QNAME = new QName("", "PROG_TYPE_ID");
    private static final  QName _RiskEnvelopeSubmissionDataSIGNEDORDER_QNAME = new QName("", "SIGNED_ORDER");
    private static final  QName _RiskEnvelopeSubmissionDataCOMMISSIONPCTOTHER_QNAME = new QName("", "COMMISSION_PCT_OTHER");
    private static final  QName _RiskEnvelopeSubmissionDataCOUNTRYOFRISKID_QNAME = new QName("", "COUNTRY_OF_RISK_ID");
    private static final  QName _RiskEnvelopeSubmissionDataBROKERID_QNAME = new QName("", "BROKER_ID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chubb.preprocessors.emailbrokermaster.jaxb.AOLxml
     */
    public ObjectFactory() {
    	//Nothing
    }

    /**
     * Create an instance of {@link RiskEnvelope }
     */
    public RiskEnvelope createRiskEnvelope() {
        return new RiskEnvelope();
    }

    /**
     * Create an instance of {@link RiskEnvelope.RiskIndex }
     */
    public RiskEnvelope.RiskIndex createRiskEnvelopeRiskIndex() {
        return new RiskEnvelope.RiskIndex();
    }

    /**
     * Create an instance of {@link RiskEnvelope.InsuredData }
     */
    public RiskEnvelope.InsuredData createRiskEnvelopeInsuredData() {
        return new RiskEnvelope.InsuredData();
    }

    /**
     * Create an instance of {@link RiskEnvelope.SubmissionData }
     */
    public RiskEnvelope.SubmissionData createRiskEnvelopeSubmissionData() {
        return new RiskEnvelope.SubmissionData();
    }

    /**
     * Create an instance of {@link RiskEnvelope.AttachmentIndex }
     */
    public RiskEnvelope.AttachmentIndex createRiskEnvelopeAttachmentIndex() {
        return new RiskEnvelope.AttachmentIndex();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "PERIOD_FROM_DT", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<XMLGregorianCalendar> createRiskEnvelopeSubmissionDataPERIODFROMDT(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RiskEnvelopeSubmissionDataPERIODFROMDT_QNAME, XMLGregorianCalendar.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "IS_SENSITIVE", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataISSENSITIVE(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataISSENSITIVE_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "COMMISSION_PCT_EL", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigDecimal> createRiskEnvelopeSubmissionDataCOMMISSIONPCTEL(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RiskEnvelopeSubmissionDataCOMMISSIONPCTEL_QNAME, BigDecimal.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "COVERAGE", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<String> createRiskEnvelopeSubmissionDataCOVERAGE(String value) {
        return new JAXBElement<String>(_RiskEnvelopeSubmissionDataCOVERAGE_QNAME, String.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "ORIG_INCEPT_DATE", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<XMLGregorianCalendar> createRiskEnvelopeSubmissionDataORIGINCEPTDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RiskEnvelopeSubmissionDataORIGINCEPTDATE_QNAME, XMLGregorianCalendar.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "FIELD_OFFICE_ID", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataFIELDOFFICEID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataFIELDOFFICEID_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "BROKER_REFERENCE", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<String> createRiskEnvelopeSubmissionDataBROKERREFERENCE(String value) {
        return new JAXBElement<String>(_RiskEnvelopeSubmissionDataBROKERREFERENCE_QNAME, String.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "POL_QUOTE_NUMBER", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<String> createRiskEnvelopeSubmissionDataPOLQUOTENUMBER(String value) {
        return new JAXBElement<String>(_RiskEnvelopeSubmissionDataPOLQUOTENUMBER_QNAME, String.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "HISTORICAL_REF", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<String> createRiskEnvelopeSubmissionDataHISTORICALREF(String value) {
        return new JAXBElement<String>(_RiskEnvelopeSubmissionDataHISTORICALREF_QNAME, String.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "NTU_DECLINE_REASON", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataNTUDECLINEREASON(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataNTUDECLINEREASON_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "STATE_ID", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataSTATEID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataSTATEID_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "LEADER", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<String> createRiskEnvelopeSubmissionDataLEADER(String value) {
        return new JAXBElement<String>(_RiskEnvelopeSubmissionDataLEADER_QNAME, String.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "WRITTEN_LINE", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigDecimal> createRiskEnvelopeSubmissionDataWRITTENLINE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RiskEnvelopeSubmissionDataWRITTENLINE_QNAME, BigDecimal.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "SIGNED_LINE", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigDecimal> createRiskEnvelopeSubmissionDataSIGNEDLINE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RiskEnvelopeSubmissionDataSIGNEDLINE_QNAME, BigDecimal.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "QUOTED_DATE", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<XMLGregorianCalendar> createRiskEnvelopeSubmissionDataQUOTEDDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RiskEnvelopeSubmissionDataQUOTEDDATE_QNAME, XMLGregorianCalendar.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "EXCL_FLAG_ID", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataEXCLFLAGID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataEXCLFLAGID_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "BRANCH_CODE", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataBRANCHCODE(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataBRANCHCODE_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "TOTAL_EXPOSURE", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigDecimal> createRiskEnvelopeSubmissionDataTOTALEXPOSURE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RiskEnvelopeSubmissionDataTOTALEXPOSURE_QNAME, BigDecimal.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "DEPT_ID", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataDEPTID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataDEPTID_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "PERIOD_TO_DT", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<XMLGregorianCalendar> createRiskEnvelopeSubmissionDataPERIODTODT(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RiskEnvelopeSubmissionDataPERIODTODT_QNAME, XMLGregorianCalendar.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "PRIMARY_LIMIT", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigDecimal> createRiskEnvelopeSubmissionDataPRIMARYLIMIT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RiskEnvelopeSubmissionDataPRIMARYLIMIT_QNAME, BigDecimal.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "SEGMENT_ID", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataSEGMENTID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataSEGMENTID_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "SIC_CODE_ID", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataSICCODEID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataSICCODEID_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "POL_SITE", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<String> createRiskEnvelopeSubmissionDataPOLSITE(String value) {
        return new JAXBElement<String>(_RiskEnvelopeSubmissionDataPOLSITE_QNAME, String.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "POL_MASTER_POL", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<String> createRiskEnvelopeSubmissionDataPOLMASTERPOL(String value) {
        return new JAXBElement<String>(_RiskEnvelopeSubmissionDataPOLMASTERPOL_QNAME, String.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "PTYP_ID", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataPTYPID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataPTYPID_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "PRODUCT_ID", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataPRODUCTID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataPRODUCTID_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "RISK_REFERENCE_NO", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<String> createRiskEnvelopeSubmissionDataRISKREFERENCENO(String value) {
        return new JAXBElement<String>(_RiskEnvelopeSubmissionDataRISKREFERENCENO_QNAME, String.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "BILLING_METHOD", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataBILLINGMETHOD(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataBILLINGMETHOD_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "TOTAL_LINE", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigDecimal> createRiskEnvelopeSubmissionDataTOTALLINE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RiskEnvelopeSubmissionDataTOTALLINE_QNAME, BigDecimal.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "FOS_FLAG_ID", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataFOSFLAGID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataFOSFLAGID_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "BUSINESS_DESC", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataBUSINESSDESC(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataBUSINESSDESC_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "PROG_TYPE_ID", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataPROGTYPEID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataPROGTYPEID_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "SIGNED_ORDER", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigDecimal> createRiskEnvelopeSubmissionDataSIGNEDORDER(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RiskEnvelopeSubmissionDataSIGNEDORDER_QNAME, BigDecimal.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "COMMISSION_PCT_OTHER", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigDecimal> createRiskEnvelopeSubmissionDataCOMMISSIONPCTOTHER(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RiskEnvelopeSubmissionDataCOMMISSIONPCTOTHER_QNAME, BigDecimal.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "COUNTRY_OF_RISK_ID", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataCOUNTRYOFRISKID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataCOUNTRYOFRISKID_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "BROKER_ID", scope = RiskEnvelope.SubmissionData.class)
    public JAXBElement<BigInteger> createRiskEnvelopeSubmissionDataBROKERID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RiskEnvelopeSubmissionDataBROKERID_QNAME, BigInteger.class, RiskEnvelope.SubmissionData.class, value);
    }

}
