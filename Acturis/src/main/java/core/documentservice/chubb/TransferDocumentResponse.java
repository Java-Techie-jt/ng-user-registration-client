
package core.documentservice.chubb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="TransferDocumentResult" type="{http://Chubb.DocumentService.Core.DataContracts/2016/03}TransferDocumentResponse" minOccurs="0"/&gt;
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
    "transferDocumentResult"
})
@XmlRootElement(name = "TransferDocumentResponse")
public class TransferDocumentResponse {

    @XmlElementRef(name = "TransferDocumentResult", namespace = "Chubb.DocumentService.Core", type = JAXBElement.class, required = false)
    protected JAXBElement<datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse> transferDocumentResult;

    /**
     * Gets the value of the transferDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse }{@code >}
     *     
     */
    public JAXBElement<datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse> getTransferDocumentResult() {
        return transferDocumentResult;
    }

    /**
     * Sets the value of the transferDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse }{@code >}
     *     
     */
    public void setTransferDocumentResult(JAXBElement<datacontracts.core.documentservice.chubb._2016._03.TransferDocumentResponse> value) {
        this.transferDocumentResult = value;
    }

}
