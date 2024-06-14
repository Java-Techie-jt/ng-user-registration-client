
package com.chubb.workview.generalfileservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralFileRequestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralFileRequestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FileSubType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsClosed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsMigrated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOnCompliance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSavedOnce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOBCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LOBGroupCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumNewDocs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AuditSecurityPolicy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookingPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BordereauxPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileIntId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentFileCaseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedSecurityPolicy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WeekNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StepName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralFileRequestDetails", propOrder = {
    "fileType",
    "fileSubType",
    "countryCode",
    "description",
    "documentTypeCode",
    "fileNumber",
    "isClosed",
    "isFile",
    "isLocked",
    "isMigrated",
    "isOnCompliance",
    "isSavedOnce",
    "lobCode",
    "lobGroupCode",
    "numNewDocs",
    "auditSecurityPolicy",
    "bookingPeriod",
    "bordereauxPeriod",
    "companyType",
    "fileIntId",
    "parentFileCaseId",
    "registrationSystemReference",
    "assignedSecurityPolicy",
    "weekNumber",
    "productCode",
    "status",
    "stepName"
})
public class GeneralFileRequestDetails {

    @XmlElement(name = "FileType")
    protected int fileType;
    @XmlElement(name = "FileSubType")
    protected int fileSubType;
    @XmlElementRef(name = "CountryCode", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "Description", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DocumentTypeCode", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentTypeCode;
    @XmlElementRef(name = "FileNumber", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileNumber;
    @XmlElementRef(name = "IsClosed", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isClosed;
    @XmlElementRef(name = "IsFile", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isFile;
    @XmlElementRef(name = "IsLocked", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isLocked;
    @XmlElementRef(name = "IsMigrated", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isMigrated;
    @XmlElementRef(name = "IsOnCompliance", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isOnCompliance;
    @XmlElementRef(name = "IsSavedOnce", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isSavedOnce;
    @XmlElement(name = "LOBCode")
    protected Integer lobCode;
    @XmlElement(name = "LOBGroupCode")
    protected Integer lobGroupCode;
    @XmlElement(name = "NumNewDocs")
    protected Integer numNewDocs;
    @XmlElement(name = "AuditSecurityPolicy")
    protected Integer auditSecurityPolicy;
    @XmlElementRef(name = "BookingPeriod", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingPeriod;
    @XmlElementRef(name = "BordereauxPeriod", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bordereauxPeriod;
    @XmlElementRef(name = "CompanyType", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyType;
    @XmlElement(name = "FileIntId")
    protected Integer fileIntId;
    @XmlElementRef(name = "ParentFileCaseId", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentFileCaseId;
    @XmlElementRef(name = "RegistrationSystemReference", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationSystemReference;
    @XmlElement(name = "AssignedSecurityPolicy")
    protected Integer assignedSecurityPolicy;
    @XmlElementRef(name = "WeekNumber", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> weekNumber;
    @XmlElementRef(name = "ProductCode", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productCode;
    @XmlElementRef(name = "Status", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElement(name = "StepName")
    protected Integer stepName;

    /**
     * Gets the value of the fileType property.
     * 
     */
    public int getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     */
    public void setFileType(int value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the fileSubType property.
     * 
     */
    public int getFileSubType() {
        return fileSubType;
    }

    /**
     * Sets the value of the fileSubType property.
     * 
     */
    public void setFileSubType(int value) {
        this.fileSubType = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<String> value) {
        this.countryCode = value;
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
     * Gets the value of the fileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileNumber(JAXBElement<String> value) {
        this.fileNumber = value;
    }

    /**
     * Gets the value of the isClosed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsClosed() {
        return isClosed;
    }

    /**
     * Sets the value of the isClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsClosed(JAXBElement<String> value) {
        this.isClosed = value;
    }

    /**
     * Gets the value of the isFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsFile() {
        return isFile;
    }

    /**
     * Sets the value of the isFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsFile(JAXBElement<String> value) {
        this.isFile = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsLocked(JAXBElement<String> value) {
        this.isLocked = value;
    }

    /**
     * Gets the value of the isMigrated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsMigrated() {
        return isMigrated;
    }

    /**
     * Sets the value of the isMigrated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsMigrated(JAXBElement<String> value) {
        this.isMigrated = value;
    }

    /**
     * Gets the value of the isOnCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsOnCompliance() {
        return isOnCompliance;
    }

    /**
     * Sets the value of the isOnCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsOnCompliance(JAXBElement<String> value) {
        this.isOnCompliance = value;
    }

    /**
     * Gets the value of the isSavedOnce property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsSavedOnce() {
        return isSavedOnce;
    }

    /**
     * Sets the value of the isSavedOnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsSavedOnce(JAXBElement<String> value) {
        this.isSavedOnce = value;
    }

    /**
     * Gets the value of the lobCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLOBCode() {
        return lobCode;
    }

    /**
     * Sets the value of the lobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLOBCode(Integer value) {
        this.lobCode = value;
    }

    /**
     * Gets the value of the lobGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLOBGroupCode() {
        return lobGroupCode;
    }

    /**
     * Sets the value of the lobGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLOBGroupCode(Integer value) {
        this.lobGroupCode = value;
    }

    /**
     * Gets the value of the numNewDocs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumNewDocs() {
        return numNewDocs;
    }

    /**
     * Sets the value of the numNewDocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumNewDocs(Integer value) {
        this.numNewDocs = value;
    }

    /**
     * Gets the value of the auditSecurityPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuditSecurityPolicy() {
        return auditSecurityPolicy;
    }

    /**
     * Sets the value of the auditSecurityPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuditSecurityPolicy(Integer value) {
        this.auditSecurityPolicy = value;
    }

    /**
     * Gets the value of the bookingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingPeriod() {
        return bookingPeriod;
    }

    /**
     * Sets the value of the bookingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingPeriod(JAXBElement<String> value) {
        this.bookingPeriod = value;
    }

    /**
     * Gets the value of the bordereauxPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBordereauxPeriod() {
        return bordereauxPeriod;
    }

    /**
     * Sets the value of the bordereauxPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBordereauxPeriod(JAXBElement<String> value) {
        this.bordereauxPeriod = value;
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyType(JAXBElement<String> value) {
        this.companyType = value;
    }

    /**
     * Gets the value of the fileIntId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFileIntId() {
        return fileIntId;
    }

    /**
     * Sets the value of the fileIntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFileIntId(Integer value) {
        this.fileIntId = value;
    }

    /**
     * Gets the value of the parentFileCaseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentFileCaseId() {
        return parentFileCaseId;
    }

    /**
     * Sets the value of the parentFileCaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentFileCaseId(JAXBElement<String> value) {
        this.parentFileCaseId = value;
    }

    /**
     * Gets the value of the registrationSystemReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationSystemReference() {
        return registrationSystemReference;
    }

    /**
     * Sets the value of the registrationSystemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationSystemReference(JAXBElement<String> value) {
        this.registrationSystemReference = value;
    }

    /**
     * Gets the value of the assignedSecurityPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssignedSecurityPolicy() {
        return assignedSecurityPolicy;
    }

    /**
     * Sets the value of the assignedSecurityPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssignedSecurityPolicy(Integer value) {
        this.assignedSecurityPolicy = value;
    }

    /**
     * Gets the value of the weekNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWeekNumber() {
        return weekNumber;
    }

    /**
     * Sets the value of the weekNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWeekNumber(JAXBElement<String> value) {
        this.weekNumber = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductCode(JAXBElement<String> value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the stepName property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStepName() {
        return stepName;
    }

    /**
     * Sets the value of the stepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStepName(Integer value) {
        this.stepName = value;
    }

}
