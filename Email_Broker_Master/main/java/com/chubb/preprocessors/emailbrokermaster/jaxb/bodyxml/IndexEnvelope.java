package com.chubb.preprocessors.emailbrokermaster.jaxb.bodyxml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}bpu_code"/>
 *         &lt;choice>
 *           &lt;element name="error_queue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="queue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element ref="{}index"/>
 *         &lt;element ref="{}document" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"bpuCode", "errorQueue", "queue", "index", "document"})
@XmlRootElement(name = "index_envelope")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
public class IndexEnvelope {

    @XmlElement(name = "bpu_code", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String bpuCode;
    @XmlElement(name = "error_queue")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String errorQueue;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String queue;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Index index;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Document> document;

    /**
     * Gets the value of the bpuCode property.
     *
     * @return possible object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getBpuCode() {
        return bpuCode;
    }

    /**
     * Sets the value of the bpuCode property.
     *
     * @param value allowed object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBpuCode(String value) {
        this.bpuCode = value;
    }

    /**
     * Gets the value of the errorQueue property.
     *
     * @return possible object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getErrorQueue() {
        return errorQueue;
    }

    /**
     * Sets the value of the errorQueue property.
     *
     * @param value allowed object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setErrorQueue(String value) {
        this.errorQueue = value;
    }

    /**
     * Gets the value of the queue property.
     *
     * @return possible object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     *
     * @param value allowed object is {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setQueue(String value) {
        this.queue = value;
    }

    /**
     * Gets the value of the index property.
     *
     * @return possible object is {@link Index }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public Index getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     *
     * @param value allowed object is {@link Index }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIndex(Index value) {
        this.index = value;
    }

    /**
     * Gets the value of the document property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the document property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <p>
     * <pre>
     * getDocument().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Document
     * }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-08-18T02:47:43+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Document> getDocument() {
        if (document == null) {
            document = new ArrayList<Document>();
        }
        return this.document;
    }

}
