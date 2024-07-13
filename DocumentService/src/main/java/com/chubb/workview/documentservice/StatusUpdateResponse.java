
package com.chubb.workview.documentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusUpdateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusUpdateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OverallResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentsStatusInfo" type="{http://chubb.com/WorkView/DocumentService/2016/06}ArrayOfDocStatusInfo"/&gt;
 *         &lt;element name="EnvironmentData" type="{http://chubb.com/WorkView/DocumentService/2016/06}EnvironmentData"/&gt;
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusUpdateResponse", propOrder = {
    "overallResult",
    "documentsStatusInfo",
    "environmentData",
    "errorText"
})
public class StatusUpdateResponse {

    @XmlElementRef(name = "OverallResult", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overallResult;
    @XmlElement(name = "DocumentsStatusInfo", required = true, nillable = true)
    protected ArrayOfDocStatusInfo documentsStatusInfo;
    @XmlElement(name = "EnvironmentData", required = true, nillable = true)
    protected EnvironmentData environmentData;
    @XmlElementRef(name = "ErrorText", namespace = "http://chubb.com/WorkView/DocumentService/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorText;

    /**
     * Gets the value of the overallResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverallResult() {
        return overallResult;
    }

    /**
     * Sets the value of the overallResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverallResult(JAXBElement<String> value) {
        this.overallResult = value;
    }

    /**
     * Gets the value of the documentsStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocStatusInfo }
     *     
     */
    public ArrayOfDocStatusInfo getDocumentsStatusInfo() {
        return documentsStatusInfo;
    }

    /**
     * Sets the value of the documentsStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocStatusInfo }
     *     
     */
    public void setDocumentsStatusInfo(ArrayOfDocStatusInfo value) {
        this.documentsStatusInfo = value;
    }

    /**
     * Gets the value of the environmentData property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentData }
     *     
     */
    public EnvironmentData getEnvironmentData() {
        return environmentData;
    }

    /**
     * Sets the value of the environmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentData }
     *     
     */
    public void setEnvironmentData(EnvironmentData value) {
        this.environmentData = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorText(JAXBElement<String> value) {
        this.errorText = value;
    }

}
