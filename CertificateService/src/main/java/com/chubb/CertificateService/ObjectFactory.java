
package com.chubb.CertificateService;

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
 * generated in the com.chubb.workview.preprocessors.generated.certificateservice package. 
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

    private static final  QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private static final  QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private static final  QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private static final  QName _Response_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "Response");
    private static final  QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private static final  QName _CorrespondentRequest_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CorrespondentRequest");
    private static final  QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private static final  QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private static final  QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private static final  QName _ArrayOfCertificateResponse_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "ArrayOfCertificateResponse");
    private static final  QName _Request_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "Request");
    private static final  QName _CertificateResponse_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CertificateResponse");
    private static final  QName _EnvironmentData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", "EnvironmentData");
    private static final  QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private static final  QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private static final  QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private static final  QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private static final  QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private static final  QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private static final  QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private static final  QName _ArrayOfCertificateRequest_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "ArrayOfCertificateRequest");
    private static final  QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private static final  QName _CertificateRequest_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CertificateRequest");
    private static final  QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private static final  QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private static final  QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private static final  QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private static final  QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private static final  QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private static final  QName _CertificateInfoRequest_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CertificateInfoRequest");
    private static final  QName _EnvironmentDataCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", "CountryCode");
    private static final  QName _EnvironmentDataSourceSystem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", "SourceSystem");
    private static final  QName _EnvironmentDataWorkViewLogonID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", "WorkViewLogonID");
    private static final  QName _EnvironmentDataWorkViewEnvironment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", "WorkViewEnvironment");
    private static final  QName _EnvironmentDataMessageGUID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", "MessageGUID");
    private static final  QName _CreateOrUpdateCertificateResponseCreateOrUpdateCertificateResult_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CreateOrUpdateCertificateResult");
    private static final  QName _CorrespondentRequestContactMethodType_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "ContactMethodType");
    private static final  QName _CorrespondentRequestUnderWriterReference_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "UnderWriterReference");
    private static final  QName _CorrespondentRequestTitleDescription_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "TitleDescription");
    private static final  QName _CorrespondentRequestBirthDate_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "BirthDate");
    private static final  QName _CorrespondentRequestPostCode_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "PostCode");
    private static final  QName _CorrespondentRequestSurname_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "Surname");
    private static final  QName _CorrespondentRequestContactName_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "ContactName");
    private static final  QName _CorrespondentRequestOtherContactNumber_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "OtherContactNumber");
    private static final  QName _CorrespondentRequestWorkNumber_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "WorkNumber");
    private static final  QName _CorrespondentRequestCountry_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "Country");
    private static final  QName _CorrespondentRequestPosition_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "Position");
    private static final  QName _CorrespondentRequestMobileNumber1_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "MobileNumber1");
    private static final  QName _CorrespondentRequestAddress1_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "Address1");
    private static final  QName _CorrespondentRequestCity_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "City");
    private static final  QName _CorrespondentRequestMobileNumber2_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "MobileNumber2");
    private static final  QName _CorrespondentRequestAddress2_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "Address2");
    private static final  QName _CorrespondentRequestTitle_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "Title");
    private static final  QName _CorrespondentRequestForename_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "Forename");
    private static final  QName _CorrespondentRequestFaxNumber_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "FaxNumber");
    private static final  QName _CorrespondentRequestMiddlename_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "Middlename");
    private static final  QName _CorrespondentRequestCorrespondentName_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CorrespondentName");
    private static final  QName _CorrespondentRequestCorrespondentNumber_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CorrespondentNumber");
    private static final  QName _CorrespondentRequestCorrespondentCompany_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CorrespondentCompany");
    private static final  QName _CorrespondentRequestEmailID_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "EmailID");
    private static final  QName _CorrespondentRequestTelephoneNumber_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "TelephoneNumber");
    private static final  QName _CorrespondentRequestClaimReference_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "ClaimReference");
    private static final  QName _CorrespondentRequestBuildingFloor_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "BuildingFloor");
    private static final  QName _CorrespondentRequestCounty_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "County");
    private static final  QName _CorrespondentRequestTownCode_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "TownCode");
    private static final  QName _CertificateResponseResult_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "Result");
    private static final  QName _CertificateInfoRequestInceptionDate_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "InceptionDate");
    private static final  QName _CertificateInfoRequestEntityCode_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "EntityCode");
    private static final  QName _CertificateInfoRequestStartDate_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "StartDate");
    private static final  QName _CertificateInfoRequestCertificateName_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CertificateName");
    private static final  QName _CertificateInfoRequestCreatedDate_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CreatedDate");
    private static final  QName _CertificateInfoRequestCertificateNumber_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CertificateNumber");
    private static final  QName _CertificateInfoRequestCertificateStatus_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "CertificateStatus");
    private static final  QName _CertificateInfoRequestBillingMethod_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "BillingMethod");
    private static final  QName _CertificateInfoRequestPolicyNumber_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "PolicyNumber");
    private static final  QName _CertificateInfoRequestOtherReference_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "OtherReference");
    private static final  QName _CertificateInfoRequestEndDate_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "EndDate");
    private static final  QName _CertificateInfoRequestBillingDate_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "BillingDate");
    private static final  QName _CertificateInfoRequestBasePackage_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "BasePackage");
    private static final  QName _RequestEnvironmentData_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "EnvironmentData");
    private static final  QName _CreateOrUpdateCertificateRequest_QNAME = new QName("http://Chubb.com/WorkView/CertificateService/2016/06", "request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chubb.workview.preprocessors.generated.certificateservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link ArrayOfCertificateRequest }
     * 
     */
    public ArrayOfCertificateRequest createArrayOfCertificateRequest() {
        return new ArrayOfCertificateRequest();
    }

    /**
     * Create an instance of {@link CreateOrUpdateCertificate }
     * 
     */
    public CreateOrUpdateCertificate createCreateOrUpdateCertificate() {
        return new CreateOrUpdateCertificate();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link CertificateResponse }
     * 
     */
    public CertificateResponse createCertificateResponse() {
        return new CertificateResponse();
    }

    /**
     * Create an instance of {@link CertificateInfoRequest }
     * 
     */
    public CertificateInfoRequest createCertificateInfoRequest() {
        return new CertificateInfoRequest();
    }

    /**
     * Create an instance of {@link CertificateRequest }
     * 
     */
    public CertificateRequest createCertificateRequest() {
        return new CertificateRequest();
    }

    /**
     * Create an instance of {@link CreateOrUpdateCertificateResponse }
     * 
     */
    public CreateOrUpdateCertificateResponse createCreateOrUpdateCertificateResponse() {
        return new CreateOrUpdateCertificateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCertificateResponse }
     * 
     */
    public ArrayOfCertificateResponse createArrayOfCertificateResponse() {
        return new ArrayOfCertificateResponse();
    }

    /**
     * Create an instance of {@link CorrespondentRequest }
     * 
     */
    public CorrespondentRequest createCorrespondentRequest() {
        return new CorrespondentRequest();
    }

    /**
     * Create an instance of {@link EnvironmentData }
     * 
     */
    public EnvironmentData createEnvironmentData() {
        return new EnvironmentData();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrespondentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "CorrespondentRequest")
    public JAXBElement<CorrespondentRequest> createCorrespondentRequest(CorrespondentRequest value) {
        return new JAXBElement<CorrespondentRequest>(_CorrespondentRequest_QNAME, CorrespondentRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCertificateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "ArrayOfCertificateResponse")
    public JAXBElement<ArrayOfCertificateResponse> createArrayOfCertificateResponse(ArrayOfCertificateResponse value) {
        return new JAXBElement<ArrayOfCertificateResponse>(_ArrayOfCertificateResponse_QNAME, ArrayOfCertificateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "Request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "CertificateResponse")
    public JAXBElement<CertificateResponse> createCertificateResponse(CertificateResponse value) {
        return new JAXBElement<CertificateResponse>(_CertificateResponse_QNAME, CertificateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", name = "EnvironmentData")
    public JAXBElement<EnvironmentData> createEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCertificateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "ArrayOfCertificateRequest")
    public JAXBElement<ArrayOfCertificateRequest> createArrayOfCertificateRequest(ArrayOfCertificateRequest value) {
        return new JAXBElement<ArrayOfCertificateRequest>(_ArrayOfCertificateRequest_QNAME, ArrayOfCertificateRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "CertificateRequest")
    public JAXBElement<CertificateRequest> createCertificateRequest(CertificateRequest value) {
        return new JAXBElement<CertificateRequest>(_CertificateRequest_QNAME, CertificateRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "CertificateInfoRequest")
    public JAXBElement<CertificateInfoRequest> createCertificateInfoRequest(CertificateInfoRequest value) {
        return new JAXBElement<CertificateInfoRequest>(_CertificateInfoRequest_QNAME, CertificateInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", name = "CountryCode", scope = EnvironmentData.class)
    public JAXBElement<String> createEnvironmentDataCountryCode(String value) {
        return new JAXBElement<String>(_EnvironmentDataCountryCode_QNAME, String.class, EnvironmentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", name = "SourceSystem", scope = EnvironmentData.class)
    public JAXBElement<String> createEnvironmentDataSourceSystem(String value) {
        return new JAXBElement<String>(_EnvironmentDataSourceSystem_QNAME, String.class, EnvironmentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", name = "WorkViewLogonID", scope = EnvironmentData.class)
    public JAXBElement<String> createEnvironmentDataWorkViewLogonID(String value) {
        return new JAXBElement<String>(_EnvironmentDataWorkViewLogonID_QNAME, String.class, EnvironmentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", name = "WorkViewEnvironment", scope = EnvironmentData.class)
    public JAXBElement<String> createEnvironmentDataWorkViewEnvironment(String value) {
        return new JAXBElement<String>(_EnvironmentDataWorkViewEnvironment_QNAME, String.class, EnvironmentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.CertificateService.DataContracts", name = "MessageGUID", scope = EnvironmentData.class)
    public JAXBElement<String> createEnvironmentDataMessageGUID(String value) {
        return new JAXBElement<String>(_EnvironmentDataMessageGUID_QNAME, String.class, EnvironmentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "CreateOrUpdateCertificateResult", scope = CreateOrUpdateCertificateResponse.class)
    public JAXBElement<Response> createCreateOrUpdateCertificateResponseCreateOrUpdateCertificateResult(Response value) {
        return new JAXBElement<Response>(_CreateOrUpdateCertificateResponseCreateOrUpdateCertificateResult_QNAME, Response.class, CreateOrUpdateCertificateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "ContactMethodType", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestContactMethodType(String value) {
        return new JAXBElement<String>(_CorrespondentRequestContactMethodType_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "UnderWriterReference", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestUnderWriterReference(String value) {
        return new JAXBElement<String>(_CorrespondentRequestUnderWriterReference_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "TitleDescription", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestTitleDescription(String value) {
        return new JAXBElement<String>(_CorrespondentRequestTitleDescription_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "BirthDate", scope = CorrespondentRequest.class)
    public JAXBElement<XMLGregorianCalendar> createCorrespondentRequestBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CorrespondentRequestBirthDate_QNAME, XMLGregorianCalendar.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "PostCode", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestPostCode(String value) {
        return new JAXBElement<String>(_CorrespondentRequestPostCode_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "Surname", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestSurname(String value) {
        return new JAXBElement<String>(_CorrespondentRequestSurname_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "ContactName", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestContactName(String value) {
        return new JAXBElement<String>(_CorrespondentRequestContactName_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "OtherContactNumber", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestOtherContactNumber(String value) {
        return new JAXBElement<String>(_CorrespondentRequestOtherContactNumber_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "WorkNumber", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestWorkNumber(String value) {
        return new JAXBElement<String>(_CorrespondentRequestWorkNumber_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "Country", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestCountry(String value) {
        return new JAXBElement<String>(_CorrespondentRequestCountry_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "Position", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestPosition(String value) {
        return new JAXBElement<String>(_CorrespondentRequestPosition_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "MobileNumber1", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestMobileNumber1(String value) {
        return new JAXBElement<String>(_CorrespondentRequestMobileNumber1_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "Address1", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestAddress1(String value) {
        return new JAXBElement<String>(_CorrespondentRequestAddress1_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "City", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestCity(String value) {
        return new JAXBElement<String>(_CorrespondentRequestCity_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "MobileNumber2", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestMobileNumber2(String value) {
        return new JAXBElement<String>(_CorrespondentRequestMobileNumber2_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "Address2", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestAddress2(String value) {
        return new JAXBElement<String>(_CorrespondentRequestAddress2_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "Title", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestTitle(String value) {
        return new JAXBElement<String>(_CorrespondentRequestTitle_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "Forename", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestForename(String value) {
        return new JAXBElement<String>(_CorrespondentRequestForename_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "FaxNumber", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestFaxNumber(String value) {
        return new JAXBElement<String>(_CorrespondentRequestFaxNumber_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "Middlename", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestMiddlename(String value) {
        return new JAXBElement<String>(_CorrespondentRequestMiddlename_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "CorrespondentName", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestCorrespondentName(String value) {
        return new JAXBElement<String>(_CorrespondentRequestCorrespondentName_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "CorrespondentNumber", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestCorrespondentNumber(String value) {
        return new JAXBElement<String>(_CorrespondentRequestCorrespondentNumber_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "CorrespondentCompany", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestCorrespondentCompany(String value) {
        return new JAXBElement<String>(_CorrespondentRequestCorrespondentCompany_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "EmailID", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestEmailID(String value) {
        return new JAXBElement<String>(_CorrespondentRequestEmailID_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "TelephoneNumber", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestTelephoneNumber(String value) {
        return new JAXBElement<String>(_CorrespondentRequestTelephoneNumber_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "ClaimReference", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestClaimReference(String value) {
        return new JAXBElement<String>(_CorrespondentRequestClaimReference_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "BuildingFloor", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestBuildingFloor(String value) {
        return new JAXBElement<String>(_CorrespondentRequestBuildingFloor_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "County", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestCounty(String value) {
        return new JAXBElement<String>(_CorrespondentRequestCounty_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "TownCode", scope = CorrespondentRequest.class)
    public JAXBElement<String> createCorrespondentRequestTownCode(String value) {
        return new JAXBElement<String>(_CorrespondentRequestTownCode_QNAME, String.class, CorrespondentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "Result", scope = CertificateResponse.class)
    public JAXBElement<String> createCertificateResponseResult(String value) {
        return new JAXBElement<String>(_CertificateResponseResult_QNAME, String.class, CertificateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "InceptionDate", scope = CertificateInfoRequest.class)
    public JAXBElement<XMLGregorianCalendar> createCertificateInfoRequestInceptionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CertificateInfoRequestInceptionDate_QNAME, XMLGregorianCalendar.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "EntityCode", scope = CertificateInfoRequest.class)
    public JAXBElement<String> createCertificateInfoRequestEntityCode(String value) {
        return new JAXBElement<String>(_CertificateInfoRequestEntityCode_QNAME, String.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "StartDate", scope = CertificateInfoRequest.class)
    public JAXBElement<XMLGregorianCalendar> createCertificateInfoRequestStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CertificateInfoRequestStartDate_QNAME, XMLGregorianCalendar.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "CertificateName", scope = CertificateInfoRequest.class)
    public JAXBElement<String> createCertificateInfoRequestCertificateName(String value) {
        return new JAXBElement<String>(_CertificateInfoRequestCertificateName_QNAME, String.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "CreatedDate", scope = CertificateInfoRequest.class)
    public JAXBElement<XMLGregorianCalendar> createCertificateInfoRequestCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CertificateInfoRequestCreatedDate_QNAME, XMLGregorianCalendar.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "CertificateNumber", scope = CertificateInfoRequest.class)
    public JAXBElement<String> createCertificateInfoRequestCertificateNumber(String value) {
        return new JAXBElement<String>(_CertificateInfoRequestCertificateNumber_QNAME, String.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "CertificateStatus", scope = CertificateInfoRequest.class)
    public JAXBElement<Integer> createCertificateInfoRequestCertificateStatus(Integer value) {
        return new JAXBElement<Integer>(_CertificateInfoRequestCertificateStatus_QNAME, Integer.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "BillingMethod", scope = CertificateInfoRequest.class)
    public JAXBElement<String> createCertificateInfoRequestBillingMethod(String value) {
        return new JAXBElement<String>(_CertificateInfoRequestBillingMethod_QNAME, String.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "PolicyNumber", scope = CertificateInfoRequest.class)
    public JAXBElement<String> createCertificateInfoRequestPolicyNumber(String value) {
        return new JAXBElement<String>(_CertificateInfoRequestPolicyNumber_QNAME, String.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "OtherReference", scope = CertificateInfoRequest.class)
    public JAXBElement<String> createCertificateInfoRequestOtherReference(String value) {
        return new JAXBElement<String>(_CertificateInfoRequestOtherReference_QNAME, String.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "EndDate", scope = CertificateInfoRequest.class)
    public JAXBElement<XMLGregorianCalendar> createCertificateInfoRequestEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CertificateInfoRequestEndDate_QNAME, XMLGregorianCalendar.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "BillingDate", scope = CertificateInfoRequest.class)
    public JAXBElement<XMLGregorianCalendar> createCertificateInfoRequestBillingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CertificateInfoRequestBillingDate_QNAME, XMLGregorianCalendar.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "BasePackage", scope = CertificateInfoRequest.class)
    public JAXBElement<String> createCertificateInfoRequestBasePackage(String value) {
        return new JAXBElement<String>(_CertificateInfoRequestBasePackage_QNAME, String.class, CertificateInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "EnvironmentData", scope = Request.class)
    public JAXBElement<EnvironmentData> createRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_RequestEnvironmentData_QNAME, EnvironmentData.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/CertificateService/2016/06", name = "request", scope = CreateOrUpdateCertificate.class)
    public JAXBElement<Request> createCreateOrUpdateCertificateRequest(Request value) {
        return new JAXBElement<Request>(_CreateOrUpdateCertificateRequest_QNAME, Request.class, CreateOrUpdateCertificate.class, value);
    }

}
