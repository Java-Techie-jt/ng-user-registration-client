
package com.chubb.workview.insuredservice._2016._06;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InsuredInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuredInfoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AceOnlineReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AddressCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntiMoneyLaunderingBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntiMoneyLaunderingBranchValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AntiMoneyLaunderingID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AntiMoneyLaunderingIDValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AntiMoneyLaunderingInputDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AnnualPremiumAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AnnualPremiumAmountValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BackendID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClaimonList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COTEExpertCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COTEExpertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeceasedIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndorsementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDNumberID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InsuredActivity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InsuredActivityValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InsuredLocation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InsuredLocationValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InsuredNation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InsuredNationValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MNPrefixID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAFCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PastClaim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentMethodValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PEPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PEPIDValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PEPIndicatorUpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PolicyLocation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PolicyLocationValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PostCardSent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredCustomerAccidentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredCustomerHealthIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousCOTECode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProvinceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReceiveInformationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportingEntity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReportingEntityValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RiskCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesForceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowNameIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiretCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialCallInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerrorSuspect" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TerrorSuspectValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VATCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuredCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNNSID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsMigrated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuredCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuredID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Method" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/>
 *         &lt;element name="DateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Addedby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComplianceHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrespondentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EntShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyHolder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DunniSRATINGID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecordStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InsuredNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuredInfoRequest", propOrder = {
    "accountID",
    "aceOnlineReference",
    "contactID",
    "addressCode",
    "antiMoneyLaunderingBranch",
    "antiMoneyLaunderingBranchValue",
    "antiMoneyLaunderingID",
    "antiMoneyLaunderingIDValue",
    "antiMoneyLaunderingInputDate",
    "annualPremiumAmount",
    "annualPremiumAmountValue",
    "backendID",
    "claimonList",
    "coteExpertCode",
    "coteExpertDate",
    "deceasedIndex",
    "endorsementIndicator",
    "entityCode",
    "fiscalCode",
    "idNumber",
    "idNumberID",
    "insuredActivity",
    "insuredActivityValue",
    "insuredLocation",
    "insuredLocationValue",
    "insuredNation",
    "insuredNationValue",
    "mnPrefixID",
    "nafCode",
    "occupation",
    "pastClaim",
    "paymentMethod",
    "paymentMethodValue",
    "pepid",
    "pepidValue",
    "pepIndicatorUpdatedDate",
    "policyLocation",
    "policyLocationValue",
    "postCardSent",
    "preferredCustomerAccidentIndicator",
    "preferredCustomerHealthIndicator",
    "previousCOTECode",
    "provinceID",
    "receiveInformationIndicator",
    "reportingEntity",
    "reportingEntityValue",
    "riskCategory",
    "salesForceID",
    "showNameIndicator",
    "siretCode",
    "specialCallInstructions",
    "terrorSuspect",
    "terrorSuspectValue",
    "vatCode",
    "website",
    "guid",
    "insuredCode",
    "dunnsid",
    "isMigrated",
    "accountName",
    "insuredCountryCode",
    "country",
    "insuredID",
    "county",
    "method",
    "dateAdded",
    "addedby",
    "complianceHolder",
    "correspondentID",
    "entShortName",
    "policyHolder",
    "dunniSRATINGID",
    "taxID",
    "recordStatus",
    "insuredNumber",
    "taxIDType",
    "taxFlag",
    "serviceName",
    "provinceCode",
    "dunnsnumber"
})
public class InsuredInfoRequest {

    @XmlElement(name = "AccountID")
    protected Integer accountID;
    @XmlElementRef(name = "AceOnlineReference", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aceOnlineReference;
    @XmlElement(name = "ContactID")
    protected Integer contactID;
    @XmlElementRef(name = "AddressCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressCode;
    @XmlElementRef(name = "AntiMoneyLaunderingBranch", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> antiMoneyLaunderingBranch;
    @XmlElement(name = "AntiMoneyLaunderingBranchValue")
    protected Integer antiMoneyLaunderingBranchValue;
    @XmlElement(name = "AntiMoneyLaunderingID")
    protected Integer antiMoneyLaunderingID;
    @XmlElement(name = "AntiMoneyLaunderingIDValue")
    protected Integer antiMoneyLaunderingIDValue;
    @XmlElement(name = "AntiMoneyLaunderingInputDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar antiMoneyLaunderingInputDate;
    @XmlElement(name = "AnnualPremiumAmount")
    protected BigDecimal annualPremiumAmount;
    @XmlElement(name = "AnnualPremiumAmountValue")
    protected Integer annualPremiumAmountValue;
    @XmlElement(name = "BackendID")
    protected Integer backendID;
    @XmlElementRef(name = "ClaimonList", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claimonList;
    @XmlElementRef(name = "COTEExpertCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coteExpertCode;
    @XmlElement(name = "COTEExpertDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar coteExpertDate;
    @XmlElementRef(name = "DeceasedIndex", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deceasedIndex;
    @XmlElementRef(name = "EndorsementIndicator", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endorsementIndicator;
    @XmlElementRef(name = "EntityCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityCode;
    @XmlElementRef(name = "FiscalCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fiscalCode;
    @XmlElementRef(name = "IDNumber", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idNumber;
    @XmlElement(name = "IDNumberID")
    protected Integer idNumberID;
    @XmlElement(name = "InsuredActivity")
    protected Integer insuredActivity;
    @XmlElement(name = "InsuredActivityValue")
    protected Integer insuredActivityValue;
    @XmlElement(name = "InsuredLocation")
    protected Integer insuredLocation;
    @XmlElement(name = "InsuredLocationValue")
    protected Integer insuredLocationValue;
    @XmlElement(name = "InsuredNation")
    protected Integer insuredNation;
    @XmlElement(name = "InsuredNationValue")
    protected Integer insuredNationValue;
    @XmlElementRef(name = "MNPrefixID", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mnPrefixID;
    @XmlElementRef(name = "NAFCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nafCode;
    @XmlElementRef(name = "Occupation", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> occupation;
    @XmlElementRef(name = "PastClaim", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pastClaim;
    @XmlElement(name = "PaymentMethod")
    protected Integer paymentMethod;
    @XmlElement(name = "PaymentMethodValue")
    protected Integer paymentMethodValue;
    @XmlElementRef(name = "PEPID", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pepid;
    @XmlElement(name = "PEPIDValue")
    protected Integer pepidValue;
    @XmlElement(name = "PEPIndicatorUpdatedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pepIndicatorUpdatedDate;
    @XmlElement(name = "PolicyLocation")
    protected Integer policyLocation;
    @XmlElement(name = "PolicyLocationValue")
    protected Integer policyLocationValue;
    @XmlElementRef(name = "PostCardSent", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postCardSent;
    @XmlElementRef(name = "PreferredCustomerAccidentIndicator", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredCustomerAccidentIndicator;
    @XmlElementRef(name = "PreferredCustomerHealthIndicator", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredCustomerHealthIndicator;
    @XmlElementRef(name = "PreviousCOTECode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousCOTECode;
    @XmlElement(name = "ProvinceID")
    protected Integer provinceID;
    @XmlElementRef(name = "ReceiveInformationIndicator", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiveInformationIndicator;
    @XmlElement(name = "ReportingEntity")
    protected Integer reportingEntity;
    @XmlElement(name = "ReportingEntityValue")
    protected Integer reportingEntityValue;
    @XmlElementRef(name = "RiskCategory", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riskCategory;
    @XmlElementRef(name = "SalesForceID", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesForceID;
    @XmlElementRef(name = "ShowNameIndicator", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> showNameIndicator;
    @XmlElementRef(name = "SiretCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siretCode;
    @XmlElementRef(name = "SpecialCallInstructions", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialCallInstructions;
    @XmlElement(name = "TerrorSuspect")
    protected Integer terrorSuspect;
    @XmlElement(name = "TerrorSuspectValue")
    protected Integer terrorSuspectValue;
    @XmlElementRef(name = "VATCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vatCode;
    @XmlElementRef(name = "Website", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> website;
    @XmlElementRef(name = "GUID", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> guid;
    @XmlElementRef(name = "InsuredCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuredCode;
    @XmlElement(name = "DUNNSID")
    protected Integer dunnsid;
    @XmlElementRef(name = "IsMigrated", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isMigrated;
    @XmlElementRef(name = "AccountName", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountName;
    @XmlElementRef(name = "InsuredCountryCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuredCountryCode;
    @XmlElementRef(name = "Country", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElement(name = "InsuredID")
    protected Integer insuredID;
    @XmlElementRef(name = "County", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> county;
    @XmlElement(name = "Method")
    protected Integer method;
    @XmlElement(name = "DateAdded")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    @XmlElementRef(name = "Addedby", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addedby;
    @XmlElementRef(name = "ComplianceHolder", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceHolder;
    @XmlElement(name = "CorrespondentID")
    protected Integer correspondentID;
    @XmlElementRef(name = "EntShortName", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entShortName;
    @XmlElement(name = "PolicyHolder")
    protected Integer policyHolder;
    @XmlElement(name = "DunniSRATINGID")
    protected Integer dunniSRATINGID;
    @XmlElement(name = "TaxID")
    protected Integer taxID;
    @XmlElement(name = "RecordStatus")
    protected Integer recordStatus;
    @XmlElementRef(name = "InsuredNumber", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuredNumber;
    @XmlElementRef(name = "TaxIDType", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxIDType;
    @XmlElementRef(name = "TaxFlag", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxFlag;
    @XmlElementRef(name = "ServiceName", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceName;
    @XmlElementRef(name = "ProvinceCode", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provinceCode;
    @XmlElementRef(name = "DunnsNumber", namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunnsnumber;
    
    public JAXBElement<String> getDunnsnumber() {
		return dunnsnumber;
	}

	public void setDunnsnumber(JAXBElement<String> dunnsnumber) {
		this.dunnsnumber = dunnsnumber;
	}

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountID(Integer value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the aceOnlineReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAceOnlineReference() {
        return aceOnlineReference;
    }

    /**
     * Sets the value of the aceOnlineReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAceOnlineReference(JAXBElement<String> value) {
        this.aceOnlineReference = value;
    }

    /**
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContactID(Integer value) {
        this.contactID = value;
    }

    /**
     * Gets the value of the addressCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressCode() {
        return addressCode;
    }

    /**
     * Sets the value of the addressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressCode(JAXBElement<String> value) {
        this.addressCode = value;
    }

    /**
     * Gets the value of the antiMoneyLaunderingBranch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAntiMoneyLaunderingBranch() {
        return antiMoneyLaunderingBranch;
    }

    /**
     * Sets the value of the antiMoneyLaunderingBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAntiMoneyLaunderingBranch(JAXBElement<String> value) {
        this.antiMoneyLaunderingBranch = value;
    }

    /**
     * Gets the value of the antiMoneyLaunderingBranchValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiMoneyLaunderingBranchValue() {
        return antiMoneyLaunderingBranchValue;
    }

    /**
     * Sets the value of the antiMoneyLaunderingBranchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntiMoneyLaunderingBranchValue(Integer value) {
        this.antiMoneyLaunderingBranchValue = value;
    }

    /**
     * Gets the value of the antiMoneyLaunderingID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiMoneyLaunderingID() {
        return antiMoneyLaunderingID;
    }

    /**
     * Sets the value of the antiMoneyLaunderingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntiMoneyLaunderingID(Integer value) {
        this.antiMoneyLaunderingID = value;
    }

    /**
     * Gets the value of the antiMoneyLaunderingIDValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiMoneyLaunderingIDValue() {
        return antiMoneyLaunderingIDValue;
    }

    /**
     * Sets the value of the antiMoneyLaunderingIDValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntiMoneyLaunderingIDValue(Integer value) {
        this.antiMoneyLaunderingIDValue = value;
    }

    /**
     * Gets the value of the antiMoneyLaunderingInputDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAntiMoneyLaunderingInputDate() {
        return antiMoneyLaunderingInputDate;
    }

    /**
     * Sets the value of the antiMoneyLaunderingInputDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAntiMoneyLaunderingInputDate(XMLGregorianCalendar value) {
        this.antiMoneyLaunderingInputDate = value;
    }

    /**
     * Gets the value of the annualPremiumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualPremiumAmount() {
        return annualPremiumAmount;
    }

    /**
     * Sets the value of the annualPremiumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualPremiumAmount(BigDecimal value) {
        this.annualPremiumAmount = value;
    }

    /**
     * Gets the value of the annualPremiumAmountValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnnualPremiumAmountValue() {
        return annualPremiumAmountValue;
    }

    /**
     * Sets the value of the annualPremiumAmountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnnualPremiumAmountValue(Integer value) {
        this.annualPremiumAmountValue = value;
    }

    /**
     * Gets the value of the backendID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackendID() {
        return backendID;
    }

    /**
     * Sets the value of the backendID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackendID(Integer value) {
        this.backendID = value;
    }

    /**
     * Gets the value of the claimonList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaimonList() {
        return claimonList;
    }

    /**
     * Sets the value of the claimonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaimonList(JAXBElement<String> value) {
        this.claimonList = value;
    }

    /**
     * Gets the value of the coteExpertCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOTEExpertCode() {
        return coteExpertCode;
    }

    /**
     * Sets the value of the coteExpertCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOTEExpertCode(JAXBElement<String> value) {
        this.coteExpertCode = value;
    }

    /**
     * Gets the value of the coteExpertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCOTEExpertDate() {
        return coteExpertDate;
    }

    /**
     * Sets the value of the coteExpertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCOTEExpertDate(XMLGregorianCalendar value) {
        this.coteExpertDate = value;
    }

    /**
     * Gets the value of the deceasedIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeceasedIndex() {
        return deceasedIndex;
    }

    /**
     * Sets the value of the deceasedIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeceasedIndex(JAXBElement<String> value) {
        this.deceasedIndex = value;
    }

    /**
     * Gets the value of the endorsementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndorsementIndicator() {
        return endorsementIndicator;
    }

    /**
     * Sets the value of the endorsementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndorsementIndicator(JAXBElement<String> value) {
        this.endorsementIndicator = value;
    }

    /**
     * Gets the value of the entityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityCode() {
        return entityCode;
    }

    /**
     * Sets the value of the entityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityCode(JAXBElement<String> value) {
        this.entityCode = value;
    }

    /**
     * Gets the value of the fiscalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalCode() {
        return fiscalCode;
    }

    /**
     * Sets the value of the fiscalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalCode(JAXBElement<String> value) {
        this.fiscalCode = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDNumber(JAXBElement<String> value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the idNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDNumberID() {
        return idNumberID;
    }

    /**
     * Sets the value of the idNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDNumberID(Integer value) {
        this.idNumberID = value;
    }

    /**
     * Gets the value of the insuredActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsuredActivity() {
        return insuredActivity;
    }

    /**
     * Sets the value of the insuredActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsuredActivity(Integer value) {
        this.insuredActivity = value;
    }

    /**
     * Gets the value of the insuredActivityValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsuredActivityValue() {
        return insuredActivityValue;
    }

    /**
     * Sets the value of the insuredActivityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsuredActivityValue(Integer value) {
        this.insuredActivityValue = value;
    }

    /**
     * Gets the value of the insuredLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsuredLocation() {
        return insuredLocation;
    }

    /**
     * Sets the value of the insuredLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsuredLocation(Integer value) {
        this.insuredLocation = value;
    }

    /**
     * Gets the value of the insuredLocationValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsuredLocationValue() {
        return insuredLocationValue;
    }

    /**
     * Sets the value of the insuredLocationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsuredLocationValue(Integer value) {
        this.insuredLocationValue = value;
    }

    /**
     * Gets the value of the insuredNation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsuredNation() {
        return insuredNation;
    }

    /**
     * Sets the value of the insuredNation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsuredNation(Integer value) {
        this.insuredNation = value;
    }

    /**
     * Gets the value of the insuredNationValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsuredNationValue() {
        return insuredNationValue;
    }

    /**
     * Sets the value of the insuredNationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsuredNationValue(Integer value) {
        this.insuredNationValue = value;
    }

    /**
     * Gets the value of the mnPrefixID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNPrefixID() {
        return mnPrefixID;
    }

    /**
     * Sets the value of the mnPrefixID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNPrefixID(JAXBElement<String> value) {
        this.mnPrefixID = value;
    }

    /**
     * Gets the value of the nafCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAFCode() {
        return nafCode;
    }

    /**
     * Sets the value of the nafCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAFCode(JAXBElement<String> value) {
        this.nafCode = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOccupation(JAXBElement<String> value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the pastClaim property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPastClaim() {
        return pastClaim;
    }

    /**
     * Sets the value of the pastClaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPastClaim(JAXBElement<String> value) {
        this.pastClaim = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentMethod(Integer value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the paymentMethodValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentMethodValue() {
        return paymentMethodValue;
    }

    /**
     * Sets the value of the paymentMethodValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentMethodValue(Integer value) {
        this.paymentMethodValue = value;
    }

    /**
     * Gets the value of the pepid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPEPID() {
        return pepid;
    }

    /**
     * Sets the value of the pepid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPEPID(JAXBElement<String> value) {
        this.pepid = value;
    }

    /**
     * Gets the value of the pepidValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPEPIDValue() {
        return pepidValue;
    }

    /**
     * Sets the value of the pepidValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPEPIDValue(Integer value) {
        this.pepidValue = value;
    }

    /**
     * Gets the value of the pepIndicatorUpdatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPEPIndicatorUpdatedDate() {
        return pepIndicatorUpdatedDate;
    }

    /**
     * Sets the value of the pepIndicatorUpdatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPEPIndicatorUpdatedDate(XMLGregorianCalendar value) {
        this.pepIndicatorUpdatedDate = value;
    }

    /**
     * Gets the value of the policyLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyLocation() {
        return policyLocation;
    }

    /**
     * Sets the value of the policyLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyLocation(Integer value) {
        this.policyLocation = value;
    }

    /**
     * Gets the value of the policyLocationValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyLocationValue() {
        return policyLocationValue;
    }

    /**
     * Sets the value of the policyLocationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyLocationValue(Integer value) {
        this.policyLocationValue = value;
    }

    /**
     * Gets the value of the postCardSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostCardSent() {
        return postCardSent;
    }

    /**
     * Sets the value of the postCardSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostCardSent(JAXBElement<String> value) {
        this.postCardSent = value;
    }

    /**
     * Gets the value of the preferredCustomerAccidentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredCustomerAccidentIndicator() {
        return preferredCustomerAccidentIndicator;
    }

    /**
     * Sets the value of the preferredCustomerAccidentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredCustomerAccidentIndicator(JAXBElement<String> value) {
        this.preferredCustomerAccidentIndicator = value;
    }

    /**
     * Gets the value of the preferredCustomerHealthIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredCustomerHealthIndicator() {
        return preferredCustomerHealthIndicator;
    }

    /**
     * Sets the value of the preferredCustomerHealthIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredCustomerHealthIndicator(JAXBElement<String> value) {
        this.preferredCustomerHealthIndicator = value;
    }

    /**
     * Gets the value of the previousCOTECode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousCOTECode() {
        return previousCOTECode;
    }

    /**
     * Sets the value of the previousCOTECode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousCOTECode(JAXBElement<String> value) {
        this.previousCOTECode = value;
    }

    /**
     * Gets the value of the provinceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProvinceID() {
        return provinceID;
    }

    /**
     * Sets the value of the provinceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProvinceID(Integer value) {
        this.provinceID = value;
    }

    /**
     * Gets the value of the receiveInformationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiveInformationIndicator() {
        return receiveInformationIndicator;
    }

    /**
     * Sets the value of the receiveInformationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiveInformationIndicator(JAXBElement<String> value) {
        this.receiveInformationIndicator = value;
    }

    /**
     * Gets the value of the reportingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportingEntity() {
        return reportingEntity;
    }

    /**
     * Sets the value of the reportingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportingEntity(Integer value) {
        this.reportingEntity = value;
    }

    /**
     * Gets the value of the reportingEntityValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportingEntityValue() {
        return reportingEntityValue;
    }

    /**
     * Sets the value of the reportingEntityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportingEntityValue(Integer value) {
        this.reportingEntityValue = value;
    }

    /**
     * Gets the value of the riskCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskCategory() {
        return riskCategory;
    }

    /**
     * Sets the value of the riskCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskCategory(JAXBElement<String> value) {
        this.riskCategory = value;
    }

    /**
     * Gets the value of the salesForceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesForceID() {
        return salesForceID;
    }

    /**
     * Sets the value of the salesForceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesForceID(JAXBElement<String> value) {
        this.salesForceID = value;
    }

    /**
     * Gets the value of the showNameIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShowNameIndicator() {
        return showNameIndicator;
    }

    /**
     * Sets the value of the showNameIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShowNameIndicator(JAXBElement<String> value) {
        this.showNameIndicator = value;
    }

    /**
     * Gets the value of the siretCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiretCode() {
        return siretCode;
    }

    /**
     * Sets the value of the siretCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiretCode(JAXBElement<String> value) {
        this.siretCode = value;
    }

    /**
     * Gets the value of the specialCallInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialCallInstructions() {
        return specialCallInstructions;
    }

    /**
     * Sets the value of the specialCallInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialCallInstructions(JAXBElement<String> value) {
        this.specialCallInstructions = value;
    }

    /**
     * Gets the value of the terrorSuspect property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTerrorSuspect() {
        return terrorSuspect;
    }

    /**
     * Sets the value of the terrorSuspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTerrorSuspect(Integer value) {
        this.terrorSuspect = value;
    }

    /**
     * Gets the value of the terrorSuspectValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTerrorSuspectValue() {
        return terrorSuspectValue;
    }

    /**
     * Sets the value of the terrorSuspectValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTerrorSuspectValue(Integer value) {
        this.terrorSuspectValue = value;
    }

    /**
     * Gets the value of the vatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVATCode() {
        return vatCode;
    }

    /**
     * Sets the value of the vatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVATCode(JAXBElement<String> value) {
        this.vatCode = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebsite(JAXBElement<String> value) {
        this.website = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGUID(JAXBElement<String> value) {
        this.guid = value;
    }

    /**
     * Gets the value of the insuredCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuredCode() {
        return insuredCode;
    }

    /**
     * Sets the value of the insuredCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuredCode(JAXBElement<String> value) {
        this.insuredCode = value;
    }

    /**
     * Gets the value of the dunnsid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDUNNSID() {
        return dunnsid;
    }

    /**
     * Sets the value of the dunnsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDUNNSID(Integer value) {
        this.dunnsid = value;
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
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountName(JAXBElement<String> value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the insuredCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuredCountryCode() {
        return insuredCountryCode;
    }

    /**
     * Sets the value of the insuredCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuredCountryCode(JAXBElement<String> value) {
        this.insuredCountryCode = value;
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
     * Gets the value of the insuredID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsuredID() {
        return insuredID;
    }

    /**
     * Sets the value of the insuredID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsuredID(Integer value) {
        this.insuredID = value;
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
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMethod(Integer value) {
        this.method = value;
    }

    /**
     * Gets the value of the dateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAdded(XMLGregorianCalendar value) {
        this.dateAdded = value;
    }

    /**
     * Gets the value of the addedby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddedby() {
        return addedby;
    }

    /**
     * Sets the value of the addedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddedby(JAXBElement<String> value) {
        this.addedby = value;
    }

    /**
     * Gets the value of the complianceHolder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceHolder() {
        return complianceHolder;
    }

    /**
     * Sets the value of the complianceHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceHolder(JAXBElement<String> value) {
        this.complianceHolder = value;
    }

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
     * Gets the value of the entShortName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntShortName() {
        return entShortName;
    }

    /**
     * Sets the value of the entShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntShortName(JAXBElement<String> value) {
        this.entShortName = value;
    }

    /**
     * Gets the value of the policyHolder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyHolder() {
        return policyHolder;
    }

    /**
     * Sets the value of the policyHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyHolder(Integer value) {
        this.policyHolder = value;
    }

    /**
     * Gets the value of the dunniSRATINGID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDunniSRATINGID() {
        return dunniSRATINGID;
    }

    /**
     * Sets the value of the dunniSRATINGID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDunniSRATINGID(Integer value) {
        this.dunniSRATINGID = value;
    }

    /**
     * Gets the value of the taxID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxID() {
        return taxID;
    }

    /**
     * Sets the value of the taxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxID(Integer value) {
        this.taxID = value;
    }

    /**
     * Gets the value of the recordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordStatus() {
        return recordStatus;
    }

    /**
     * Sets the value of the recordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordStatus(Integer value) {
        this.recordStatus = value;
    }

    /**
     * Gets the value of the insuredNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuredNumber() {
        return insuredNumber;
    }

    /**
     * Sets the value of the insuredNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuredNumber(JAXBElement<String> value) {
        this.insuredNumber = value;
    }

    /**
     * Gets the value of the taxIDType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxIDType() {
        return taxIDType;
    }

    /**
     * Sets the value of the taxIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxIDType(JAXBElement<String> value) {
        this.taxIDType = value;
    }

    /**
     * Gets the value of the taxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxFlag() {
        return taxFlag;
    }

    /**
     * Sets the value of the taxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxFlag(JAXBElement<String> value) {
        this.taxFlag = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceName(JAXBElement<String> value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the provinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvinceCode() {
        return provinceCode;
    }

    /**
     * Sets the value of the provinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvinceCode(JAXBElement<String> value) {
        this.provinceCode = value;
    }

}
