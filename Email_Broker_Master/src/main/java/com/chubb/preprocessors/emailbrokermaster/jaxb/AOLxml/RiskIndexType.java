package com.chubb.preprocessors.emailbrokermaster.jaxb.AOLxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskIndexType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="RiskIndexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POL_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ENT_CODE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BPU_CODE" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskIndexType", propOrder = {
        "polnumber",
        "entcode",
        "bpucode"
})
public class RiskIndexType {

    @XmlElement(name = "POL_NUMBER", required = true)
    protected String polnumber;
    @XmlElement(name = "ENT_CODE")
    protected int entcode;
    @XmlElement(name = "BPU_CODE")
    protected byte bpucode;

    /**
     * Gets the value of the polnumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPOLNUMBER() {
        return polnumber;
    }

    /**
     * Sets the value of the polnumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPOLNUMBER(String value) {
        this.polnumber = value;
    }

    /**
     * Gets the value of the entcode property.
     */
    public int getENTCODE() {
        return entcode;
    }

    /**
     * Sets the value of the entcode property.
     */
    public void setENTCODE(int value) {
        this.entcode = value;
    }

    /**
     * Gets the value of the bpucode property.
     */
    public byte getBPUCODE() {
        return bpucode;
    }

    /**
     * Sets the value of the bpucode property.
     */
    public void setBPUCODE(byte value) {
        this.bpucode = value;
    }

}
