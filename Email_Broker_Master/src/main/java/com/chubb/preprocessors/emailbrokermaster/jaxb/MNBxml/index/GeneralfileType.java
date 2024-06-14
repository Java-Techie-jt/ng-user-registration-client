package com.chubb.preprocessors.emailbrokermaster.jaxb.MNBxml.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for generalfileType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="generalfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bpu_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="error_queue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gf_header" type="{}gf_headerType"/>
 *         &lt;element name="gf_fields" type="{}gf_fieldsType"/>
 *         &lt;element name="document" type="{}documentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalfileType", propOrder = {
        "bpuCode",
        "errorQueue",
        "gfHeader",
        "gfFields",
        "document"
})
public class GeneralfileType {

    @XmlElement(name = "bpu_code", required = true)
    protected String bpuCode;
    @XmlElement(name = "error_queue", required = true)
    protected String errorQueue;
    @XmlElement(name = "gf_header", required = true)
    protected GfHeaderType gfHeader;
    @XmlElement(name = "gf_fields", required = true)
    protected GfFieldsType gfFields;
    @XmlElement(required = true)
    protected List<DocumentType> document;

    /**
     * Gets the value of the bpuCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBpuCode() {
        return bpuCode;
    }

    /**
     * Sets the value of the bpuCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBpuCode(String value) {
        this.bpuCode = value;
    }

    /**
     * Gets the value of the errorQueue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrorQueue() {
        return errorQueue;
    }

    /**
     * Sets the value of the errorQueue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrorQueue(String value) {
        this.errorQueue = value;
    }

    /**
     * Gets the value of the gfHeader property.
     *
     * @return possible object is
     * {@link GfHeaderType }
     */
    public GfHeaderType getGfHeader() {
        return gfHeader;
    }

    /**
     * Sets the value of the gfHeader property.
     *
     * @param value allowed object is
     *              {@link GfHeaderType }
     */
    public void setGfHeader(GfHeaderType value) {
        this.gfHeader = value;
    }

    /**
     * Gets the value of the gfFields property.
     *
     * @return possible object is
     * {@link GfFieldsType }
     */
    public GfFieldsType getGfFields() {
        return gfFields;
    }

    /**
     * Sets the value of the gfFields property.
     *
     * @param value allowed object is
     *              {@link GfFieldsType }
     */
    public void setGfFields(GfFieldsType value) {
        this.gfFields = value;
    }

    /**
     * Gets the value of the document property.
     *
     * @return possible object is
     * {@link DocumentType }
     */
    public List<DocumentType> getAttachmentIndex() {
        if (document == null) {
            document = new ArrayList<DocumentType>();
        }
        return this.document;
    }

}
