package com.chubb.preprocessors.emailbrokermaster.jaxb.AOLxml;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RiskEnvelopeType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="RiskEnvelopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACEOnlineVersion" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="RiskIndex" type="{}RiskIndexType"/>
 *         &lt;element name="InsuredData" type="{}InsuredDataType"/>
 *         &lt;element name="SubmissionData" type="{}SubmissionDataType"/>
 *         &lt;element name="AttachmentIndex" type="{}AttachmentIndexType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskEnvelopeType", propOrder = {
        "aceOnlineVersion",
        "riskIndex",
        "insuredData",
        "submissionData",
        "attachmentIndex"
})
@XmlRootElement(name = "RiskEnvelope")
public class RiskEnvelopeType {

    @XmlElement(name = "ACEOnlineVersion")
    protected float aceOnlineVersion;
    @XmlElement(name = "RiskIndex", required = true)
    protected RiskIndexType riskIndex;
    @XmlElement(name = "InsuredData", required = true)
    protected InsuredDataType insuredData;
    @XmlElement(name = "SubmissionData", required = true)
    protected SubmissionDataType submissionData;
    @XmlElement(name = "AttachmentIndex")
    protected List<AttachmentIndexType> attachmentIndex;

    /**
     * Gets the value of the aceOnlineVersion property.
     */
    public float getACEOnlineVersion() {
        return aceOnlineVersion;
    }

    /**
     * Sets the value of the aceOnlineVersion property.
     */
    public void setACEOnlineVersion(float value) {
        this.aceOnlineVersion = value;
    }

    /**
     * Gets the value of the riskIndex property.
     *
     * @return possible object is
     * {@link RiskIndexType }
     */
    public RiskIndexType getRiskIndex() {
        return riskIndex;
    }

    /**
     * Sets the value of the riskIndex property.
     *
     * @param value allowed object is
     *              {@link RiskIndexType }
     */
    public void setRiskIndex(RiskIndexType value) {
        this.riskIndex = value;
    }

    /**
     * Gets the value of the insuredData property.
     *
     * @return possible object is
     * {@link InsuredDataType }
     */
    public InsuredDataType getInsuredData() {
        return insuredData;
    }

    /**
     * Sets the value of the insuredData property.
     *
     * @param value allowed object is
     *              {@link InsuredDataType }
     */
    public void setInsuredData(InsuredDataType value) {
        this.insuredData = value;
    }

    /**
     * Gets the value of the submissionData property.
     *
     * @return possible object is
     * {@link SubmissionDataType }
     */
    public SubmissionDataType getSubmissionData() {
        return submissionData;
    }

    /**
     * Sets the value of the submissionData property.
     *
     * @param value allowed object is
     *              {@link SubmissionDataType }
     */
    public void setSubmissionData(SubmissionDataType value) {
        this.submissionData = value;
    }

    /**
     * Gets the value of the attachmentIndex property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentIndex property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentIndex().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentIndexType }
     */
    public List<AttachmentIndexType> getAttachmentIndex() {
        if (attachmentIndex == null) {
            attachmentIndex = new ArrayList<AttachmentIndexType>();
        }
        return this.attachmentIndex;
    }

}
