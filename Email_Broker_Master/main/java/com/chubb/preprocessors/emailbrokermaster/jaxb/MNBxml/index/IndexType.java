package com.chubb.preprocessors.emailbrokermaster.jaxb.MNBxml.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for indexType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="indexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generalfile" type="{}generalfileType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indexType", propOrder = {
        "generalfile"
})
public class IndexType {

    @XmlElement(required = true)
    protected GeneralfileType generalfile;

    /**
     * Gets the value of the generalfile property.
     *
     * @return possible object is
     * {@link GeneralfileType }
     */
    public GeneralfileType getGeneralfile() {
        return generalfile;
    }

    /**
     * Sets the value of the generalfile property.
     *
     * @param value allowed object is
     *              {@link GeneralfileType }
     */
    public void setGeneralfile(GeneralfileType value) {
        this.generalfile = value;
    }

}
