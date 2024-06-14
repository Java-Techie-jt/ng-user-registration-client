package com.chubb.preprocessors.emailbrokermaster.jaxb.MNBxml.index;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.chubb.preprocessors.integration.jaxb.generalfile.index package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IndexEnvelope_QNAME = new QName("", "index_envelope");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chubb.preprocessors.integration.jaxb.generalfile.index
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IndexEnvelopeType }
     */
    public IndexEnvelopeType createIndexEnvelopeType() {
        return new IndexEnvelopeType();
    }

    /**
     * Create an instance of {@link GeneralfileType }
     */
    public GeneralfileType createGeneralfileType() {
        return new GeneralfileType();
    }

    /**
     * Create an instance of {@link IndexType }
     */
    public IndexType createIndexType() {
        return new IndexType();
    }

    /**
     * Create an instance of {@link DocumentType }
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link GfFieldsType }
     */
    public GfFieldsType createGfFieldsType() {
        return new GfFieldsType();
    }

    /**
     * Create an instance of {@link GfHeaderType }
     */
    public GfHeaderType createGfHeaderType() {
        return new GfHeaderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexEnvelopeType }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "index_envelope")
    public JAXBElement<IndexEnvelopeType> createIndexEnvelope(IndexEnvelopeType value) {
        return new JAXBElement<IndexEnvelopeType>(_IndexEnvelope_QNAME, IndexEnvelopeType.class, null, value);
    }

}
