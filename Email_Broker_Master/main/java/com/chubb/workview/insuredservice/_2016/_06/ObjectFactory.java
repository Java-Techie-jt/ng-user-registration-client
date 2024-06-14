
package com.chubb.workview.insuredservice._2016._06;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chubb.workview.preprocessors.generated.InsuredService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfMeridianExtractInsuredResponseDetail_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ArrayOfMeridianExtractInsuredResponseDetail");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfInsuredDetails_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredRequest");
    private final static QName _InsuredRelationResponse_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredRelationResponse");
    private final static QName _Request_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Request");
    private final static QName _CorrespondentDetails_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CorrespondentDetails");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Response_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Response");
    private final static QName _MeridianInsuredExtractResponseDetail_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "MeridianInsuredExtractResponseDetail");
    private final static QName _InsuredRelationDetails_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredRelationDetails");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfExtractInsuredResponseDetail_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ArrayOfExtractInsuredResponseDetail");
    private final static QName _YearlyPremiumResponse_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "YearlyPremiumResponse");
    private final static QName _GetInsuredResponseDetails_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "GetInsuredResponseDetails");
    private final static QName _ArrayOfGetInsuredDetail_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ArrayOfGetInsuredDetail");
    private final static QName _GetInsuredDetail_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "GetInsuredDetail");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfMeridianInsuredExtractResponseDetail_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ArrayOfMeridianInsuredExtractResponseDetail");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _InsuredInfoRequest_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredInfoRequest");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _MeridianInsuredExtractResponse_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "MeridianInsuredExtractResponse");
    private final static QName _ExtractInsuredResponse_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ExtractInsuredResponse");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _InsuredResponse_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredResponse");
    private final static QName _YearlyPremiumDetails_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "YearlyPremiumDetails");
    private final static QName _MeridianExtractInsuredResponseDetail_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "MeridianExtractInsuredResponseDetail");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _GetInsuredRequest_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "GetInsuredRequest");
    private final static QName _InsuredRelationRequest_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredRelationRequest");
    private final static QName _MeridianExtractInsuredResponse_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "MeridianExtractInsuredResponse");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _ExtractInsuredRequest_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ExtractInsuredRequest");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _InsuredDetails_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredDetails");
    private final static QName _ArrayOfInsuredResponse_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ArrayOfInsuredResponse");
    private final static QName _ExtractInsuredResponseDetail_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ExtractInsuredResponseDetail");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfInsuredRelationDetails_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ArrayOfInsuredRelationDetails");
    private final static QName _InsuredRelationInfo_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredRelationInfo");
    private final static QName _EnvironmentData_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "EnvironmentData");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfInsuredRelationInfo_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ArrayOfInsuredRelationInfo");
    private final static QName _YearlyPremiumRequest_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "YearlyPremiumRequest");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ArrayOfYearlyPremiumDetails_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ArrayOfYearlyPremiumDetails");
    private final static QName _ArrayOfYearlyPremiumInfo_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ArrayOfYearlyPremiumInfo");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _YearlyPremiumInfo_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "YearlyPremiumInfo");
    private final static QName _RequestInsuredRequest_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredDetails");
    private final static QName _CreateOrUpdateInsuredRequest_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "request");
    private final static QName _YearlyPremiumDetailsEntity_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Entity");
    private final static QName _YearlyPremiumDetailsPositiveX002FNegativeAmount_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Positive_x002F_NegativeAmount");
    private final static QName _YearlyPremiumDetailsInsuredNumber_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredNumber");
    private final static QName _YearlyPremiumResponseYearlyPremium_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "YearlyPremium");
    private final static QName _YearlyPremiumResponseOverAllResult_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "OverAllResult");
    private final static QName _InsuredRelationRequestInsuredRelation_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredRelation");
    private final static QName _GetInsuredResponseGetInsuredResult_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "GetInsuredResult");
    private final static QName _CreateOrUpdateInsuredRelationInsuredRelationRequest_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "insuredRelationRequest");
    private final static QName _CreateOrUpdateInsuredResponseCreateOrUpdateInsuredResult_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CreateOrUpdateInsuredResult");
    private final static QName _ResponseOverallResult_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "OverallResult");
    private final static QName _MeridianInsuredExtractResponseDetailDUNBRADSTREETNUMBER_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "DUNBRADSTREETNUMBER");
    private final static QName _MeridianInsuredExtractResponseDetailPOLICYHOLDERSTREET2_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "POLICYHOLDERSTREET2");
    private final static QName _MeridianInsuredExtractResponseDetailRECORDTYPEV21_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "RECORDTYPEV21");
    private final static QName _MeridianInsuredExtractResponseDetailPOLICYHOLDERSTREET1_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "POLICYHOLDERSTREET1");
    private final static QName _MeridianInsuredExtractResponseDetailBANKACCOUNTNUMBER_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "BANKACCOUNTNUMBER");
    private final static QName _MeridianInsuredExtractResponseDetailPOLICYHOLDERCITY_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "POLICYHOLDERCITY");
    private final static QName _MeridianInsuredExtractResponseDetailPOLICYHOLDERCODE_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "POLICYHOLDERCODE");
    private final static QName _MeridianInsuredExtractResponseDetailLETTERSEQUENCE_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "LETTERSEQUENCE");
    private final static QName _MeridianInsuredExtractResponseDetailTITLECODE_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "TITLECODE");
    private final static QName _MeridianInsuredExtractResponseDetailACTIONCODE_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ACTIONCODE");
    private final static QName _MeridianInsuredExtractResponseDetailUFIL3_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "UFIL3");
    private final static QName _MeridianInsuredExtractResponseDetailUFIL2_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "UFIL2");
    private final static QName _MeridianInsuredExtractResponseDetailUFIL1_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "UFIL1");
    private final static QName _MeridianInsuredExtractResponseDetailPOLICYHOLDERSALPHACODE_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "POLICYHOLDERSALPHACODE");
    private final static QName _MeridianInsuredExtractResponseDetailDUNBRADSTREETRATING_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "DUNBRADSTREETRATING");
    private final static QName _MeridianInsuredExtractResponseDetailPOLICYHOLDERNAME_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "POLICYHOLDERNAME");
    private final static QName _MeridianInsuredExtractResponseDetailPOLICYHOLDERCOUNTRY_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "POLICYHOLDERCOUNTRY");
    private final static QName _MeridianInsuredExtractResponseDetailMULTINATIONALCODE_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "MULTINATIONALCODE");
    private final static QName _MeridianInsuredExtractResponseDetailBLOCKINGINDICATOR_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "BLOCKINGINDICATOR");
    private final static QName _MeridianInsuredExtractResponseDetailTRANSACTIONEVENTTAG_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "TRANSACTIONEVENTTAG");
    private final static QName _MeridianInsuredExtractResponseDetailENDOFRECORDMARKER_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ENDOFRECORDMARKER");
    private final static QName _MeridianInsuredExtractResponseDetailEMPLOYEENUMBER_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "EMPLOYEENUMBER");
    private final static QName _MeridianInsuredExtractResponseDetailUFIL5_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "UFIL5");
    private final static QName _MeridianInsuredExtractResponseDetailUFIL4_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "UFIL4");
    private final static QName _MeridianInsuredExtractResponseDetailBUSINESSENTITY_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "BUSINESSENTITY");
    private final static QName _MeridianInsuredExtractResponseDetailMULTINATIONALPREFIX_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "MULTINATIONALPREFIX");
    private final static QName _MeridianInsuredExtractResponseDetailTAXCODE_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "TAXCODE");
    private final static QName _MeridianInsuredExtractResponseDetailPOLICYHOLDERPOLITICALSUBDIVISION_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "POLICYHOLDERPOLITICALSUBDIVISION");
    private final static QName _MeridianInsuredExtractResponseDetailPOLICYHOLDERZIPCODE_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "POLICYHOLDERZIPCODE");
    private final static QName _MeridianInsuredExtractResponseDetailBANKROUTINGNUMBER_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "BANKROUTINGNUMBER");
    private final static QName _MeridianInsuredExtractResponseDetailLASTDATEOFCHANGE_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "LASTDATEOFCHANGE");
    private final static QName _ExtractInsuredResponseDetailFiscalCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "FiscalCode");
    private final static QName _ExtractInsuredResponseDetailRiskCategory_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "RiskCategory");
    private final static QName _ExtractInsuredResponseDetailInsuredCountryCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredCountryCode");
    private final static QName _ExtractInsuredResponseDetailCurrentRate_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CurrentRate");
    private final static QName _ExtractInsuredResponseDetailInsuredName_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredName");
    private final static QName _ExtractInsuredResponseDetailPreviousRate_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PreviousRate");
    private final static QName _ExtractInsuredResponseDetailAddress3_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Address3");
    private final static QName _ExtractInsuredResponseDetailAddress2_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Address2");
    private final static QName _ExtractInsuredResponseDetailInsuredID_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredID");
    private final static QName _ExtractInsuredResponseDetailAddressCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "AddressCode");
    private final static QName _ExtractInsuredResponseDetailAddress1_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Address1");
    private final static QName _ExtractInsuredResponseDetailCity_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "City");
    private final static QName _ExtractInsuredResponseDetailNAFCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "NAFCode");
    private final static QName _ExtractInsuredResponseDetailNameType_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "NameType");
    private final static QName _ExtractInsuredResponseDetailVATCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "VATCode");
    private final static QName _ExtractInsuredResponseDetailNANANM_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "NANANM");
    private final static QName _ExtractInsuredResponseDetailAddress5_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Address5");
    private final static QName _ExtractInsuredResponseDetailEffectiveRate_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "EffectiveRate");
    private final static QName _ExtractInsuredResponseDetailMNPrefixID_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "MNPrefixID");
    private final static QName _ExtractInsuredResponseDetailPostCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PostCode");
    private final static QName _ExtractInsuredResponseDetailName2_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Name2");
    private final static QName _ExtractInsuredResponseDetailName1_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Name1");
    private final static QName _ExtractInsuredResponseDetailInsuredFlag_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredFlag");
    private final static QName _ExtractInsuredResponseDetailInsuredCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredCode");
    private final static QName _CorrespondentDetailsPosition_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Position");
    private final static QName _CorrespondentDetailsTitle_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Title");
    private final static QName _CorrespondentDetailsMobileNumber2_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "MobileNumber2");
    private final static QName _CorrespondentDetailsMobileNumber1_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "MobileNumber1");
    private final static QName _CorrespondentDetailsUnderWriterReference_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "UnderWriterReference");
    private final static QName _CorrespondentDetailsContactMethodType_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ContactMethodType");
    private final static QName _CorrespondentDetailsTitleDescription_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "TitleDescription");
    private final static QName _CorrespondentDetailsSurname_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Surname");
    private final static QName _CorrespondentDetailsContactName_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ContactName");
    private final static QName _CorrespondentDetailsOtherContactNumber_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "OtherContactNumber");
    private final static QName _CorrespondentDetailsBirthDate_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "BirthDate");
    private final static QName _CorrespondentDetailsCountry_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Country");
    private final static QName _CorrespondentDetailsWorkNumber_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "WorkNumber");
    private final static QName _CorrespondentDetailsCorrespondentName_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CorrespondentName");
    private final static QName _CorrespondentDetailsCorrespondentCompany_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CorrespondentCompany");
    private final static QName _CorrespondentDetailsEmailID_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "EmailID");
    private final static QName _CorrespondentDetailsCorrespondentNumber_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CorrespondentNumber");
    private final static QName _CorrespondentDetailsClaimReference_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ClaimReference");
    private final static QName _CorrespondentDetailsBuildingFloor_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "BuildingFloor");
    private final static QName _CorrespondentDetailsCounty_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "County");
    private final static QName _CorrespondentDetailsTelephoneNumber_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "TelephoneNumber");
    private final static QName _CorrespondentDetailsTownCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "TownCode");
    private final static QName _CorrespondentDetailsFaxNumber_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "FaxNumber");
    private final static QName _CorrespondentDetailsForename_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Forename");
    private final static QName _CorrespondentDetailsMiddlename_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Middlename");
    private final static QName _GetInsuredBatchResponseGetInsuredBatchResult_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "GetInsuredBatchResult");
    private final static QName _InsuredRelationDetailsPolicyHolderCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PolicyHolderCode");
    private final static QName _InsuredRelationDetailsPolicyHolderPrimaryCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PolicyHolderPrimaryCode");
    private final static QName _GetInsuredDetailPolicyNumber_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PolicyNumber");
    private final static QName _GetInsuredDetailSanctionStatus_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "SanctionStatus");
    private final static QName _GetInsuredDetailGeniusNameCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "GeniusNameCode");
    private final static QName _GetInsuredDetailMultinationalAgreement_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "multinationalAgreement");
    private final static QName _GetInsuredDetailTypeofMovement_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "TypeofMovement");
    private final static QName _GetInsuredDetailNationality_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Nationality");
    private final static QName _GetInsuredDetailBankOfficeBranch_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "BankOfficeBranch");
    private final static QName _GetInsuredDetailTaxIDType_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "TaxIDType");
    private final static QName _GetInsuredDetailCodeIIBB_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CodeIIBB");
    private final static QName _GetInsuredDetailSourceSystem_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "SourceSystem");
    private final static QName _GetInsuredDetailInscriptionNumber_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InscriptionNumber");
    private final static QName _GetInsuredDetailLocation_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Location");
    private final static QName _GetInsuredDetailProvinceCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ProvinceCode");
    private final static QName _GetInsuredDetailCountryName_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CountryName");
    private final static QName _GetInsuredDetailUser_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "User");
    private final static QName _GetInsuredDetailFutureUse4_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "FutureUse4");
    private final static QName _GetInsuredDetailFutureUse5_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "FutureUse5");
    private final static QName _GetInsuredDetailFNMN_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "FNMN");
    private final static QName _GetInsuredDetailDischargeCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "DischargeCode");
    private final static QName _GetInsuredDetailCorrespondentResultList_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CorrespondentResultList");
    private final static QName _GetInsuredDetailFutureUse1_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "FutureUse1");
    private final static QName _GetInsuredDetailFutureUse2_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "FutureUse2");
    private final static QName _GetInsuredDetailForeignFlag_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ForeignFlag");
    private final static QName _GetInsuredDetailFutureUse3_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "FutureUse3");
    private final static QName _GetInsuredDetailGrossIncome_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "GrossIncome");
    private final static QName _GetInsuredDetailCertificateNumber_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CertificateNumber");
    private final static QName _GetInsuredDetailInsuredCodeType_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "InsuredCodeType");
    private final static QName _GetInsuredDetailEmailAddress_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "EmailAddress");
    private final static QName _GetInsuredDetailDunsNumber_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "DunsNumber");
    private final static QName _GetInsuredDetailTaxID_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "TaxID");
    private final static QName _GetInsuredDetailDNBRating_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "DNBRating");
    private final static QName _GetInsuredDetailEnvironment_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Environment");
    private final static QName _GetInsuredDetailConsortium_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Consortium");
    private final static QName _GetInsuredDetailPaymentPlan_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PaymentPlan");
    private final static QName _GetInsuredDetailTaxPaymentPosition_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "TaxPaymentPosition");
    private final static QName _GetInsuredDetailRequestID_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "RequestID");
    private final static QName _GetInsuredDetailSuburb_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Suburb");
    private final static QName _GetInsuredDetailAddress_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Address");
    private final static QName _GetInsuredDetailClaimDescription_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ClaimDescription");
    private final static QName _GetInsuredDetailTaxesExempt_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "TaxesExempt");
    private final static QName _GetInsuredDetailCountryID_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CountryID");
    private final static QName _GetInsuredDetailCountyCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CountyCode");
    private final static QName _GetInsuredDetailEmail_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Email");
    private final static QName _GetInsuredDetailCompany_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Company");
    private final static QName _GetInsuredDetailRemotePoint_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "RemotePoint");
    private final static QName _GetInsuredDetailNumberIIBBFlag_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "NumberIIBBFlag");
    private final static QName _GetInsuredDetailName_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Name");
    private final static QName _GetInsuredDetailPaymentPlanTerm_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PaymentPlanTerm");
    private final static QName _GetInsuredDetailFullName1_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "FullName1");
    private final static QName _GetInsuredDetailFullName2_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "FullName2");
    private final static QName _GetInsuredDetailCreditCardNumberLast4_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CreditCardNumberLast4");
    private final static QName _InsuredInfoRequestPreferredCustomerAccidentIndicator_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PreferredCustomerAccidentIndicator");
    private final static QName _InsuredInfoRequestEntShortName_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "EntShortName");
    private final static QName _InsuredInfoRequestComplianceHolder_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ComplianceHolder");
    private final static QName _InsuredInfoRequestPostCardSent_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PostCardSent");
    private final static QName _InsuredInfoRequestPreferredCustomerHealthIndicator_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PreferredCustomerHealthIndicator");
    private final static QName _InsuredInfoRequestAceOnlineReference_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "AceOnlineReference");
    private final static QName _InsuredInfoRequestGUID_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "GUID");
    private final static QName _InsuredInfoRequestEntityCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "EntityCode");
    private final static QName _InsuredInfoRequestServiceName_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ServiceName");
    private final static QName _InsuredInfoRequestOccupation_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Occupation");
    private final static QName _InsuredInfoRequestSpecialCallInstructions_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "SpecialCallInstructions");
    private final static QName _InsuredInfoRequestAddedby_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Addedby");
    private final static QName _InsuredInfoRequestAccountName_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "AccountName");
    private final static QName _InsuredInfoRequestReceiveInformationIndicator_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ReceiveInformationIndicator");
    private final static QName _InsuredInfoRequestClaimonList_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ClaimonList");
    private final static QName _InsuredInfoRequestPreviousCOTECode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PreviousCOTECode");
    private final static QName _InsuredInfoRequestEndorsementIndicator_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "EndorsementIndicator");
    private final static QName _InsuredInfoRequestSalesForceID_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "SalesForceID");
    private final static QName _InsuredInfoRequestIsMigrated_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "IsMigrated");
    private final static QName _InsuredInfoRequestShowNameIndicator_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ShowNameIndicator");
    private final static QName _InsuredInfoRequestWebsite_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Website");
    private final static QName _InsuredInfoRequestDeceasedIndex_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "DeceasedIndex");
    private final static QName _InsuredInfoRequestAntiMoneyLaunderingBranch_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "AntiMoneyLaunderingBranch");
    private final static QName _InsuredInfoRequestSiretCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "SiretCode");
    private final static QName _InsuredInfoRequestPEPID_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PEPID");
    private final static QName _InsuredInfoRequestPastClaim_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "PastClaim");
    private final static QName _InsuredInfoRequestIDNumber_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "IDNumber");
    private final static QName _InsuredInfoRequestCOTEExpertCode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "COTEExpertCode");
    private final static QName _InsuredInfoRequestTaxFlag_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "TaxFlag");
    private final static QName _GetMeridianExtractInsuredResponseGetMeridianExtractInsuredResult_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "GetMeridianExtractInsuredResult");
    private final static QName _GetInsuredResponseDetailsGetInsuredDetails_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "GetInsuredDetails");
    private final static QName _MeridianExtractInsuredResponseDetailCOTEExpertDate_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "COTEExpertDate");
    private final static QName _MeridianExtractInsuredResponseDetailPolicyholdercode_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Policyholdercode");
    private final static QName _YearlyPremiumInfoDescription_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Description");
    private final static QName _YearlyPremiumInfoResult_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Result");
    private final static QName _GetMeridianExtractInsuredExtractRequest_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "extractRequest");
    private final static QName _UpdateYearlyPremiumYearlyPremiumRequest_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "yearlyPremiumRequest");
    private final static QName _CreateOrUpdateInsuredRelationResponseCreateOrUpdateInsuredRelationResult_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "CreateOrUpdateInsuredRelationResult");
    private final static QName _UpdateYearlyPremiumResponseUpdateYearlyPremiumResult_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "UpdateYearlyPremiumResult");
    private final static QName _GetInsuredMeridianBatchResponseGetInsuredMeridianBatchResult_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "GetInsuredMeridianBatchResult");
    private final static QName _GetInsuredRequestTelephone_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Telephone");
    private final static QName _GetInsuredRequestFloor_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Floor");
    private final static QName _GetInsuredRequestResultOrder_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "ResultOrder");
    private final static QName _GetInsuredRequestMNPrefixId_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "MNPrefixId");
    private final static QName _GetInsuredRequestFAX_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "FAX");
    private final static QName _GetInsuredRequestEnvironmentdata_QNAME = new QName("http://Chubb.com/WorkView/InsuredService/2016/06", "Environmentdata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chubb.workview.preprocessors.generated.InsuredService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsuredDetails }
     * 
     */
    public InsuredDetails createInsuredDetails() {
        return new InsuredDetails();
    }

    /**
     * Create an instance of {@link ArrayOfInsuredResponse }
     * 
     */
    public ArrayOfInsuredResponse createArrayOfInsuredResponse() {
        return new ArrayOfInsuredResponse();
    }

    /**
     * Create an instance of {@link ExtractInsuredResponseDetail }
     * 
     */
    public ExtractInsuredResponseDetail createExtractInsuredResponseDetail() {
        return new ExtractInsuredResponseDetail();
    }

    /**
     * Create an instance of {@link ExtractInsuredRequest }
     * 
     */
    public ExtractInsuredRequest createExtractInsuredRequest() {
        return new ExtractInsuredRequest();
    }

    /**
     * Create an instance of {@link ArrayOfInsuredRelationDetails }
     * 
     */
    public ArrayOfInsuredRelationDetails createArrayOfInsuredRelationDetails() {
        return new ArrayOfInsuredRelationDetails();
    }

    /**
     * Create an instance of {@link EnvironmentData }
     * 
     */
    public EnvironmentData createEnvironmentData() {
        return new EnvironmentData();
    }

    /**
     * Create an instance of {@link InsuredRelationInfo }
     * 
     */
    public InsuredRelationInfo createInsuredRelationInfo() {
        return new InsuredRelationInfo();
    }

    /**
     * Create an instance of {@link YearlyPremiumRequest }
     * 
     */
    public YearlyPremiumRequest createYearlyPremiumRequest() {
        return new YearlyPremiumRequest();
    }

    /**
     * Create an instance of {@link ArrayOfInsuredRelationInfo }
     * 
     */
    public ArrayOfInsuredRelationInfo createArrayOfInsuredRelationInfo() {
        return new ArrayOfInsuredRelationInfo();
    }

    /**
     * Create an instance of {@link YearlyPremiumInfo }
     * 
     */
    public YearlyPremiumInfo createYearlyPremiumInfo() {
        return new YearlyPremiumInfo();
    }

    /**
     * Create an instance of {@link GetInsuredMod }
     * 
     */
    public GetInsuredMod createGetInsuredMod() {
        return new GetInsuredMod();
    }

    /**
     * Create an instance of {@link ArrayOfYearlyPremiumDetails }
     * 
     */
    public ArrayOfYearlyPremiumDetails createArrayOfYearlyPremiumDetails() {
        return new ArrayOfYearlyPremiumDetails();
    }

    /**
     * Create an instance of {@link ArrayOfYearlyPremiumInfo }
     * 
     */
    public ArrayOfYearlyPremiumInfo createArrayOfYearlyPremiumInfo() {
        return new ArrayOfYearlyPremiumInfo();
    }

    /**
     * Create an instance of {@link ExtractInsuredResponse }
     * 
     */
    public ExtractInsuredResponse createExtractInsuredResponse() {
        return new ExtractInsuredResponse();
    }

    /**
     * Create an instance of {@link InsuredResponse }
     * 
     */
    public InsuredResponse createInsuredResponse() {
        return new InsuredResponse();
    }

    /**
     * Create an instance of {@link InsuredInfoRequest }
     * 
     */
    public InsuredInfoRequest createInsuredInfoRequest() {
        return new InsuredInfoRequest();
    }

    /**
     * Create an instance of {@link MeridianInsuredExtractResponse }
     * 
     */
    public MeridianInsuredExtractResponse createMeridianInsuredExtractResponse() {
        return new MeridianInsuredExtractResponse();
    }

    /**
     * Create an instance of {@link GetInsuredBatchResponse }
     * 
     */
    public GetInsuredBatchResponse createGetInsuredBatchResponse() {
        return new GetInsuredBatchResponse();
    }

    /**
     * Create an instance of {@link YearlyPremiumDetails }
     * 
     */
    public YearlyPremiumDetails createYearlyPremiumDetails() {
        return new YearlyPremiumDetails();
    }

    /**
     * Create an instance of {@link MeridianExtractInsuredResponseDetail }
     * 
     */
    public MeridianExtractInsuredResponseDetail createMeridianExtractInsuredResponseDetail() {
        return new MeridianExtractInsuredResponseDetail();
    }

    /**
     * Create an instance of {@link GetInsuredResponse }
     * 
     */
    public GetInsuredResponse createGetInsuredResponse() {
        return new GetInsuredResponse();
    }

    /**
     * Create an instance of {@link GetInsuredResponseDetails }
     * 
     */
    public GetInsuredResponseDetails createGetInsuredResponseDetails() {
        return new GetInsuredResponseDetails();
    }

    /**
     * Create an instance of {@link CreateOrUpdateInsuredRelationResponse }
     * 
     */
    public CreateOrUpdateInsuredRelationResponse createCreateOrUpdateInsuredRelationResponse() {
        return new CreateOrUpdateInsuredRelationResponse();
    }

    /**
     * Create an instance of {@link InsuredRelationResponse }
     * 
     */
    public InsuredRelationResponse createInsuredRelationResponse() {
        return new InsuredRelationResponse();
    }

    /**
     * Create an instance of {@link CreateOrUpdateInsured }
     * 
     */
    public CreateOrUpdateInsured createCreateOrUpdateInsured() {
        return new CreateOrUpdateInsured();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link MeridianExtractInsuredResponse }
     * 
     */
    public MeridianExtractInsuredResponse createMeridianExtractInsuredResponse() {
        return new MeridianExtractInsuredResponse();
    }

    /**
     * Create an instance of {@link GetInsuredBatch }
     * 
     */
    public GetInsuredBatch createGetInsuredBatch() {
        return new GetInsuredBatch();
    }

    /**
     * Create an instance of {@link InsuredRelationRequest }
     * 
     */
    public InsuredRelationRequest createInsuredRelationRequest() {
        return new InsuredRelationRequest();
    }

    /**
     * Create an instance of {@link GetInsuredRequest }
     * 
     */
    public GetInsuredRequest createGetInsuredRequest() {
        return new GetInsuredRequest();
    }

    /**
     * Create an instance of {@link CreateOrUpdateInsuredResponse }
     * 
     */
    public CreateOrUpdateInsuredResponse createCreateOrUpdateInsuredResponse() {
        return new CreateOrUpdateInsuredResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link GetMeridianExtractInsuredResponse }
     * 
     */
    public GetMeridianExtractInsuredResponse createGetMeridianExtractInsuredResponse() {
        return new GetMeridianExtractInsuredResponse();
    }

    /**
     * Create an instance of {@link YearlyPremiumResponse }
     * 
     */
    public YearlyPremiumResponse createYearlyPremiumResponse() {
        return new YearlyPremiumResponse();
    }

    /**
     * Create an instance of {@link ArrayOfExtractInsuredResponseDetail }
     * 
     */
    public ArrayOfExtractInsuredResponseDetail createArrayOfExtractInsuredResponseDetail() {
        return new ArrayOfExtractInsuredResponseDetail();
    }

    /**
     * Create an instance of {@link GetInsuredMeridianBatch }
     * 
     */
    public GetInsuredMeridianBatch createGetInsuredMeridianBatch() {
        return new GetInsuredMeridianBatch();
    }

    /**
     * Create an instance of {@link GetInsuredMeridianBatchResponse }
     * 
     */
    public GetInsuredMeridianBatchResponse createGetInsuredMeridianBatchResponse() {
        return new GetInsuredMeridianBatchResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGetInsuredDetail }
     * 
     */
    public ArrayOfGetInsuredDetail createArrayOfGetInsuredDetail() {
        return new ArrayOfGetInsuredDetail();
    }

    /**
     * Create an instance of {@link GetInsuredDetail }
     * 
     */
    public GetInsuredDetail createGetInsuredDetail() {
        return new GetInsuredDetail();
    }

    /**
     * Create an instance of {@link ArrayOfMeridianInsuredExtractResponseDetail }
     * 
     */
    public ArrayOfMeridianInsuredExtractResponseDetail createArrayOfMeridianInsuredExtractResponseDetail() {
        return new ArrayOfMeridianInsuredExtractResponseDetail();
    }

    /**
     * Create an instance of {@link GetMeridianExtractInsured }
     * 
     */
    public GetMeridianExtractInsured createGetMeridianExtractInsured() {
        return new GetMeridianExtractInsured();
    }

    /**
     * Create an instance of {@link InsuredRequest }
     * 
     */
    public InsuredRequest createArrayOfInsuredDetails() {
        return new InsuredRequest();
    }

    /**
     * Create an instance of {@link ArrayOfMeridianExtractInsuredResponseDetail }
     * 
     */
    public ArrayOfMeridianExtractInsuredResponseDetail createArrayOfMeridianExtractInsuredResponseDetail() {
        return new ArrayOfMeridianExtractInsuredResponseDetail();
    }

    /**
     * Create an instance of {@link UpdateYearlyPremiumResponse }
     * 
     */
    public UpdateYearlyPremiumResponse createUpdateYearlyPremiumResponse() {
        return new UpdateYearlyPremiumResponse();
    }

    /**
     * Create an instance of {@link CorrespondentDetails }
     * 
     */
    public CorrespondentDetails createCorrespondentDetails() {
        return new CorrespondentDetails();
    }

    /**
     * Create an instance of {@link CreateOrUpdateInsuredRelation }
     * 
     */
    public CreateOrUpdateInsuredRelation createCreateOrUpdateInsuredRelation() {
        return new CreateOrUpdateInsuredRelation();
    }

    /**
     * Create an instance of {@link MeridianInsuredExtractResponseDetail }
     * 
     */
    public MeridianInsuredExtractResponseDetail createMeridianInsuredExtractResponseDetail() {
        return new MeridianInsuredExtractResponseDetail();
    }

    /**
     * Create an instance of {@link InsuredRelationDetails }
     * 
     */
    public InsuredRelationDetails createInsuredRelationDetails() {
        return new InsuredRelationDetails();
    }

    /**
     * Create an instance of {@link UpdateYearlyPremium }
     * 
     */
    public UpdateYearlyPremium createUpdateYearlyPremium() {
        return new UpdateYearlyPremium();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeridianExtractInsuredResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ArrayOfMeridianExtractInsuredResponseDetail")
    public JAXBElement<ArrayOfMeridianExtractInsuredResponseDetail> createArrayOfMeridianExtractInsuredResponseDetail(ArrayOfMeridianExtractInsuredResponseDetail value) {
        return new JAXBElement<ArrayOfMeridianExtractInsuredResponseDetail>(_ArrayOfMeridianExtractInsuredResponseDetail_QNAME, ArrayOfMeridianExtractInsuredResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuredRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredRequest")
    public JAXBElement<InsuredRequest> createArrayOfInsuredDetails(InsuredRequest value) {
        return new JAXBElement<InsuredRequest>(_ArrayOfInsuredDetails_QNAME, InsuredRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuredRelationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredRelationResponse")
    public JAXBElement<InsuredRelationResponse> createInsuredRelationResponse(InsuredRelationResponse value) {
        return new JAXBElement<InsuredRelationResponse>(_InsuredRelationResponse_QNAME, InsuredRelationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CorrespondentDetails")
    public JAXBElement<CorrespondentDetails> createCorrespondentDetails(CorrespondentDetails value) {
        return new JAXBElement<CorrespondentDetails>(_CorrespondentDetails_QNAME, CorrespondentDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeridianInsuredExtractResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MeridianInsuredExtractResponseDetail")
    public JAXBElement<MeridianInsuredExtractResponseDetail> createMeridianInsuredExtractResponseDetail(MeridianInsuredExtractResponseDetail value) {
        return new JAXBElement<MeridianInsuredExtractResponseDetail>(_MeridianInsuredExtractResponseDetail_QNAME, MeridianInsuredExtractResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuredRelationDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredRelationDetails")
    public JAXBElement<InsuredRelationDetails> createInsuredRelationDetails(InsuredRelationDetails value) {
        return new JAXBElement<InsuredRelationDetails>(_InsuredRelationDetails_QNAME, InsuredRelationDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtractInsuredResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ArrayOfExtractInsuredResponseDetail")
    public JAXBElement<ArrayOfExtractInsuredResponseDetail> createArrayOfExtractInsuredResponseDetail(ArrayOfExtractInsuredResponseDetail value) {
        return new JAXBElement<ArrayOfExtractInsuredResponseDetail>(_ArrayOfExtractInsuredResponseDetail_QNAME, ArrayOfExtractInsuredResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearlyPremiumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "YearlyPremiumResponse")
    public JAXBElement<YearlyPremiumResponse> createYearlyPremiumResponse(YearlyPremiumResponse value) {
        return new JAXBElement<YearlyPremiumResponse>(_YearlyPremiumResponse_QNAME, YearlyPremiumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInsuredResponseDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "GetInsuredResponseDetails")
    public JAXBElement<GetInsuredResponseDetails> createGetInsuredResponseDetails(GetInsuredResponseDetails value) {
        return new JAXBElement<GetInsuredResponseDetails>(_GetInsuredResponseDetails_QNAME, GetInsuredResponseDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetInsuredDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ArrayOfGetInsuredDetail")
    public JAXBElement<ArrayOfGetInsuredDetail> createArrayOfGetInsuredDetail(ArrayOfGetInsuredDetail value) {
        return new JAXBElement<ArrayOfGetInsuredDetail>(_ArrayOfGetInsuredDetail_QNAME, ArrayOfGetInsuredDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInsuredDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "GetInsuredDetail")
    public JAXBElement<GetInsuredDetail> createGetInsuredDetail(GetInsuredDetail value) {
        return new JAXBElement<GetInsuredDetail>(_GetInsuredDetail_QNAME, GetInsuredDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeridianInsuredExtractResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ArrayOfMeridianInsuredExtractResponseDetail")
    public JAXBElement<ArrayOfMeridianInsuredExtractResponseDetail> createArrayOfMeridianInsuredExtractResponseDetail(ArrayOfMeridianInsuredExtractResponseDetail value) {
        return new JAXBElement<ArrayOfMeridianInsuredExtractResponseDetail>(_ArrayOfMeridianInsuredExtractResponseDetail_QNAME, ArrayOfMeridianInsuredExtractResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuredInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredInfoRequest")
    public JAXBElement<InsuredInfoRequest> createInsuredInfoRequest(InsuredInfoRequest value) {
        return new JAXBElement<InsuredInfoRequest>(_InsuredInfoRequest_QNAME, InsuredInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeridianInsuredExtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MeridianInsuredExtractResponse")
    public JAXBElement<MeridianInsuredExtractResponse> createMeridianInsuredExtractResponse(MeridianInsuredExtractResponse value) {
        return new JAXBElement<MeridianInsuredExtractResponse>(_MeridianInsuredExtractResponse_QNAME, MeridianInsuredExtractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtractInsuredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ExtractInsuredResponse")
    public JAXBElement<ExtractInsuredResponse> createExtractInsuredResponse(ExtractInsuredResponse value) {
        return new JAXBElement<ExtractInsuredResponse>(_ExtractInsuredResponse_QNAME, ExtractInsuredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredResponse")
    public JAXBElement<InsuredResponse> createInsuredResponse(InsuredResponse value) {
        return new JAXBElement<InsuredResponse>(_InsuredResponse_QNAME, InsuredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearlyPremiumDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "YearlyPremiumDetails")
    public JAXBElement<YearlyPremiumDetails> createYearlyPremiumDetails(YearlyPremiumDetails value) {
        return new JAXBElement<YearlyPremiumDetails>(_YearlyPremiumDetails_QNAME, YearlyPremiumDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeridianExtractInsuredResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MeridianExtractInsuredResponseDetail")
    public JAXBElement<MeridianExtractInsuredResponseDetail> createMeridianExtractInsuredResponseDetail(MeridianExtractInsuredResponseDetail value) {
        return new JAXBElement<MeridianExtractInsuredResponseDetail>(_MeridianExtractInsuredResponseDetail_QNAME, MeridianExtractInsuredResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInsuredRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "GetInsuredRequest")
    public JAXBElement<GetInsuredRequest> createGetInsuredRequest(GetInsuredRequest value) {
        return new JAXBElement<GetInsuredRequest>(_GetInsuredRequest_QNAME, GetInsuredRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuredRelationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredRelationRequest")
    public JAXBElement<InsuredRelationRequest> createInsuredRelationRequest(InsuredRelationRequest value) {
        return new JAXBElement<InsuredRelationRequest>(_InsuredRelationRequest_QNAME, InsuredRelationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeridianExtractInsuredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MeridianExtractInsuredResponse")
    public JAXBElement<MeridianExtractInsuredResponse> createMeridianExtractInsuredResponse(MeridianExtractInsuredResponse value) {
        return new JAXBElement<MeridianExtractInsuredResponse>(_MeridianExtractInsuredResponse_QNAME, MeridianExtractInsuredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtractInsuredRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ExtractInsuredRequest")
    public JAXBElement<ExtractInsuredRequest> createExtractInsuredRequest(ExtractInsuredRequest value) {
        return new JAXBElement<ExtractInsuredRequest>(_ExtractInsuredRequest_QNAME, ExtractInsuredRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuredDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredDetails")
    public JAXBElement<InsuredDetails> createInsuredDetails(InsuredDetails value) {
        return new JAXBElement<InsuredDetails>(_InsuredDetails_QNAME, InsuredDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsuredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ArrayOfInsuredResponse")
    public JAXBElement<ArrayOfInsuredResponse> createArrayOfInsuredResponse(ArrayOfInsuredResponse value) {
        return new JAXBElement<ArrayOfInsuredResponse>(_ArrayOfInsuredResponse_QNAME, ArrayOfInsuredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtractInsuredResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ExtractInsuredResponseDetail")
    public JAXBElement<ExtractInsuredResponseDetail> createExtractInsuredResponseDetail(ExtractInsuredResponseDetail value) {
        return new JAXBElement<ExtractInsuredResponseDetail>(_ExtractInsuredResponseDetail_QNAME, ExtractInsuredResponseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsuredRelationDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ArrayOfInsuredRelationDetails")
    public JAXBElement<ArrayOfInsuredRelationDetails> createArrayOfInsuredRelationDetails(ArrayOfInsuredRelationDetails value) {
        return new JAXBElement<ArrayOfInsuredRelationDetails>(_ArrayOfInsuredRelationDetails_QNAME, ArrayOfInsuredRelationDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuredRelationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredRelationInfo")
    public JAXBElement<InsuredRelationInfo> createInsuredRelationInfo(InsuredRelationInfo value) {
        return new JAXBElement<InsuredRelationInfo>(_InsuredRelationInfo_QNAME, InsuredRelationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "EnvironmentData")
    public JAXBElement<EnvironmentData> createEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsuredRelationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ArrayOfInsuredRelationInfo")
    public JAXBElement<ArrayOfInsuredRelationInfo> createArrayOfInsuredRelationInfo(ArrayOfInsuredRelationInfo value) {
        return new JAXBElement<ArrayOfInsuredRelationInfo>(_ArrayOfInsuredRelationInfo_QNAME, ArrayOfInsuredRelationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearlyPremiumRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "YearlyPremiumRequest")
    public JAXBElement<YearlyPremiumRequest> createYearlyPremiumRequest(YearlyPremiumRequest value) {
        return new JAXBElement<YearlyPremiumRequest>(_YearlyPremiumRequest_QNAME, YearlyPremiumRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfYearlyPremiumDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ArrayOfYearlyPremiumDetails")
    public JAXBElement<ArrayOfYearlyPremiumDetails> createArrayOfYearlyPremiumDetails(ArrayOfYearlyPremiumDetails value) {
        return new JAXBElement<ArrayOfYearlyPremiumDetails>(_ArrayOfYearlyPremiumDetails_QNAME, ArrayOfYearlyPremiumDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfYearlyPremiumInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ArrayOfYearlyPremiumInfo")
    public JAXBElement<ArrayOfYearlyPremiumInfo> createArrayOfYearlyPremiumInfo(ArrayOfYearlyPremiumInfo value) {
        return new JAXBElement<ArrayOfYearlyPremiumInfo>(_ArrayOfYearlyPremiumInfo_QNAME, ArrayOfYearlyPremiumInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearlyPremiumInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "YearlyPremiumInfo")
    public JAXBElement<YearlyPremiumInfo> createYearlyPremiumInfo(YearlyPremiumInfo value) {
        return new JAXBElement<YearlyPremiumInfo>(_YearlyPremiumInfo_QNAME, YearlyPremiumInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuredRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredDetails", scope = Request.class)
    public JAXBElement<InsuredRequest> createRequestInsuredRequest(InsuredRequest value) {
        return new JAXBElement<InsuredRequest>(_RequestInsuredRequest_QNAME, InsuredRequest.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "EnvironmentData", scope = Request.class)
    public JAXBElement<EnvironmentData> createRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "request", scope = CreateOrUpdateInsured.class)
    public JAXBElement<Request> createCreateOrUpdateInsuredRequest(Request value) {
        return new JAXBElement<Request>(_CreateOrUpdateInsuredRequest_QNAME, Request.class, CreateOrUpdateInsured.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Entity", scope = YearlyPremiumDetails.class)
    public JAXBElement<String> createYearlyPremiumDetailsEntity(String value) {
        return new JAXBElement<String>(_YearlyPremiumDetailsEntity_QNAME, String.class, YearlyPremiumDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Positive_x002F_NegativeAmount", scope = YearlyPremiumDetails.class)
    public JAXBElement<String> createYearlyPremiumDetailsPositiveX002FNegativeAmount(String value) {
        return new JAXBElement<String>(_YearlyPremiumDetailsPositiveX002FNegativeAmount_QNAME, String.class, YearlyPremiumDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredNumber", scope = YearlyPremiumDetails.class)
    public JAXBElement<String> createYearlyPremiumDetailsInsuredNumber(String value) {
        return new JAXBElement<String>(_YearlyPremiumDetailsInsuredNumber_QNAME, String.class, YearlyPremiumDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfYearlyPremiumInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "YearlyPremium", scope = YearlyPremiumResponse.class)
    public JAXBElement<ArrayOfYearlyPremiumInfo> createYearlyPremiumResponseYearlyPremium(ArrayOfYearlyPremiumInfo value) {
        return new JAXBElement<ArrayOfYearlyPremiumInfo>(_YearlyPremiumResponseYearlyPremium_QNAME, ArrayOfYearlyPremiumInfo.class, YearlyPremiumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "OverAllResult", scope = YearlyPremiumResponse.class)
    public JAXBElement<String> createYearlyPremiumResponseOverAllResult(String value) {
        return new JAXBElement<String>(_YearlyPremiumResponseOverAllResult_QNAME, String.class, YearlyPremiumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsuredRelationDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredRelation", scope = InsuredRelationRequest.class)
    public JAXBElement<ArrayOfInsuredRelationDetails> createInsuredRelationRequestInsuredRelation(ArrayOfInsuredRelationDetails value) {
        return new JAXBElement<ArrayOfInsuredRelationDetails>(_InsuredRelationRequestInsuredRelation_QNAME, ArrayOfInsuredRelationDetails.class, InsuredRelationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "EnvironmentData", scope = InsuredRelationRequest.class)
    public JAXBElement<EnvironmentData> createInsuredRelationRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, InsuredRelationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInsuredResponseDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "GetInsuredResult", scope = GetInsuredResponse.class)
    public JAXBElement<GetInsuredResponseDetails> createGetInsuredResponseGetInsuredResult(GetInsuredResponseDetails value) {
        return new JAXBElement<GetInsuredResponseDetails>(_GetInsuredResponseGetInsuredResult_QNAME, GetInsuredResponseDetails.class, GetInsuredResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeridianInsuredExtractResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MeridianInsuredExtractResponse", scope = MeridianInsuredExtractResponse.class)
    public JAXBElement<ArrayOfMeridianInsuredExtractResponseDetail> createMeridianInsuredExtractResponseMeridianInsuredExtractResponse(ArrayOfMeridianInsuredExtractResponseDetail value) {
        return new JAXBElement<ArrayOfMeridianInsuredExtractResponseDetail>(_MeridianInsuredExtractResponse_QNAME, ArrayOfMeridianInsuredExtractResponseDetail.class, MeridianInsuredExtractResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuredRelationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "insuredRelationRequest", scope = CreateOrUpdateInsuredRelation.class)
    public JAXBElement<InsuredRelationRequest> createCreateOrUpdateInsuredRelationInsuredRelationRequest(InsuredRelationRequest value) {
        return new JAXBElement<InsuredRelationRequest>(_CreateOrUpdateInsuredRelationInsuredRelationRequest_QNAME, InsuredRelationRequest.class, CreateOrUpdateInsuredRelation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CreateOrUpdateInsuredResult", scope = CreateOrUpdateInsuredResponse.class)
    public JAXBElement<Response> createCreateOrUpdateInsuredResponseCreateOrUpdateInsuredResult(Response value) {
        return new JAXBElement<Response>(_CreateOrUpdateInsuredResponseCreateOrUpdateInsuredResult_QNAME, Response.class, CreateOrUpdateInsuredResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsuredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredResponse", scope = Response.class)
    public JAXBElement<ArrayOfInsuredResponse> createResponseInsuredResponse(ArrayOfInsuredResponse value) {
        return new JAXBElement<ArrayOfInsuredResponse>(_InsuredResponse_QNAME, ArrayOfInsuredResponse.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "OverallResult", scope = Response.class)
    public JAXBElement<String> createResponseOverallResult(String value) {
        return new JAXBElement<String>(_ResponseOverallResult_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "DUNBRADSTREETNUMBER", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailDUNBRADSTREETNUMBER(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailDUNBRADSTREETNUMBER_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "POLICYHOLDERSTREET2", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailPOLICYHOLDERSTREET2(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailPOLICYHOLDERSTREET2_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "RECORDTYPEV21", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailRECORDTYPEV21(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailRECORDTYPEV21_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "POLICYHOLDERSTREET1", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailPOLICYHOLDERSTREET1(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailPOLICYHOLDERSTREET1_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "BANKACCOUNTNUMBER", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailBANKACCOUNTNUMBER(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailBANKACCOUNTNUMBER_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "POLICYHOLDERCITY", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailPOLICYHOLDERCITY(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailPOLICYHOLDERCITY_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "POLICYHOLDERCODE", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailPOLICYHOLDERCODE(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailPOLICYHOLDERCODE_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "LETTERSEQUENCE", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailLETTERSEQUENCE(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailLETTERSEQUENCE_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TITLECODE", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailTITLECODE(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailTITLECODE_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ACTIONCODE", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailACTIONCODE(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailACTIONCODE_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "UFIL3", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailUFIL3(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailUFIL3_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "UFIL2", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailUFIL2(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailUFIL2_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "UFIL1", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailUFIL1(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailUFIL1_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "POLICYHOLDERSALPHACODE", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailPOLICYHOLDERSALPHACODE(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailPOLICYHOLDERSALPHACODE_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "DUNBRADSTREETRATING", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailDUNBRADSTREETRATING(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailDUNBRADSTREETRATING_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "POLICYHOLDERNAME", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailPOLICYHOLDERNAME(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailPOLICYHOLDERNAME_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "POLICYHOLDERCOUNTRY", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailPOLICYHOLDERCOUNTRY(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailPOLICYHOLDERCOUNTRY_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MULTINATIONALCODE", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailMULTINATIONALCODE(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailMULTINATIONALCODE_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "BLOCKINGINDICATOR", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailBLOCKINGINDICATOR(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailBLOCKINGINDICATOR_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TRANSACTIONEVENTTAG", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<BigDecimal> createMeridianInsuredExtractResponseDetailTRANSACTIONEVENTTAG(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MeridianInsuredExtractResponseDetailTRANSACTIONEVENTTAG_QNAME, BigDecimal.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ENDOFRECORDMARKER", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailENDOFRECORDMARKER(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailENDOFRECORDMARKER_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "EMPLOYEENUMBER", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailEMPLOYEENUMBER(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailEMPLOYEENUMBER_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "UFIL5", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailUFIL5(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailUFIL5_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "UFIL4", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailUFIL4(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailUFIL4_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "BUSINESSENTITY", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailBUSINESSENTITY(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailBUSINESSENTITY_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MULTINATIONALPREFIX", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailMULTINATIONALPREFIX(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailMULTINATIONALPREFIX_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TAXCODE", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailTAXCODE(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailTAXCODE_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "POLICYHOLDERPOLITICALSUBDIVISION", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailPOLICYHOLDERPOLITICALSUBDIVISION(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailPOLICYHOLDERPOLITICALSUBDIVISION_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "POLICYHOLDERZIPCODE", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailPOLICYHOLDERZIPCODE(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailPOLICYHOLDERZIPCODE_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "BANKROUTINGNUMBER", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<String> createMeridianInsuredExtractResponseDetailBANKROUTINGNUMBER(String value) {
        return new JAXBElement<String>(_MeridianInsuredExtractResponseDetailBANKROUTINGNUMBER_QNAME, String.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "LASTDATEOFCHANGE", scope = MeridianInsuredExtractResponseDetail.class)
    public JAXBElement<XMLGregorianCalendar> createMeridianInsuredExtractResponseDetailLASTDATEOFCHANGE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MeridianInsuredExtractResponseDetailLASTDATEOFCHANGE_QNAME, XMLGregorianCalendar.class, MeridianInsuredExtractResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtractInsuredResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ExtractInsuredResponse", scope = ExtractInsuredResponse.class)
    public JAXBElement<ArrayOfExtractInsuredResponseDetail> createExtractInsuredResponseExtractInsuredResponse(ArrayOfExtractInsuredResponseDetail value) {
        return new JAXBElement<ArrayOfExtractInsuredResponseDetail>(_ExtractInsuredResponse_QNAME, ArrayOfExtractInsuredResponseDetail.class, ExtractInsuredResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FiscalCode", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailFiscalCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailFiscalCode_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "RiskCategory", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailRiskCategory(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailRiskCategory_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredCountryCode", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailInsuredCountryCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailInsuredCountryCode_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CurrentRate", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailCurrentRate(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailCurrentRate_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredName", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailInsuredName(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailInsuredName_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PreviousRate", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailPreviousRate(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailPreviousRate_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Address3", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailAddress3(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailAddress3_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Address2", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailAddress2(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailAddress2_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredID", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailInsuredID(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailInsuredID_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "AddressCode", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailAddressCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailAddressCode_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Address1", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailAddress1(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailAddress1_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "City", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailCity(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailCity_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "NAFCode", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailNAFCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailNAFCode_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "NameType", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailNameType(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailNameType_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "VATCode", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailVATCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailVATCode_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "NANANM", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailNANANM(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailNANANM_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Address5", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailAddress5(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailAddress5_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "EffectiveRate", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailEffectiveRate(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailEffectiveRate_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MNPrefixID", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailMNPrefixID(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailMNPrefixID_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PostCode", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailPostCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailPostCode_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Name2", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailName2(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailName2_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Name1", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailName1(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailName1_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredFlag", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailInsuredFlag(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailInsuredFlag_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredCode", scope = ExtractInsuredResponseDetail.class)
    public JAXBElement<String> createExtractInsuredResponseDetailInsuredCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailInsuredCode_QNAME, String.class, ExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Position", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsPosition(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsPosition_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Title", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsTitle(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsTitle_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Address2", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsAddress2(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailAddress2_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Address1", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsAddress1(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailAddress1_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "City", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsCity(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailCity_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MobileNumber2", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsMobileNumber2(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsMobileNumber2_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MobileNumber1", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsMobileNumber1(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsMobileNumber1_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "UnderWriterReference", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsUnderWriterReference(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsUnderWriterReference_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ContactMethodType", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsContactMethodType(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsContactMethodType_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TitleDescription", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsTitleDescription(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsTitleDescription_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Surname", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsSurname(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsSurname_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ContactName", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsContactName(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsContactName_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "OtherContactNumber", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsOtherContactNumber(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsOtherContactNumber_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PostCode", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsPostCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailPostCode_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "BirthDate", scope = CorrespondentDetails.class)
    public JAXBElement<XMLGregorianCalendar> createCorrespondentDetailsBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CorrespondentDetailsBirthDate_QNAME, XMLGregorianCalendar.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Country", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsCountry(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsCountry_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "WorkNumber", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsWorkNumber(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsWorkNumber_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CorrespondentName", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsCorrespondentName(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsCorrespondentName_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CorrespondentCompany", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsCorrespondentCompany(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsCorrespondentCompany_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "EmailID", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsEmailID(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsEmailID_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CorrespondentNumber", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsCorrespondentNumber(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsCorrespondentNumber_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ClaimReference", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsClaimReference(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsClaimReference_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "BuildingFloor", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsBuildingFloor(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsBuildingFloor_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "County", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsCounty(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsCounty_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TelephoneNumber", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsTelephoneNumber(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsTelephoneNumber_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TownCode", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsTownCode(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsTownCode_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FaxNumber", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsFaxNumber(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsFaxNumber_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Forename", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsForename(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsForename_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Middlename", scope = CorrespondentDetails.class)
    public JAXBElement<String> createCorrespondentDetailsMiddlename(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsMiddlename_QNAME, String.class, CorrespondentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtractInsuredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "GetInsuredBatchResult", scope = GetInsuredBatchResponse.class)
    public JAXBElement<ExtractInsuredResponse> createGetInsuredBatchResponseGetInsuredBatchResult(ExtractInsuredResponse value) {
        return new JAXBElement<ExtractInsuredResponse>(_GetInsuredBatchResponseGetInsuredBatchResult_QNAME, ExtractInsuredResponse.class, GetInsuredBatchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Entity", scope = InsuredRelationDetails.class)
    public JAXBElement<String> createInsuredRelationDetailsEntity(String value) {
        return new JAXBElement<String>(_YearlyPremiumDetailsEntity_QNAME, String.class, InsuredRelationDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PolicyHolderCode", scope = InsuredRelationDetails.class)
    public JAXBElement<String> createInsuredRelationDetailsPolicyHolderCode(String value) {
        return new JAXBElement<String>(_InsuredRelationDetailsPolicyHolderCode_QNAME, String.class, InsuredRelationDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PolicyHolderPrimaryCode", scope = InsuredRelationDetails.class)
    public JAXBElement<String> createInsuredRelationDetailsPolicyHolderPrimaryCode(String value) {
        return new JAXBElement<String>(_InsuredRelationDetailsPolicyHolderPrimaryCode_QNAME, String.class, InsuredRelationDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PolicyNumber", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailPolicyNumber(String value) {
        return new JAXBElement<String>(_GetInsuredDetailPolicyNumber_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "SanctionStatus", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailSanctionStatus(String value) {
        return new JAXBElement<String>(_GetInsuredDetailSanctionStatus_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "GeniusNameCode", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailGeniusNameCode(String value) {
        return new JAXBElement<String>(_GetInsuredDetailGeniusNameCode_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "multinationalAgreement", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailMultinationalAgreement(String value) {
        return new JAXBElement<String>(_GetInsuredDetailMultinationalAgreement_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TypeofMovement", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailTypeofMovement(String value) {
        return new JAXBElement<String>(_GetInsuredDetailTypeofMovement_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Nationality", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailNationality(String value) {
        return new JAXBElement<String>(_GetInsuredDetailNationality_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Address2", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailAddress2(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailAddress2_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "BankOfficeBranch", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailBankOfficeBranch(String value) {
        return new JAXBElement<String>(_GetInsuredDetailBankOfficeBranch_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Address1", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailAddress1(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailAddress1_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TaxIDType", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailTaxIDType(String value) {
        return new JAXBElement<String>(_GetInsuredDetailTaxIDType_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CodeIIBB", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailCodeIIBB(String value) {
        return new JAXBElement<String>(_GetInsuredDetailCodeIIBB_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Surname", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailSurname(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsSurname_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "SourceSystem", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailSourceSystem(String value) {
        return new JAXBElement<String>(_GetInsuredDetailSourceSystem_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InscriptionNumber", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailInscriptionNumber(String value) {
        return new JAXBElement<String>(_GetInsuredDetailInscriptionNumber_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Location", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailLocation(String value) {
        return new JAXBElement<String>(_GetInsuredDetailLocation_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ProvinceCode", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailProvinceCode(String value) {
        return new JAXBElement<String>(_GetInsuredDetailProvinceCode_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CountryName", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailCountryName(String value) {
        return new JAXBElement<String>(_GetInsuredDetailCountryName_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "User", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailUser(String value) {
        return new JAXBElement<String>(_GetInsuredDetailUser_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "County", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailCounty(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsCounty_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FutureUse4", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailFutureUse4(String value) {
        return new JAXBElement<String>(_GetInsuredDetailFutureUse4_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FutureUse5", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailFutureUse5(String value) {
        return new JAXBElement<String>(_GetInsuredDetailFutureUse5_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FNMN", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailFNMN(String value) {
        return new JAXBElement<String>(_GetInsuredDetailFNMN_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "DischargeCode", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailDischargeCode(String value) {
        return new JAXBElement<String>(_GetInsuredDetailDischargeCode_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CorrespondentResultList", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailCorrespondentResultList(String value) {
        return new JAXBElement<String>(_GetInsuredDetailCorrespondentResultList_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FutureUse1", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailFutureUse1(String value) {
        return new JAXBElement<String>(_GetInsuredDetailFutureUse1_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FutureUse2", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailFutureUse2(String value) {
        return new JAXBElement<String>(_GetInsuredDetailFutureUse2_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ForeignFlag", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailForeignFlag(String value) {
        return new JAXBElement<String>(_GetInsuredDetailForeignFlag_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FutureUse3", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailFutureUse3(String value) {
        return new JAXBElement<String>(_GetInsuredDetailFutureUse3_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "GrossIncome", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailGrossIncome(String value) {
        return new JAXBElement<String>(_GetInsuredDetailGrossIncome_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CertificateNumber", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailCertificateNumber(String value) {
        return new JAXBElement<String>(_GetInsuredDetailCertificateNumber_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredCodeType", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailInsuredCodeType(String value) {
        return new JAXBElement<String>(_GetInsuredDetailInsuredCodeType_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "EmailAddress", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailEmailAddress(String value) {
        return new JAXBElement<String>(_GetInsuredDetailEmailAddress_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredID", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailInsuredID(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailInsuredID_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "City", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailCity(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailCity_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "DunsNumber", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailDunsNumber(String value) {
        return new JAXBElement<String>(_GetInsuredDetailDunsNumber_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TaxID", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailTaxID(String value) {
        return new JAXBElement<String>(_GetInsuredDetailTaxID_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "DNBRating", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailDNBRating(String value) {
        return new JAXBElement<String>(_GetInsuredDetailDNBRating_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PostCode", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailPostCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailPostCode_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Environment", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailEnvironment(String value) {
        return new JAXBElement<String>(_GetInsuredDetailEnvironment_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Consortium", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailConsortium(String value) {
        return new JAXBElement<String>(_GetInsuredDetailConsortium_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PaymentPlan", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailPaymentPlan(String value) {
        return new JAXBElement<String>(_GetInsuredDetailPaymentPlan_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TaxPaymentPosition", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailTaxPaymentPosition(String value) {
        return new JAXBElement<String>(_GetInsuredDetailTaxPaymentPosition_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FiscalCode", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailFiscalCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailFiscalCode_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "RequestID", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailRequestID(String value) {
        return new JAXBElement<String>(_GetInsuredDetailRequestID_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Suburb", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailSuburb(String value) {
        return new JAXBElement<String>(_GetInsuredDetailSuburb_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Address", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailAddress(String value) {
        return new JAXBElement<String>(_GetInsuredDetailAddress_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredName", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailInsuredName(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailInsuredName_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ClaimDescription", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailClaimDescription(String value) {
        return new JAXBElement<String>(_GetInsuredDetailClaimDescription_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TaxesExempt", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailTaxesExempt(String value) {
        return new JAXBElement<String>(_GetInsuredDetailTaxesExempt_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Entity", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailEntity(String value) {
        return new JAXBElement<String>(_YearlyPremiumDetailsEntity_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CountryID", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailCountryID(String value) {
        return new JAXBElement<String>(_GetInsuredDetailCountryID_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CountyCode", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailCountyCode(String value) {
        return new JAXBElement<String>(_GetInsuredDetailCountyCode_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Email", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailEmail(String value) {
        return new JAXBElement<String>(_GetInsuredDetailEmail_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Company", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailCompany(String value) {
        return new JAXBElement<String>(_GetInsuredDetailCompany_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "RemotePoint", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailRemotePoint(String value) {
        return new JAXBElement<String>(_GetInsuredDetailRemotePoint_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "BuildingFloor", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailBuildingFloor(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsBuildingFloor_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "NumberIIBBFlag", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailNumberIIBBFlag(String value) {
        return new JAXBElement<String>(_GetInsuredDetailNumberIIBBFlag_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TelephoneNumber", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailTelephoneNumber(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsTelephoneNumber_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Name", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailName(String value) {
        return new JAXBElement<String>(_GetInsuredDetailName_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PaymentPlanTerm", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailPaymentPlanTerm(String value) {
        return new JAXBElement<String>(_GetInsuredDetailPaymentPlanTerm_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FaxNumber", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailFaxNumber(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsFaxNumber_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FullName1", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailFullName1(String value) {
        return new JAXBElement<String>(_GetInsuredDetailFullName1_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FullName2", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailFullName2(String value) {
        return new JAXBElement<String>(_GetInsuredDetailFullName2_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CreditCardNumberLast4", scope = GetInsuredDetail.class)
    public JAXBElement<String> createGetInsuredDetailCreditCardNumberLast4(String value) {
        return new JAXBElement<String>(_GetInsuredDetailCreditCardNumberLast4_QNAME, String.class, GetInsuredDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PreferredCustomerAccidentIndicator", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestPreferredCustomerAccidentIndicator(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestPreferredCustomerAccidentIndicator_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "RiskCategory", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestRiskCategory(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailRiskCategory_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredCountryCode", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestInsuredCountryCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailInsuredCountryCode_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "EntShortName", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestEntShortName(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestEntShortName_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ComplianceHolder", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestComplianceHolder(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestComplianceHolder_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PostCardSent", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestPostCardSent(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestPostCardSent_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PreferredCustomerHealthIndicator", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestPreferredCustomerHealthIndicator(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestPreferredCustomerHealthIndicator_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "AceOnlineReference", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestAceOnlineReference(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestAceOnlineReference_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "GUID", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestGUID(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestGUID_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "AddressCode", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestAddressCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailAddressCode_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TaxIDType", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestTaxIDType(String value) {
        return new JAXBElement<String>(_GetInsuredDetailTaxIDType_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "EntityCode", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestEntityCode(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestEntityCode_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ServiceName", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestServiceName(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestServiceName_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Occupation", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestOccupation(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestOccupation_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "SpecialCallInstructions", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestSpecialCallInstructions(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestSpecialCallInstructions_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Addedby", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestAddedby(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestAddedby_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "AccountName", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestAccountName(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestAccountName_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ReceiveInformationIndicator", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestReceiveInformationIndicator(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestReceiveInformationIndicator_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredCode", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestInsuredCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailInsuredCode_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Country", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestCountry(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsCountry_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ProvinceCode", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestProvinceCode(String value) {
        return new JAXBElement<String>(_GetInsuredDetailProvinceCode_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ClaimonList", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestClaimonList(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestClaimonList_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FiscalCode", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestFiscalCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailFiscalCode_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PreviousCOTECode", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestPreviousCOTECode(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestPreviousCOTECode_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "EndorsementIndicator", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestEndorsementIndicator(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestEndorsementIndicator_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "County", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestCounty(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsCounty_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "SalesForceID", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestSalesForceID(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestSalesForceID_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "IsMigrated", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestIsMigrated(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestIsMigrated_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ShowNameIndicator", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestShowNameIndicator(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestShowNameIndicator_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Website", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestWebsite(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestWebsite_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "DeceasedIndex", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestDeceasedIndex(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestDeceasedIndex_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredNumber", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestInsuredNumber(String value) {
        return new JAXBElement<String>(_YearlyPremiumDetailsInsuredNumber_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "NAFCode", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestNAFCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailNAFCode_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "AntiMoneyLaunderingBranch", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestAntiMoneyLaunderingBranch(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestAntiMoneyLaunderingBranch_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "VATCode", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestVATCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailVATCode_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "SiretCode", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestSiretCode(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestSiretCode_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PEPID", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestPEPID(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestPEPID_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MNPrefixID", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestMNPrefixID(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailMNPrefixID_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PastClaim", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestPastClaim(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestPastClaim_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "IDNumber", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestIDNumber(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestIDNumber_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "COTEExpertCode", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestCOTEExpertCode(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestCOTEExpertCode_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "TaxFlag", scope = InsuredInfoRequest.class)
    public JAXBElement<String> createInsuredInfoRequestTaxFlag(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestTaxFlag_QNAME, String.class, InsuredInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeridianInsuredExtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "GetMeridianExtractInsuredResult", scope = GetMeridianExtractInsuredResponse.class)
    public JAXBElement<MeridianInsuredExtractResponse> createGetMeridianExtractInsuredResponseGetMeridianExtractInsuredResult(MeridianInsuredExtractResponse value) {
        return new JAXBElement<MeridianInsuredExtractResponse>(_GetMeridianExtractInsuredResponseGetMeridianExtractInsuredResult_QNAME, MeridianInsuredExtractResponse.class, GetMeridianExtractInsuredResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeridianExtractInsuredResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MeridianExtractInsuredResponse", scope = MeridianExtractInsuredResponse.class)
    public JAXBElement<ArrayOfMeridianExtractInsuredResponseDetail> createMeridianExtractInsuredResponseMeridianExtractInsuredResponse(ArrayOfMeridianExtractInsuredResponseDetail value) {
        return new JAXBElement<ArrayOfMeridianExtractInsuredResponseDetail>(_MeridianExtractInsuredResponse_QNAME, ArrayOfMeridianExtractInsuredResponseDetail.class, MeridianExtractInsuredResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "EnvironmentData", scope = ExtractInsuredRequest.class)
    public JAXBElement<EnvironmentData> createExtractInsuredRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, ExtractInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetInsuredDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "GetInsuredDetails", scope = GetInsuredResponseDetails.class)
    public JAXBElement<ArrayOfGetInsuredDetail> createGetInsuredResponseDetailsGetInsuredDetails(ArrayOfGetInsuredDetail value) {
        return new JAXBElement<ArrayOfGetInsuredDetail>(_GetInsuredResponseDetailsGetInsuredDetails_QNAME, ArrayOfGetInsuredDetail.class, GetInsuredResponseDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "SiretCode", scope = MeridianExtractInsuredResponseDetail.class)
    public JAXBElement<String> createMeridianExtractInsuredResponseDetailSiretCode(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestSiretCode_QNAME, String.class, MeridianExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Entity", scope = MeridianExtractInsuredResponseDetail.class)
    public JAXBElement<String> createMeridianExtractInsuredResponseDetailEntity(String value) {
        return new JAXBElement<String>(_YearlyPremiumDetailsEntity_QNAME, String.class, MeridianExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PreviousCOTECode", scope = MeridianExtractInsuredResponseDetail.class)
    public JAXBElement<String> createMeridianExtractInsuredResponseDetailPreviousCOTECode(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestPreviousCOTECode_QNAME, String.class, MeridianExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "COTEExpertCode", scope = MeridianExtractInsuredResponseDetail.class)
    public JAXBElement<String> createMeridianExtractInsuredResponseDetailCOTEExpertCode(String value) {
        return new JAXBElement<String>(_InsuredInfoRequestCOTEExpertCode_QNAME, String.class, MeridianExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "COTEExpertDate", scope = MeridianExtractInsuredResponseDetail.class)
    public JAXBElement<XMLGregorianCalendar> createMeridianExtractInsuredResponseDetailCOTEExpertDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MeridianExtractInsuredResponseDetailCOTEExpertDate_QNAME, XMLGregorianCalendar.class, MeridianExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "NAFCode", scope = MeridianExtractInsuredResponseDetail.class)
    public JAXBElement<String> createMeridianExtractInsuredResponseDetailNAFCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailNAFCode_QNAME, String.class, MeridianExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Policyholdercode", scope = MeridianExtractInsuredResponseDetail.class)
    public JAXBElement<String> createMeridianExtractInsuredResponseDetailPolicyholdercode(String value) {
        return new JAXBElement<String>(_MeridianExtractInsuredResponseDetailPolicyholdercode_QNAME, String.class, MeridianExtractInsuredResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfYearlyPremiumDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "YearlyPremium", scope = YearlyPremiumRequest.class)
    public JAXBElement<ArrayOfYearlyPremiumDetails> createYearlyPremiumRequestYearlyPremium(ArrayOfYearlyPremiumDetails value) {
        return new JAXBElement<ArrayOfYearlyPremiumDetails>(_YearlyPremiumResponseYearlyPremium_QNAME, ArrayOfYearlyPremiumDetails.class, YearlyPremiumRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "EnvironmentData", scope = YearlyPremiumRequest.class)
    public JAXBElement<EnvironmentData> createYearlyPremiumRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, YearlyPremiumRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsuredRelationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredRelation", scope = InsuredRelationResponse.class)
    public JAXBElement<ArrayOfInsuredRelationInfo> createInsuredRelationResponseInsuredRelation(ArrayOfInsuredRelationInfo value) {
        return new JAXBElement<ArrayOfInsuredRelationInfo>(_InsuredRelationRequestInsuredRelation_QNAME, ArrayOfInsuredRelationInfo.class, InsuredRelationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "OverAllResult", scope = InsuredRelationResponse.class)
    public JAXBElement<String> createInsuredRelationResponseOverAllResult(String value) {
        return new JAXBElement<String>(_YearlyPremiumResponseOverAllResult_QNAME, String.class, InsuredRelationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtractInsuredRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "request", scope = GetInsuredBatch.class)
    public JAXBElement<ExtractInsuredRequest> createGetInsuredBatchRequest(ExtractInsuredRequest value) {
        return new JAXBElement<ExtractInsuredRequest>(_CreateOrUpdateInsuredRequest_QNAME, ExtractInsuredRequest.class, GetInsuredBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Description", scope = YearlyPremiumInfo.class)
    public JAXBElement<String> createYearlyPremiumInfoDescription(String value) {
        return new JAXBElement<String>(_YearlyPremiumInfoDescription_QNAME, String.class, YearlyPremiumInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Result", scope = YearlyPremiumInfo.class)
    public JAXBElement<String> createYearlyPremiumInfoResult(String value) {
        return new JAXBElement<String>(_YearlyPremiumInfoResult_QNAME, String.class, YearlyPremiumInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredNumber", scope = YearlyPremiumInfo.class)
    public JAXBElement<String> createYearlyPremiumInfoInsuredNumber(String value) {
        return new JAXBElement<String>(_YearlyPremiumDetailsInsuredNumber_QNAME, String.class, YearlyPremiumInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Result", scope = InsuredResponse.class)
    public JAXBElement<String> createInsuredResponseResult(String value) {
        return new JAXBElement<String>(_YearlyPremiumInfoResult_QNAME, String.class, InsuredResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtractInsuredRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "extractRequest", scope = GetMeridianExtractInsured.class)
    public JAXBElement<ExtractInsuredRequest> createGetMeridianExtractInsuredExtractRequest(ExtractInsuredRequest value) {
        return new JAXBElement<ExtractInsuredRequest>(_GetMeridianExtractInsuredExtractRequest_QNAME, ExtractInsuredRequest.class, GetMeridianExtractInsured.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInsuredRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "request", scope = GetInsuredMod.class)
    public JAXBElement<GetInsuredRequest> createGetInsuredModRequest(GetInsuredRequest value) {
        return new JAXBElement<GetInsuredRequest>(_CreateOrUpdateInsuredRequest_QNAME, GetInsuredRequest.class, GetInsuredMod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearlyPremiumRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "yearlyPremiumRequest", scope = UpdateYearlyPremium.class)
    public JAXBElement<YearlyPremiumRequest> createUpdateYearlyPremiumYearlyPremiumRequest(YearlyPremiumRequest value) {
        return new JAXBElement<YearlyPremiumRequest>(_UpdateYearlyPremiumYearlyPremiumRequest_QNAME, YearlyPremiumRequest.class, UpdateYearlyPremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuredInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredInfoRequest", scope = InsuredDetails.class)
    public JAXBElement<InsuredInfoRequest> createInsuredDetailsInsuredInfoRequest(InsuredInfoRequest value) {
        return new JAXBElement<InsuredInfoRequest>(_InsuredInfoRequest_QNAME, InsuredInfoRequest.class, InsuredDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CorrespondentDetails", scope = InsuredDetails.class)
    public JAXBElement<CorrespondentDetails> createInsuredDetailsCorrespondentDetails(CorrespondentDetails value) {
        return new JAXBElement<CorrespondentDetails>(_CorrespondentDetails_QNAME, CorrespondentDetails.class, InsuredDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuredRelationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "CreateOrUpdateInsuredRelationResult", scope = CreateOrUpdateInsuredRelationResponse.class)
    public JAXBElement<InsuredRelationResponse> createCreateOrUpdateInsuredRelationResponseCreateOrUpdateInsuredRelationResult(InsuredRelationResponse value) {
        return new JAXBElement<InsuredRelationResponse>(_CreateOrUpdateInsuredRelationResponseCreateOrUpdateInsuredRelationResult_QNAME, InsuredRelationResponse.class, CreateOrUpdateInsuredRelationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtractInsuredRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "extractRequest", scope = GetInsuredMeridianBatch.class)
    public JAXBElement<ExtractInsuredRequest> createGetInsuredMeridianBatchExtractRequest(ExtractInsuredRequest value) {
        return new JAXBElement<ExtractInsuredRequest>(_GetMeridianExtractInsuredExtractRequest_QNAME, ExtractInsuredRequest.class, GetInsuredMeridianBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearlyPremiumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "UpdateYearlyPremiumResult", scope = UpdateYearlyPremiumResponse.class)
    public JAXBElement<YearlyPremiumResponse> createUpdateYearlyPremiumResponseUpdateYearlyPremiumResult(YearlyPremiumResponse value) {
        return new JAXBElement<YearlyPremiumResponse>(_UpdateYearlyPremiumResponseUpdateYearlyPremiumResult_QNAME, YearlyPremiumResponse.class, UpdateYearlyPremiumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeridianExtractInsuredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "GetInsuredMeridianBatchResult", scope = GetInsuredMeridianBatchResponse.class)
    public JAXBElement<MeridianExtractInsuredResponse> createGetInsuredMeridianBatchResponseGetInsuredMeridianBatchResult(MeridianExtractInsuredResponse value) {
        return new JAXBElement<MeridianExtractInsuredResponse>(_GetInsuredMeridianBatchResponseGetInsuredMeridianBatchResult_QNAME, MeridianExtractInsuredResponse.class, GetInsuredMeridianBatchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Description", scope = InsuredRelationInfo.class)
    public JAXBElement<String> createInsuredRelationInfoDescription(String value) {
        return new JAXBElement<String>(_YearlyPremiumInfoDescription_QNAME, String.class, InsuredRelationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PolicyHolderCode", scope = InsuredRelationInfo.class)
    public JAXBElement<String> createInsuredRelationInfoPolicyHolderCode(String value) {
        return new JAXBElement<String>(_InsuredRelationDetailsPolicyHolderCode_QNAME, String.class, InsuredRelationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Result", scope = InsuredRelationInfo.class)
    public JAXBElement<String> createInsuredRelationInfoResult(String value) {
        return new JAXBElement<String>(_YearlyPremiumInfoResult_QNAME, String.class, InsuredRelationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FiscalCode", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestFiscalCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailFiscalCode_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Telephone", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestTelephone(String value) {
        return new JAXBElement<String>(_GetInsuredRequestTelephone_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "RiskCategory", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestRiskCategory(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailRiskCategory_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredName", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestInsuredName(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailInsuredName_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredCountryCode", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestInsuredCountryCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailInsuredCountryCode_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Floor", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestFloor(String value) {
        return new JAXBElement<String>(_GetInsuredRequestFloor_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Email", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestEmail(String value) {
        return new JAXBElement<String>(_GetInsuredDetailEmail_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "County", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestCounty(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsCounty_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Address2", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestAddress2(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailAddress2_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Address1", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestAddress1(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailAddress1_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "City", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestCity(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailCity_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "ResultOrder", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestResultOrder(String value) {
        return new JAXBElement<String>(_GetInsuredRequestResultOrder_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "MNPrefixId", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestMNPrefixId(String value) {
        return new JAXBElement<String>(_GetInsuredRequestMNPrefixId_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "PostCode", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestPostCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailPostCode_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "FAX", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestFAX(String value) {
        return new JAXBElement<String>(_GetInsuredRequestFAX_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Country", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestCountry(String value) {
        return new JAXBElement<String>(_CorrespondentDetailsCountry_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "InsuredCode", scope = GetInsuredRequest.class)
    public JAXBElement<String> createGetInsuredRequestInsuredCode(String value) {
        return new JAXBElement<String>(_ExtractInsuredResponseDetailInsuredCode_QNAME, String.class, GetInsuredRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/InsuredService/2016/06", name = "Environmentdata", scope = GetInsuredRequest.class)
    public JAXBElement<EnvironmentData> createGetInsuredRequestEnvironmentdata(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_GetInsuredRequestEnvironmentdata_QNAME, EnvironmentData.class, GetInsuredRequest.class, value);
    }

}
