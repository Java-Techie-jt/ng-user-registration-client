
package core.documentservice.chubb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import datacontracts.core.documentservice.chubb._2016._03.TransferDocumentRequest;


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
 *         &lt;element name="transferDocumentRequest" type="{http://Chubb.DocumentService.Core.DataContracts/2016/03}TransferDocumentRequest" minOccurs="0"/&gt;
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
    "transferDocumentRequest"
})
@XmlRootElement(name = "TransferDocument")
public class TransferDocument {

    @XmlElementRef(name = "transferDocumentRequest", namespace = "Chubb.DocumentService.Core", type = JAXBElement.class, required = false)
    protected JAXBElement<TransferDocumentRequest> transferDocumentRequest;

    /**
     * Gets the value of the transferDocumentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferDocumentRequest }{@code >}
     *     
     */
    public JAXBElement<TransferDocumentRequest> getTransferDocumentRequest() {
        return transferDocumentRequest;
    }

    /**
     * Sets the value of the transferDocumentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferDocumentRequest }{@code >}
     *     
     */
    public void setTransferDocumentRequest(JAXBElement<TransferDocumentRequest> value) {
        this.transferDocumentRequest = value;
    }

}
