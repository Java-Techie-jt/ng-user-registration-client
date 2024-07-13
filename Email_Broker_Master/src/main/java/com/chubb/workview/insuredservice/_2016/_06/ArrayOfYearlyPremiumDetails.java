
package com.chubb.workview.insuredservice._2016._06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfYearlyPremiumDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfYearlyPremiumDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YearlyPremiumDetails" type="{http://Chubb.com/WorkView/InsuredService/2016/06}YearlyPremiumDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfYearlyPremiumDetails", propOrder = {
    "yearlyPremiumDetails"
})
public class ArrayOfYearlyPremiumDetails {

    @XmlElement(name = "YearlyPremiumDetails", nillable = true)
    protected List<YearlyPremiumDetails> yearlyPremiumDetails;

    /**
     * Gets the value of the yearlyPremiumDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yearlyPremiumDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYearlyPremiumDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YearlyPremiumDetails }
     * 
     * 
     */
    public List<YearlyPremiumDetails> getYearlyPremiumDetails() {
        if (yearlyPremiumDetails == null) {
            yearlyPremiumDetails = new ArrayList<YearlyPremiumDetails>();
        }
        return this.yearlyPremiumDetails;
    }

}
