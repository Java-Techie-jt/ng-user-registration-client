
package com.chubb.workview.insuredservice._2016._06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfYearlyPremiumInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfYearlyPremiumInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YearlyPremiumInfo" type="{http://Chubb.com/WorkView/InsuredService/2016/06}YearlyPremiumInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfYearlyPremiumInfo", propOrder = {
    "yearlyPremiumInfo"
})
public class ArrayOfYearlyPremiumInfo {

    @XmlElement(name = "YearlyPremiumInfo", nillable = true)
    protected List<YearlyPremiumInfo> yearlyPremiumInfo;

    /**
     * Gets the value of the yearlyPremiumInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yearlyPremiumInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYearlyPremiumInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YearlyPremiumInfo }
     * 
     * 
     */
    public List<YearlyPremiumInfo> getYearlyPremiumInfo() {
        if (yearlyPremiumInfo == null) {
            yearlyPremiumInfo = new ArrayList<YearlyPremiumInfo>();
        }
        return this.yearlyPremiumInfo;
    }

}
