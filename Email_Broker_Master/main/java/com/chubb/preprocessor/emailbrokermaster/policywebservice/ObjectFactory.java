package com.chubb.preprocessor.emailbrokermaster.policywebservice;

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
 * generated in the com.ace.dtsi.integration.jaxb package. 
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

    
    private static final  QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private static final  QName _PolicyResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyResponse");
    private static final  QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private static final  QName _CoverageResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "CoverageResponse");   
    private static final  QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private static final  QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private static final  QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private static final  QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private static final  QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private static final  QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private static final  QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private static final  QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private static final  QName _PolicyCoverageResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyCoverageResponse");
    private static final  QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private static final  QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private static final  QName _ArrayOfPolicyResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ArrayOfPolicyResponse");
    private static final  QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private static final  QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private static final  QName _ArrayOfCoverageResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfCoverageResponse");
    private static final  QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private static final  QName _Response_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Response");
    private static final  QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private static final  QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private static final  QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private static final  QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private static final  QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private static final  QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private static final  QName _FeedPolicyResponseUWOverAllResult_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "OverAllResult");
    private static final  QName _CoverageResponseCoverageDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "CoverageDescription");
    private static final  QName _CoverageResponseCoverageResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "CoverageResult");
    private static final  QName _PolicyCoverageResponseCoverageResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "CoverageResponse");
    private static final  QName _PolicyResponseDescription_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Description");
    private static final  QName _CreateOrUpdatePolicyResponseElementCreateOrUpdatePolicyResult_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "CreateOrUpdatePolicyResult");
    
   
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ace.dtsi.integration.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOrUpdatePolicyProducerReferenceElement }
     * 
     */
  

    /**
     * Create an instance of {@link CreateOrUpdatePolicyResponseElement }
     * 
     */
    public CreateOrUpdatePolicyResponseElement createCreateOrUpdatePolicyResponseElement() {
        return new CreateOrUpdatePolicyResponseElement();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link GetPolicyBatchElement }
     * 
     */
   



    /**
     * Create an instance of {@link PolicyCoverageResponse }
     * 
     */
    public PolicyCoverageResponse createPolicyCoverageResponse() {
        return new PolicyCoverageResponse();
    }

  


    /**
     * Create an instance of {@link ArrayOfPolicyResponse }
     * 
     */
    public ArrayOfPolicyResponse createArrayOfPolicyResponse() {
        return new ArrayOfPolicyResponse();
    }

    /**
     * Create an instance of {@link PolicyDetails }
     * 
     */
    

    /**
     * Create an instance of {@link ArrayOfExtractPolicyInfo }
     * 
     */
   
    /**
     * Create an instance of {@link PolicyResponse }
     * 
     */
    public PolicyResponse createPolicyResponse() {
        return new PolicyResponse();
    }

    /**
     * Create an instance of {@link PolicyInfo }
     * 
     */
  
    /**
     * Create an instance of {@link ArrayOfCoverageResponse }
     * 
     */
    public ArrayOfCoverageResponse createArrayOfCoverageResponse() {
        return new ArrayOfCoverageResponse();
    }

    /**
     * Create an instance of {@link CoverageResponse }
     * 
     */
    public CoverageResponse createCoverageResponse() {
        return new CoverageResponse();
    }

   
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyDetails }{@code >}}
     * 
     */
  
   
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyResponse")
    public JAXBElement<PolicyResponse> createPolicyResponse(PolicyResponse value) {
        return new JAXBElement<PolicyResponse>(_PolicyResponse_QNAME, PolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyBatchResponse }{@code >}}
     * 
     */
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedPolicyrequest }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoverageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "CoverageResponse")
    public JAXBElement<CoverageResponse> createCoverageResponse(CoverageResponse value) {
        return new JAXBElement<CoverageResponse>(_CoverageResponse_QNAME, CoverageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtractResponse }{@code >}}
     * 
     */
   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProgrammeType }{@code >}}
     * 
     */
     /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoverageRequest }{@code >}}
     * 
     */
  
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPolNumberPattern }{@code >}}
     * 
     */
   
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyBatchRequest }{@code >}}
     * 
     */
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedRequestDataUW }{@code >}}
     * 
     */
    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItemRequest }{@code >}}
     * 
     */
   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedPolicyResponse }{@code >}}
     * 
     */
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyCoverageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyCoverageResponse")
    public JAXBElement<PolicyCoverageResponse> createPolicyCoverageResponse(PolicyCoverageResponse value) {
        return new JAXBElement<PolicyCoverageResponse>(_PolicyCoverageResponse_QNAME, PolicyCoverageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyItemRequest }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedpolResponse }{@code >}}
     * 
     */
   

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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "ArrayOfPolicyResponse")
    public JAXBElement<ArrayOfPolicyResponse> createArrayOfPolicyResponse(ArrayOfPolicyResponse value) {
        return new JAXBElement<ArrayOfPolicyResponse>(_ArrayOfPolicyResponse_QNAME, ArrayOfPolicyResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtractPolicyInfo }{@code >}}
     * 
     */
   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeedUWPolicyResponse }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoverageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "ArrayOfCoverageResponse")
    public JAXBElement<ArrayOfCoverageResponse> createArrayOfCoverageResponse(ArrayOfCoverageResponse value) {
        return new JAXBElement<ArrayOfCoverageResponse>(_ArrayOfCoverageResponse_QNAME, ArrayOfCoverageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtractResponse }{@code >}}
     * 
     */
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedUWPolicyResponse }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PolRequest }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteExtractResponse }{@code >}}
     * 
     */
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPolicyDetails }{@code >}}
     * 
     */
   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSegmentResponse }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyRequest }{@code >}}
     * 
     */
    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgrammeType }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    

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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPolicyInfo }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
   

    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "CoverageDescription", scope = CoverageResponse.class)
    public JAXBElement<String> createCoverageResponseCoverageDescription(String value) {
        return new JAXBElement<String>(_CoverageResponseCoverageDescription_QNAME, String.class, CoverageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "CoverageResult", scope = CoverageResponse.class)
    public JAXBElement<String> createCoverageResponseCoverageResult(String value) {
        return new JAXBElement<String>(_CoverageResponseCoverageResult_QNAME, String.class, CoverageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyItemResponse }{@code >}}
     * 
     */
  

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "CoverageResponse", scope = PolicyCoverageResponse.class)
    public JAXBElement<ArrayOfCoverageResponse> createPolicyCoverageResponseCoverageResponse(ArrayOfCoverageResponse value) {
        return new JAXBElement<ArrayOfCoverageResponse>(_PolicyCoverageResponseCoverageResponse_QNAME, ArrayOfCoverageResponse.class, PolicyCoverageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "OverAllResult", scope = PolicyCoverageResponse.class)
    public JAXBElement<String> createPolicyCoverageResponseOverAllResult(String value) {
        return new JAXBElement<String>(_FeedPolicyResponseUWOverAllResult_QNAME, String.class, PolicyCoverageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "Description", scope = PolicyResponse.class)
    public JAXBElement<String> createPolicyResponseDescription(String value) {
        return new JAXBElement<String>(_PolicyResponseDescription_QNAME, String.class, PolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoverageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "CoverageResponse", scope = PolicyResponse.class)
    public JAXBElement<ArrayOfCoverageResponse> createPolicyResponseCoverageResponse(ArrayOfCoverageResponse value) {
        return new JAXBElement<ArrayOfCoverageResponse>(_PolicyCoverageResponseCoverageResponse_QNAME, ArrayOfCoverageResponse.class, PolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
   

   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "OverAllResult", scope = Response.class)
    public JAXBElement<String> createResponseOverAllResult(String value) {
        return new JAXBElement<String>(_FeedPolicyResponseUWOverAllResult_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyResponse", scope = Response.class)
    public JAXBElement<ArrayOfPolicyResponse> createResponsePolicyResponse(ArrayOfPolicyResponse value) {
        return new JAXBElement<ArrayOfPolicyResponse>(_PolicyResponse_QNAME, ArrayOfPolicyResponse.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/PolicyService/2016/06", name = "CreateOrUpdatePolicyResult", scope = CreateOrUpdatePolicyResponseElement.class)
    public JAXBElement<Response> createCreateOrUpdatePolicyResponseElementCreateOrUpdatePolicyResult(Response value) {
        return new JAXBElement<Response>(_CreateOrUpdatePolicyResponseElementCreateOrUpdatePolicyResult_QNAME, Response.class, CreateOrUpdatePolicyResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
  
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
  
   


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeedRequestData }{@code >}}
     * 
     */
    
   
    
   

}
