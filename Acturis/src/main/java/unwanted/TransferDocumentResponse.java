
package unwanted;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for TransferDocumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferDocumentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutPutReferenceData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OverallResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferDocumentResponse", propOrder = {
    "outPutReferenceData",
    "overallResult"
})
public class TransferDocumentResponse {

    @XmlElementRef(name = "OutPutReferenceData", namespace = "http://Chubb.DocumentService.Core.DataContracts/2016/03", type = JAXBElement.class, required = false)
    protected JAXBElement<TransferDocumentResponse.OutPutReferenceData> outPutReferenceData;
    @XmlElement(name = "OverallResult")
    protected Boolean overallResult;

    /**
     * Gets the value of the outPutReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferDocumentResponse.OutPutReferenceData }{@code >}
     *     
     */
    public JAXBElement<TransferDocumentResponse.OutPutReferenceData> getOutPutReferenceData() {
        return outPutReferenceData;
    }

    /**
     * Sets the value of the outPutReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferDocumentResponse.OutPutReferenceData }{@code >}
     *     
     */
    public void setOutPutReferenceData(JAXBElement<TransferDocumentResponse.OutPutReferenceData> value) {
        this.outPutReferenceData = value;
    }

    /**
     * Gets the value of the overallResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverallResult() {
        return overallResult;
    }

    /**
     * Sets the value of the overallResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverallResult(Boolean value) {
        this.overallResult = value;
    }


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
     *         &lt;any processContents='lax' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "OutPutReferenceData", propOrder = {
        "OverallStatus",
        "ErrorText",
        "DocumentFileName"
    })
    public static class OutPutReferenceData {
    	
    	 @XmlElementRef(name ="OverallStatus", namespace ="http://Chubb.DocumentService.Core.DataContracts/2016/03", type = JAXBElement.class, required = false)
    	 protected JAXBElement<String> OverallStatus;
    	 @XmlElementRef(name ="ErrorText", namespace ="http://Chubb.DocumentService.Core.DataContracts/2016/03", type = JAXBElement.class, required = false)
    	 protected JAXBElement<String> ErrorText;
    	 @XmlElementRef(name ="DocumentFileName", namespace ="http://Chubb.DocumentService.Core.DataContracts/2016/03", type = JAXBElement.class, required = false)
    	 protected JAXBElement<String> DocumentFileName;
		/**
		 * @return the overallStatus
		 */
		public JAXBElement<String> getOverallStatus() {
			return OverallStatus;
		}
		/**
		 * @param overallStatus the overallStatus to set
		 */
		public void setOverallStatus(JAXBElement<String> overallStatus) {
			OverallStatus = overallStatus;
		}
		/**
		 * @return the errorText
		 */
		public JAXBElement<String> getErrorText() {
			return ErrorText;
		}
		/**
		 * @param errorText the errorText to set
		 */
		public void setErrorText(JAXBElement<String> errorText) {
			ErrorText = errorText;
		}
		/**
		 * @return the documentFileName
		 */
		public JAXBElement<String> getDocumentFileName() {
			return DocumentFileName;
		}
		/**
		 * @param documentFileName the documentFileName to set
		 */
		public void setDocumentFileName(JAXBElement<String> documentFileName) {
			DocumentFileName = documentFileName;
		}
    	 
    	 

//        @XmlAnyElement(lax = true)
//        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
//        public Object getAny() {
//            return any;
//        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
//        public void setAny(Object value) {
//            this.any = value;
//        }

    }

}
