
package com.chubb.workview.policyservice._2016._06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCoverageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCoverageRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoverageRequest" type="{http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts}CoverageRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyCoverRequest", propOrder = {
    "coverageRequest"
})
public class PolicyCoverRequest {

    @XmlElement(name = "CoverageRequest", nillable = true)
    protected List<CoverageRequest> coverageRequest;

    /**
     * Gets the value of the coverageRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageRequest }
     * 
     * 
     */
    public List<CoverageRequest> getCoverageRequest() {
        if (coverageRequest == null) {
            coverageRequest = new ArrayList<CoverageRequest>();
        }
        return this.coverageRequest;
    }

}
