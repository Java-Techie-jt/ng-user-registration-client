package com.chubb.preprocessors.emailbrokermaster.beans;

import com.chubb.preprocessors.emailbrokermaster.jaxb.AOLxml.RiskEnvelopeType;

import com.chubb.preprocessors.emailbrokermaster.jaxb.MNBxml.index.IndexEnvelopeType;
import com.chubb.preprocessors.emailbrokermaster.jaxb.bodyxml.IndexEnvelope;
import com.chubb.preprocessors.emailbrokermaster.jaxb.iccxml.Index;
import com.chubb.preprocessors.emailbrokermaster.jaxb.iccxml.WorkbasketData;

import java.util.Date;
import java.util.List;

/**
 * Created by sxgonn on 08/03/2016. This is a Bean Class used throughout the
 * Execution for an Email Object.
 */
public class EmailBean {

    private String[] to;
    private String from;
    private String subject;
    private Date sendDate;
    private Date receivedDate;
    private boolean hasAttachments = false;
    private String detectedMailType;
    private String countryCode;
    private String sourceXML;
    private String packageID;
    private List<DocumentBean> attachments;
    private String emailName;
    private Index indexInfoBean;
   

	private boolean isCertCreated=false;

    private IndexEnvelope indexEnvelope;
    private IndexEnvelopeType indexEnvelopeType;


   


    private RiskEnvelopeType riskEnvelopeType;
    private WorkbasketData wbInfoBean;
    private String ackMessage;
    private String shaXML;
    private boolean isAckSent = false;
    private String InsuredId;
    private String PolicyId;
    private String gfNumber;
    private String quoteNumber;


    public boolean isCertCreated() {
		return isCertCreated;
	}

	public void setCertCreated(boolean isCertCreated) {
		this.isCertCreated = isCertCreated;
	}
    
    
    public String getQuoteNumber() {
        return quoteNumber;
    }

    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }

    public String getGfNumber() {
        return gfNumber;
    }

    public void setGfNumber(String gfNumber) {
        this.gfNumber = gfNumber;
    }

    public IndexEnvelopeType getIndexEnvelopeType() {
        return indexEnvelopeType;
    }

    public void setIndexEnvelopeType(IndexEnvelopeType indexEnvelopeType) {
        this.indexEnvelopeType = indexEnvelopeType;
    }

    public String getPolicyId() {
        return PolicyId;
    }

    public void setPolicyId(String policyId) {
        PolicyId = policyId;
    }

    public String getInsuredId() {
        return InsuredId;
    }

    public void setInsuredId(String insuredId) {
        InsuredId = insuredId;
    }

    public RiskEnvelopeType getRiskEnvelopeType() {
        return riskEnvelopeType;
    }

    public void setRiskEnvelopeType(RiskEnvelopeType riskEnvelopeType) {
        this.riskEnvelopeType = riskEnvelopeType;
    }

   

    public boolean isAckSent() {
        return isAckSent;
    }

    public void setAckSent(boolean isAckSent) {
        this.isAckSent = isAckSent;
    }

    public String getAckMessage() {
        return ackMessage;
    }

    public void setAckMessage(String ackMessage) {
        this.ackMessage = ackMessage;
    }

    public String getShaXML() {
        return shaXML;
    }

    public void setShaXML(String shaXML) {
        this.shaXML = shaXML;
    }


    public String[] getTo() {
        return to;
    }

    public void setTo(String[] to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public boolean isHasAttachments() {
        return hasAttachments;
    }

    public void setHasAttachments(boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public List<DocumentBean> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<DocumentBean> attachments) {
        this.attachments = attachments;
    }

    public Index getIndexInfoBean() {
        return indexInfoBean;
    }

    public void setIndexInfoBean(Index indexInfoBean) {
        this.indexInfoBean = indexInfoBean;
    }

    public WorkbasketData getWbInfoBean() {
        return wbInfoBean;
    }

    public void setWbInfoBean(WorkbasketData wbInfoBean) {
        this.wbInfoBean = wbInfoBean;
    }

    public String getSourceXML() {
        return sourceXML;
    }

    public void setSourceXML(String body) {
        this.sourceXML = body;
    }

    public String getPackageID() {
        return packageID;
    }

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    public Date getsendDate() {
        return sendDate;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public IndexEnvelope getIndexEnvelope() {
        return indexEnvelope;
    }

    public void setIndexEnvelope(IndexEnvelope indexEnvelope) {
        this.indexEnvelope = indexEnvelope;
    }

    public String getDetectedMailType() {
        return detectedMailType;
    }

    public void setDetectedMailType(String detectedMailType) {
        this.detectedMailType = detectedMailType;
    }
}
