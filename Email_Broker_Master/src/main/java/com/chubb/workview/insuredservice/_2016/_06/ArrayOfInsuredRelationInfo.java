
package com.chubb.workview.insuredservice._2016._06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInsuredRelationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInsuredRelationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuredRelationInfo" type="{http://Chubb.com/WorkView/InsuredService/2016/06}InsuredRelationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInsuredRelationInfo", propOrder = {
    "insuredRelationInfo"
})
public class ArrayOfInsuredRelationInfo {

    @XmlElement(name = "InsuredRelationInfo", nillable = true)
    protected List<InsuredRelationInfo> insuredRelationInfo;

    /**
     * Gets the value of the insuredRelationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuredRelationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuredRelationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuredRelationInfo }
     * 
     * 
     */
    public List<InsuredRelationInfo> getInsuredRelationInfo() {
        if (insuredRelationInfo == null) {
            insuredRelationInfo = new ArrayList<InsuredRelationInfo>();
        }
        return this.insuredRelationInfo;
    }

}
