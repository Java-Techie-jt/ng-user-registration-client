
package com.chubb.workview.insuredservice._2016._06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInsuredRelationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInsuredRelationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuredRelationDetails" type="{http://Chubb.com/WorkView/InsuredService/2016/06}InsuredRelationDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInsuredRelationDetails", propOrder = {
    "insuredRelationDetails"
})
public class ArrayOfInsuredRelationDetails {

    @XmlElement(name = "InsuredRelationDetails", nillable = true)
    protected List<InsuredRelationDetails> insuredRelationDetails;

    /**
     * Gets the value of the insuredRelationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuredRelationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuredRelationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuredRelationDetails }
     * 
     * 
     */
    public List<InsuredRelationDetails> getInsuredRelationDetails() {
        if (insuredRelationDetails == null) {
            insuredRelationDetails = new ArrayList<InsuredRelationDetails>();
        }
        return this.insuredRelationDetails;
    }

}
