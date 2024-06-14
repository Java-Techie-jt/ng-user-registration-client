
package com.chubb.workview.generalfileservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;




/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chubb.workview.generalfile._2016._06 package. 
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

	private static final  QName _GeneralFileResponse_QNAME = new QName("http://Chubb.com/WorkView/GeneralFileService/2016/06", "GeneralFileResponse");
    private static final  QName _GeneralFileResponseResult_QNAME = new QName("http://Chubb.com/WorkView/GeneralFileService/2016/06", "Result");
    private static final  QName _GeneralFileResponseGeneralFileNumber_QNAME = new QName("http://Chubb.com/WorkView/GeneralFileService/2016/06", "GeneralFileNumber");
	
	private static final  QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private static final  QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private static final  QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private static final  QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private static final  QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private static final  QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private static final  QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private static final  QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private static final  QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private static final  QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private static final  QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private static final  QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private static final  QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private static final  QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private static final  QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private static final  QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private static final  QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private static final  QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private static final  QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private static final  QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private static final  QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
	
	private static final  QName _Request_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "Request");
    private static final  QName _GeneralFileRequestDetails_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "GeneralFileRequestDetails");
    private static final  QName _Response_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "Response");
    private static final  QName _EnvironmentData_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "EnvironmentData");
    private static final  QName _ArrayOfGeneralFileRequestDetails_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "ArrayOfGeneralFileRequestDetails");
    private static final  QName _ResponseGeneralFileResponse_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "GeneralFileResponse");
    private static final  QName _ResponseOverAllResult_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "OverAllResult");
    private static final  QName _CreateOrUpdateGeneralFileRequest_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "request");
    private static final  QName _GeneralFileRequestDetailsIsClosed_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "IsClosed");
    private static final  QName _GeneralFileRequestDetailsCompanyType_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "CompanyType");
    private static final  QName _GeneralFileRequestDetailsIsLocked_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "IsLocked");
    private static final  QName _GeneralFileRequestDetailsIsSavedOnce_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "IsSavedOnce");
    private static final  QName _GeneralFileRequestDetailsBordereauxPeriod_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "BordereauxPeriod");
    private static final  QName _GeneralFileRequestDetailsIsMigrated_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "IsMigrated");
    private static final  QName _GeneralFileRequestDetailsDescription_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "Description");
    private static final  QName _GeneralFileRequestDetailsIsFile_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "IsFile");
    private static final  QName _GeneralFileRequestDetailsStatus_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "Status");
    private static final  QName _GeneralFileRequestDetailsProductCode_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "ProductCode");
    private static final  QName _GeneralFileRequestDetailsWeekNumber_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "WeekNumber");
    private static final  QName _GeneralFileRequestDetailsDocumentTypeCode_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "DocumentTypeCode");
    private static final  QName _GeneralFileRequestDetailsFileNumber_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "FileNumber");
    private static final  QName _GeneralFileRequestDetailsBookingPeriod_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "BookingPeriod");
    private static final  QName _GeneralFileRequestDetailsCountryCode_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "CountryCode");
    private static final  QName _GeneralFileRequestDetailsParentFileCaseId_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "ParentFileCaseId");
    private static final  QName _GeneralFileRequestDetailsRegistrationSystemReference_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "RegistrationSystemReference");
    private static final  QName _GeneralFileRequestDetailsIsOnCompliance_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "IsOnCompliance");
    private static final  QName _CreateOrUpdateGeneralFileResponseCreateOrUpdateGeneralFileResult_QNAME = new QName("http://Chubb.com/WorkView/GeneralFile/2016/06", "CreateOrUpdateGeneralFileResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chubb.workview.generalfile._2016._06
     * 
     */
    public ObjectFactory() {
        //Nothing
    }

    public GeneralFileResponse createGeneralFileResponse() {
        return new GeneralFileResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFileService/2016/06", name = "GeneralFileResponse")
    public JAXBElement<GeneralFileResponse> createGeneralFileResponse(GeneralFileResponse value) {
        return new JAXBElement<GeneralFileResponse>(_GeneralFileResponse_QNAME, GeneralFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFileService/2016/06", name = "Result", scope = GeneralFileResponse.class)
    public JAXBElement<String> createGeneralFileResponseResult(String value) {
        return new JAXBElement<String>(_GeneralFileResponseResult_QNAME, String.class, GeneralFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFileService/2016/06", name = "GeneralFileNumber", scope = GeneralFileResponse.class)
    public JAXBElement<String> createGeneralFileResponseGeneralFileNumber(String value) {
        return new JAXBElement<String>(_GeneralFileResponseGeneralFileNumber_QNAME, String.class, GeneralFileResponse.class, value);
    }
    
    
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
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
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link GeneralFileRequestDetails }
     * 
     */
    public GeneralFileRequestDetails createGeneralFileRequestDetails() {
        return new GeneralFileRequestDetails();
    }

    /**
     * Create an instance of {@link EnvironmentData }
     * 
     */
    public EnvironmentData createEnvironmentData() {
        return new EnvironmentData();
    }

    /**
     * Create an instance of {@link CreateOrUpdateGeneralFile }
     * 
     */
    public CreateOrUpdateGeneralFile createCreateOrUpdateGeneralFile() {
        return new CreateOrUpdateGeneralFile();
    }

    /**
     * Create an instance of {@link CreateOrUpdateGeneralFileResponse }
     * 
     */
    public CreateOrUpdateGeneralFileResponse createCreateOrUpdateGeneralFileResponse() {
        return new CreateOrUpdateGeneralFileResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGeneralFileRequestDetails }
     * 
     */
    public ArrayOfGeneralFileRequestDetails createArrayOfGeneralFileRequestDetails() {
        return new ArrayOfGeneralFileRequestDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "Request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralFileRequestDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "GeneralFileRequestDetails")
    public JAXBElement<GeneralFileRequestDetails> createGeneralFileRequestDetails(GeneralFileRequestDetails value) {
        return new JAXBElement<GeneralFileRequestDetails>(_GeneralFileRequestDetails_QNAME, GeneralFileRequestDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "EnvironmentData")
    public JAXBElement<EnvironmentData> createEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeneralFileRequestDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "ArrayOfGeneralFileRequestDetails")
    public JAXBElement<ArrayOfGeneralFileRequestDetails> createArrayOfGeneralFileRequestDetails(ArrayOfGeneralFileRequestDetails value) {
        return new JAXBElement<ArrayOfGeneralFileRequestDetails>(_ArrayOfGeneralFileRequestDetails_QNAME, ArrayOfGeneralFileRequestDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "GeneralFileResponse", scope = Response.class)
    public JAXBElement<GeneralFileResponse> createResponseGeneralFileResponse(GeneralFileResponse value) {
        return new JAXBElement<GeneralFileResponse>(_ResponseGeneralFileResponse_QNAME, GeneralFileResponse.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "OverAllResult", scope = Response.class)
    public JAXBElement<String> createResponseOverAllResult(String value) {
        return new JAXBElement<String>(_ResponseOverAllResult_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "request", scope = CreateOrUpdateGeneralFile.class)
    public JAXBElement<Request> createCreateOrUpdateGeneralFileRequest(Request value) {
        return new JAXBElement<Request>(_CreateOrUpdateGeneralFileRequest_QNAME, Request.class, CreateOrUpdateGeneralFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "IsClosed", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsIsClosed(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsIsClosed_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "CompanyType", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsCompanyType(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsCompanyType_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "IsLocked", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsIsLocked(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsIsLocked_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "IsSavedOnce", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsIsSavedOnce(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsIsSavedOnce_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "BordereauxPeriod", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsBordereauxPeriod(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsBordereauxPeriod_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "IsMigrated", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsIsMigrated(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsIsMigrated_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "Description", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsDescription(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsDescription_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "IsFile", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsIsFile(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsIsFile_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "Status", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsStatus(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsStatus_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "ProductCode", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsProductCode(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsProductCode_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "WeekNumber", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsWeekNumber(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsWeekNumber_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "DocumentTypeCode", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsDocumentTypeCode(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsDocumentTypeCode_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "FileNumber", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsFileNumber(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsFileNumber_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "BookingPeriod", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsBookingPeriod(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsBookingPeriod_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "CountryCode", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsCountryCode(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsCountryCode_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "ParentFileCaseId", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsParentFileCaseId(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsParentFileCaseId_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "RegistrationSystemReference", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsRegistrationSystemReference(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsRegistrationSystemReference_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "IsOnCompliance", scope = GeneralFileRequestDetails.class)
    public JAXBElement<String> createGeneralFileRequestDetailsIsOnCompliance(String value) {
        return new JAXBElement<String>(_GeneralFileRequestDetailsIsOnCompliance_QNAME, String.class, GeneralFileRequestDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", name = "CreateOrUpdateGeneralFileResult", scope = CreateOrUpdateGeneralFileResponse.class)
    public JAXBElement<Response> createCreateOrUpdateGeneralFileResponseCreateOrUpdateGeneralFileResult(Response value) {
        return new JAXBElement<Response>(_CreateOrUpdateGeneralFileResponseCreateOrUpdateGeneralFileResult_QNAME, Response.class, CreateOrUpdateGeneralFileResponse.class, value);
    }

}
