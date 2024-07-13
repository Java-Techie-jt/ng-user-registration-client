
package com.chubb.workview.documentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndexDocumentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexDocumentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolderTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOBGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HiddenFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnderwriterYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SecurityPolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentActionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAcknowledgmentLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcknowledmentLetterDateSent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnvironmentData" type="{http://chubb.com/WorkView/DocumentService/2016/06}EnvironmentData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexDocumentRequest", propOrder = {
    "documentGUID",
    "folderTypeCode",
    "documentTypeCode",
    "lobGroupCode",
    "documentDescription",
    "hiddenFile",
    "policyNumber",
    "claimNumber",
    "underwriterYear",
    "securityPolicyID",
    "documentActionDate",
    "isAcknowledgmentLetter",
    "acknowledmentLetterDateSent",
    "environmentData"
})
public class IndexDocumentRequest {

    @XmlElementRef(name = "DocumentGUID", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentGUID;
    @XmlElementRef(name = "FolderTypeCode", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> folderTypeCode;
    @XmlElementRef(name = "DocumentTypeCode", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentTypeCode;
    @XmlElementRef(name = "LOBGroupCode", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lobGroupCode;
    @XmlElementRef(name = "DocumentDescription", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentDescription;
    @XmlElementRef(name = "HiddenFile", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hiddenFile;
    @XmlElementRef(name = "PolicyNumber", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNumber;
    @XmlElementRef(name = "ClaimNumber", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claimNumber;
    @XmlElement(name = "UnderwriterYear")
    protected Integer underwriterYear;
    @XmlElementRef(name = "SecurityPolicyID", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> securityPolicyID;
    @XmlElementRef(name = "DocumentActionDate", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentActionDate;
    @XmlElementRef(name = "IsAcknowledgmentLetter", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isAcknowledgmentLetter;
    @XmlElementRef(name = "AcknowledmentLetterDateSent", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acknowledmentLetterDateSent;
    @XmlElementRef(name = "EnvironmentData", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<EnvironmentData> environmentData;

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
     * Gets the value of the hiddenFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHiddenFile() {
        return hiddenFile;
    }

    /**
     * Sets the value of the hiddenFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHiddenFile(JAXBElement<String> value) {
        this.hiddenFile = value;
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
     * Gets the value of the documentActionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentActionDate() {
        return documentActionDate;
    }

    /**
     * Sets the value of the documentActionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentActionDate(JAXBElement<String> value) {
        this.documentActionDate = value;
    }

    /**
     * Gets the value of the isAcknowledgmentLetter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsAcknowledgmentLetter() {
        return isAcknowledgmentLetter;
    }

    /**
     * Sets the value of the isAcknowledgmentLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsAcknowledgmentLetter(JAXBElement<String> value) {
        this.isAcknowledgmentLetter = value;
    }

    /**
     * Gets the value of the acknowledmentLetterDateSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcknowledmentLetterDateSent() {
        return acknowledmentLetterDateSent;
    }

    /**
     * Sets the value of the acknowledmentLetterDateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcknowledmentLetterDateSent(JAXBElement<String> value) {
        this.acknowledmentLetterDateSent = value;
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

}
