package com.chubb.preprocessors.emailbrokermaster.jaxb.MNBxml.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="documentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scan_info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doc_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doc_producer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ftyp_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doc_typ_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentType", propOrder = {
        "scanInfo",
        "docDescription",
        "docProducer",
        "ftypCode",
        "docTypCode"
})
public class DocumentType {

    @XmlElement(name = "scan_info", required = true)
    protected String scanInfo;
    @XmlElement(name = "doc_description", required = true)
    protected String docDescription;
    @XmlElement(name = "doc_producer", required = true)
    protected String docProducer;
    @XmlElement(name = "ftyp_code", required = true)
    protected String ftypCode;
    @XmlElement(name = "doc_typ_code", required = true)
    protected String docTypCode;

    /**
     * Gets the value of the scanInfo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getScanInfo() {
        return scanInfo;
    }

    /**
     * Sets the value of the scanInfo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setScanInfo(String value) {
        this.scanInfo = value;
    }

    /**
     * Gets the value of the docDescription property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocDescription() {
        return docDescription;
    }

    /**
     * Sets the value of the docDescription property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocDescription(String value) {
        this.docDescription = value;
    }

    /**
     * Gets the value of the docProducer property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocProducer() {
        return docProducer;
    }

    /**
     * Sets the value of the docProducer property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocProducer(String value) {
        this.docProducer = value;
    }

    /**
     * Gets the value of the ftypCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFtypCode() {
        return ftypCode;
    }

    /**
     * Sets the value of the ftypCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFtypCode(String value) {
        this.ftypCode = value;
    }

    /**
     * Gets the value of the docTypCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocTypCode() {
        return docTypCode;
    }

    /**
     * Sets the value of the docTypCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocTypCode(String value) {
        this.docTypCode = value;
    }

}
