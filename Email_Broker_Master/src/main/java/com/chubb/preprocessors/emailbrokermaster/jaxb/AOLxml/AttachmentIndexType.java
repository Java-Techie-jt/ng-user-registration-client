package com.chubb.preprocessors.emailbrokermaster.jaxb.AOLxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentIndexType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="AttachmentIndexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DOC_PRODUCER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FTYP_CODE" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="DOC_TYP_CODE" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DOC_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SCAN_INFO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentIndexType", propOrder = {
        "docproducer",
        "ftypcode",
        "doctypcode",
        "docdescription",
        "scaninfo",
        "ain"
})
public class AttachmentIndexType {

    @XmlElement(name = "DOC_PRODUCER", required = true)
    protected String docproducer;
    @XmlElement(name = "FTYP_CODE")
    protected byte ftypcode;
    @XmlElement(name = "DOC_TYP_CODE")
    protected short doctypcode;
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
     */
    public byte getFTYPCODE() {
        return ftypcode;
    }

    /**
     * Sets the value of the ftypcode property.
     */
    public void setFTYPCODE(byte value) {
        this.ftypcode = value;
    }

    /**
     * Gets the value of the doctypcode property.
     */
    public short getDOCTYPCODE() {
        return doctypcode;
    }

    /**
     * Sets the value of the doctypcode property.
     */
    public void setDOCTYPCODE(short value) {
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
