
package com.chubb.workview.generalfileservice._2016._06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGeneralFileRequestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGeneralFileRequestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeneralFileRequestDetails" type="{http://Chubb.com/WorkView/GeneralFile/2016/06}GeneralFileRequestDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGeneralFileRequestDetails", propOrder = {
    "generalFileRequestDetails"
})
public class ArrayOfGeneralFileRequestDetails {

    @XmlElement(name = "GeneralFileRequestDetails", nillable = true)
    protected List<GeneralFileRequestDetails> generalFileRequestDetails;

    /**
     * Gets the value of the generalFileRequestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalFileRequestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralFileRequestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralFileRequestDetails }
     * 
     * 
     */
    public List<GeneralFileRequestDetails> getGeneralFileRequestDetails() {
        if (generalFileRequestDetails == null) {
            generalFileRequestDetails = new ArrayList<GeneralFileRequestDetails>();
        }
        return this.generalFileRequestDetails;
    }

}
