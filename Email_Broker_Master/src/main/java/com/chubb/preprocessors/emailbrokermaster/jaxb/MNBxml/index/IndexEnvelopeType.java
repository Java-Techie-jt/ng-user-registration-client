package com.chubb.preprocessors.emailbrokermaster.jaxb.MNBxml.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for index_envelopeType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="index_envelopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="index" type="{}indexType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "index_envelopeType", propOrder = {
        "index"
})
public class IndexEnvelopeType {

    @XmlElement(required = true)
    protected IndexType index;

    /**
     * Gets the value of the index property.
     *
     * @return possible object is
     * {@link IndexType }
     */
    public IndexType getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     *
     * @param value allowed object is
     *              {@link IndexType }
     */
    public void setIndex(IndexType value) {
        this.index = value;
    }

}
