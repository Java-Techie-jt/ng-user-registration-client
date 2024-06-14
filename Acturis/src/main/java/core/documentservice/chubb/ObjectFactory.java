
package core.documentservice.chubb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import datacontracts.core.documentservice.chubb._2016._03.TransferDocumentRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the core.documentservice.chubb package. 
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

    private final static QName _TransferDocumentTransferDocumentRequest_QNAME = new QName("Chubb.DocumentService.Core", "transferDocumentRequest");
    private final static QName _TransferDocumentResponseTransferDocumentResult_QNAME = new QName("Chubb.DocumentService.Core", "TransferDocumentResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: core.documentservice.chubb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransferDocument }
     * 
     */
    public TransferDocument createTransferDocument() {
        return new TransferDocument();
    }

    /**
     * Create an instance of {@link core.documentservice.chubb.TransferDocumentResponse }
     * 
     */
    public core.documentservice.chubb.TransferDocumentResponse createTransferDocumentResponse() {
        return new core.documentservice.chubb.TransferDocumentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "Chubb.DocumentService.Core", name = "transferDocumentRequest", scope = TransferDocument.class)
    public JAXBElement<TransferDocumentRequest> createTransferDocumentTransferDocumentRequest(TransferDocumentRequest value) {
        return new JAXBElement<TransferDocumentRequest>(_TransferDocumentTransferDocumentRequest_QNAME, TransferDocumentRequest.class, TransferDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "Chubb.DocumentService.Core", name = "TransferDocumentResult", scope = core.documentservice.chubb.TransferDocumentResponse.class)
    public JAXBElement<datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse> createTransferDocumentResponseTransferDocumentResult(datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse value) {
        return new JAXBElement<datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse>(_TransferDocumentResponseTransferDocumentResult_QNAME, datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse.class, core.documentservice.chubb.TransferDocumentResponse.class, value);
    }

}
