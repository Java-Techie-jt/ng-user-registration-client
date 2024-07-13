
package com.chubb.workview.documentloader.jaxb.iccxml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.chubb.workview.interfaces.jaxb.iccxml
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _ScannedImage_QNAME = new QName("", "ScannedImage");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.chubb.workview.interfaces.jaxb.iccxml
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ScannedImageType }
	 * 
	 */
	public ScannedImageType createScannedImageType() {
		return new ScannedImageType();
	}

	/**
	 * Create an instance of {@link DocumentType }
	 * 
	 */
	public DocumentType createDocumentType() {
		return new DocumentType();
	}

	/**
	 * Create an instance of {@link IndexType }
	 * 
	 */
	public IndexType createIndexType() {
		return new IndexType();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ScannedImageType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "ScannedImage")
	public JAXBElement<ScannedImageType> createScannedImage(ScannedImageType value) {
		return new JAXBElement<ScannedImageType>(_ScannedImage_QNAME, ScannedImageType.class, null, value);
	}

}
