
package com.chubb.workview.documentservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWVDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWVDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WVDocument" type="{http://chubb.com/WorkView/DocumentService/2016/06}WVDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWVDocument", propOrder = {
    "wvDocument"
})
public class ArrayOfWVDocument {

    @XmlElement(name = "WVDocument", nillable = true)
    protected List<WVDocument> wvDocument;

    /**
     * Gets the value of the wvDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wvDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWVDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WVDocument }
     * 
     * 
     */
    public List<WVDocument> getWVDocument() {
        if (wvDocument == null) {
            wvDocument = new ArrayList<WVDocument>();
        }
        return this.wvDocument;
    }

}
