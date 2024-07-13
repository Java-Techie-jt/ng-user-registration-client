
package com.chubb.workview.generalfileservice._2016._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeneralFileRequest" type="{http://Chubb.com/WorkView/GeneralFile/2016/06}ArrayOfGeneralFileRequestDetails"/>
 *         &lt;element name="EnvironmentData" type="{http://Chubb.com/WorkView/GeneralFile/2016/06}EnvironmentData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "generalFileRequest",
    "environmentData"
})
public class Request {

    @XmlElement(name = "GeneralFileRequest", required = true, nillable = true)
    protected ArrayOfGeneralFileRequestDetails generalFileRequest;
    @XmlElement(name = "EnvironmentData", required = true, nillable = true)
    protected EnvironmentData environmentData;

    /**
     * Gets the value of the generalFileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGeneralFileRequestDetails }
     *     
     */
    public ArrayOfGeneralFileRequestDetails getGeneralFileRequest() {
        return generalFileRequest;
    }

    /**
     * Sets the value of the generalFileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGeneralFileRequestDetails }
     *     
     */
    public void setGeneralFileRequest(ArrayOfGeneralFileRequestDetails value) {
        this.generalFileRequest = value;
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

}
