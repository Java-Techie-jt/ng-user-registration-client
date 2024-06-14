
package com.chubb.preprocessor.emailbrokermaster.policywebservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCoverageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCoverageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoverageResponse" type="{http://schemas.datacontract.org/2004/07/Chubb.WorkView.PolicyService.DataContracts}CoverageResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCoverageResponse", propOrder = {
    "coverageResponse"
})
public class ArrayOfCoverageResponse {

    @XmlElement(name = "CoverageResponse", nillable = true)
    protected List<CoverageResponse> coverageResponse;

    /**
     * Gets the value of the coverageResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageResponse }
     * 
     * 
     */
    public List<CoverageResponse> getCoverageResponse() {
        if (coverageResponse == null) {
            coverageResponse = new ArrayList<CoverageResponse>();
        }
        return this.coverageResponse;
    }

}
