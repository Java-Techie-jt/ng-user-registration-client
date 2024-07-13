
package com.chubb.workview.documentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WVDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WVDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnderwriterYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SecurityPolicyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Broker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnderwriterID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InputType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InsuredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UTCOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalBytesUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Attachments" type="{http://chubb.com/WorkView/DocumentService/2016/06}ArrayOfAttachmentDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WVDocument", propOrder = {
    "documentGUID",
    "quoteNumber",
    "policyNumber",
    "certificateNumber",
    "documentType",
    "folderType",
    "underwriterYear",
    "securityPolicyId",
    "description",
    "broker",
    "underwriterID",
    "inputType",
    "branch",
    "insuredName",
    "isHidden",
    "scanDate",
    "utcOffset",
    "originalBytesUsed",
    "documentDate",
    "attachments"
})
public class WVDocument {

    @XmlElementRef(name = "DocumentGUID", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentGUID;
    @XmlElementRef(name = "QuoteNumber", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quoteNumber;
    @XmlElementRef(name = "PolicyNumber", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNumber;
    @XmlElementRef(name = "CertificateNumber", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificateNumber;
    @XmlElementRef(name = "DocumentType", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentType;
    @XmlElementRef(name = "FolderType", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> folderType;
    @XmlElement(name = "UnderwriterYear")
    protected Integer underwriterYear;
    @XmlElement(name = "SecurityPolicyId")
    protected Integer securityPolicyId;
    @XmlElementRef(name = "Description", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Broker", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> broker;
    @XmlElement(name = "UnderwriterID")
    protected Integer underwriterID;
    @XmlElementRef(name = "InputType", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputType;
    @XmlElement(name = "Branch")
    protected Integer branch;
    @XmlElementRef(name = "InsuredName", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuredName;
    @XmlElementRef(name = "IsHidden", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isHidden;
    @XmlElementRef(name = "ScanDate", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> scanDate;
    @XmlElementRef(name = "UTCOffset", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> utcOffset;
    @XmlElementRef(name = "OriginalBytesUsed", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalBytesUsed;
    @XmlElementRef(name = "DocumentDate", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> documentDate;
    @XmlElementRef(name = "Attachments", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAttachmentDetail> attachments;

    /**
     * Gets the value of the documentGUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentGUID() {
        return documentGUID;
    }

    /**
     * Sets the value of the documentGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentGUID(JAXBElement<String> value) {
        this.documentGUID = value;
    }

    /**
     * Gets the value of the quoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuoteNumber(JAXBElement<String> value) {
        this.quoteNumber = value;
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
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificateNumber(JAXBElement<String> value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentType(JAXBElement<String> value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the folderType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFolderType() {
        return folderType;
    }

    /**
     * Sets the value of the folderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFolderType(JAXBElement<String> value) {
        this.folderType = value;
    }

    /**
     * Gets the value of the underwriterYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnderwriterYear() {
        return underwriterYear;
    }

    /**
     * Sets the value of the underwriterYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnderwriterYear(Integer value) {
        this.underwriterYear = value;
    }

    /**
     * Gets the value of the securityPolicyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecurityPolicyId() {
        return securityPolicyId;
    }

    /**
     * Sets the value of the securityPolicyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecurityPolicyId(Integer value) {
        this.securityPolicyId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the broker property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBroker() {
        return broker;
    }

    /**
     * Sets the value of the broker property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBroker(JAXBElement<String> value) {
        this.broker = value;
    }

    /**
     * Gets the value of the underwriterID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnderwriterID() {
        return underwriterID;
    }

    /**
     * Sets the value of the underwriterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnderwriterID(Integer value) {
        this.underwriterID = value;
    }

    /**
     * Gets the value of the inputType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputType() {
        return inputType;
    }

    /**
     * Sets the value of the inputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputType(JAXBElement<String> value) {
        this.inputType = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBranch(Integer value) {
        this.branch = value;
    }

    /**
     * Gets the value of the insuredName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuredName() {
        return insuredName;
    }

    /**
     * Sets the value of the insuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuredName(JAXBElement<String> value) {
        this.insuredName = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsHidden(JAXBElement<Boolean> value) {
        this.isHidden = value;
    }

    /**
     * Gets the value of the scanDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getScanDate() {
        return scanDate;
    }

    /**
     * Sets the value of the scanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setScanDate(JAXBElement<XMLGregorianCalendar> value) {
        this.scanDate = value;
    }

    /**
     * Gets the value of the utcOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUTCOffset() {
        return utcOffset;
    }

    /**
     * Sets the value of the utcOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUTCOffset(JAXBElement<String> value) {
        this.utcOffset = value;
    }

    /**
     * Gets the value of the originalBytesUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalBytesUsed() {
        return originalBytesUsed;
    }

    /**
     * Sets the value of the originalBytesUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalBytesUsed(JAXBElement<String> value) {
        this.originalBytesUsed = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDocumentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAttachmentDetail> getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetail }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<ArrayOfAttachmentDetail> value) {
        this.attachments = value;
    }

}
