
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
 * <p>Java class for DocumentDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentDetailsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteNumbers" type="{http://chubb.com/WorkView/DocumentService/2016/06}ArrayOfQuotenumber" minOccurs="0"/&gt;
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolderTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentTypes" type="{http://chubb.com/WorkView/DocumentService/2016/06}ArrayOfDocumentType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOBGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InsuredID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrokerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecordLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnderwriterID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EnvironmentData" type="{http://chubb.com/WorkView/DocumentService/2016/06}EnvironmentData" minOccurs="0"/&gt;
 *         &lt;element name="PolIntId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentDetailsRequest", propOrder = {
    "documentGUID",
    "quoteNumbers",
    "policyNumber",
    "certificateNumber",
    "folderTypeCode",
    "documentTypes",
    "documentDescription",
    "lobGroupCode",
    "documentDate",
    "branchCode",
    "insuredID",
    "brokerCode",
    "inputType",
    "recordLimit",
    "underwriterID",
    "environmentData",
    "polIntId"
})
public class DocumentDetailsRequest {

    @XmlElementRef(name = "DocumentGUID", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentGUID;
    @XmlElementRef(name = "QuoteNumbers", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfQuotenumber> quoteNumbers;
    @XmlElementRef(name = "PolicyNumber", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNumber;
    @XmlElementRef(name = "CertificateNumber", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificateNumber;
    @XmlElementRef(name = "FolderTypeCode", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> folderTypeCode;
    @XmlElementRef(name = "DocumentTypes", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentType> documentTypes;
    @XmlElementRef(name = "DocumentDescription", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentDescription;
    @XmlElementRef(name = "LOBGroupCode", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lobGroupCode;
    @XmlElement(name = "DocumentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "BranchCode")
    protected Integer branchCode;
    @XmlElementRef(name = "InsuredID", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuredID;
    @XmlElementRef(name = "BrokerCode", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brokerCode;
    @XmlElementRef(name = "InputType", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputType;
    @XmlElementRef(name = "RecordLimit", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordLimit;
    @XmlElement(name = "UnderwriterID")
    protected Integer underwriterID;
    @XmlElementRef(name = "EnvironmentData", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<EnvironmentData> environmentData;
    @XmlElement(name = "PolIntId")
    protected Integer polIntId;

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
     * Gets the value of the quoteNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotenumber }{@code >}
     *     
     */
    public JAXBElement<ArrayOfQuotenumber> getQuoteNumbers() {
        return quoteNumbers;
    }

    /**
     * Sets the value of the quoteNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotenumber }{@code >}
     *     
     */
    public void setQuoteNumbers(JAXBElement<ArrayOfQuotenumber> value) {
        this.quoteNumbers = value;
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
     * Gets the value of the documentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentType> getDocumentTypes() {
        return documentTypes;
    }

    /**
     * Sets the value of the documentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     *     
     */
    public void setDocumentTypes(JAXBElement<ArrayOfDocumentType> value) {
        this.documentTypes = value;
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
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
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
     * Gets the value of the insuredID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuredID() {
        return insuredID;
    }

    /**
     * Sets the value of the insuredID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuredID(JAXBElement<String> value) {
        this.insuredID = value;
    }

    /**
     * Gets the value of the brokerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrokerCode() {
        return brokerCode;
    }

    /**
     * Sets the value of the brokerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrokerCode(JAXBElement<String> value) {
        this.brokerCode = value;
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
     * Gets the value of the recordLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecordLimit() {
        return recordLimit;
    }

    /**
     * Sets the value of the recordLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecordLimit(JAXBElement<String> value) {
        this.recordLimit = value;
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
     * Gets the value of the polIntId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolIntId() {
        return polIntId;
    }

    /**
     * Sets the value of the polIntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolIntId(Integer value) {
        this.polIntId = value;
    }

}
