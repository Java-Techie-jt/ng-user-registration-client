package com.chubb.preprocessor.emailbrokermaster.ackservice;

public class DocumentBean {

    private String packageId;
    private String docName;
    private String receipientEmailId;
    private String fromEmailId;
    private String isDocumentOGIMD5CheckSumMatch;
    private String isDocumentIndexed;
    private String isDocumentCreated;
    private String isEVNTHNDLRPSCCMPLD;
    private String polNumber;
    private String isAckSent;
    private String ctrycode;

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getReceipientEmailId() {
        return receipientEmailId;
    }

    public void setReceipientEmailId(String receipientEmailId) {
        this.receipientEmailId = receipientEmailId;
    }

    public String getFromEmailId() {
        return fromEmailId;
    }

    public void setFromEmailId(String fromEmailId) {
        this.fromEmailId = fromEmailId;
    }

    public String getIsDocumentOGIMD5CheckSumMatch() {
        return isDocumentOGIMD5CheckSumMatch;
    }

    public void setIsDocumentOGIMD5CheckSumMatch(String isDocumentOGIMD5CheckSumMatch) {
    	this.isDocumentOGIMD5CheckSumMatch = isDocumentOGIMD5CheckSumMatch;
    }

    public String getIsDocumentIndexed() {
        return isDocumentIndexed;
    }

    public void setIsDocumentIndexed(String isDocumentIndexed) {
    	this.isDocumentIndexed = isDocumentIndexed;
    }

    public String getIsDocumentCreated() {
        return isDocumentCreated;
    }

    public void setIsDocumentCreated(String isDocumentCreated) {
    	this.isDocumentCreated = isDocumentCreated;
    }

    public String getIsEVNTHNDLRPSCCMPLD() {
        return isEVNTHNDLRPSCCMPLD;
    }

    public void setIsEVNTHNDLRPSCCMPLD(String isEVNTHNDLRPSCCMPLD) {
        this.isEVNTHNDLRPSCCMPLD = isEVNTHNDLRPSCCMPLD;
    }

    public String getPolNumber() {
        return polNumber;
    }

    public void setPolNumber(String polNumber) {
        this.polNumber = polNumber;
    }

    public String getIsAckSent() {
        return isAckSent;
    }

    public void setIsAckSent(String isAckSent) {
    	this.isAckSent = isAckSent;
    }

    public String getCtrycode() {
        return ctrycode;
    }

    public void setCtrycode(String ctrycode) {
        this.ctrycode = ctrycode;
    }


}
