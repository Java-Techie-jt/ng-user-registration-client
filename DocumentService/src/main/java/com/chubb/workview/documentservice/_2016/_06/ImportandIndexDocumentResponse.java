
package com.chubb.workview.documentservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.chubb.workview.documentservice.ImportandIndexDocumentResponseInfo;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImportandIndexDocumentResult" type="{http://chubb.com/WorkView/DocumentService/2016/06}ImportandIndexDocumentResponseInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importandIndexDocumentResult"
})
@XmlRootElement(name = "ImportandIndexDocumentResponse")
public class ImportandIndexDocumentResponse {

    @XmlElementRef(name = "ImportandIndexDocumentResult", namespace = "http://chubb.com/Workview/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportandIndexDocumentResponseInfo> importandIndexDocumentResult;

    /**
     * Gets the value of the importandIndexDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportandIndexDocumentResponseInfo }{@code >}
     *     
     */
    public JAXBElement<ImportandIndexDocumentResponseInfo> getImportandIndexDocumentResult() {
        return importandIndexDocumentResult;
    }

    /**
     * Sets the value of the importandIndexDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportandIndexDocumentResponseInfo }{@code >}
     *     
     */
    public void setImportandIndexDocumentResult(JAXBElement<ImportandIndexDocumentResponseInfo> value) {
        this.importandIndexDocumentResult = value;
    }

}
