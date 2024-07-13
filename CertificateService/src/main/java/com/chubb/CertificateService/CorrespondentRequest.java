
package com.chubb.CertificateService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CorrespondentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrespondentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorrespondentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClaimReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnderWriterReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrespondentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrespondentCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuildingFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrespondentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherContactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/>
 *         &lt;element name="MobileNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TownCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPreferred" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/>
 *         &lt;element name="ContactMethodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondentRequest", propOrder = {
    "correspondentID",
    "claimReference",
    "underWriterReference",
    "correspondentNumber",
    "correspondentCompany",
    "position",
    "surname",
    "forename",
    "middlename",
    "emailID",
    "address1",
    "address2",
    "buildingFloor",
    "correspondentName",
    "titleDescription",
    "city",
    "postCode",
    "telephoneNumber",
    "faxNumber",
    "birthDate",
    "contactName",
    "otherContactNumber",
    "country",
    "title",
    "county",
    "sex",
    "mobileNumber1",
    "townCode",
    "mobileNumber2",
    "workNumber",
    "isPreferred",
    "contactMethodType"
})
public class CorrespondentRequest {

    @XmlElement(name = "CorrespondentID")
    protected Integer correspondentID;
    @XmlElementRef(name = "ClaimReference", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claimReference;
    @XmlElementRef(name = "UnderWriterReference", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> underWriterReference;
    @XmlElementRef(name = "CorrespondentNumber", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correspondentNumber;
    @XmlElementRef(name = "CorrespondentCompany", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correspondentCompany;
    @XmlElementRef(name = "Position", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> position;
    @XmlElementRef(name = "Surname", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surname;
    @XmlElementRef(name = "Forename", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forename;
    @XmlElementRef(name = "Middlename", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middlename;
    @XmlElementRef(name = "EmailID", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailID;
    @XmlElementRef(name = "Address1", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address1;
    @XmlElementRef(name = "Address2", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address2;
    @XmlElementRef(name = "BuildingFloor", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buildingFloor;
    @XmlElementRef(name = "CorrespondentName", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correspondentName;
    @XmlElementRef(name = "TitleDescription", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titleDescription;
    @XmlElementRef(name = "City", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "PostCode", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postCode;
    @XmlElementRef(name = "TelephoneNumber", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telephoneNumber;
    @XmlElementRef(name = "FaxNumber", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faxNumber;
    @XmlElementRef(name = "BirthDate", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> birthDate;
    @XmlElementRef(name = "ContactName", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactName;
    @XmlElementRef(name = "OtherContactNumber", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherContactNumber;
    @XmlElementRef(name = "Country", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "Title", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "County", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> county;
    @XmlElement(name = "Sex")
    protected Integer sex;
    @XmlElementRef(name = "MobileNumber1", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileNumber1;
    @XmlElementRef(name = "TownCode", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> townCode;
    @XmlElementRef(name = "MobileNumber2", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileNumber2;
    @XmlElementRef(name = "WorkNumber", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workNumber;
    @XmlElement(name = "IsPreferred")
    protected Integer isPreferred;
    @XmlElementRef(name = "ContactMethodType", namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactMethodType;

    /**
     * Gets the value of the correspondentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrespondentID() {
        return correspondentID;
    }

    /**
     * Sets the value of the correspondentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrespondentID(Integer value) {
        this.correspondentID = value;
    }

    /**
     * Gets the value of the claimReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaimReference() {
        return claimReference;
    }

    /**
     * Sets the value of the claimReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaimReference(JAXBElement<String> value) {
        this.claimReference = value;
    }

    /**
     * Gets the value of the underWriterReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnderWriterReference() {
        return underWriterReference;
    }

    /**
     * Sets the value of the underWriterReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnderWriterReference(JAXBElement<String> value) {
        this.underWriterReference = value;
    }

    /**
     * Gets the value of the correspondentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrespondentNumber() {
        return correspondentNumber;
    }

    /**
     * Sets the value of the correspondentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrespondentNumber(JAXBElement<String> value) {
        this.correspondentNumber = value;
    }

    /**
     * Gets the value of the correspondentCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrespondentCompany() {
        return correspondentCompany;
    }

    /**
     * Sets the value of the correspondentCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrespondentCompany(JAXBElement<String> value) {
        this.correspondentCompany = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosition(JAXBElement<String> value) {
        this.position = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurname(JAXBElement<String> value) {
        this.surname = value;
    }

    /**
     * Gets the value of the forename property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForename() {
        return forename;
    }

    /**
     * Sets the value of the forename property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForename(JAXBElement<String> value) {
        this.forename = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddlename(JAXBElement<String> value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the emailID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailID() {
        return emailID;
    }

    /**
     * Sets the value of the emailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailID(JAXBElement<String> value) {
        this.emailID = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress1(JAXBElement<String> value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress2(JAXBElement<String> value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the buildingFloor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildingFloor() {
        return buildingFloor;
    }

    /**
     * Sets the value of the buildingFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildingFloor(JAXBElement<String> value) {
        this.buildingFloor = value;
    }

    /**
     * Gets the value of the correspondentName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrespondentName() {
        return correspondentName;
    }

    /**
     * Sets the value of the correspondentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrespondentName(JAXBElement<String> value) {
        this.correspondentName = value;
    }

    /**
     * Gets the value of the titleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitleDescription() {
        return titleDescription;
    }

    /**
     * Sets the value of the titleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitleDescription(JAXBElement<String> value) {
        this.titleDescription = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostCode(JAXBElement<String> value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelephoneNumber(JAXBElement<String> value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxNumber(JAXBElement<String> value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBirthDate(JAXBElement<XMLGregorianCalendar> value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactName(JAXBElement<String> value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the otherContactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherContactNumber() {
        return otherContactNumber;
    }

    /**
     * Sets the value of the otherContactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherContactNumber(JAXBElement<String> value) {
        this.otherContactNumber = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounty(JAXBElement<String> value) {
        this.county = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSex(Integer value) {
        this.sex = value;
    }

    /**
     * Gets the value of the mobileNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileNumber1() {
        return mobileNumber1;
    }

    /**
     * Sets the value of the mobileNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileNumber1(JAXBElement<String> value) {
        this.mobileNumber1 = value;
    }

    /**
     * Gets the value of the townCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTownCode() {
        return townCode;
    }

    /**
     * Sets the value of the townCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTownCode(JAXBElement<String> value) {
        this.townCode = value;
    }

    /**
     * Gets the value of the mobileNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileNumber2() {
        return mobileNumber2;
    }

    /**
     * Sets the value of the mobileNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileNumber2(JAXBElement<String> value) {
        this.mobileNumber2 = value;
    }

    /**
     * Gets the value of the workNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkNumber() {
        return workNumber;
    }

    /**
     * Sets the value of the workNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkNumber(JAXBElement<String> value) {
        this.workNumber = value;
    }

    /**
     * Gets the value of the isPreferred property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsPreferred() {
        return isPreferred;
    }

    /**
     * Sets the value of the isPreferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsPreferred(Integer value) {
        this.isPreferred = value;
    }

    /**
     * Gets the value of the contactMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactMethodType() {
        return contactMethodType;
    }

    /**
     * Sets the value of the contactMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactMethodType(JAXBElement<String> value) {
        this.contactMethodType = value;
    }

}
