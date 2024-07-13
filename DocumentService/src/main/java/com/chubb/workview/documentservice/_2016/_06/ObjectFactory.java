
package com.chubb.workview.documentservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.chubb.workview.documentservice.DocumentDetailsRequest;
import com.chubb.workview.documentservice.DocumentDetailsResponse;
import com.chubb.workview.documentservice.DocumentInformationRequest;
import com.chubb.workview.documentservice.DocumentInformationResponse;
import com.chubb.workview.documentservice.DocumentMoveRequest;
import com.chubb.workview.documentservice.DocumentMoveResponse;
import com.chubb.workview.documentservice.DocumentRequest;
import com.chubb.workview.documentservice.DocumentResponse;
import com.chubb.workview.documentservice.ImportDocumentToFileRequest;
import com.chubb.workview.documentservice.ImportandIndexDocumentRequest;
import com.chubb.workview.documentservice.ImportandIndexDocumentResponseInfo;
import com.chubb.workview.documentservice.IndexDocumentRequest;
import com.chubb.workview.documentservice.IndexDocumentResponse;
import com.chubb.workview.documentservice.SpecificDocumentRequest;
import com.chubb.workview.documentservice.SpecificDocumentResponse;
import com.chubb.workview.documentservice.StatusUpdateRequest;
import com.chubb.workview.documentservice.StatusUpdateResponse;
import com.chubb.workview.documentservice.UpdateDocumentDetailsRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chubb.workview.documentservice._2016._06 package. 
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

    private final static QName _DocumentLifeCycleStatusUpdateRequest_QNAME = new QName("http://chubb.com/Workview/DocumentService/2016/06", "request");
    private final static QName _DocumentLifeCycleStatusUpdateResponseDocumentLifeCycleStatusUpdateResult_QNAME = new QName("http://chubb.com/Workview/DocumentService/2016/06", "DocumentLifeCycleStatusUpdateResult");
    private final static QName _ExecuteDocumentMoveResponseExecuteDocumentMoveResult_QNAME = new QName("http://chubb.com/Workview/DocumentService/2016/06", "ExecuteDocumentMoveResult");
    private final static QName _GetDocumentDetailsResponseGetDocumentDetailsResult_QNAME = new QName("http://chubb.com/Workview/DocumentService/2016/06", "GetDocumentDetailsResult");
    private final static QName _ExecuteIndexDocumentResponseExecuteIndexDocumentResult_QNAME = new QName("http://chubb.com/Workview/DocumentService/2016/06", "ExecuteIndexDocumentResult");
    private final static QName _ImportandIndexDocumentResponseImportandIndexDocumentResult_QNAME = new QName("http://chubb.com/Workview/DocumentService/2016/06", "ImportandIndexDocumentResult");
    private final static QName _GetSpecificDocumentResponseGetSpecificDocumentResult_QNAME = new QName("http://chubb.com/Workview/DocumentService/2016/06", "GetSpecificDocumentResult");
    private final static QName _ExportDocumentResponseExportDocumentResult_QNAME = new QName("http://chubb.com/Workview/DocumentService/2016/06", "ExportDocumentResult");
    private final static QName _ImportDocumentToFileResponseImportDocumentToFileResult_QNAME = new QName("http://chubb.com/Workview/DocumentService/2016/06", "ImportDocumentToFileResult");
    private final static QName _GetDocumentInformationResponseGetDocumentInformationResult_QNAME = new QName("http://chubb.com/Workview/DocumentService/2016/06", "GetDocumentInformationResult");
    private final static QName _UpdateDocumentDetailsResponseUpdateDocumentDetailsResult_QNAME = new QName("http://chubb.com/Workview/DocumentService/2016/06", "UpdateDocumentDetailsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chubb.workview.documentservice._2016._06
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentLifeCycleStatusUpdate }
     * 
     */
    public DocumentLifeCycleStatusUpdate createDocumentLifeCycleStatusUpdate() {
        return new DocumentLifeCycleStatusUpdate();
    }

    /**
     * Create an instance of {@link DocumentLifeCycleStatusUpdateResponse }
     * 
     */
    public DocumentLifeCycleStatusUpdateResponse createDocumentLifeCycleStatusUpdateResponse() {
        return new DocumentLifeCycleStatusUpdateResponse();
    }

    /**
     * Create an instance of {@link ExecuteDocumentMove }
     * 
     */
    public ExecuteDocumentMove createExecuteDocumentMove() {
        return new ExecuteDocumentMove();
    }

    /**
     * Create an instance of {@link ExecuteDocumentMoveResponse }
     * 
     */
    public ExecuteDocumentMoveResponse createExecuteDocumentMoveResponse() {
        return new ExecuteDocumentMoveResponse();
    }

    /**
     * Create an instance of {@link GetDocumentDetails }
     * 
     */
    public GetDocumentDetails createGetDocumentDetails() {
        return new GetDocumentDetails();
    }

    /**
     * Create an instance of {@link GetDocumentDetailsResponse }
     * 
     */
    public GetDocumentDetailsResponse createGetDocumentDetailsResponse() {
        return new GetDocumentDetailsResponse();
    }

    /**
     * Create an instance of {@link ExecuteIndexDocument }
     * 
     */
    public ExecuteIndexDocument createExecuteIndexDocument() {
        return new ExecuteIndexDocument();
    }

    /**
     * Create an instance of {@link ExecuteIndexDocumentResponse }
     * 
     */
    public ExecuteIndexDocumentResponse createExecuteIndexDocumentResponse() {
        return new ExecuteIndexDocumentResponse();
    }

    /**
     * Create an instance of {@link ImportandIndexDocument }
     * 
     */
    public ImportandIndexDocument createImportandIndexDocument() {
        return new ImportandIndexDocument();
    }

    /**
     * Create an instance of {@link ImportandIndexDocumentResponse }
     * 
     */
    public ImportandIndexDocumentResponse createImportandIndexDocumentResponse() {
        return new ImportandIndexDocumentResponse();
    }

    /**
     * Create an instance of {@link GetSpecificDocument }
     * 
     */
    public GetSpecificDocument createGetSpecificDocument() {
        return new GetSpecificDocument();
    }

    /**
     * Create an instance of {@link GetSpecificDocumentResponse }
     * 
     */
    public GetSpecificDocumentResponse createGetSpecificDocumentResponse() {
        return new GetSpecificDocumentResponse();
    }

    /**
     * Create an instance of {@link ExportDocument }
     * 
     */
    public ExportDocument createExportDocument() {
        return new ExportDocument();
    }

    /**
     * Create an instance of {@link ExportDocumentResponse }
     * 
     */
    public ExportDocumentResponse createExportDocumentResponse() {
        return new ExportDocumentResponse();
    }

    /**
     * Create an instance of {@link ImportDocumentToFile }
     * 
     */
    public ImportDocumentToFile createImportDocumentToFile() {
        return new ImportDocumentToFile();
    }

    /**
     * Create an instance of {@link com.chubb.workview.documentservice._2016._06.ImportDocumentToFileResponse }
     * 
     */
    public com.chubb.workview.documentservice._2016._06.ImportDocumentToFileResponse createImportDocumentToFileResponse() {
        return new com.chubb.workview.documentservice._2016._06.ImportDocumentToFileResponse();
    }

    /**
     * Create an instance of {@link GetDocumentInformation }
     * 
     */
    public GetDocumentInformation createGetDocumentInformation() {
        return new GetDocumentInformation();
    }

    /**
     * Create an instance of {@link GetDocumentInformationResponse }
     * 
     */
    public GetDocumentInformationResponse createGetDocumentInformationResponse() {
        return new GetDocumentInformationResponse();
    }

    /**
     * Create an instance of {@link UpdateDocumentDetails }
     * 
     */
    public UpdateDocumentDetails createUpdateDocumentDetails() {
        return new UpdateDocumentDetails();
    }

    /**
     * Create an instance of {@link com.chubb.workview.documentservice._2016._06.UpdateDocumentDetailsResponse }
     * 
     */
    public com.chubb.workview.documentservice._2016._06.UpdateDocumentDetailsResponse createUpdateDocumentDetailsResponse() {
        return new com.chubb.workview.documentservice._2016._06.UpdateDocumentDetailsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusUpdateRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusUpdateRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "request", scope = DocumentLifeCycleStatusUpdate.class)
    public JAXBElement<StatusUpdateRequest> createDocumentLifeCycleStatusUpdateRequest(StatusUpdateRequest value) {
        return new JAXBElement<StatusUpdateRequest>(_DocumentLifeCycleStatusUpdateRequest_QNAME, StatusUpdateRequest.class, DocumentLifeCycleStatusUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusUpdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusUpdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "DocumentLifeCycleStatusUpdateResult", scope = DocumentLifeCycleStatusUpdateResponse.class)
    public JAXBElement<StatusUpdateResponse> createDocumentLifeCycleStatusUpdateResponseDocumentLifeCycleStatusUpdateResult(StatusUpdateResponse value) {
        return new JAXBElement<StatusUpdateResponse>(_DocumentLifeCycleStatusUpdateResponseDocumentLifeCycleStatusUpdateResult_QNAME, StatusUpdateResponse.class, DocumentLifeCycleStatusUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentMoveRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentMoveRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "request", scope = ExecuteDocumentMove.class)
    public JAXBElement<DocumentMoveRequest> createExecuteDocumentMoveRequest(DocumentMoveRequest value) {
        return new JAXBElement<DocumentMoveRequest>(_DocumentLifeCycleStatusUpdateRequest_QNAME, DocumentMoveRequest.class, ExecuteDocumentMove.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentMoveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentMoveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "ExecuteDocumentMoveResult", scope = ExecuteDocumentMoveResponse.class)
    public JAXBElement<DocumentMoveResponse> createExecuteDocumentMoveResponseExecuteDocumentMoveResult(DocumentMoveResponse value) {
        return new JAXBElement<DocumentMoveResponse>(_ExecuteDocumentMoveResponseExecuteDocumentMoveResult_QNAME, DocumentMoveResponse.class, ExecuteDocumentMoveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentDetailsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentDetailsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "request", scope = GetDocumentDetails.class)
    public JAXBElement<DocumentDetailsRequest> createGetDocumentDetailsRequest(DocumentDetailsRequest value) {
        return new JAXBElement<DocumentDetailsRequest>(_DocumentLifeCycleStatusUpdateRequest_QNAME, DocumentDetailsRequest.class, GetDocumentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentDetailsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentDetailsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "GetDocumentDetailsResult", scope = GetDocumentDetailsResponse.class)
    public JAXBElement<DocumentDetailsResponse> createGetDocumentDetailsResponseGetDocumentDetailsResult(DocumentDetailsResponse value) {
        return new JAXBElement<DocumentDetailsResponse>(_GetDocumentDetailsResponseGetDocumentDetailsResult_QNAME, DocumentDetailsResponse.class, GetDocumentDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndexDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "request", scope = ExecuteIndexDocument.class)
    public JAXBElement<IndexDocumentRequest> createExecuteIndexDocumentRequest(IndexDocumentRequest value) {
        return new JAXBElement<IndexDocumentRequest>(_DocumentLifeCycleStatusUpdateRequest_QNAME, IndexDocumentRequest.class, ExecuteIndexDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndexDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "ExecuteIndexDocumentResult", scope = ExecuteIndexDocumentResponse.class)
    public JAXBElement<IndexDocumentResponse> createExecuteIndexDocumentResponseExecuteIndexDocumentResult(IndexDocumentResponse value) {
        return new JAXBElement<IndexDocumentResponse>(_ExecuteIndexDocumentResponseExecuteIndexDocumentResult_QNAME, IndexDocumentResponse.class, ExecuteIndexDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportandIndexDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportandIndexDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "request", scope = ImportandIndexDocument.class)
    public JAXBElement<ImportandIndexDocumentRequest> createImportandIndexDocumentRequest(ImportandIndexDocumentRequest value) {
        return new JAXBElement<ImportandIndexDocumentRequest>(_DocumentLifeCycleStatusUpdateRequest_QNAME, ImportandIndexDocumentRequest.class, ImportandIndexDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportandIndexDocumentResponseInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportandIndexDocumentResponseInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "ImportandIndexDocumentResult", scope = ImportandIndexDocumentResponse.class)
    public JAXBElement<ImportandIndexDocumentResponseInfo> createImportandIndexDocumentResponseImportandIndexDocumentResult(ImportandIndexDocumentResponseInfo value) {
        return new JAXBElement<ImportandIndexDocumentResponseInfo>(_ImportandIndexDocumentResponseImportandIndexDocumentResult_QNAME, ImportandIndexDocumentResponseInfo.class, ImportandIndexDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecificDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "request", scope = GetSpecificDocument.class)
    public JAXBElement<SpecificDocumentRequest> createGetSpecificDocumentRequest(SpecificDocumentRequest value) {
        return new JAXBElement<SpecificDocumentRequest>(_DocumentLifeCycleStatusUpdateRequest_QNAME, SpecificDocumentRequest.class, GetSpecificDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecificDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "GetSpecificDocumentResult", scope = GetSpecificDocumentResponse.class)
    public JAXBElement<SpecificDocumentResponse> createGetSpecificDocumentResponseGetSpecificDocumentResult(SpecificDocumentResponse value) {
        return new JAXBElement<SpecificDocumentResponse>(_GetSpecificDocumentResponseGetSpecificDocumentResult_QNAME, SpecificDocumentResponse.class, GetSpecificDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "request", scope = ExportDocument.class)
    public JAXBElement<DocumentRequest> createExportDocumentRequest(DocumentRequest value) {
        return new JAXBElement<DocumentRequest>(_DocumentLifeCycleStatusUpdateRequest_QNAME, DocumentRequest.class, ExportDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "ExportDocumentResult", scope = ExportDocumentResponse.class)
    public JAXBElement<DocumentResponse> createExportDocumentResponseExportDocumentResult(DocumentResponse value) {
        return new JAXBElement<DocumentResponse>(_ExportDocumentResponseExportDocumentResult_QNAME, DocumentResponse.class, ExportDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportDocumentToFileRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportDocumentToFileRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "request", scope = ImportDocumentToFile.class)
    public JAXBElement<ImportDocumentToFileRequest> createImportDocumentToFileRequest(ImportDocumentToFileRequest value) {
        return new JAXBElement<ImportDocumentToFileRequest>(_DocumentLifeCycleStatusUpdateRequest_QNAME, ImportDocumentToFileRequest.class, ImportDocumentToFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.chubb.workview.documentservice.ImportDocumentToFileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.chubb.workview.documentservice.ImportDocumentToFileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "ImportDocumentToFileResult", scope = com.chubb.workview.documentservice._2016._06.ImportDocumentToFileResponse.class)
    public JAXBElement<com.chubb.workview.documentservice.ImportDocumentToFileResponse> createImportDocumentToFileResponseImportDocumentToFileResult(com.chubb.workview.documentservice.ImportDocumentToFileResponse value) {
        return new JAXBElement<com.chubb.workview.documentservice.ImportDocumentToFileResponse>(_ImportDocumentToFileResponseImportDocumentToFileResult_QNAME, com.chubb.workview.documentservice.ImportDocumentToFileResponse.class, com.chubb.workview.documentservice._2016._06.ImportDocumentToFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentInformationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentInformationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "request", scope = GetDocumentInformation.class)
    public JAXBElement<DocumentInformationRequest> createGetDocumentInformationRequest(DocumentInformationRequest value) {
        return new JAXBElement<DocumentInformationRequest>(_DocumentLifeCycleStatusUpdateRequest_QNAME, DocumentInformationRequest.class, GetDocumentInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentInformationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentInformationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "GetDocumentInformationResult", scope = GetDocumentInformationResponse.class)
    public JAXBElement<DocumentInformationResponse> createGetDocumentInformationResponseGetDocumentInformationResult(DocumentInformationResponse value) {
        return new JAXBElement<DocumentInformationResponse>(_GetDocumentInformationResponseGetDocumentInformationResult_QNAME, DocumentInformationResponse.class, GetDocumentInformationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocumentDetailsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDocumentDetailsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "request", scope = UpdateDocumentDetails.class)
    public JAXBElement<UpdateDocumentDetailsRequest> createUpdateDocumentDetailsRequest(UpdateDocumentDetailsRequest value) {
        return new JAXBElement<UpdateDocumentDetailsRequest>(_DocumentLifeCycleStatusUpdateRequest_QNAME, UpdateDocumentDetailsRequest.class, UpdateDocumentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.chubb.workview.documentservice.UpdateDocumentDetailsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.chubb.workview.documentservice.UpdateDocumentDetailsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://chubb.com/Workview/DocumentService/2016/06", name = "UpdateDocumentDetailsResult", scope = com.chubb.workview.documentservice._2016._06.UpdateDocumentDetailsResponse.class)
    public JAXBElement<com.chubb.workview.documentservice.UpdateDocumentDetailsResponse> createUpdateDocumentDetailsResponseUpdateDocumentDetailsResult(com.chubb.workview.documentservice.UpdateDocumentDetailsResponse value) {
        return new JAXBElement<com.chubb.workview.documentservice.UpdateDocumentDetailsResponse>(_UpdateDocumentDetailsResponseUpdateDocumentDetailsResult_QNAME, com.chubb.workview.documentservice.UpdateDocumentDetailsResponse.class, com.chubb.workview.documentservice._2016._06.UpdateDocumentDetailsResponse.class, value);
    }

}
