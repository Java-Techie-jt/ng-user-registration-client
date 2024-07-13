
package com.chubb.workview.insuredservice._2016._06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMeridianInsuredExtractResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMeridianInsuredExtractResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeridianInsuredExtractResponseDetail" type="{http://Chubb.com/WorkView/InsuredService/2016/06}MeridianInsuredExtractResponseDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMeridianInsuredExtractResponseDetail", propOrder = {
    "meridianInsuredExtractResponseDetail"
})
public class ArrayOfMeridianInsuredExtractResponseDetail {

    @XmlElement(name = "MeridianInsuredExtractResponseDetail", nillable = true)
    protected List<MeridianInsuredExtractResponseDetail> meridianInsuredExtractResponseDetail;

    /**
     * Gets the value of the meridianInsuredExtractResponseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meridianInsuredExtractResponseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeridianInsuredExtractResponseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeridianInsuredExtractResponseDetail }
     * 
     * 
     */
    public List<MeridianInsuredExtractResponseDetail> getMeridianInsuredExtractResponseDetail() {
        if (meridianInsuredExtractResponseDetail == null) {
            meridianInsuredExtractResponseDetail = new ArrayList<MeridianInsuredExtractResponseDetail>();
        }
        return this.meridianInsuredExtractResponseDetail;
    }

}
