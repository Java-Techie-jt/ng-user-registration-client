
package unwanted;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import unwanted.TransferDocumentRequest.InputReferenceData;
import unwanted.TransferDocumentResponse.OutPutReferenceData;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the datacontracts.core.documentservice.chubb._2016._03 package. 
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

    private final static QName _TransferDocumentRequest_QNAME = new QName("http://Chubb.DocumentService.Core.DataContracts/2016/03", "TransferDocumentRequest");
    private final static QName _TransferDocumentResponse_QNAME = new QName("http://Chubb.DocumentService.Core.DataContracts/2016/03", "TransferDocumentResponse");
    private final static QName _TransferDocumentResponseOutPutReferenceData_QNAME = new QName("http://Chubb.DocumentService.Core.DataContracts/2016/03", "OutPutReferenceData");
    private final static QName _TransferDocumentRequestDestinationSystem_QNAME = new QName("http://Chubb.DocumentService.Core.DataContracts/2016/03", "DestinationSystem");
    private final static QName _TransferDocumentRequestInputReferenceData_QNAME = new QName("http://Chubb.DocumentService.Core.DataContracts/2016/03", "InputReferenceData");
    private final static QName _TransferDocumentRequestSourceSystem_QNAME = new QName("http://Chubb.DocumentService.Core.DataContracts/2016/03", "SourceSystem");
    
    private final static QName _TransferDocumentRequestOverAllStatus_QNAME = new QName("http://Chubb.DocumentService.Core.DataContracts/2016/03", "OverallStatus");
    private final static QName _TransferDocumentRequestErrorText_QNAME = new QName("http://Chubb.DocumentService.Core.DataContracts/2016/03", "ErrorText");
    private final static QName _TransferDocumentRequestFileName_QNAME = new QName("http://Chubb.DocumentService.Core.DataContracts/2016/03", "DocumentFileName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: datacontracts.core.documentservice.chubb._2016._03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransferDocumentResponse }
     * 
     */
    public TransferDocumentResponse createTransferDocumentResponse() {
        return new TransferDocumentResponse();
    }

    /**
     * Create an instance of {@link TransferDocumentRequest }
     * 
     */
    public TransferDocumentRequest createTransferDocumentRequest() {
        return new TransferDocumentRequest();
    }

    /**
     * Create an instance of {@link TransferDocumentResponse.OutPutReferenceData }
     * 
     */
    public TransferDocumentResponse.OutPutReferenceData createTransferDocumentResponseOutPutReferenceData() {
        return new TransferDocumentResponse.OutPutReferenceData();
    }

    /**
     * Create an instance of {@link TransferDocumentRequest.InputReferenceData }
     * 
     */
    public TransferDocumentRequest.InputReferenceData createTransferDocumentRequestInputReferenceData() {
        return new TransferDocumentRequest.InputReferenceData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://Chubb.DocumentService.Core.DataContracts/2016/03", name = "TransferDocumentRequest")
    public JAXBElement<TransferDocumentRequest> createTransferDocumentRequest(TransferDocumentRequest value) {
        return new JAXBElement<TransferDocumentRequest>(_TransferDocumentRequest_QNAME, TransferDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Chubb.DocumentService.Core.DataContracts/2016/03", name = "TransferDocumentResponse")
    public JAXBElement<TransferDocumentResponse> createTransferDocumentResponse(TransferDocumentResponse value) {
        return new JAXBElement<TransferDocumentResponse>(_TransferDocumentResponse_QNAME, TransferDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferDocumentResponse.OutPutReferenceData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferDocumentResponse.OutPutReferenceData }{@code >}
     */
    @XmlElementDecl(namespace = "http://Chubb.DocumentService.Core.DataContracts/2016/03", name = "OutPutReferenceData", scope = TransferDocumentResponse.class)
    public JAXBElement<TransferDocumentResponse.OutPutReferenceData> createTransferDocumentResponseOutPutReferenceData(TransferDocumentResponse.OutPutReferenceData value) {
        return new JAXBElement<TransferDocumentResponse.OutPutReferenceData>(_TransferDocumentResponseOutPutReferenceData_QNAME, TransferDocumentResponse.OutPutReferenceData.class, TransferDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://Chubb.DocumentService.Core.DataContracts/2016/03", name = "DestinationSystem", scope = TransferDocumentRequest.class)
    public JAXBElement<String> createTransferDocumentRequestDestinationSystem(String value) {
        return new JAXBElement<String>(_TransferDocumentRequestDestinationSystem_QNAME, String.class, TransferDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferDocumentRequest.InputReferenceData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferDocumentRequest.InputReferenceData }{@code >}
     */
    @XmlElementDecl(namespace = "http://Chubb.DocumentService.Core.DataContracts/2016/03", name = "InputReferenceData", scope = TransferDocumentRequest.class)
    public JAXBElement<TransferDocumentRequest.InputReferenceData> createTransferDocumentRequestInputReferenceData(TransferDocumentRequest.InputReferenceData value) {
        return new JAXBElement<TransferDocumentRequest.InputReferenceData>(_TransferDocumentRequestInputReferenceData_QNAME, TransferDocumentRequest.InputReferenceData.class, TransferDocumentRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://Chubb.DocumentService.Core.DataContracts/2016/03", name = "SourceSystem", scope = TransferDocumentRequest.class)
    public JAXBElement<String> createTransferDocumentRequestSourceSystem(String value) {
        return new JAXBElement<String>(_TransferDocumentRequestSourceSystem_QNAME, String.class, TransferDocumentRequest.class, value);
    }

	/**
	 * @return the TransferdocumentrequestoverallstatusQname
	 */
    @XmlElementDecl(namespace = "http://Chubb.DocumentService.Core.DataContracts/2016/03", name ="OverallStatus", scope = TransferDocumentResponse.OutPutReferenceData.class)
	public JAXBElement<String> createTransferdocumentrequestoverallstatusQname(String value) {
		return new JAXBElement<String>(_TransferDocumentRequestOverAllStatus_QNAME, String.class, TransferDocumentResponse.OutPutReferenceData.class, value);
	}

	/**
	 * @return the TransferdocumentrequesterrortextQname
	 */
    @XmlElementDecl(namespace = "http://Chubb.DocumentService.Core.DataContracts/2016/03", name ="ErrorText" , scope = TransferDocumentResponse.OutPutReferenceData.class)
	public JAXBElement<String> createTransferdocumentrequesterrortextQname(String value) {
	   return new JAXBElement<String>(_TransferDocumentRequestErrorText_QNAME, String.class, TransferDocumentResponse.OutPutReferenceData.class, value);
	}

	/**
	 * @return the TransferdocumentrequestfilenameQname
	 */
    @XmlElementDecl(namespace = "http://Chubb.DocumentService.Core.DataContracts/2016/03", name ="DocumentFileName", scope = TransferDocumentResponse.OutPutReferenceData.class)
	public JAXBElement<String> createTransferdocumentrequestfilenameQname(String value) {
    	return new JAXBElement<String>(_TransferDocumentRequestFileName_QNAME, String.class, TransferDocumentResponse.OutPutReferenceData.class, value);
	}
    
    

}
