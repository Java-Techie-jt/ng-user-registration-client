package com.chubb.preprocessors.emailbrokermaster.jaxb.MNBxml.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for gf_fieldsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="gf_fieldsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gf_field" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Assuming"/>
 *               &lt;enumeration value="Monthly"/>
 *               &lt;enumeration value="2013/08    "/>
 *               &lt;enumeration value="Summary"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gf_fieldsType", propOrder = {
        "gfField"
})
public class GfFieldsType {

    @XmlElement(name = "gf_field")
    protected List<String> gfField;

    /**
     * Gets the value of the gfField property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gfField property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGfField().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getGfField() {
        if (gfField == null) {
            gfField = new ArrayList<String>();
        }
        return this.gfField;
    }

}
