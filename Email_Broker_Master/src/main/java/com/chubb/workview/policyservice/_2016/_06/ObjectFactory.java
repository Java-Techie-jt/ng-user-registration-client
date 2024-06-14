
package com.chubb.workview.policyservice._2016._06;

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
 * generated in the com.chubb.workview.preprocessors.generated.policyservice package. 
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

    private final static QName _ItemResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ItemResponse");
    private final static QName _PolNumberPattern_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "PolNumberPattern");
    private final static QName _PolicyItemResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyItemResponse");
  
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _PolicyDetails_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyDetails");
    private final static QName _FeedPolicyResponseUW_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FeedPolicyResponseUW");
    private final static QName _PolicyResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyResponse");
    private final static QName _GetPolicyBatchResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "GetPolicyBatchResponse");
    private final static QName _GetPolicyInfo_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "GetPolicyInfo");
    private final static QName _ArrayOfItemResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfItemResponse");
    private final static QName _MeridianSegmentRequest_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "MeridianSegmentRequest");
    private final static QName _FeedPolicyrequest_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FeedPolicyrequest");
    private final static QName _MeridianSegmentResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "MeridianSegmentResponse");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _CoverageResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "CoverageResponse");
    private final static QName _ExtractResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ExtractResponse");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfProgrammeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfProgrammeType");
    private final static QName _ArrayOfFeedRequestData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfFeedRequestData");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _CoverageRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "CoverageRequest");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _ArrayOfPolNumberPattern_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfPolNumberPattern");
    private final static QName _ArrayOfSegmentRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfSegmentRequest");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _GetPolicyBatchRequest_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "GetPolicyBatchRequest");
    private final static QName _ArrayOfPolRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfPolRequest");
    private final static QName _FeedRequestDataUW_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "FeedRequestDataUW");
    private final static QName _PolicyCoverageRequest_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyCoverageRequest");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfItemRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfItemRequest");
    private final static QName _ApsyncResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ApsyncResponse");
    private final static QName _FeedPolicyResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FeedPolicyResponse");
    private final static QName _ArrayOfCertificateResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ArrayOfCertificateResponse");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _PolicyCoverageResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyCoverageResponse");
    private final static QName _PolicyItemRequest_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyItemRequest");
    private final static QName _ArrayOfFeedpolResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfFeedpolResponse");
    private final static QName _FeedpolResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "FeedpolResponse");
    private final static QName _ArrayOfCoverageRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "PolicyCoverRequest");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ArrayOfPolicyResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ArrayOfPolicyResponse");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
   
    private final static QName _ArrayOfFeedRequestDataUW_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfFeedRequestDataUW");
    private final static QName _FeddpolicyRequestUW_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FeddpolicyRequestUW");
    private final static QName _SegmentResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "SegmentResponse");
    private final static QName _ArrayOfFeedUWPolicyResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfFeedUWPolicyResponse");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ArrayOfCoverageResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfCoverageResponse");
    private final static QName _ArrayOfExtractResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfExtractResponse");
    private final static QName _ItemRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ItemRequest");
    private final static QName _FeedRequestData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "FeedRequestData");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _FeedUWPolicyResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "FeedUWPolicyResponse");
    private final static QName _Response_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Response");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _PolRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "PolRequest");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _QuoteExtractResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "QuoteExtractResponse");
    private final static QName _EnvironmentData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "EnvironmentData");
    private final static QName _ArrayOfPolicyDetails_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ArrayOfPolicyDetails");
    private final static QName _ArrayOfSegmentResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ArrayOfSegmentResponse");
    private final static QName _PolicySearchRequestExclusionParams_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "PolicySearchRequestExclusionParams");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _GetPolicyRequest_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "GetPolicyRequest");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ProgrammeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ProgrammeType");
    private final static QName _Request_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Request");
    private final static QName _PolicyInfo_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyInfo");
    private final static QName _CertificateResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "CertificateResponse");
    private final static QName _SegmentRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "SegmentRequest");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfPolicyInfo_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyRequest");
    private final static QName _PolicyCoverageRequestPolCoverageRequest_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolCoverageRequest");
    private final static QName _PolicyCoverageRequestEnvironmentData_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "EnvironmentData");
    private final static QName _GetPolicyBatchResponseElementGetPolicyBatchResult_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "GetPolicyBatchResult");
    private final static QName _PolicyItemRequestPolItemRequst_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolItemRequst");
    private final static QName _PolNumberPatternPolicyNumberPattern_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "PolicyNumberPattern");
    private final static QName _FeedPolicyResponseUWFeedUWPolicyResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FeedUWPolicyResponse");
    private final static QName _FeedPolicyResponseUWOverAllResult_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "OverAllResult");
    private final static QName _PolicyItemResponseItemResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ItemResponse");
    private final static QName _CreateOrUpdateQuoteElementRequest_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "request");
    private final static QName _SegmentRequestEntityShortName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "EntityShortName");
    private final static QName _SegmentRequestPolicyNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "PolicyNumber");
    private final static QName _SegmentRequestSegmentCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "SegmentCode");
    private final static QName _CreateOrUpdatePolicyProducerReferenceResponseElementCreateOrUpdatePolicyProducerReferenceResult_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "CreateOrUpdatePolicyProducerReferenceResult");
    private final static QName _GetPolicyResponseElementGetPolicyResult_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "GetPolicyResult");
    private final static QName _MeridianSegmentResponseSegmentResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "SegmentResponse");
    private final static QName _ApsyncUpdateStatusElementEnvironmentData_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "EnvironmentData");
    private final static QName _FeedPolicyResponseFeedpolResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FeedpolResponse");
    private final static QName _CreateOrUpdateQuoteResponseElementCreateOrUpdateQuoteResult_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "CreateOrUpdateQuoteResult");
    private final static QName _CoverageRequestPolicyAnnualPremium_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "PolicyAnnualPremium");
    private final static QName _CoverageRequestSubSectionCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "SubSectionCode");
    private final static QName _CoverageRequestCoveragCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "CoveragCode");
    private final static QName _CoverageRequestSectionDetailID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "SectionDetailID");
    private final static QName _CoverageRequestPOCUPR_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "POCUPR");
    private final static QName _CoverageRequestAttachmentPoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "AttachmentPoint");
    private final static QName _CoverageRequestPOCULL_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "POCULL");
    private final static QName _CoverageRequestPremiumCurrencyCD_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "PremiumCurrencyCD");
    private final static QName _CoverageRequestCurrencyCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "CurrencyCode");
    private final static QName _CoverageRequestSectionCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "SectionCode");
    private final static QName _CoverageRequestLimit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "Limit");
    private final static QName _CoverageRequestSectionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "SectionName");
    private final static QName _CoverageRequestSectionDetailTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "SectionDetailTitle");
    private final static QName _CreateOrUpdatePolicyUWResponseElementCreateOrUpdatePolicyUWResult_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "CreateOrUpdatePolicyUWResult");
    private final static QName _ItemRequestItemCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ItemCode");
    private final static QName _ItemRequestItemvalue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "Itemvalue");
    private final static QName _ItemRequestAddedBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "AddedBy");
    private final static QName _ItemRequestCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "CountryCode");
    private final static QName _ItemRequestModifiedBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ModifiedBy");
    private final static QName _CertificateResponsePolicyBackendDescription_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyBackendDescription");
    private final static QName _CertificateResponseLOBDescription_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "LOBDescription");
    private final static QName _RequestPolicyRequest_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyRequest");
    private final static QName _CreateOrUpdatePolicyCoverageResponseElementCreateOrUpdatePolicyCoverageResult_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "CreateOrUpdatePolicyCoverageResult");
    private final static QName _FeedUWPolicyResponseErrorText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ErrorText");
    private final static QName _FeedUWPolicyResponseResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "Result");
    private final static QName _GetQuoteBatchResponseElementGetQuoteBatchResult_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "GetQuoteBatchResult");
    private final static QName _MeridianSegmentRequestSegmentRequest_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "SegmentRequest");
    private final static QName _EnvironmentDataMessageGUID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "MessageGUID");
    private final static QName _EnvironmentDataWorkViewEnvironment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "WorkViewEnvironment");
    private final static QName _EnvironmentDataWorkViewLogonID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "WorkViewLogonID");
    private final static QName _EnvironmentDataSourceSystem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "SourceSystem");
    private final static QName _CreateOrUpdateMeridianSegmentResponseElementCreateOrUpdateMeridianSegmentResult_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "CreateOrUpdateMeridianSegmentResult");
    private final static QName _ApsyncUpdateStatusResponseElementApsyncUpdateStatusResult_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "ApsyncUpdateStatusResult");
    private final static QName _PolRequestBrokerReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "BrokerReference");
    private final static QName _PolRequestQuoteNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "QuoteNumber");
    private final static QName _PolRequestUnderwriterLanID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "UnderwriterLanID");
    private final static QName _PolRequestCertificateNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "CertificateNumber");
    private final static QName _PolRequestExclusionParams_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ExclusionParams");
    private final static QName _PolRequestLOBGroupDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "LOBGroupDescription");
    private final static QName _FeedRequestDataUWXXUWR_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "XXUWR");
    private final static QName _FeedRequestDataUWXXSPC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "XXSPC");
    private final static QName _FeedRequestDataUWXXISOC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "XXISOC");
    private final static QName _FeedRequestDataUWMAPORF_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "MAPORF");
    private final static QName _CreateOrUpdatePolicyResponseElementCreateOrUpdatePolicyResult_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "CreateOrUpdatePolicyResult");
    private final static QName _PolicyInfoCurrencyCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "CurrencyCode");
    private final static QName _PolicyInfoBackendLockedFlag_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "BackendLockedFlag");
    private final static QName _PolicyInfoAccountingIndicatorPremiumPaid_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "AccountingIndicatorPremiumPaid");
    private final static QName _PolicyInfoFreedomofServicesFlagCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FreedomofServicesFlagCode");
    private final static QName _PolicyInfoCoverageExtention_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "CoverageExtention");
    private final static QName _PolicyInfoAdjustmentCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "AdjustmentCode");
    private final static QName _PolicyInfoPolicyGUID_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyGUID");
    private final static QName _PolicyInfoProducerCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ProducerCode");
    private final static QName _PolicyInfoPortfolioSubClass_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PortfolioSubClass");
    private final static QName _PolicyInfoRefreshRate_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "RefreshRate");
    private final static QName _PolicyInfoPolicyCoverRequest_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyCoverRequest");
    private final static QName _PolicyInfoInsuredName_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "InsuredName");
    private final static QName _PolicyInfoPolicyQuoteNumber_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyQuoteNumber");
    private final static QName _PolicyInfoInterfMarkI_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "InterfMark_I");
    private final static QName _PolicyInfoTaxPosition_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "TaxPosition");
    private final static QName _PolicyInfoAntiMoneyLaunderingBranch_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "AntiMoneyLaunderingBranch");
    private final static QName _PolicyInfoPOCULL_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "POCULL");
    private final static QName _PolicyInfoGENNEXTpolicy_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "GENNEXTpolicy");
    private final static QName _PolicyInfoPremiumModificationCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PremiumModificationCode");
    private final static QName _PolicyInfoPOCUPR_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "POCUPR");
    private final static QName _PolicyInfoNationalAssociationofInsuranceCommissionersExtension_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "NationalAssociationofInsuranceCommissionersExtension");
    private final static QName _PolicyInfoBusinessDescription_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "BusinessDescription");
    private final static QName _PolicyInfoRiskReferenceNo_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "RiskReferenceNo");
    private final static QName _PolicyInfoBusinessProcessingUnitCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "BusinessProcessingUnitCode");
    private final static QName _PolicyInfoInsuranceCompanyCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "InsuranceCompanyCode");
    private final static QName _PolicyInfoSegmentCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "SegmentCode");
    private final static QName _PolicyInfoPortfolioClass_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PortfolioClass");
    private final static QName _PolicyInfoPaymentTypeCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PaymentTypeCode");
    private final static QName _PolicyInfoDDMandateNumber_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "DDMandateNumber");
    private final static QName _PolicyInfoInsuredCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "InsuredCode");
    private final static QName _PolicyInfoDocumentPerCurrency_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "DocumentPerCurrency");
    private final static QName _PolicyInfoCamp02_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Camp02");
    private final static QName _PolicyInfoPrefixMid_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PrefixMid");
    private final static QName _PolicyInfoFrequencyRebilling_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FrequencyRebilling");
    private final static QName _PolicyInfoBankAccountNumber_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "BankAccountNumber");
    private final static QName _PolicyInfoBillingMethodCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "BillingMethodCode");
    private final static QName _PolicyInfoProductCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ProductCode");
    private final static QName _PolicyInfoPolicyStateID_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyStateID");
    private final static QName _PolicyInfoLiqDifCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "LiqDifCode");
    private final static QName _PolicyInfoPolicyCountryCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyCountryCode");
    private final static QName _PolicyInfoGENNEXTLockID_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "GENNEXTLockID");
    private final static QName _PolicyInfoPolicyHolder_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyHolder");
    private final static QName _PolicyInfoMasterPolicyNumber_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "MasterPolicyNumber");
    private final static QName _PolicyInfoBusinessInterruption_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "BusinessInterruption");
    private final static QName _PolicyInfoMultinationalCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "MultinationalCode");
    private final static QName _PolicyInfoCommissionorCollection1Code_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "CommissionorCollection1Code");
    private final static QName _PolicyInfoFlagValue_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FlagValue");
    private final static QName _PolicyInfoPolicyPeriod_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyPeriod");
    private final static QName _PolicyInfoProgrammeTypeCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ProgrammeTypeCode");
    private final static QName _PolicyInfoTacitlyRenewedIndicator_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "TacitlyRenewedIndicator");
    private final static QName _PolicyInfoComplaintReference_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ComplaintReference");
    private final static QName _PolicyInfoCountryCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "CountryCode");
    private final static QName _PolicyInfoTypeofInsurance_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "TypeofInsurance");
    private final static QName _PolicyInfoENDRC_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ENDRC");
    private final static QName _PolicyInfoPolicyMarkOLE_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyMarkOLE");
    private final static QName _PolicyInfoCommissionorCollection2Code_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "CommissionorCollection2Code");
    private final static QName _PolicyInfoRenewalBusFlag_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "RenewalBusFlag");
    private final static QName _PolicyInfoPACPRCD2_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PACPR_CD_2");
    private final static QName _PolicyInfoUser_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "User");
    private final static QName _PolicyInfoDocum_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Docum");
    private final static QName _PolicyInfoUnderwriterAreaShortname_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "UnderwriterAreaShortname");
    private final static QName _PolicyInfoLeader_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Leader");
    private final static QName _PolicyInfoTypeofAssurance_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "TypeofAssurance");
    private final static QName _PolicyInfoUpdateDatabase_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "UpdateDatabase");
    private final static QName _PolicyInfoEndorsementIndicator_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "EndorsementIndicator");
    private final static QName _PolicyInfoSISBrokerCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "SISBrokerCode");
    private final static QName _PolicyInfoHistoricalReference_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "HistoricalReference");
    private final static QName _PolicyInfoVNAB_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "VNAB");
    private final static QName _PolicyInfoQuoteNumber_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "QuoteNumber");
    private final static QName _PolicyInfoSalesPlanCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "SalesPlanCode");
    private final static QName _PolicyInfoBrokerReference_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "BrokerReference");
    private final static QName _PolicyInfoReasonForMovement_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ReasonForMovement");
    private final static QName _PolicyInfoPolicySite_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicySite");
    private final static QName _PolicyInfoEntityCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "EntityCode");
    private final static QName _PolicyInfoEntityShortName_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "EntityShortName");
    private final static QName _PolicyInfoCancelledOperation_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "CancelledOperation");
    private final static QName _PolicyInfoIsMigrated_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Is_Migrated");
    private final static QName _PolicyInfoDirectAssumedCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "DirectAssumedCode");
    private final static QName _PolicyInfoPACPRCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PACPRCode");
    private final static QName _PolicyInfoDistributionChannelCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "DistributionChannelCode");
    private final static QName _PolicyInfoStandardIndustrialClassificationCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "StandardIndustrialClassificationCode");
    private final static QName _PolicyInfoExclusiveFlagCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ExclusiveFlagCode");
    private final static QName _PolicyInfoNorthAmericanIndustrialClassificationSystemDetails_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "NorthAmericanIndustrialClassificationSystemDetails");
    private final static QName _PolicyInfoSalesPersonID_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "SalesPersonID");
    private final static QName _PolicyInfoDepartmentCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "DepartmentCode");
    private final static QName _PolicyInfoFieldOfficeCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FieldOfficeCode");
    private final static QName _PolicyInfoPolicyShare_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyShare");
    private final static QName _PolicyInfoPolicyNumber_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PolicyNumber");
    private final static QName _PolicyInfoCoverage_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Coverage");
    private final static QName _GetPolicyBatchResponseExtractPolicy_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ExtractPolicy");
    private final static QName _GetQuoteBatchElementResponse_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "response");
    private final static QName _ItemResponseDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "Description");
    private final static QName _PolicyResponseDescription_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Description");
    private final static QName _PolicyResponseCoverageResponse_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "CoverageResponse");
    private final static QName _PolicyDetailsMasterPolicy_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "MasterPolicy");
    private final static QName _PolicyDetailsBusinessSizeCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "BusinessSizeCode");
    private final static QName _PolicyDetailsUnderwriterAreaShortName_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "UnderwriterAreaShortName");
    private final static QName _PolicyDetailsProgrammeTypeDescription_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "ProgrammeTypeDescription");
    private final static QName _PolicyDetailsBrokerOpertionNumber_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "BrokerOpertionNumber");
    private final static QName _PolicyDetailsStateDescription_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "StateDescription");
    private final static QName _PolicyDetailsBackEndSytem_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "BackEndSytem");
    private final static QName _PolicyDetailsStandardIndustrialClassificationDescription_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "StandardIndustrialClassificationDescription");
    private final static QName _PolicyDetailsCorrespondentName_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "CorrespondentName");
    private final static QName _PolicyDetailsCaseDescription_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "CaseDescription");
    private final static QName _PolicyDetailsPtypeDescription_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PtypeDescription");
    private final static QName _PolicyDetailsFieldOfficeDescription_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FieldOfficeDescription");
    private final static QName _PolicyDetailsUnderwriterLanID_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "UnderwriterLanID");
    private final static QName _PolicyDetailsStandarInsustrialCodeDescriptionCodeDesc_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "StandarInsustrialCodeDescriptionCodeDesc");
    private final static QName _PolicyDetailsEnvironment_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Environment");
    private final static QName _PolicyDetailsEndorsementNumber_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "EndorsementNumber");
    private final static QName _PolicyDetailsBusinessdescription_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Businessdescription");
    private final static QName _PolicyDetailsAPPlication_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "APPlication");
    private final static QName _PolicyDetailsMultiNationalCode_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "MultiNationalCode");
    private final static QName _PolicyDetailsPreventTransfer_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "PreventTransfer");
    private final static QName _PolicyDetailsSanctionStatus_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "SanctionStatus");
    private final static QName _PolicyDetailsRiskReferenceNumber_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "RiskReferenceNumber");
    private final static QName _PolicyDetailsPeriod_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "Period");
    private final static QName _CoverageResponseCoverageDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "CoverageDescription");
    private final static QName _CoverageResponseCoverageResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "CoverageResult");
    private final static QName _ApsyncResponseOverAllResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "OverAllResult");
    private final static QName _FeedRequestDataNINU1CD_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "NINU1CD");
    private final static QName _FeedRequestDataBDBDR1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "BDBDR1");
   
       private final static QName _PolicySearchRequestExclusionParamsProgrammeTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "ProgrammeTypes");
    private final static QName _PolicySearchRequestExclusionParamsPolicyNumberPatterns_QNAME = new QName("http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", "PolicyNumberPatterns");
    private final static QName _FeedPolicyrequestFeedRequestData_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FeedRequestData");
    private final static QName _FeddpolicyRequestUWFeedRequestDataUW_QNAME = new QName("http://Chubb.com/WorkView/PolicyService/2016/06", "FeedRequestDataUW");
   
    private final static QName _CreateOrUpdatePolicyItemElementPolicyItemRequest_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "policyItemRequest");
    private final static QName _CreateOrUpdatePolicyItemResponseElementCreateOrUpdatePolicyItemResult_QNAME = new QName("http://chubb.com/WorkView/PolicyService/2016/06", "CreateOrUpdatePolicyItemResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chubb.workview.preprocessors.generated.policyservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOrUpdatePolicyProducerReferenceElement }
     * 
     */
   

    /**
     * Create an instance of {@link CreateOrUpdatePolicyProducerReferenceResponseElement }
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
     * Create an instance of {@link CreateOrUpdatePolicyUWElement }
     * 
     */
    
    /**
     * Create an instance of {@link CreateOrUpdatePolicyElement }
     * 
     */
    public CreateOrUpdatePolicyElement createCreateOrUpdatePolicyElement() {
        return new CreateOrUpdatePolicyElement();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link CreateOrUpdatePolicyCoverageElement }
     * 
     */
    

    /**
     * Create an instance of {@link PolicyCoverageRequest }
     * 
     */
    

    /**
     * Create an instance of {@link PolicyItemRequest }
     * 
     */
   

    /**
     * Create an instance of {@link GetPolicyResponseElement }
     * 
     */
    

    /**
     * Create an instance of {@link ApsyncUpdateStatusElement }
     * 
     */
    
    /**
     * Create an instance of {@link EnvironmentData }
     * 
     */
    public EnvironmentData createEnvironmentData() {
        return new EnvironmentData();
    }

    /**
     * Create an instance of {@link CreateOrUpdatePolicyUWResponseElement }
     * 
     */
   
    /**
     * Create an instance of {@link FeedPolicyResponseUW }
     * 
     */
    

    /**
     * Create an instance of {@link PolicyItemResponse }
     * 
     */
   

    /**
     * Create an instance of {@link MeridianSegmentResponse }
     * 
     */
   

    /**
     * Create an instance of {@link ApsyncResponse }
     * 
     */
    

    /**
     * Create an instance of {@link MeridianSegmentRequest }
     * 
     */
    
    /**
     * Create an instance of {@link GetPolicyBatchResponse }
     * 
     */
    
    /**
     * Create an instance of {@link GetPolicyElement }
     * 
     */
    

    /**
     * Create an instance of {@link GetPolicyRequest }
     * 
     */
    

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
    public PolicyInfo createPolicyInfo() {
        return new PolicyInfo();
    }

    /**
     * Create an instance of {@link CertificateResponse }
     * 
     */
    

    /**
     * Create an instance of {@link ArrayOfPolicyDetails }
     * 
     */
    
    /**
     * Create an instance of {@link CoverageRequest }
     * 
     */
    public CoverageRequest createCoverageRequest() {
        return new CoverageRequest();
    }

    /**
     * Create an instance of {@link FeedUWPolicyResponse }
     * 
     */
   

    /**
     * Create an instance of {@link FeedRequestDataUW }
     * 
     */
    

    /**
     * Create an instance of {@link ArrayOfSegmentResponse }
     * 
     */
    

    /**
     * Create an instance of {@link SegmentRequest }
     * 
     */
    

    /**
     * Create an instance of {@link PolNumberPattern }
     * 
     */
    public PolicyCoverRequest createArrayOfCoverageRequest() {
        return new PolicyCoverRequest();
    }
    /**
     * Create an instance of {@link ArrayOfFeedUWPolicyResponse }
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

    /**
     * Create an instance of {@link ArrayOfExtractResponse }
     * 
     */
   

    /**
     * Create an instance of {@link FeedRequestData }
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtractPolicyInfo }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyDetails }{@code >}}
     * 
     */
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyResponse }{@code >}}
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItemResponse }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeridianSegmentResponse }{@code >}}
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "CoverageRequest")
    public JAXBElement<CoverageRequest> createCoverageRequest(CoverageRequest value) {
        return new JAXBElement<CoverageRequest>(_CoverageRequest_QNAME, CoverageRequest.class, null, value);
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
   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoverageRequest }{@code >}}
     * 
     */
   
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyCoverRequest")
    public JAXBElement<PolicyCoverRequest> createArrayOfCoverageRequest(PolicyCoverRequest value) {
        return new JAXBElement<PolicyCoverRequest>(_ArrayOfCoverageRequest_QNAME, PolicyCoverRequest.class, null, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "EnvironmentData")
    public JAXBElement<EnvironmentData> createEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPolicyDetails }{@code >}}
     * 
     */
    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSegmentResponse }{@code >}}
     * 
     */
    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicySearchRequestExclusionParams }{@code >}}
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
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "Request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyInfo")
    public JAXBElement<PolicyInfo> createPolicyInfo(PolicyInfo value) {
        return new JAXBElement<PolicyInfo>(_PolicyInfo_QNAME, PolicyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateResponse }{@code >}}
     * 
     */
    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegmentRequest }{@code >}}
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoverageRequest }{@code >}}
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
   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyInfo }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "PolicyAnnualPremium", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestPolicyAnnualPremium(String value) {
        return new JAXBElement<String>(_CoverageRequestPolicyAnnualPremium_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "SubSectionCode", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestSubSectionCode(String value) {
        return new JAXBElement<String>(_CoverageRequestSubSectionCode_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "CoveragCode", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestCoveragCode(String value) {
        return new JAXBElement<String>(_CoverageRequestCoveragCode_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "PolicyNumber", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestPolicyNumber(String value) {
        return new JAXBElement<String>(_SegmentRequestPolicyNumber_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "SectionDetailID", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestSectionDetailID(String value) {
        return new JAXBElement<String>(_CoverageRequestSectionDetailID_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "POCUPR", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestPOCUPR(String value) {
        return new JAXBElement<String>(_CoverageRequestPOCUPR_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "AttachmentPoint", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestAttachmentPoint(String value) {
        return new JAXBElement<String>(_CoverageRequestAttachmentPoint_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "POCULL", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestPOCULL(String value) {
        return new JAXBElement<String>(_CoverageRequestPOCULL_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "PremiumCurrencyCD", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestPremiumCurrencyCD(String value) {
        return new JAXBElement<String>(_CoverageRequestPremiumCurrencyCD_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "CurrencyCode", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestCurrencyCode(String value) {
        return new JAXBElement<String>(_CoverageRequestCurrencyCode_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "SectionCode", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestSectionCode(String value) {
        return new JAXBElement<String>(_CoverageRequestSectionCode_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "EntityShortName", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestEntityShortName(String value) {
        return new JAXBElement<String>(_SegmentRequestEntityShortName_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "Limit", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestLimit(String value) {
        return new JAXBElement<String>(_CoverageRequestLimit_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "SectionName", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestSectionName(String value) {
        return new JAXBElement<String>(_CoverageRequestSectionName_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "SectionDetailTitle", scope = CoverageRequest.class)
    public JAXBElement<String> createCoverageRequestSectionDetailTitle(String value) {
        return new JAXBElement<String>(_CoverageRequestSectionDetailTitle_QNAME, String.class, CoverageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedPolicyResponseUW }{@code >}}
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "EnvironmentData", scope = Request.class)
    public JAXBElement<EnvironmentData> createRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_PolicyCoverageRequestEnvironmentData_QNAME, EnvironmentData.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPolicyInfo }{@code >}}
     * 
     */
    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteExtractResponse }{@code >}}
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "MessageGUID", scope = EnvironmentData.class)
    public JAXBElement<String> createEnvironmentDataMessageGUID(String value) {
        return new JAXBElement<String>(_EnvironmentDataMessageGUID_QNAME, String.class, EnvironmentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "WorkViewEnvironment", scope = EnvironmentData.class)
    public JAXBElement<String> createEnvironmentDataWorkViewEnvironment(String value) {
        return new JAXBElement<String>(_EnvironmentDataWorkViewEnvironment_QNAME, String.class, EnvironmentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "WorkViewLogonID", scope = EnvironmentData.class)
    public JAXBElement<String> createEnvironmentDataWorkViewLogonID(String value) {
        return new JAXBElement<String>(_EnvironmentDataWorkViewLogonID_QNAME, String.class, EnvironmentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "SourceSystem", scope = EnvironmentData.class)
    public JAXBElement<String> createEnvironmentDataSourceSystem(String value) {
        return new JAXBElement<String>(_EnvironmentDataSourceSystem_QNAME, String.class, EnvironmentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts", name = "CountryCode", scope = EnvironmentData.class)
    public JAXBElement<String> createEnvironmentDataCountryCode(String value) {
        return new JAXBElement<String>(_ItemRequestCountryCode_QNAME, String.class, EnvironmentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedPolicyrequest }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/PolicyService/2016/06", name = "request", scope = CreateOrUpdatePolicyElement.class)
    public JAXBElement<Request> createCreateOrUpdatePolicyElementRequest(Request value) {
        return new JAXBElement<Request>(_CreateOrUpdateQuoteElementRequest_QNAME, Request.class, CreateOrUpdatePolicyElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeridianSegmentResponse }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApsyncResponse }{@code >}}
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}}
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyRequest }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "CurrencyCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoCurrencyCode(String value) {
        return new JAXBElement<String>(_PolicyInfoCurrencyCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "BackendLockedFlag", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoBackendLockedFlag(String value) {
        return new JAXBElement<String>(_PolicyInfoBackendLockedFlag_QNAME, String.class, PolicyInfo.class, value);
    }
   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "AccountingIndicatorPremiumPaid", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoAccountingIndicatorPremiumPaid(String value) {
        return new JAXBElement<String>(_PolicyInfoAccountingIndicatorPremiumPaid_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "FreedomofServicesFlagCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoFreedomofServicesFlagCode(String value) {
        return new JAXBElement<String>(_PolicyInfoFreedomofServicesFlagCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "CoverageExtention", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoCoverageExtention(String value) {
        return new JAXBElement<String>(_PolicyInfoCoverageExtention_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "AdjustmentCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoAdjustmentCode(String value) {
        return new JAXBElement<String>(_PolicyInfoAdjustmentCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyGUID", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPolicyGUID(String value) {
        return new JAXBElement<String>(_PolicyInfoPolicyGUID_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "ProducerCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoProducerCode(String value) {
        return new JAXBElement<String>(_PolicyInfoProducerCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
   

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "RefreshRate", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoRefreshRate(String value) {
        return new JAXBElement<String>(_PolicyInfoRefreshRate_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoverageRequest }{@code >}}
     * 
     */
    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "InsuredName", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoInsuredName(String value) {
        return new JAXBElement<String>(_PolicyInfoInsuredName_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyQuoteNumber", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPolicyQuoteNumber(String value) {
        return new JAXBElement<String>(_PolicyInfoPolicyQuoteNumber_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "InterfMark_I", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoInterfMarkI(String value) {
        return new JAXBElement<String>(_PolicyInfoInterfMarkI_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "TaxPosition", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoTaxPosition(String value) {
        return new JAXBElement<String>(_PolicyInfoTaxPosition_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "AntiMoneyLaunderingBranch", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoAntiMoneyLaunderingBranch(String value) {
        return new JAXBElement<String>(_PolicyInfoAntiMoneyLaunderingBranch_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "POCULL", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPOCULL(String value) {
        return new JAXBElement<String>(_PolicyInfoPOCULL_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "GENNEXTpolicy", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoGENNEXTpolicy(String value) {
        return new JAXBElement<String>(_PolicyInfoGENNEXTpolicy_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PremiumModificationCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPremiumModificationCode(String value) {
        return new JAXBElement<String>(_PolicyInfoPremiumModificationCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "POCUPR", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPOCUPR(String value) {
        return new JAXBElement<String>(_PolicyInfoPOCUPR_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "NationalAssociationofInsuranceCommissionersExtension", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoNationalAssociationofInsuranceCommissionersExtension(String value) {
        return new JAXBElement<String>(_PolicyInfoNationalAssociationofInsuranceCommissionersExtension_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "BusinessDescription", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoBusinessDescription(String value) {
        return new JAXBElement<String>(_PolicyInfoBusinessDescription_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "RiskReferenceNo", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoRiskReferenceNo(String value) {
        return new JAXBElement<String>(_PolicyInfoRiskReferenceNo_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "BusinessProcessingUnitCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoBusinessProcessingUnitCode(String value) {
        return new JAXBElement<String>(_PolicyInfoBusinessProcessingUnitCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "InsuranceCompanyCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoInsuranceCompanyCode(String value) {
        return new JAXBElement<String>(_PolicyInfoInsuranceCompanyCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "SegmentCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoSegmentCode(String value) {
        return new JAXBElement<String>(_PolicyInfoSegmentCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PortfolioClass", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPortfolioClass(String value) {
        return new JAXBElement<String>(_PolicyInfoPortfolioClass_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PaymentTypeCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPaymentTypeCode(String value) {
        return new JAXBElement<String>(_PolicyInfoPaymentTypeCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "DDMandateNumber", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoDDMandateNumber(String value) {
        return new JAXBElement<String>(_PolicyInfoDDMandateNumber_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "InsuredCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoInsuredCode(String value) {
        return new JAXBElement<String>(_PolicyInfoInsuredCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "DocumentPerCurrency", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoDocumentPerCurrency(String value) {
        return new JAXBElement<String>(_PolicyInfoDocumentPerCurrency_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "Camp02", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoCamp02(String value) {
        return new JAXBElement<String>(_PolicyInfoCamp02_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PrefixMid", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPrefixMid(String value) {
        return new JAXBElement<String>(_PolicyInfoPrefixMid_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "FrequencyRebilling", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoFrequencyRebilling(String value) {
        return new JAXBElement<String>(_PolicyInfoFrequencyRebilling_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "BankAccountNumber", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoBankAccountNumber(String value) {
        return new JAXBElement<String>(_PolicyInfoBankAccountNumber_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "BillingMethodCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoBillingMethodCode(String value) {
        return new JAXBElement<String>(_PolicyInfoBillingMethodCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "ProductCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoProductCode(String value) {
        return new JAXBElement<String>(_PolicyInfoProductCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyStateID", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPolicyStateID(String value) {
        return new JAXBElement<String>(_PolicyInfoPolicyStateID_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "LiqDifCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoLiqDifCode(String value) {
        return new JAXBElement<String>(_PolicyInfoLiqDifCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyCountryCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPolicyCountryCode(String value) {
        return new JAXBElement<String>(_PolicyInfoPolicyCountryCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "GENNEXTLockID", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoGENNEXTLockID(String value) {
        return new JAXBElement<String>(_PolicyInfoGENNEXTLockID_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyHolder", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPolicyHolder(String value) {
        return new JAXBElement<String>(_PolicyInfoPolicyHolder_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "MasterPolicyNumber", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoMasterPolicyNumber(String value) {
        return new JAXBElement<String>(_PolicyInfoMasterPolicyNumber_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "BusinessInterruption", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoBusinessInterruption(String value) {
        return new JAXBElement<String>(_PolicyInfoBusinessInterruption_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "MultinationalCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoMultinationalCode(String value) {
        return new JAXBElement<String>(_PolicyInfoMultinationalCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "CommissionorCollection1Code", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoCommissionorCollection1Code(String value) {
        return new JAXBElement<String>(_PolicyInfoCommissionorCollection1Code_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "FlagValue", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoFlagValue(String value) {
        return new JAXBElement<String>(_PolicyInfoFlagValue_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyPeriod", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPolicyPeriod(String value) {
        return new JAXBElement<String>(_PolicyInfoPolicyPeriod_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "ProgrammeTypeCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoProgrammeTypeCode(String value) {
        return new JAXBElement<String>(_PolicyInfoProgrammeTypeCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "TacitlyRenewedIndicator", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoTacitlyRenewedIndicator(String value) {
        return new JAXBElement<String>(_PolicyInfoTacitlyRenewedIndicator_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "ComplaintReference", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoComplaintReference(String value) {
        return new JAXBElement<String>(_PolicyInfoComplaintReference_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "CountryCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoCountryCode(String value) {
        return new JAXBElement<String>(_PolicyInfoCountryCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "TypeofInsurance", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoTypeofInsurance(String value) {
        return new JAXBElement<String>(_PolicyInfoTypeofInsurance_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "ENDRC", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoENDRC(String value) {
        return new JAXBElement<String>(_PolicyInfoENDRC_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyMarkOLE", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPolicyMarkOLE(String value) {
        return new JAXBElement<String>(_PolicyInfoPolicyMarkOLE_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "CommissionorCollection2Code", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoCommissionorCollection2Code(String value) {
        return new JAXBElement<String>(_PolicyInfoCommissionorCollection2Code_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "RenewalBusFlag", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoRenewalBusFlag(String value) {
        return new JAXBElement<String>(_PolicyInfoRenewalBusFlag_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PACPR_CD_2", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPACPRCD2(String value) {
        return new JAXBElement<String>(_PolicyInfoPACPRCD2_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "User", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoUser(String value) {
        return new JAXBElement<String>(_PolicyInfoUser_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "Docum", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoDocum(String value) {
        return new JAXBElement<String>(_PolicyInfoDocum_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "UnderwriterAreaShortname", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoUnderwriterAreaShortname(String value) {
        return new JAXBElement<String>(_PolicyInfoUnderwriterAreaShortname_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "Leader", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoLeader(String value) {
        return new JAXBElement<String>(_PolicyInfoLeader_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "TypeofAssurance", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoTypeofAssurance(String value) {
        return new JAXBElement<String>(_PolicyInfoTypeofAssurance_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "UpdateDatabase", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoUpdateDatabase(String value) {
        return new JAXBElement<String>(_PolicyInfoUpdateDatabase_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "EndorsementIndicator", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoEndorsementIndicator(String value) {
        return new JAXBElement<String>(_PolicyInfoEndorsementIndicator_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "SISBrokerCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoSISBrokerCode(String value) {
        return new JAXBElement<String>(_PolicyInfoSISBrokerCode_QNAME, String.class, PolicyInfo.class, value);
    }
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyRequest")
    public JAXBElement<PolicyRequest> createArrayOfPolicyInfo(PolicyRequest value) {
        return new JAXBElement<PolicyRequest>(_ArrayOfPolicyInfo_QNAME, PolicyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "HistoricalReference", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoHistoricalReference(String value) {
        return new JAXBElement<String>(_PolicyInfoHistoricalReference_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "VNAB", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoVNAB(String value) {
        return new JAXBElement<String>(_PolicyInfoVNAB_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "QuoteNumber", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoQuoteNumber(String value) {
        return new JAXBElement<String>(_PolicyInfoQuoteNumber_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "SalesPlanCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoSalesPlanCode(String value) {
        return new JAXBElement<String>(_PolicyInfoSalesPlanCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "BrokerReference", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoBrokerReference(String value) {
        return new JAXBElement<String>(_PolicyInfoBrokerReference_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "ReasonForMovement", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoReasonForMovement(String value) {
        return new JAXBElement<String>(_PolicyInfoReasonForMovement_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicySite", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPolicySite(String value) {
        return new JAXBElement<String>(_PolicyInfoPolicySite_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "EntityCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoEntityCode(String value) {
        return new JAXBElement<String>(_PolicyInfoEntityCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "EntityShortName", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoEntityShortName(String value) {
        return new JAXBElement<String>(_PolicyInfoEntityShortName_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "CancelledOperation", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoCancelledOperation(String value) {
        return new JAXBElement<String>(_PolicyInfoCancelledOperation_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "Is_Migrated", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoIsMigrated(String value) {
        return new JAXBElement<String>(_PolicyInfoIsMigrated_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "DirectAssumedCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoDirectAssumedCode(String value) {
        return new JAXBElement<String>(_PolicyInfoDirectAssumedCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PACPRCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPACPRCode(String value) {
        return new JAXBElement<String>(_PolicyInfoPACPRCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "DistributionChannelCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoDistributionChannelCode(String value) {
        return new JAXBElement<String>(_PolicyInfoDistributionChannelCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "StandardIndustrialClassificationCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoStandardIndustrialClassificationCode(String value) {
        return new JAXBElement<String>(_PolicyInfoStandardIndustrialClassificationCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "ExclusiveFlagCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoExclusiveFlagCode(String value) {
        return new JAXBElement<String>(_PolicyInfoExclusiveFlagCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "NorthAmericanIndustrialClassificationSystemDetails", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoNorthAmericanIndustrialClassificationSystemDetails(String value) {
        return new JAXBElement<String>(_PolicyInfoNorthAmericanIndustrialClassificationSystemDetails_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "SalesPersonID", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoSalesPersonID(String value) {
        return new JAXBElement<String>(_PolicyInfoSalesPersonID_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "DepartmentCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoDepartmentCode(String value) {
        return new JAXBElement<String>(_PolicyInfoDepartmentCode_QNAME, String.class, PolicyInfo.class, value);
    }
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/PolicyService/2016/06", name = "CreateOrUpdatePolicyResult", scope = CreateOrUpdatePolicyResponseElement.class)
    public JAXBElement<Response> createCreateOrUpdatePolicyResponseElementCreateOrUpdatePolicyResult(Response value) {
        return new JAXBElement<Response>(_CreateOrUpdatePolicyResponseElementCreateOrUpdatePolicyResult_QNAME, Response.class, CreateOrUpdatePolicyResponseElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "FieldOfficeCode", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoFieldOfficeCode(String value) {
        return new JAXBElement<String>(_PolicyInfoFieldOfficeCode_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyShare", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPolicyShare(String value) {
        return new JAXBElement<String>(_PolicyInfoPolicyShare_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "PolicyNumber", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoPolicyNumber(String value) {
        return new JAXBElement<String>(_PolicyInfoPolicyNumber_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Chubb.com/WorkView/PolicyService/2016/06", name = "Coverage", scope = PolicyInfo.class)
    public JAXBElement<String> createPolicyInfoCoverage(String value) {
        return new JAXBElement<String>(_PolicyInfoCoverage_QNAME, String.class, PolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtractPolicyInfo }{@code >}}
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
        return new JAXBElement<ArrayOfCoverageResponse>(_PolicyResponseCoverageResponse_QNAME, ArrayOfCoverageResponse.class, PolicyResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FeddpolicyRequestUW }{@code >}}
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

}
