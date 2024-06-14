package com.chubb.preprocessors.emailbrokermaster.jaxb.bodyxml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.chubb.preprocessors.emailbrokermaster.jaxb.bodyxml package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _GfNumber_QNAME = new QName("", "gf_number");
    private static final QName _FtypCode_QNAME = new QName("", "ftyp_code");
    private static final QName _CertNumber_QNAME = new QName("", "cert_number");
    private static final QName _CertName_QNAME = new QName("", "cert_name");
    private static final QName _DocTypCode_QNAME = new QName("", "doc_typ_code");
    private static final QName _QuoteNumber_QNAME = new QName("", "quote_number");
    private static final QName _DocDescription_QNAME = new QName("", "doc_description");
    private static final QName _BpuCode_QNAME = new QName("", "bpu_code");
    private static final QName _DocProducer_QNAME = new QName("", "doc_producer");
    private static final QName _PolNumber_QNAME = new QName("", "pol_number");
    private static final QName _EntCode_QNAME = new QName("", "ent_code");
    private static final QName _ScanInfo_QNAME = new QName("", "scan_info");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * com.chubb.preprocessors.emailbrokermaster.jaxb.bodyxml
     */
    public ObjectFactory() {
    }

    //

    /**
     * Create an instance of {@link Document }
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Certificate }
     */
    public Certificate createCertificate() {
        return new Certificate();
    }

    /**
     * Create an instance of {@link Index }
     */
    public Index createIndex() {
        return new Index();
    }

    /**
     * Create an instance of {@link Policy }
     */
    public Policy createPolicy() {
        return new Policy();
    }

    /**
     * Create an instance of {@link Claim }
     */
    public Claim createClaim() {
        return new Claim();
    }

    /**
     * Create an instance of {@link Generalfile }
     */
    public Generalfile createGeneralfile() {
        return new Generalfile();
    }

    /**
     * Create an instance of {@link Quote }
     */
    public Quote createQuote() {
        return new Quote();
    }

    /**
     * Create an instance of {@link IndexEnvelope }
     */
    public IndexEnvelope createIndexEnvelope() {
        return new IndexEnvelope();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String
     * }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "gf_number")
    public JAXBElement<String> createGfNumber(String value) {
        return new JAXBElement<>(_GfNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String
     * }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "ftyp_code")
    public JAXBElement<String> createFtypCode(String value) {
        return new JAXBElement<>(_FtypCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String
     * }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "cert_number")
    public JAXBElement<String> createCertNumber(String value) {
        return new JAXBElement<>(_CertNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String
     * }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "cert_name")
    public JAXBElement<String> createCertName(String value) {
        return new JAXBElement<>(_CertName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String
     * }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "doc_typ_code")
    public JAXBElement<String> createDocTypCode(String value) {
        return new JAXBElement<>(_DocTypCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String
     * }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "quote_number")
    public JAXBElement<String> createQuoteNumber(String value) {
        return new JAXBElement<>(_QuoteNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String
     * }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "doc_description")
    public JAXBElement<String> createDocDescription(String value) {
        return new JAXBElement<>(_DocDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String
     * }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "bpu_code")
    public JAXBElement<String> createBpuCode(String value) {
        return new JAXBElement<>(_BpuCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String
     * }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "doc_producer")
    public JAXBElement<String> createDocProducer(String value) {
        return new JAXBElement<>(_DocProducer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String
     * }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "pol_number")
    public JAXBElement<String> createPolNumber(String value) {
        return new JAXBElement<>(_PolNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String
     * }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "ent_code")
    public JAXBElement<String> createEntCode(String value) {
        return new JAXBElement<>(_EntCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String
     * }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "scan_info")
    public JAXBElement<String> createScanInfo(String value) {
        return new JAXBElement<>(_ScanInfo_QNAME, String.class, null, value);
    }

}
