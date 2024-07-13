
package com.chubb.workview.documentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chubb.workview.documentservice package. 
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

    private final static QName _StatusUpdateRequest_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "StatusUpdateRequest");
    private final static QName _ArrayOfStatusUpdateDocumentInfo_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ArrayOfStatusUpdateDocumentInfo");
    private final static QName _StatusUpdateDocumentInfo_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "StatusUpdateDocumentInfo");
    private final static QName _EnvironmentData_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "EnvironmentData");
    private final static QName _StatusUpdateResponse_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "StatusUpdateResponse");
    private final static QName _ArrayOfDocStatusInfo_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ArrayOfDocStatusInfo");
    private final static QName _DocStatusInfo_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocStatusInfo");
    private final static QName _DocumentMoveRequest_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentMoveRequest");
    private final static QName _DocumentMoveResponse_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentMoveResponse");
    private final static QName _DocumentDetailsRequest_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentDetailsRequest");
    private final static QName _ArrayOfQuotenumber_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ArrayOfQuotenumber");
    private final static QName _Quotenumber_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "Quotenumber");
    private final static QName _ArrayOfDocumentType_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ArrayOfDocumentType");
    private final static QName _DocumentType_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentType");
    private final static QName _DocumentDetailsResponse_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentDetailsResponse");
    private final static QName _ArrayOfWVDocument_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ArrayOfWVDocument");
    private final static QName _WVDocument_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "WVDocument");
    private final static QName _ArrayOfAttachmentDetail_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ArrayOfAttachmentDetail");
    private final static QName _AttachmentDetail_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "AttachmentDetail");
    private final static QName _IndexDocumentRequest_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "IndexDocumentRequest");
    private final static QName _IndexDocumentResponse_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "IndexDocumentResponse");
    private final static QName _ImportandIndexDocumentRequest_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ImportandIndexDocumentRequest");
    private final static QName _ArrayOfAttachment_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ArrayOfAttachment");
    private final static QName _Attachment_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "Attachment");
    private final static QName _ImportandIndexDocumentResponseInfo_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ImportandIndexDocumentResponseInfo");
    private final static QName _ArrayOfAttachmentInfo_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ArrayOfAttachmentInfo");
    private final static QName _AttachmentInfo_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "AttachmentInfo");
    private final static QName _SpecificDocumentRequest_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "SpecificDocumentRequest");
    private final static QName _SpecificDocumentResponse_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "SpecificDocumentResponse");
    private final static QName _WorkViewDocument_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "WorkViewDocument");
    private final static QName _ArrayOfWorkViewDocument_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ArrayOfWorkViewDocument");
    private final static QName _DocumentRequest_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentRequest");
    private final static QName _DocumentResponse_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentResponse");
    private final static QName _ImportDocumentToFileRequest_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ImportDocumentToFileRequest");
    private final static QName _ImportDocumentToFileResponse_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ImportDocumentToFileResponse");
    private final static QName _DocumentInformationRequest_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentInformationRequest");
    private final static QName _ArrayOfDocInfoRequest_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ArrayOfDocInfoRequest");
    private final static QName _DocInfoRequest_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocInfoRequest");
    private final static QName _DocumentInformationResponse_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentInformationResponse");
    private final static QName _ArrayOfDocInfoResponse_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ArrayOfDocInfoResponse");
    private final static QName _DocInfoResponse_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocInfoResponse");
    private final static QName _ArrayOfWVDocumentInfo_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ArrayOfWVDocumentInfo");
    private final static QName _WVDocumentInfo_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "WVDocumentInfo");
    private final static QName _UpdateDocumentDetailsRequest_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "UpdateDocumentDetailsRequest");
    private final static QName _UpdateDocumentDetailsResponse_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "UpdateDocumentDetailsResponse");
    private final static QName _UpdateDocumentDetailsResponseOverallResult_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "OverallResult");
    private final static QName _UpdateDocumentDetailsResponseErrorText_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ErrorText");
    private final static QName _UpdateDocumentDetailsResponseResult_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "Result");
    private final static QName _UpdateDocumentDetailsResponseDocumentGUID_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentGUID");
    private final static QName _UpdateDocumentDetailsRequestDocumentDesc_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentDesc");
    private final static QName _UpdateDocumentDetailsRequestDocumentDate_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentDate");
    private final static QName _UpdateDocumentDetailsRequestFolderType_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "FolderType");
    private final static QName _UpdateDocumentDetailsRequestIngestionInfo_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "IngestionInfo");
    private final static QName _UpdateDocumentDetailsRequestOriginator_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "Originator");
    private final static QName _UpdateDocumentDetailsRequestBranch_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "Branch");
    private final static QName _UpdateDocumentDetailsRequestActionedDate_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ActionedDate");
    private final static QName _UpdateDocumentDetailsRequestAcknowledgedDate_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "AcknowledgedDate");
    private final static QName _WVDocumentInfoQuoteNumber_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "QuoteNumber");
    private final static QName _WVDocumentInfoPolicyNumber_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "PolicyNumber");
    private final static QName _WVDocumentInfoCertificateNumber_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "CertificateNumber");
    private final static QName _WVDocumentInfoDescription_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "Description");
    private final static QName _WVDocumentInfoBroker_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "Broker");
    private final static QName _WVDocumentInfoInputType_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "InputType");
    private final static QName _WVDocumentInfoInsuredName_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "InsuredName");
    private final static QName _WVDocumentInfoIsHidden_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "IsHidden");
    private final static QName _WVDocumentInfoScanDate_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ScanDate");
    private final static QName _WVDocumentInfoUTCOffset_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "UTCOffset");
    private final static QName _WVDocumentInfoOriginalBytesUsed_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "OriginalBytesUsed");
    private final static QName _WVDocumentInfoExternalDocID_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ExternalDocID");
    private final static QName _WVDocumentInfoAttachments_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "Attachments");
    private final static QName _DocInfoResponseWorkViewDocuments_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "WorkViewDocuments");
    private final static QName _DocInfoRequestQuoteNumbers_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "QuoteNumbers");
    private final static QName _DocInfoRequestFolderTypeCode_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "FolderTypeCode");
    private final static QName _DocInfoRequestDocumentTypes_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentTypes");
    private final static QName _DocInfoRequestDocumentDescription_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentDescription");
    private final static QName _DocInfoRequestLOBGroupCode_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "LOBGroupCode");
    private final static QName _DocInfoRequestImportType_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ImportType");
    private final static QName _DocInfoRequestInsuredID_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "InsuredID");
    private final static QName _DocInfoRequestBrokerCode_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "BrokerCode");
    private final static QName _DocInfoRequestRecordLimit_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "RecordLimit");
    private final static QName _DocInfoRequestClaimNumber_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "ClaimNumber");
    private final static QName _DocumentInformationRequestDocumentInformation_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentInformation");
    private final static QName _ImportDocumentToFileResponseFileNumber_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "FileNumber");
    private final static QName _ImportDocumentToFileResponseFileTypeCode_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "FileTypeCode");
    private final static QName _ImportDocumentToFileResponseFileTypeDescription_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "FileTypeDescription");
    private final static QName _ImportDocumentToFileResponseSecurityPolicyID_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "SecurityPolicyID");
    private final static QName _ImportDocumentToFileResponseAttachmentsInfo_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "AttachmentsInfo");
    private final static QName _ImportDocumentToFileResponseCaseGUID_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "CaseGUID");
    private final static QName _ImportDocumentToFileRequestDocumentTypeCode_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentTypeCode");
    private final static QName _ImportDocumentToFileRequestDocumentProducer_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentProducer");
    private final static QName _ImportDocumentToFileRequestIsAcknowledmentLetter_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "IsAcknowledmentLetter");
    private final static QName _ImportDocumentToFileRequestAcknowledmentLetterDateSent_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "AcknowledmentLetterDateSent");
    private final static QName _ImportDocumentToFileRequestDocumentData_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentData");
    private final static QName _ImportDocumentToFileRequestDocumentFileName_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentFileName");
    private final static QName _ImportDocumentToFileRequestEmailSender_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "EmailSender");
    private final static QName _ImportDocumentToFileRequestPaidDate_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "PaidDate");
    private final static QName _DocumentResponseDocumentLifeCycleStatusId_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentLifeCycleStatusId");
    private final static QName _DocumentRequestMultinationalCode_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "MultinationalCode");
    private final static QName _WorkViewDocumentMimeType_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "MimeType");
    private final static QName _AttachmentInfoAttachmentGUID_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "AttachmentGUID");
    private final static QName _AttachmentInfoAttachmentDescription_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "AttachmentDescription");
    private final static QName _AttachmentData_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "Data");
    private final static QName _AttachmentAttachmentFileName_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "AttachmentFileName");
    private final static QName _ImportandIndexDocumentRequestPolicyQuoteNumber_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "PolicyQuoteNumber");
    private final static QName _IndexDocumentRequestHiddenFile_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "HiddenFile");
    private final static QName _IndexDocumentRequestDocumentActionDate_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocumentActionDate");
    private final static QName _IndexDocumentRequestIsAcknowledgmentLetter_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "IsAcknowledgmentLetter");
    private final static QName _DocumentTypeDocType_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "DocType");
    private final static QName _QuotenumberQuote_QNAME = new QName("http://chubb.com/WorkView/DocumentService/2016/06", "Quote");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chubb.workview.documentservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatusUpdateRequest }
     * 
     */
    public StatusUpdateRequest createStatusUpdateRequest() {
        return new StatusUpdateRequest();
    }

    /**
     * Create an instance of {@link ArrayOfStatusUpdateDocumentInfo }
     * 
     */
    public ArrayOfStatusUpdateDocumentInfo createArrayOfStatusUpdateDocumentInfo() {
        return new ArrayOfStatusUpdateDocumentInfo();
    }

    /**
     * Create an instance of {@link StatusUpdateDocumentInfo }
     * 
     */
    public StatusUpdateDocumentInfo createStatusUpdateDocumentInfo() {
        return new StatusUpdateDocumentInfo();
    }

    /**
     * Create an instance of {@link EnvironmentData }
     * 
     */
    public EnvironmentData createEnvironmentData() {
        return new EnvironmentData();
    }

    /**
     * Create an instance of {@link StatusUpdateResponse }
     * 
     */
    public StatusUpdateResponse createStatusUpdateResponse() {
        return new StatusUpdateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDocStatusInfo }
     * 
     */
    public ArrayOfDocStatusInfo createArrayOfDocStatusInfo() {
        return new ArrayOfDocStatusInfo();
    }

    /**
     * Create an instance of {@link DocStatusInfo }
     * 
     */
    public DocStatusInfo createDocStatusInfo() {
        return new DocStatusInfo();
    }

    /**
     * Create an instance of {@link DocumentMoveRequest }
     * 
     */
    public DocumentMoveRequest createDocumentMoveRequest() {
        return new DocumentMoveRequest();
    }

    /**
     * Create an instance of {@link DocumentMoveResponse }
     * 
     */
    public DocumentMoveResponse createDocumentMoveResponse() {
        return new DocumentMoveResponse();
    }

    /**
     * Create an instance of {@link DocumentDetailsRequest }
     * 
     */
    public DocumentDetailsRequest createDocumentDetailsRequest() {
        return new DocumentDetailsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfQuotenumber }
     * 
     */
    public ArrayOfQuotenumber createArrayOfQuotenumber() {
        return new ArrayOfQuotenumber();
    }

    /**
     * Create an instance of {@link Quotenumber }
     * 
     */
    public Quotenumber createQuotenumber() {
        return new Quotenumber();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentType }
     * 
     */
    public ArrayOfDocumentType createArrayOfDocumentType() {
        return new ArrayOfDocumentType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link DocumentDetailsResponse }
     * 
     */
    public DocumentDetailsResponse createDocumentDetailsResponse() {
        return new DocumentDetailsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWVDocument }
     * 
     */
    public ArrayOfWVDocument createArrayOfWVDocument() {
        return new ArrayOfWVDocument();
    }

    /**
     * Create an instance of {@link WVDocument }
     * 
     */
    public WVDocument createWVDocument() {
        return new WVDocument();
    }

    /**
     * Create an instance of {@link ArrayOfAttachmentDetail }
     * 
     */
    public ArrayOfAttachmentDetail createArrayOfAttachmentDetail() {
        return new ArrayOfAttachmentDetail();
    }

    /**
     * Create an instance of {@link AttachmentDetail }
     * 
     */
    public AttachmentDetail createAttachmentDetail() {
        return new AttachmentDetail();
    }

    /**
     * Create an instance of {@link IndexDocumentRequest }
     * 
     */
    public IndexDocumentRequest createIndexDocumentRequest() {
        return new IndexDocumentRequest();
    }

    /**
     * Create an instance of {@link IndexDocumentResponse }
     * 
     */
    public IndexDocumentResponse createIndexDocumentResponse() {
        return new IndexDocumentResponse();
    }

    /**
     * Create an instance of {@link ImportandIndexDocumentRequest }
     * 
     */
    public ImportandIndexDocumentRequest createImportandIndexDocumentRequest() {
        return new ImportandIndexDocumentRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAttachment }
     * 
     */
    public ArrayOfAttachment createArrayOfAttachment() {
        return new ArrayOfAttachment();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link ImportandIndexDocumentResponseInfo }
     * 
     */
    public ImportandIndexDocumentResponseInfo createImportandIndexDocumentResponseInfo() {
        return new ImportandIndexDocumentResponseInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAttachmentInfo }
     * 
     */
    public ArrayOfAttachmentInfo createArrayOfAttachmentInfo() {
        return new ArrayOfAttachmentInfo();
    }

    /**
     * Create an instance of {@link AttachmentInfo }
     * 
     */
    public AttachmentInfo createAttachmentInfo() {
        return new AttachmentInfo();
    }

    /**
     * Create an instance of {@link SpecificDocumentRequest }
     * 
     */
    public SpecificDocumentRequest createSpecificDocumentRequest() {
        return new SpecificDocumentRequest();
    }

    /**
     * Create an instance of {@link SpecificDocumentResponse }
     * 
     */
    public SpecificDocumentResponse createSpecificDocumentResponse() {
        return new SpecificDocumentResponse();
    }

    /**
     * Create an instance of {@link WorkViewDocument }
     * 
     */
    public WorkViewDocument createWorkViewDocument() {
        return new WorkViewDocument();
    }

    /**
     * Create an instance of {@link ArrayOfWorkViewDocument }
     * 
     */
    public ArrayOfWorkViewDocument createArrayOfWorkViewDocument() {
        return new ArrayOfWorkViewDocument();
    }

    /**
     * Create an instance of {@link DocumentRequest }
     * 
     */
    public DocumentRequest createDocumentRequest() {
        return new DocumentRequest();
    }

    /**
     * Create an instance of {@link DocumentResponse }
     * 
     */
    public DocumentResponse createDocumentResponse() {
        return new DocumentResponse();
    }

    /**
     * Create an instance of {@link ImportDocumentToFileRequest }
     * 
     */
    public ImportDocumentToFileRequest createImportDocumentToFileRequest() {
        return new ImportDocumentToFileRequest();
    }

    /**
     * Create an instance of {@link ImportDocumentToFileResponse }
     * 
     */
    public ImportDocumentToFileResponse createImportDocumentToFileResponse() {
        return new ImportDocumentToFileResponse();
    }

    /**
     * Create an instance of {@link DocumentInformationRequest }
     * 
     */
    public DocumentInformationRequest createDocumentInformationRequest() {
        return new DocumentInformationRequest();
    }

    /**
     * Create an instance of {@link ArrayOfDocInfoRequest }
     * 
     */
    public ArrayOfDocInfoRequest createArrayOfDocInfoRequest() {
        return new ArrayOfDocInfoRequest();
    }

    /**
     * Create an instance of {@link DocInfoRequest }
     * 
     */
    public DocInfoRequest createDocInfoRequest() {
        return new DocInfoRequest();
    }

    /**
     * Create an instance of {@link DocumentInformationResponse }
     * 
     */
    public DocumentInformationResponse createDocumentInformationResponse() {
        return new DocumentInformationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDocInfoResponse }
     * 
     */
    public ArrayOfDocInfoResponse createArrayOfDocInfoResponse() {
        return new ArrayOfDocInfoResponse();
    }

    /**
     * Create an instance of {@link DocInfoResponse }
     * 
     */
    public DocInfoResponse createDocInfoResponse() {
        return new DocInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWVDocumentInfo }
     * 
     */
    public ArrayOfWVDocumentInfo createArrayOfWVDocumentInfo() {
        return new ArrayOfWVDocumentInfo();
    }

    /**
     * Create an instance of {@link WVDocumentInfo }
     * 
     */
    public WVDocumentInfo createWVDocumentInfo() {
        return new WVDocumentInfo();
    }

    /**
     * Create an instance of {@link UpdateDocumentDetailsRequest }
     * 
     */
    public UpdateDocumentDetailsRequest createUpdateDocumentDetailsRequest() {
        return new UpdateDocumentDetailsRequest();
    }

    /**
     * Create an instance of {@link UpdateDocumentDetailsResponse }
     * 
     */
    public UpdateDocumentDetailsResponse createUpdateDocumentDetailsResponse() {
        return new UpdateDocumentDetailsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusUpdateRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusUpdateRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "StatusUpdateRequest")
    public JAXBElement<StatusUpdateRequest> createStatusUpdateRequest(StatusUpdateRequest value) {
        return new JAXBElement<StatusUpdateRequest>(_StatusUpdateRequest_QNAME, StatusUpdateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusUpdateDocumentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusUpdateDocumentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ArrayOfStatusUpdateDocumentInfo")
    public JAXBElement<ArrayOfStatusUpdateDocumentInfo> createArrayOfStatusUpdateDocumentInfo(ArrayOfStatusUpdateDocumentInfo value) {
        return new JAXBElement<ArrayOfStatusUpdateDocumentInfo>(_ArrayOfStatusUpdateDocumentInfo_QNAME, ArrayOfStatusUpdateDocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusUpdateDocumentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusUpdateDocumentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "StatusUpdateDocumentInfo")
    public JAXBElement<StatusUpdateDocumentInfo> createStatusUpdateDocumentInfo(StatusUpdateDocumentInfo value) {
        return new JAXBElement<StatusUpdateDocumentInfo>(_StatusUpdateDocumentInfo_QNAME, StatusUpdateDocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "EnvironmentData")
    public JAXBElement<EnvironmentData> createEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusUpdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusUpdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "StatusUpdateResponse")
    public JAXBElement<StatusUpdateResponse> createStatusUpdateResponse(StatusUpdateResponse value) {
        return new JAXBElement<StatusUpdateResponse>(_StatusUpdateResponse_QNAME, StatusUpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocStatusInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocStatusInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ArrayOfDocStatusInfo")
    public JAXBElement<ArrayOfDocStatusInfo> createArrayOfDocStatusInfo(ArrayOfDocStatusInfo value) {
        return new JAXBElement<ArrayOfDocStatusInfo>(_ArrayOfDocStatusInfo_QNAME, ArrayOfDocStatusInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocStatusInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocStatusInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocStatusInfo")
    public JAXBElement<DocStatusInfo> createDocStatusInfo(DocStatusInfo value) {
        return new JAXBElement<DocStatusInfo>(_DocStatusInfo_QNAME, DocStatusInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentMoveRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentMoveRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentMoveRequest")
    public JAXBElement<DocumentMoveRequest> createDocumentMoveRequest(DocumentMoveRequest value) {
        return new JAXBElement<DocumentMoveRequest>(_DocumentMoveRequest_QNAME, DocumentMoveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentMoveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentMoveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentMoveResponse")
    public JAXBElement<DocumentMoveResponse> createDocumentMoveResponse(DocumentMoveResponse value) {
        return new JAXBElement<DocumentMoveResponse>(_DocumentMoveResponse_QNAME, DocumentMoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentDetailsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentDetailsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDetailsRequest")
    public JAXBElement<DocumentDetailsRequest> createDocumentDetailsRequest(DocumentDetailsRequest value) {
        return new JAXBElement<DocumentDetailsRequest>(_DocumentDetailsRequest_QNAME, DocumentDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotenumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotenumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ArrayOfQuotenumber")
    public JAXBElement<ArrayOfQuotenumber> createArrayOfQuotenumber(ArrayOfQuotenumber value) {
        return new JAXBElement<ArrayOfQuotenumber>(_ArrayOfQuotenumber_QNAME, ArrayOfQuotenumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quotenumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Quotenumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Quotenumber")
    public JAXBElement<Quotenumber> createQuotenumber(Quotenumber value) {
        return new JAXBElement<Quotenumber>(_Quotenumber_QNAME, Quotenumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ArrayOfDocumentType")
    public JAXBElement<ArrayOfDocumentType> createArrayOfDocumentType(ArrayOfDocumentType value) {
        return new JAXBElement<ArrayOfDocumentType>(_ArrayOfDocumentType_QNAME, ArrayOfDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentType")
    public JAXBElement<DocumentType> createDocumentType(DocumentType value) {
        return new JAXBElement<DocumentType>(_DocumentType_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentDetailsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentDetailsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDetailsResponse")
    public JAXBElement<DocumentDetailsResponse> createDocumentDetailsResponse(DocumentDetailsResponse value) {
        return new JAXBElement<DocumentDetailsResponse>(_DocumentDetailsResponse_QNAME, DocumentDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWVDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWVDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ArrayOfWVDocument")
    public JAXBElement<ArrayOfWVDocument> createArrayOfWVDocument(ArrayOfWVDocument value) {
        return new JAXBElement<ArrayOfWVDocument>(_ArrayOfWVDocument_QNAME, ArrayOfWVDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WVDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WVDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "WVDocument")
    public JAXBElement<WVDocument> createWVDocument(WVDocument value) {
        return new JAXBElement<WVDocument>(_WVDocument_QNAME, WVDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ArrayOfAttachmentDetail")
    public JAXBElement<ArrayOfAttachmentDetail> createArrayOfAttachmentDetail(ArrayOfAttachmentDetail value) {
        return new JAXBElement<ArrayOfAttachmentDetail>(_ArrayOfAttachmentDetail_QNAME, ArrayOfAttachmentDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttachmentDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AttachmentDetail")
    public JAXBElement<AttachmentDetail> createAttachmentDetail(AttachmentDetail value) {
        return new JAXBElement<AttachmentDetail>(_AttachmentDetail_QNAME, AttachmentDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndexDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "IndexDocumentRequest")
    public JAXBElement<IndexDocumentRequest> createIndexDocumentRequest(IndexDocumentRequest value) {
        return new JAXBElement<IndexDocumentRequest>(_IndexDocumentRequest_QNAME, IndexDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndexDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "IndexDocumentResponse")
    public JAXBElement<IndexDocumentResponse> createIndexDocumentResponse(IndexDocumentResponse value) {
        return new JAXBElement<IndexDocumentResponse>(_IndexDocumentResponse_QNAME, IndexDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportandIndexDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportandIndexDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ImportandIndexDocumentRequest")
    public JAXBElement<ImportandIndexDocumentRequest> createImportandIndexDocumentRequest(ImportandIndexDocumentRequest value) {
        return new JAXBElement<ImportandIndexDocumentRequest>(_ImportandIndexDocumentRequest_QNAME, ImportandIndexDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachment }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ArrayOfAttachment")
    public JAXBElement<ArrayOfAttachment> createArrayOfAttachment(ArrayOfAttachment value) {
        return new JAXBElement<ArrayOfAttachment>(_ArrayOfAttachment_QNAME, ArrayOfAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attachment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Attachment }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Attachment")
    public JAXBElement<Attachment> createAttachment(Attachment value) {
        return new JAXBElement<Attachment>(_Attachment_QNAME, Attachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportandIndexDocumentResponseInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportandIndexDocumentResponseInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ImportandIndexDocumentResponseInfo")
    public JAXBElement<ImportandIndexDocumentResponseInfo> createImportandIndexDocumentResponseInfo(ImportandIndexDocumentResponseInfo value) {
        return new JAXBElement<ImportandIndexDocumentResponseInfo>(_ImportandIndexDocumentResponseInfo_QNAME, ImportandIndexDocumentResponseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ArrayOfAttachmentInfo")
    public JAXBElement<ArrayOfAttachmentInfo> createArrayOfAttachmentInfo(ArrayOfAttachmentInfo value) {
        return new JAXBElement<ArrayOfAttachmentInfo>(_ArrayOfAttachmentInfo_QNAME, ArrayOfAttachmentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttachmentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AttachmentInfo")
    public JAXBElement<AttachmentInfo> createAttachmentInfo(AttachmentInfo value) {
        return new JAXBElement<AttachmentInfo>(_AttachmentInfo_QNAME, AttachmentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecificDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "SpecificDocumentRequest")
    public JAXBElement<SpecificDocumentRequest> createSpecificDocumentRequest(SpecificDocumentRequest value) {
        return new JAXBElement<SpecificDocumentRequest>(_SpecificDocumentRequest_QNAME, SpecificDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecificDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "SpecificDocumentResponse")
    public JAXBElement<SpecificDocumentResponse> createSpecificDocumentResponse(SpecificDocumentResponse value) {
        return new JAXBElement<SpecificDocumentResponse>(_SpecificDocumentResponse_QNAME, SpecificDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkViewDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkViewDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "WorkViewDocument")
    public JAXBElement<WorkViewDocument> createWorkViewDocument(WorkViewDocument value) {
        return new JAXBElement<WorkViewDocument>(_WorkViewDocument_QNAME, WorkViewDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkViewDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkViewDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ArrayOfWorkViewDocument")
    public JAXBElement<ArrayOfWorkViewDocument> createArrayOfWorkViewDocument(ArrayOfWorkViewDocument value) {
        return new JAXBElement<ArrayOfWorkViewDocument>(_ArrayOfWorkViewDocument_QNAME, ArrayOfWorkViewDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentRequest")
    public JAXBElement<DocumentRequest> createDocumentRequest(DocumentRequest value) {
        return new JAXBElement<DocumentRequest>(_DocumentRequest_QNAME, DocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentResponse")
    public JAXBElement<DocumentResponse> createDocumentResponse(DocumentResponse value) {
        return new JAXBElement<DocumentResponse>(_DocumentResponse_QNAME, DocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportDocumentToFileRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportDocumentToFileRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ImportDocumentToFileRequest")
    public JAXBElement<ImportDocumentToFileRequest> createImportDocumentToFileRequest(ImportDocumentToFileRequest value) {
        return new JAXBElement<ImportDocumentToFileRequest>(_ImportDocumentToFileRequest_QNAME, ImportDocumentToFileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportDocumentToFileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportDocumentToFileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ImportDocumentToFileResponse")
    public JAXBElement<ImportDocumentToFileResponse> createImportDocumentToFileResponse(ImportDocumentToFileResponse value) {
        return new JAXBElement<ImportDocumentToFileResponse>(_ImportDocumentToFileResponse_QNAME, ImportDocumentToFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentInformationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentInformationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentInformationRequest")
    public JAXBElement<DocumentInformationRequest> createDocumentInformationRequest(DocumentInformationRequest value) {
        return new JAXBElement<DocumentInformationRequest>(_DocumentInformationRequest_QNAME, DocumentInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocInfoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocInfoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ArrayOfDocInfoRequest")
    public JAXBElement<ArrayOfDocInfoRequest> createArrayOfDocInfoRequest(ArrayOfDocInfoRequest value) {
        return new JAXBElement<ArrayOfDocInfoRequest>(_ArrayOfDocInfoRequest_QNAME, ArrayOfDocInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocInfoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocInfoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocInfoRequest")
    public JAXBElement<DocInfoRequest> createDocInfoRequest(DocInfoRequest value) {
        return new JAXBElement<DocInfoRequest>(_DocInfoRequest_QNAME, DocInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentInformationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentInformationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentInformationResponse")
    public JAXBElement<DocumentInformationResponse> createDocumentInformationResponse(DocumentInformationResponse value) {
        return new JAXBElement<DocumentInformationResponse>(_DocumentInformationResponse_QNAME, DocumentInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ArrayOfDocInfoResponse")
    public JAXBElement<ArrayOfDocInfoResponse> createArrayOfDocInfoResponse(ArrayOfDocInfoResponse value) {
        return new JAXBElement<ArrayOfDocInfoResponse>(_ArrayOfDocInfoResponse_QNAME, ArrayOfDocInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocInfoResponse")
    public JAXBElement<DocInfoResponse> createDocInfoResponse(DocInfoResponse value) {
        return new JAXBElement<DocInfoResponse>(_DocInfoResponse_QNAME, DocInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWVDocumentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWVDocumentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ArrayOfWVDocumentInfo")
    public JAXBElement<ArrayOfWVDocumentInfo> createArrayOfWVDocumentInfo(ArrayOfWVDocumentInfo value) {
        return new JAXBElement<ArrayOfWVDocumentInfo>(_ArrayOfWVDocumentInfo_QNAME, ArrayOfWVDocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WVDocumentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WVDocumentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "WVDocumentInfo")
    public JAXBElement<WVDocumentInfo> createWVDocumentInfo(WVDocumentInfo value) {
        return new JAXBElement<WVDocumentInfo>(_WVDocumentInfo_QNAME, WVDocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocumentDetailsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDocumentDetailsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "UpdateDocumentDetailsRequest")
    public JAXBElement<UpdateDocumentDetailsRequest> createUpdateDocumentDetailsRequest(UpdateDocumentDetailsRequest value) {
        return new JAXBElement<UpdateDocumentDetailsRequest>(_UpdateDocumentDetailsRequest_QNAME, UpdateDocumentDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocumentDetailsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDocumentDetailsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "UpdateDocumentDetailsResponse")
    public JAXBElement<UpdateDocumentDetailsResponse> createUpdateDocumentDetailsResponse(UpdateDocumentDetailsResponse value) {
        return new JAXBElement<UpdateDocumentDetailsResponse>(_UpdateDocumentDetailsResponse_QNAME, UpdateDocumentDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "OverallResult", scope = UpdateDocumentDetailsResponse.class)
    public JAXBElement<String> createUpdateDocumentDetailsResponseOverallResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseOverallResult_QNAME, String.class, UpdateDocumentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = UpdateDocumentDetailsResponse.class)
    public JAXBElement<String> createUpdateDocumentDetailsResponseErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, UpdateDocumentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Result", scope = UpdateDocumentDetailsResponse.class)
    public JAXBElement<String> createUpdateDocumentDetailsResponseResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseResult_QNAME, String.class, UpdateDocumentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = UpdateDocumentDetailsResponse.class)
    public JAXBElement<String> createUpdateDocumentDetailsResponseDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, UpdateDocumentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = UpdateDocumentDetailsRequest.class)
    public JAXBElement<String> createUpdateDocumentDetailsRequestDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, UpdateDocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDesc", scope = UpdateDocumentDetailsRequest.class)
    public JAXBElement<String> createUpdateDocumentDetailsRequestDocumentDesc(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsRequestDocumentDesc_QNAME, String.class, UpdateDocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDate", scope = UpdateDocumentDetailsRequest.class)
    public JAXBElement<String> createUpdateDocumentDetailsRequestDocumentDate(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsRequestDocumentDate_QNAME, String.class, UpdateDocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FolderType", scope = UpdateDocumentDetailsRequest.class)
    public JAXBElement<String> createUpdateDocumentDetailsRequestFolderType(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsRequestFolderType_QNAME, String.class, UpdateDocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentType", scope = UpdateDocumentDetailsRequest.class)
    public JAXBElement<String> createUpdateDocumentDetailsRequestDocumentType(String value) {
        return new JAXBElement<String>(_DocumentType_QNAME, String.class, UpdateDocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "IngestionInfo", scope = UpdateDocumentDetailsRequest.class)
    public JAXBElement<String> createUpdateDocumentDetailsRequestIngestionInfo(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsRequestIngestionInfo_QNAME, String.class, UpdateDocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Originator", scope = UpdateDocumentDetailsRequest.class)
    public JAXBElement<String> createUpdateDocumentDetailsRequestOriginator(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsRequestOriginator_QNAME, String.class, UpdateDocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Branch", scope = UpdateDocumentDetailsRequest.class)
    public JAXBElement<String> createUpdateDocumentDetailsRequestBranch(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsRequestBranch_QNAME, String.class, UpdateDocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ActionedDate", scope = UpdateDocumentDetailsRequest.class)
    public JAXBElement<String> createUpdateDocumentDetailsRequestActionedDate(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsRequestActionedDate_QNAME, String.class, UpdateDocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AcknowledgedDate", scope = UpdateDocumentDetailsRequest.class)
    public JAXBElement<String> createUpdateDocumentDetailsRequestAcknowledgedDate(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsRequestAcknowledgedDate_QNAME, String.class, UpdateDocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "EnvironmentData", scope = UpdateDocumentDetailsRequest.class)
    public JAXBElement<EnvironmentData> createUpdateDocumentDetailsRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, UpdateDocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "QuoteNumber", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoQuoteNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoQuoteNumber_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "PolicyNumber", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoPolicyNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoPolicyNumber_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "CertificateNumber", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoCertificateNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoCertificateNumber_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentType", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoDocumentType(String value) {
        return new JAXBElement<String>(_DocumentType_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FolderType", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoFolderType(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsRequestFolderType_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Description", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoDescription(String value) {
        return new JAXBElement<String>(_WVDocumentInfoDescription_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Broker", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoBroker(String value) {
        return new JAXBElement<String>(_WVDocumentInfoBroker_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "InputType", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoInputType(String value) {
        return new JAXBElement<String>(_WVDocumentInfoInputType_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "InsuredName", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoInsuredName(String value) {
        return new JAXBElement<String>(_WVDocumentInfoInsuredName_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "IsHidden", scope = WVDocumentInfo.class)
    public JAXBElement<Boolean> createWVDocumentInfoIsHidden(Boolean value) {
        return new JAXBElement<Boolean>(_WVDocumentInfoIsHidden_QNAME, Boolean.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ScanDate", scope = WVDocumentInfo.class)
    public JAXBElement<XMLGregorianCalendar> createWVDocumentInfoScanDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WVDocumentInfoScanDate_QNAME, XMLGregorianCalendar.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "UTCOffset", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoUTCOffset(String value) {
        return new JAXBElement<String>(_WVDocumentInfoUTCOffset_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "OriginalBytesUsed", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoOriginalBytesUsed(String value) {
        return new JAXBElement<String>(_WVDocumentInfoOriginalBytesUsed_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDate", scope = WVDocumentInfo.class)
    public JAXBElement<XMLGregorianCalendar> createWVDocumentInfoDocumentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateDocumentDetailsRequestDocumentDate_QNAME, XMLGregorianCalendar.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ExternalDocID", scope = WVDocumentInfo.class)
    public JAXBElement<String> createWVDocumentInfoExternalDocID(String value) {
        return new JAXBElement<String>(_WVDocumentInfoExternalDocID_QNAME, String.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Attachments", scope = WVDocumentInfo.class)
    public JAXBElement<ArrayOfAttachmentDetail> createWVDocumentInfoAttachments(ArrayOfAttachmentDetail value) {
        return new JAXBElement<ArrayOfAttachmentDetail>(_WVDocumentInfoAttachments_QNAME, ArrayOfAttachmentDetail.class, WVDocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = DocInfoResponse.class)
    public JAXBElement<String> createDocInfoResponseErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, DocInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Result", scope = DocInfoResponse.class)
    public JAXBElement<String> createDocInfoResponseResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseResult_QNAME, String.class, DocInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWVDocumentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWVDocumentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "WorkViewDocuments", scope = DocInfoResponse.class)
    public JAXBElement<ArrayOfWVDocumentInfo> createDocInfoResponseWorkViewDocuments(ArrayOfWVDocumentInfo value) {
        return new JAXBElement<ArrayOfWVDocumentInfo>(_DocInfoResponseWorkViewDocuments_QNAME, ArrayOfWVDocumentInfo.class, DocInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "OverallResult", scope = DocumentInformationResponse.class)
    public JAXBElement<String> createDocumentInformationResponseOverallResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseOverallResult_QNAME, String.class, DocumentInformationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentInformationResponse", scope = DocumentInformationResponse.class)
    public JAXBElement<ArrayOfDocInfoResponse> createDocumentInformationResponseDocumentInformationResponse(ArrayOfDocInfoResponse value) {
        return new JAXBElement<ArrayOfDocInfoResponse>(_DocumentInformationResponse_QNAME, ArrayOfDocInfoResponse.class, DocumentInformationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "QuoteNumbers", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestQuoteNumbers(String value) {
        return new JAXBElement<String>(_DocInfoRequestQuoteNumbers_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "PolicyNumber", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestPolicyNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoPolicyNumber_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "CertificateNumber", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestCertificateNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoCertificateNumber_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FolderTypeCode", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestFolderTypeCode(String value) {
        return new JAXBElement<String>(_DocInfoRequestFolderTypeCode_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentTypes", scope = DocInfoRequest.class)
    public JAXBElement<ArrayOfDocumentType> createDocInfoRequestDocumentTypes(ArrayOfDocumentType value) {
        return new JAXBElement<ArrayOfDocumentType>(_DocInfoRequestDocumentTypes_QNAME, ArrayOfDocumentType.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDescription", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestDocumentDescription(String value) {
        return new JAXBElement<String>(_DocInfoRequestDocumentDescription_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "LOBGroupCode", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestLOBGroupCode(String value) {
        return new JAXBElement<String>(_DocInfoRequestLOBGroupCode_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ImportType", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestImportType(String value) {
        return new JAXBElement<String>(_DocInfoRequestImportType_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "InsuredID", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestInsuredID(String value) {
        return new JAXBElement<String>(_DocInfoRequestInsuredID_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "BrokerCode", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestBrokerCode(String value) {
        return new JAXBElement<String>(_DocInfoRequestBrokerCode_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ExternalDocID", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestExternalDocID(String value) {
        return new JAXBElement<String>(_WVDocumentInfoExternalDocID_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "RecordLimit", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestRecordLimit(String value) {
        return new JAXBElement<String>(_DocInfoRequestRecordLimit_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ClaimNumber", scope = DocInfoRequest.class)
    public JAXBElement<String> createDocInfoRequestClaimNumber(String value) {
        return new JAXBElement<String>(_DocInfoRequestClaimNumber_QNAME, String.class, DocInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocInfoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocInfoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentInformation", scope = DocumentInformationRequest.class)
    public JAXBElement<ArrayOfDocInfoRequest> createDocumentInformationRequestDocumentInformation(ArrayOfDocInfoRequest value) {
        return new JAXBElement<ArrayOfDocInfoRequest>(_DocumentInformationRequestDocumentInformation_QNAME, ArrayOfDocInfoRequest.class, DocumentInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "EnvironmentData", scope = DocumentInformationRequest.class)
    public JAXBElement<EnvironmentData> createDocumentInformationRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, DocumentInformationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "OverallResult", scope = ImportDocumentToFileResponse.class)
    public JAXBElement<String> createImportDocumentToFileResponseOverallResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseOverallResult_QNAME, String.class, ImportDocumentToFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = ImportDocumentToFileResponse.class)
    public JAXBElement<String> createImportDocumentToFileResponseErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, ImportDocumentToFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Result", scope = ImportDocumentToFileResponse.class)
    public JAXBElement<String> createImportDocumentToFileResponseResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseResult_QNAME, String.class, ImportDocumentToFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = ImportDocumentToFileResponse.class)
    public JAXBElement<String> createImportDocumentToFileResponseDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, ImportDocumentToFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FileNumber", scope = ImportDocumentToFileResponse.class)
    public JAXBElement<String> createImportDocumentToFileResponseFileNumber(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileResponseFileNumber_QNAME, String.class, ImportDocumentToFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FileTypeCode", scope = ImportDocumentToFileResponse.class)
    public JAXBElement<String> createImportDocumentToFileResponseFileTypeCode(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileResponseFileTypeCode_QNAME, String.class, ImportDocumentToFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FileTypeDescription", scope = ImportDocumentToFileResponse.class)
    public JAXBElement<String> createImportDocumentToFileResponseFileTypeDescription(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileResponseFileTypeDescription_QNAME, String.class, ImportDocumentToFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDescription", scope = ImportDocumentToFileResponse.class)
    public JAXBElement<String> createImportDocumentToFileResponseDocumentDescription(String value) {
        return new JAXBElement<String>(_DocInfoRequestDocumentDescription_QNAME, String.class, ImportDocumentToFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "SecurityPolicyID", scope = ImportDocumentToFileResponse.class)
    public JAXBElement<String> createImportDocumentToFileResponseSecurityPolicyID(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileResponseSecurityPolicyID_QNAME, String.class, ImportDocumentToFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AttachmentsInfo", scope = ImportDocumentToFileResponse.class)
    public JAXBElement<ArrayOfAttachmentInfo> createImportDocumentToFileResponseAttachmentsInfo(ArrayOfAttachmentInfo value) {
        return new JAXBElement<ArrayOfAttachmentInfo>(_ImportDocumentToFileResponseAttachmentsInfo_QNAME, ArrayOfAttachmentInfo.class, ImportDocumentToFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "CaseGUID", scope = ImportDocumentToFileResponse.class)
    public JAXBElement<String> createImportDocumentToFileResponseCaseGUID(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileResponseCaseGUID_QNAME, String.class, ImportDocumentToFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FileNumber", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestFileNumber(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileResponseFileNumber_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FileTypeCode", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestFileTypeCode(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileResponseFileTypeCode_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "LOBGroupCode", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestLOBGroupCode(String value) {
        return new JAXBElement<String>(_DocInfoRequestLOBGroupCode_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FolderTypeCode", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestFolderTypeCode(String value) {
        return new JAXBElement<String>(_DocInfoRequestFolderTypeCode_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentTypeCode", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestDocumentTypeCode(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestDocumentTypeCode_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentProducer", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestDocumentProducer(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestDocumentProducer_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "SecurityPolicyID", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestSecurityPolicyID(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileResponseSecurityPolicyID_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "IsAcknowledmentLetter", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestIsAcknowledmentLetter(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestIsAcknowledmentLetter_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AcknowledmentLetterDateSent", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<XMLGregorianCalendar> createImportDocumentToFileRequestAcknowledmentLetterDateSent(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ImportDocumentToFileRequestAcknowledmentLetterDateSent_QNAME, XMLGregorianCalendar.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentData", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestDocumentData(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestDocumentData_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDescription", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestDocumentDescription(String value) {
        return new JAXBElement<String>(_DocInfoRequestDocumentDescription_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentFileName", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestDocumentFileName(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestDocumentFileName_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentInformation", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestDocumentInformation(String value) {
        return new JAXBElement<String>(_DocumentInformationRequestDocumentInformation_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "EmailSender", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestEmailSender(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestEmailSender_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ActionedDate", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<XMLGregorianCalendar> createImportDocumentToFileRequestActionedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateDocumentDetailsRequestActionedDate_QNAME, XMLGregorianCalendar.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "PaidDate", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<XMLGregorianCalendar> createImportDocumentToFileRequestPaidDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ImportDocumentToFileRequestPaidDate_QNAME, XMLGregorianCalendar.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachment }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Attachments", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<ArrayOfAttachment> createImportDocumentToFileRequestAttachments(ArrayOfAttachment value) {
        return new JAXBElement<ArrayOfAttachment>(_WVDocumentInfoAttachments_QNAME, ArrayOfAttachment.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "EnvironmentData", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<EnvironmentData> createImportDocumentToFileRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "CaseGUID", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestCaseGUID(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileResponseCaseGUID_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ExternalDocID", scope = ImportDocumentToFileRequest.class)
    public JAXBElement<String> createImportDocumentToFileRequestExternalDocID(String value) {
        return new JAXBElement<String>(_WVDocumentInfoExternalDocID_QNAME, String.class, ImportDocumentToFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "OverallResult", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseOverallResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseOverallResult_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentLifeCycleStatusId", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseDocumentLifeCycleStatusId(String value) {
        return new JAXBElement<String>(_DocumentResponseDocumentLifeCycleStatusId_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = DocumentRequest.class)
    public JAXBElement<String> createDocumentRequestDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, DocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "MultinationalCode", scope = DocumentRequest.class)
    public JAXBElement<String> createDocumentRequestMultinationalCode(String value) {
        return new JAXBElement<String>(_DocumentRequestMultinationalCode_QNAME, String.class, DocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "PolicyNumber", scope = DocumentRequest.class)
    public JAXBElement<String> createDocumentRequestPolicyNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoPolicyNumber_QNAME, String.class, DocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ClaimNumber", scope = DocumentRequest.class)
    public JAXBElement<String> createDocumentRequestClaimNumber(String value) {
        return new JAXBElement<String>(_DocInfoRequestClaimNumber_QNAME, String.class, DocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "EnvironmentData", scope = DocumentRequest.class)
    public JAXBElement<EnvironmentData> createDocumentRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, DocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentData", scope = WorkViewDocument.class)
    public JAXBElement<String> createWorkViewDocumentDocumentData(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestDocumentData_QNAME, String.class, WorkViewDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDescription", scope = WorkViewDocument.class)
    public JAXBElement<String> createWorkViewDocumentDocumentDescription(String value) {
        return new JAXBElement<String>(_DocInfoRequestDocumentDescription_QNAME, String.class, WorkViewDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "MimeType", scope = WorkViewDocument.class)
    public JAXBElement<String> createWorkViewDocumentMimeType(String value) {
        return new JAXBElement<String>(_WorkViewDocumentMimeType_QNAME, String.class, WorkViewDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = WorkViewDocument.class)
    public JAXBElement<String> createWorkViewDocumentDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, WorkViewDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = WorkViewDocument.class)
    public JAXBElement<String> createWorkViewDocumentErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, WorkViewDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Result", scope = WorkViewDocument.class)
    public JAXBElement<String> createWorkViewDocumentResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseResult_QNAME, String.class, WorkViewDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkViewDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkViewDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Attachments", scope = WorkViewDocument.class)
    public JAXBElement<ArrayOfWorkViewDocument> createWorkViewDocumentAttachments(ArrayOfWorkViewDocument value) {
        return new JAXBElement<ArrayOfWorkViewDocument>(_WVDocumentInfoAttachments_QNAME, ArrayOfWorkViewDocument.class, WorkViewDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "OverallResult", scope = SpecificDocumentResponse.class)
    public JAXBElement<String> createSpecificDocumentResponseOverallResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseOverallResult_QNAME, String.class, SpecificDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = SpecificDocumentResponse.class)
    public JAXBElement<String> createSpecificDocumentResponseErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, SpecificDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkViewDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkViewDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "WorkViewDocument", scope = SpecificDocumentResponse.class)
    public JAXBElement<WorkViewDocument> createSpecificDocumentResponseWorkViewDocument(WorkViewDocument value) {
        return new JAXBElement<WorkViewDocument>(_WorkViewDocument_QNAME, WorkViewDocument.class, SpecificDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = SpecificDocumentRequest.class)
    public JAXBElement<String> createSpecificDocumentRequestDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, SpecificDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "EnvironmentData", scope = SpecificDocumentRequest.class)
    public JAXBElement<EnvironmentData> createSpecificDocumentRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, SpecificDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AttachmentGUID", scope = AttachmentInfo.class)
    public JAXBElement<String> createAttachmentInfoAttachmentGUID(String value) {
        return new JAXBElement<String>(_AttachmentInfoAttachmentGUID_QNAME, String.class, AttachmentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AttachmentDescription", scope = AttachmentInfo.class)
    public JAXBElement<String> createAttachmentInfoAttachmentDescription(String value) {
        return new JAXBElement<String>(_AttachmentInfoAttachmentDescription_QNAME, String.class, AttachmentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = AttachmentInfo.class)
    public JAXBElement<String> createAttachmentInfoErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, AttachmentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Result", scope = AttachmentInfo.class)
    public JAXBElement<String> createAttachmentInfoResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseResult_QNAME, String.class, AttachmentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "OverallResult", scope = ImportandIndexDocumentResponseInfo.class)
    public JAXBElement<String> createImportandIndexDocumentResponseInfoOverallResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseOverallResult_QNAME, String.class, ImportandIndexDocumentResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = ImportandIndexDocumentResponseInfo.class)
    public JAXBElement<String> createImportandIndexDocumentResponseInfoErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, ImportandIndexDocumentResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Result", scope = ImportandIndexDocumentResponseInfo.class)
    public JAXBElement<String> createImportandIndexDocumentResponseInfoResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseResult_QNAME, String.class, ImportandIndexDocumentResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = ImportandIndexDocumentResponseInfo.class)
    public JAXBElement<String> createImportandIndexDocumentResponseInfoDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, ImportandIndexDocumentResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "PolicyNumber", scope = ImportandIndexDocumentResponseInfo.class)
    public JAXBElement<String> createImportandIndexDocumentResponseInfoPolicyNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoPolicyNumber_QNAME, String.class, ImportandIndexDocumentResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "CertificateNumber", scope = ImportandIndexDocumentResponseInfo.class)
    public JAXBElement<String> createImportandIndexDocumentResponseInfoCertificateNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoCertificateNumber_QNAME, String.class, ImportandIndexDocumentResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ClaimNumber", scope = ImportandIndexDocumentResponseInfo.class)
    public JAXBElement<String> createImportandIndexDocumentResponseInfoClaimNumber(String value) {
        return new JAXBElement<String>(_DocInfoRequestClaimNumber_QNAME, String.class, ImportandIndexDocumentResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDescription", scope = ImportandIndexDocumentResponseInfo.class)
    public JAXBElement<String> createImportandIndexDocumentResponseInfoDocumentDescription(String value) {
        return new JAXBElement<String>(_DocInfoRequestDocumentDescription_QNAME, String.class, ImportandIndexDocumentResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "SecurityPolicyID", scope = ImportandIndexDocumentResponseInfo.class)
    public JAXBElement<String> createImportandIndexDocumentResponseInfoSecurityPolicyID(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileResponseSecurityPolicyID_QNAME, String.class, ImportandIndexDocumentResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AttachmentsInfo", scope = ImportandIndexDocumentResponseInfo.class)
    public JAXBElement<ArrayOfAttachmentInfo> createImportandIndexDocumentResponseInfoAttachmentsInfo(ArrayOfAttachmentInfo value) {
        return new JAXBElement<ArrayOfAttachmentInfo>(_ImportDocumentToFileResponseAttachmentsInfo_QNAME, ArrayOfAttachmentInfo.class, ImportandIndexDocumentResponseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Data", scope = Attachment.class)
    public JAXBElement<String> createAttachmentData(String value) {
        return new JAXBElement<String>(_AttachmentData_QNAME, String.class, Attachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AttachmentDescription", scope = Attachment.class)
    public JAXBElement<String> createAttachmentAttachmentDescription(String value) {
        return new JAXBElement<String>(_AttachmentInfoAttachmentDescription_QNAME, String.class, Attachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AttachmentFileName", scope = Attachment.class)
    public JAXBElement<String> createAttachmentAttachmentFileName(String value) {
        return new JAXBElement<String>(_AttachmentAttachmentFileName_QNAME, String.class, Attachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "PolicyNumber", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestPolicyNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoPolicyNumber_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "CertificateNumber", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestCertificateNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoCertificateNumber_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ClaimNumber", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestClaimNumber(String value) {
        return new JAXBElement<String>(_DocInfoRequestClaimNumber_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "LOBGroupCode", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestLOBGroupCode(String value) {
        return new JAXBElement<String>(_DocInfoRequestLOBGroupCode_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FolderTypeCode", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestFolderTypeCode(String value) {
        return new JAXBElement<String>(_DocInfoRequestFolderTypeCode_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentTypeCode", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestDocumentTypeCode(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestDocumentTypeCode_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentProducer", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestDocumentProducer(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestDocumentProducer_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "SecurityPolicyID", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestSecurityPolicyID(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileResponseSecurityPolicyID_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "IsAcknowledmentLetter", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestIsAcknowledmentLetter(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestIsAcknowledmentLetter_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AcknowledmentLetterDateSent", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<XMLGregorianCalendar> createImportandIndexDocumentRequestAcknowledmentLetterDateSent(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ImportDocumentToFileRequestAcknowledmentLetterDateSent_QNAME, XMLGregorianCalendar.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentData", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestDocumentData(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestDocumentData_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDescription", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestDocumentDescription(String value) {
        return new JAXBElement<String>(_DocInfoRequestDocumentDescription_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentFileName", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestDocumentFileName(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestDocumentFileName_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentInformation", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestDocumentInformation(String value) {
        return new JAXBElement<String>(_DocumentInformationRequestDocumentInformation_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "EmailSender", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestEmailSender(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestEmailSender_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ActionedDate", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<XMLGregorianCalendar> createImportandIndexDocumentRequestActionedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateDocumentDetailsRequestActionedDate_QNAME, XMLGregorianCalendar.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "PaidDate", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<XMLGregorianCalendar> createImportandIndexDocumentRequestPaidDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ImportDocumentToFileRequestPaidDate_QNAME, XMLGregorianCalendar.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachment }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Attachments", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<ArrayOfAttachment> createImportandIndexDocumentRequestAttachments(ArrayOfAttachment value) {
        return new JAXBElement<ArrayOfAttachment>(_WVDocumentInfoAttachments_QNAME, ArrayOfAttachment.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "EnvironmentData", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<EnvironmentData> createImportandIndexDocumentRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "PolicyQuoteNumber", scope = ImportandIndexDocumentRequest.class)
    public JAXBElement<String> createImportandIndexDocumentRequestPolicyQuoteNumber(String value) {
        return new JAXBElement<String>(_ImportandIndexDocumentRequestPolicyQuoteNumber_QNAME, String.class, ImportandIndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "OverallResult", scope = IndexDocumentResponse.class)
    public JAXBElement<String> createIndexDocumentResponseOverallResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseOverallResult_QNAME, String.class, IndexDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = IndexDocumentResponse.class)
    public JAXBElement<String> createIndexDocumentResponseErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, IndexDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Result", scope = IndexDocumentResponse.class)
    public JAXBElement<String> createIndexDocumentResponseResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseResult_QNAME, String.class, IndexDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = IndexDocumentResponse.class)
    public JAXBElement<String> createIndexDocumentResponseDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, IndexDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = IndexDocumentRequest.class)
    public JAXBElement<String> createIndexDocumentRequestDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FolderTypeCode", scope = IndexDocumentRequest.class)
    public JAXBElement<String> createIndexDocumentRequestFolderTypeCode(String value) {
        return new JAXBElement<String>(_DocInfoRequestFolderTypeCode_QNAME, String.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentTypeCode", scope = IndexDocumentRequest.class)
    public JAXBElement<String> createIndexDocumentRequestDocumentTypeCode(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestDocumentTypeCode_QNAME, String.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "LOBGroupCode", scope = IndexDocumentRequest.class)
    public JAXBElement<String> createIndexDocumentRequestLOBGroupCode(String value) {
        return new JAXBElement<String>(_DocInfoRequestLOBGroupCode_QNAME, String.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDescription", scope = IndexDocumentRequest.class)
    public JAXBElement<String> createIndexDocumentRequestDocumentDescription(String value) {
        return new JAXBElement<String>(_DocInfoRequestDocumentDescription_QNAME, String.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "HiddenFile", scope = IndexDocumentRequest.class)
    public JAXBElement<String> createIndexDocumentRequestHiddenFile(String value) {
        return new JAXBElement<String>(_IndexDocumentRequestHiddenFile_QNAME, String.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "PolicyNumber", scope = IndexDocumentRequest.class)
    public JAXBElement<String> createIndexDocumentRequestPolicyNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoPolicyNumber_QNAME, String.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ClaimNumber", scope = IndexDocumentRequest.class)
    public JAXBElement<String> createIndexDocumentRequestClaimNumber(String value) {
        return new JAXBElement<String>(_DocInfoRequestClaimNumber_QNAME, String.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "SecurityPolicyID", scope = IndexDocumentRequest.class)
    public JAXBElement<String> createIndexDocumentRequestSecurityPolicyID(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileResponseSecurityPolicyID_QNAME, String.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentActionDate", scope = IndexDocumentRequest.class)
    public JAXBElement<String> createIndexDocumentRequestDocumentActionDate(String value) {
        return new JAXBElement<String>(_IndexDocumentRequestDocumentActionDate_QNAME, String.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "IsAcknowledgmentLetter", scope = IndexDocumentRequest.class)
    public JAXBElement<String> createIndexDocumentRequestIsAcknowledgmentLetter(String value) {
        return new JAXBElement<String>(_IndexDocumentRequestIsAcknowledgmentLetter_QNAME, String.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AcknowledmentLetterDateSent", scope = IndexDocumentRequest.class)
    public JAXBElement<String> createIndexDocumentRequestAcknowledmentLetterDateSent(String value) {
        return new JAXBElement<String>(_ImportDocumentToFileRequestAcknowledmentLetterDateSent_QNAME, String.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "EnvironmentData", scope = IndexDocumentRequest.class)
    public JAXBElement<EnvironmentData> createIndexDocumentRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, IndexDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AttachmentGUID", scope = AttachmentDetail.class)
    public JAXBElement<String> createAttachmentDetailAttachmentGUID(String value) {
        return new JAXBElement<String>(_AttachmentInfoAttachmentGUID_QNAME, String.class, AttachmentDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "AttachmentDescription", scope = AttachmentDetail.class)
    public JAXBElement<String> createAttachmentDetailAttachmentDescription(String value) {
        return new JAXBElement<String>(_AttachmentInfoAttachmentDescription_QNAME, String.class, AttachmentDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = WVDocument.class)
    public JAXBElement<String> createWVDocumentDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "QuoteNumber", scope = WVDocument.class)
    public JAXBElement<String> createWVDocumentQuoteNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoQuoteNumber_QNAME, String.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "PolicyNumber", scope = WVDocument.class)
    public JAXBElement<String> createWVDocumentPolicyNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoPolicyNumber_QNAME, String.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "CertificateNumber", scope = WVDocument.class)
    public JAXBElement<String> createWVDocumentCertificateNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoCertificateNumber_QNAME, String.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentType", scope = WVDocument.class)
    public JAXBElement<String> createWVDocumentDocumentType(String value) {
        return new JAXBElement<String>(_DocumentType_QNAME, String.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FolderType", scope = WVDocument.class)
    public JAXBElement<String> createWVDocumentFolderType(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsRequestFolderType_QNAME, String.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Description", scope = WVDocument.class)
    public JAXBElement<String> createWVDocumentDescription(String value) {
        return new JAXBElement<String>(_WVDocumentInfoDescription_QNAME, String.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Broker", scope = WVDocument.class)
    public JAXBElement<String> createWVDocumentBroker(String value) {
        return new JAXBElement<String>(_WVDocumentInfoBroker_QNAME, String.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "InputType", scope = WVDocument.class)
    public JAXBElement<String> createWVDocumentInputType(String value) {
        return new JAXBElement<String>(_WVDocumentInfoInputType_QNAME, String.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "InsuredName", scope = WVDocument.class)
    public JAXBElement<String> createWVDocumentInsuredName(String value) {
        return new JAXBElement<String>(_WVDocumentInfoInsuredName_QNAME, String.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "IsHidden", scope = WVDocument.class)
    public JAXBElement<Boolean> createWVDocumentIsHidden(Boolean value) {
        return new JAXBElement<Boolean>(_WVDocumentInfoIsHidden_QNAME, Boolean.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ScanDate", scope = WVDocument.class)
    public JAXBElement<XMLGregorianCalendar> createWVDocumentScanDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WVDocumentInfoScanDate_QNAME, XMLGregorianCalendar.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "UTCOffset", scope = WVDocument.class)
    public JAXBElement<String> createWVDocumentUTCOffset(String value) {
        return new JAXBElement<String>(_WVDocumentInfoUTCOffset_QNAME, String.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "OriginalBytesUsed", scope = WVDocument.class)
    public JAXBElement<String> createWVDocumentOriginalBytesUsed(String value) {
        return new JAXBElement<String>(_WVDocumentInfoOriginalBytesUsed_QNAME, String.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDate", scope = WVDocument.class)
    public JAXBElement<XMLGregorianCalendar> createWVDocumentDocumentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateDocumentDetailsRequestDocumentDate_QNAME, XMLGregorianCalendar.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Attachments", scope = WVDocument.class)
    public JAXBElement<ArrayOfAttachmentDetail> createWVDocumentAttachments(ArrayOfAttachmentDetail value) {
        return new JAXBElement<ArrayOfAttachmentDetail>(_WVDocumentInfoAttachments_QNAME, ArrayOfAttachmentDetail.class, WVDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "OverallResult", scope = DocumentDetailsResponse.class)
    public JAXBElement<String> createDocumentDetailsResponseOverallResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseOverallResult_QNAME, String.class, DocumentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = DocumentDetailsResponse.class)
    public JAXBElement<String> createDocumentDetailsResponseErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, DocumentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Result", scope = DocumentDetailsResponse.class)
    public JAXBElement<String> createDocumentDetailsResponseResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseResult_QNAME, String.class, DocumentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWVDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWVDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "WorkViewDocuments", scope = DocumentDetailsResponse.class)
    public JAXBElement<ArrayOfWVDocument> createDocumentDetailsResponseWorkViewDocuments(ArrayOfWVDocument value) {
        return new JAXBElement<ArrayOfWVDocument>(_DocInfoResponseWorkViewDocuments_QNAME, ArrayOfWVDocument.class, DocumentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocType", scope = DocumentType.class)
    public JAXBElement<String> createDocumentTypeDocType(String value) {
        return new JAXBElement<String>(_DocumentTypeDocType_QNAME, String.class, DocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Quote", scope = Quotenumber.class)
    public JAXBElement<String> createQuotenumberQuote(String value) {
        return new JAXBElement<String>(_QuotenumberQuote_QNAME, String.class, Quotenumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = DocumentDetailsRequest.class)
    public JAXBElement<String> createDocumentDetailsRequestDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotenumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfQuotenumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "QuoteNumbers", scope = DocumentDetailsRequest.class)
    public JAXBElement<ArrayOfQuotenumber> createDocumentDetailsRequestQuoteNumbers(ArrayOfQuotenumber value) {
        return new JAXBElement<ArrayOfQuotenumber>(_DocInfoRequestQuoteNumbers_QNAME, ArrayOfQuotenumber.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "PolicyNumber", scope = DocumentDetailsRequest.class)
    public JAXBElement<String> createDocumentDetailsRequestPolicyNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoPolicyNumber_QNAME, String.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "CertificateNumber", scope = DocumentDetailsRequest.class)
    public JAXBElement<String> createDocumentDetailsRequestCertificateNumber(String value) {
        return new JAXBElement<String>(_WVDocumentInfoCertificateNumber_QNAME, String.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "FolderTypeCode", scope = DocumentDetailsRequest.class)
    public JAXBElement<String> createDocumentDetailsRequestFolderTypeCode(String value) {
        return new JAXBElement<String>(_DocInfoRequestFolderTypeCode_QNAME, String.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentTypes", scope = DocumentDetailsRequest.class)
    public JAXBElement<ArrayOfDocumentType> createDocumentDetailsRequestDocumentTypes(ArrayOfDocumentType value) {
        return new JAXBElement<ArrayOfDocumentType>(_DocInfoRequestDocumentTypes_QNAME, ArrayOfDocumentType.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentDescription", scope = DocumentDetailsRequest.class)
    public JAXBElement<String> createDocumentDetailsRequestDocumentDescription(String value) {
        return new JAXBElement<String>(_DocInfoRequestDocumentDescription_QNAME, String.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "LOBGroupCode", scope = DocumentDetailsRequest.class)
    public JAXBElement<String> createDocumentDetailsRequestLOBGroupCode(String value) {
        return new JAXBElement<String>(_DocInfoRequestLOBGroupCode_QNAME, String.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "InsuredID", scope = DocumentDetailsRequest.class)
    public JAXBElement<String> createDocumentDetailsRequestInsuredID(String value) {
        return new JAXBElement<String>(_DocInfoRequestInsuredID_QNAME, String.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "BrokerCode", scope = DocumentDetailsRequest.class)
    public JAXBElement<String> createDocumentDetailsRequestBrokerCode(String value) {
        return new JAXBElement<String>(_DocInfoRequestBrokerCode_QNAME, String.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "InputType", scope = DocumentDetailsRequest.class)
    public JAXBElement<String> createDocumentDetailsRequestInputType(String value) {
        return new JAXBElement<String>(_WVDocumentInfoInputType_QNAME, String.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "RecordLimit", scope = DocumentDetailsRequest.class)
    public JAXBElement<String> createDocumentDetailsRequestRecordLimit(String value) {
        return new JAXBElement<String>(_DocInfoRequestRecordLimit_QNAME, String.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "EnvironmentData", scope = DocumentDetailsRequest.class)
    public JAXBElement<EnvironmentData> createDocumentDetailsRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, DocumentDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "OverallResult", scope = DocumentMoveResponse.class)
    public JAXBElement<String> createDocumentMoveResponseOverallResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseOverallResult_QNAME, String.class, DocumentMoveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = DocumentMoveResponse.class)
    public JAXBElement<String> createDocumentMoveResponseErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, DocumentMoveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Result", scope = DocumentMoveResponse.class)
    public JAXBElement<String> createDocumentMoveResponseResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseResult_QNAME, String.class, DocumentMoveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = DocumentMoveResponse.class)
    public JAXBElement<String> createDocumentMoveResponseDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, DocumentMoveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = DocumentMoveRequest.class)
    public JAXBElement<String> createDocumentMoveRequestDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, DocumentMoveRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvironmentData }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "EnvironmentData", scope = DocumentMoveRequest.class)
    public JAXBElement<EnvironmentData> createDocumentMoveRequestEnvironmentData(EnvironmentData value) {
        return new JAXBElement<EnvironmentData>(_EnvironmentData_QNAME, EnvironmentData.class, DocumentMoveRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "DocumentGUID", scope = DocStatusInfo.class)
    public JAXBElement<String> createDocStatusInfoDocumentGUID(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseDocumentGUID_QNAME, String.class, DocStatusInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = DocStatusInfo.class)
    public JAXBElement<String> createDocStatusInfoErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, DocStatusInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "Result", scope = DocStatusInfo.class)
    public JAXBElement<String> createDocStatusInfoResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseResult_QNAME, String.class, DocStatusInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "OverallResult", scope = StatusUpdateResponse.class)
    public JAXBElement<String> createStatusUpdateResponseOverallResult(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseOverallResult_QNAME, String.class, StatusUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/WorkView/DocumentService/2016/06", name = "ErrorText", scope = StatusUpdateResponse.class)
    public JAXBElement<String> createStatusUpdateResponseErrorText(String value) {
        return new JAXBElement<String>(_UpdateDocumentDetailsResponseErrorText_QNAME, String.class, StatusUpdateResponse.class, value);
    }

}
