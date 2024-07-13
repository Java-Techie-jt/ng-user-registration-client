
package com.chubb.workview.documentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ImportandIndexDocumentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportandIndexDocumentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOBGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolderTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DocumentProducer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnderwriterYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SecurityPolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAcknowledmentLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcknowledmentLetterDateSent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DocumentData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActionedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PaidDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TCFReporting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnvelopeNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Pages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Attachments" type="{http://chubb.com/WorkView/DocumentService/2016/06}ArrayOfAttachment" minOccurs="0"/&gt;
 *         &lt;element name="EnvironmentData" type="{http://chubb.com/WorkView/DocumentService/2016/06}EnvironmentData" minOccurs="0"/&gt;
 *         &lt;element name="IngestionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PolicyIntId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PolicyQuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportandIndexDocumentRequest", propOrder = {
    "policyNumber",
    "certificateNumber",
    "claimNumber",
    "lobGroupCode",
    "folderTypeCode",
    "documentTypeCode",
    "emailDate",
    "documentProducer",
    "underwriterYear",
    "securityPolicyID",
    "isAcknowledmentLetter",
    "acknowledmentLetterDateSent",
    "documentData",
    "documentDescription",
    "documentFileName",
    "documentInformation",
    "emailSender",
    "branchCode",
    "actionedDate",
    "paidDate",
    "lifeCycleStatus",
    "tcfReporting",
    "envelopeNumber",
    "pages",
    "attachments",
    "environmentData",
    "ingestionDate",
    "policyIntId",
    "policyQuoteNumber"
})
public class ImportandIndexDocumentRequest {

    @XmlElementRef(name = "PolicyNumber", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNumber;
    @XmlElementRef(name = "CertificateNumber", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificateNumber;
    @XmlElementRef(name = "ClaimNumber", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claimNumber;
    @XmlElementRef(name = "LOBGroupCode", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lobGroupCode;
    @XmlElementRef(name = "FolderTypeCode", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> folderTypeCode;
    @XmlElementRef(name = "DocumentTypeCode", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentTypeCode;
    @XmlElement(name = "EmailDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emailDate;
    @XmlElementRef(name = "DocumentProducer", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentProducer;
    @XmlElement(name = "UnderwriterYear")
    protected Integer underwriterYear;
    @XmlElementRef(name = "SecurityPolicyID", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> securityPolicyID;
    @XmlElementRef(name = "IsAcknowledmentLetter", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isAcknowledmentLetter;
    @XmlElementRef(name = "AcknowledmentLetterDateSent", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> acknowledmentLetterDateSent;
    @XmlElementRef(name = "DocumentData", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentData;
    @XmlElementRef(name = "DocumentDescription", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentDescription;
    @XmlElementRef(name = "DocumentFileName", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentFileName;
    @XmlElementRef(name = "DocumentInformation", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentInformation;
    @XmlElementRef(name = "EmailSender", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailSender;
    @XmlElement(name = "BranchCode")
    protected Integer branchCode;
    @XmlElementRef(name = "ActionedDate", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actionedDate;
    @XmlElementRef(name = "PaidDate", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> paidDate;
    @XmlElement(name = "LifeCycleStatus")
    protected Integer lifeCycleStatus;
    @XmlElement(name = "TCFReporting")
    protected Boolean tcfReporting;
    @XmlElement(name = "EnvelopeNumber")
    protected Integer envelopeNumber;
    @XmlElement(name = "Pages")
    protected Integer pages;
    @XmlElementRef(name = "Attachments", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAttachment> attachments;
    @XmlElementRef(name = "EnvironmentData", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<EnvironmentData> environmentData;
    @XmlElement(name = "IngestionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ingestionDate;
    @XmlElement(name = "PolicyIntId")
    protected Integer policyIntId;
    @XmlElementRef(name = "PolicyQuoteNumber", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyQuoteNumber;

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
     * Gets the value of the claimNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaimNumber() {
        return claimNumber;
    }

    /**
     * Sets the value of the claimNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaimNumber(JAXBElement<String> value) {
        this.claimNumber = value;
    }

    /**
     * Gets the value of the lobGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLOBGroupCode() {
        return lobGroupCode;
    }

    /**
     * Sets the value of the lobGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLOBGroupCode(JAXBElement<String> value) {
        this.lobGroupCode = value;
    }

    /**
     * Gets the value of the folderTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFolderTypeCode() {
        return folderTypeCode;
    }

    /**
     * Sets the value of the folderTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFolderTypeCode(JAXBElement<String> value) {
        this.folderTypeCode = value;
    }

    /**
     * Gets the value of the documentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Sets the value of the documentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentTypeCode(JAXBElement<String> value) {
        this.documentTypeCode = value;
    }

    /**
     * Gets the value of the emailDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmailDate() {
        return emailDate;
    }

    /**
     * Sets the value of the emailDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmailDate(XMLGregorianCalendar value) {
        this.emailDate = value;
    }

    /**
     * Gets the value of the documentProducer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentProducer() {
        return documentProducer;
    }

    /**
     * Sets the value of the documentProducer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentProducer(JAXBElement<String> value) {
        this.documentProducer = value;
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
     * Gets the value of the securityPolicyID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecurityPolicyID() {
        return securityPolicyID;
    }

    /**
     * Sets the value of the securityPolicyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecurityPolicyID(JAXBElement<String> value) {
        this.securityPolicyID = value;
    }

    /**
     * Gets the value of the isAcknowledmentLetter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsAcknowledmentLetter() {
        return isAcknowledmentLetter;
    }

    /**
     * Sets the value of the isAcknowledmentLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsAcknowledmentLetter(JAXBElement<String> value) {
        this.isAcknowledmentLetter = value;
    }

    /**
     * Gets the value of the acknowledmentLetterDateSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAcknowledmentLetterDateSent() {
        return acknowledmentLetterDateSent;
    }

    /**
     * Sets the value of the acknowledmentLetterDateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAcknowledmentLetterDateSent(JAXBElement<XMLGregorianCalendar> value) {
        this.acknowledmentLetterDateSent = value;
    }

    /**
     * Gets the value of the documentData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentData() {
        return documentData;
    }

    /**
     * Sets the value of the documentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentData(JAXBElement<String> value) {
        this.documentData = value;
    }

    /**
     * Gets the value of the documentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentDescription() {
        return documentDescription;
    }

    /**
     * Sets the value of the documentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentDescription(JAXBElement<String> value) {
        this.documentDescription = value;
    }

    /**
     * Gets the value of the documentFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentFileName() {
        return documentFileName;
    }

    /**
     * Sets the value of the documentFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentFileName(JAXBElement<String> value) {
        this.documentFileName = value;
    }

    /**
     * Gets the value of the documentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentInformation() {
        return documentInformation;
    }

    /**
     * Sets the value of the documentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentInformation(JAXBElement<String> value) {
        this.documentInformation = value;
    }

    /**
     * Gets the value of the emailSender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailSender() {
        return emailSender;
    }

    /**
     * Sets the value of the emailSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailSender(JAXBElement<String> value) {
        this.emailSender = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBranchCode(Integer value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the actionedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActionedDate() {
        return actionedDate;
    }

    /**
     * Sets the value of the actionedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActionedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.actionedDate = value;
    }

    /**
     * Gets the value of the paidDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPaidDate() {
        return paidDate;
    }

    /**
     * Sets the value of the paidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPaidDate(JAXBElement<XMLGregorianCalendar> value) {
        this.paidDate = value;
    }

    /**
     * Gets the value of the lifeCycleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLifeCycleStatus() {
        return lifeCycleStatus;
    }

    /**
     * Sets the value of the lifeCycleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLifeCycleStatus(Integer value) {
        this.lifeCycleStatus = value;
    }

    /**
     * Gets the value of the tcfReporting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTCFReporting() {
        return tcfReporting;
    }

    /**
     * Sets the value of the tcfReporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTCFReporting(Boolean value) {
        this.tcfReporting = value;
    }

    /**
     * Gets the value of the envelopeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnvelopeNumber() {
        return envelopeNumber;
    }

    /**
     * Sets the value of the envelopeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnvelopeNumber(Integer value) {
        this.envelopeNumber = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPages(Integer value) {
        this.pages = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttachment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAttachment> getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttachment }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<ArrayOfAttachment> value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the environmentData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     *     
     */
    public JAXBElement<EnvironmentData> getEnvironmentData() {
        return environmentData;
    }

    /**
     * Sets the value of the environmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     *     
     */
    public void setEnvironmentData(JAXBElement<EnvironmentData> value) {
        this.environmentData = value;
    }

    /**
     * Gets the value of the ingestionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIngestionDate() {
        return ingestionDate;
    }

    /**
     * Sets the value of the ingestionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIngestionDate(XMLGregorianCalendar value) {
        this.ingestionDate = value;
    }

    /**
     * Gets the value of the policyIntId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyIntId() {
        return policyIntId;
    }

    /**
     * Sets the value of the policyIntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyIntId(Integer value) {
        this.policyIntId = value;
    }

    /**
     * Gets the value of the policyQuoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyQuoteNumber() {
        return policyQuoteNumber;
    }

    /**
     * Sets the value of the policyQuoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyQuoteNumber(JAXBElement<String> value) {
        this.policyQuoteNumber = value;
    }

}
