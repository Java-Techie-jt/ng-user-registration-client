
package com.chubb.workview.generalfileservice._2016._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OverAllResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeneralFileResponse" type="{http://Chubb.com/WorkView/GeneralFileService/2016/06}GeneralFileResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "overAllResult",
    "generalFileResponse"
})
public class Response {

    @XmlElementRef(name = "OverAllResult", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overAllResult;
    @XmlElementRef(name = "GeneralFileResponse", namespace = "http://Chubb.com/WorkView/GeneralFile/2016/06", type = JAXBElement.class, required = false)
    protected JAXBElement<GeneralFileResponse> generalFileResponse;

    /**
     * Gets the value of the overAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverAllResult() {
        return overAllResult;
    }

    /**
     * Sets the value of the overAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverAllResult(JAXBElement<String> value) {
        this.overAllResult = value;
    }

    /**
     * Gets the value of the generalFileResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeneralFileResponse }{@code >}
     *     
     */
    public JAXBElement<GeneralFileResponse> getGeneralFileResponse() {
        return generalFileResponse;
    }

    /**
     * Sets the value of the generalFileResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeneralFileResponse }{@code >}
     *     
     */
    public void setGeneralFileResponse(JAXBElement<GeneralFileResponse> value) {
        this.generalFileResponse = value;
    }

}
