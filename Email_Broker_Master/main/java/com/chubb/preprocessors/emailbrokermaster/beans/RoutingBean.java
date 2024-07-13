package com.chubb.preprocessors.emailbrokermaster.beans;

/**
 * Created by sxgonn on 10/08/2016.
 */
public class RoutingBean {
    private String ctryCode;
    private String documentTypeCode;
    private String docProducer;
    private String folderTypeCode;
    private String lobGroupCode;
    private String mailboxName;
    private String receipientEmailId;
    private String teamWorkbasket;
    private String workbasketCode;
    private String workbasketName;
    private String fileTypeCode;
    private String lobId;
    private String batchDescription;
    private int wiTargetDays;
    private String priority;
    private String tcfRequired;


    public String getTcfRequired() {
        return tcfRequired;
    }

    public void setTcfRequired(String tcfRequired) {
        this.tcfRequired = tcfRequired;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getLobId() {
        return lobId;
    }

    public void setLobId(String lobId) {
        this.lobId = lobId;
    }

    public String getBatchDescription() {
        return batchDescription;
    }

    public void setBatchDescription(String batchDescription) {
        this.batchDescription = batchDescription;
    }

    public int getWiTargetDays() {
        return wiTargetDays;
    }

    public void setWiTargetDays(int wiTargetDays) {
        this.wiTargetDays = wiTargetDays;
    }

    public String getFileTypeCode() {
        return fileTypeCode;
    }

    public void setFileTypeCode(String fileTypeCode) {
        this.fileTypeCode = fileTypeCode;
    }

    public String getCtryCode() {
        return ctryCode;
    }

    public void setCtryCode(String ctryCode) {
        this.ctryCode = ctryCode;
    }

    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    public void setDocumentTypeCode(String documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
    }

    public String getDocProducer() {
        return docProducer;
    }

    public void setDocProducer(String docProducer) {
        this.docProducer = docProducer;
    }

    public String getFolderTypeCode() {
        return folderTypeCode;
    }

    public void setFolderTypeCode(String folderTypeCode) {
        this.folderTypeCode = folderTypeCode;
    }

    public String getLobGroupCode() {
        return lobGroupCode;
    }

    public void setLobGroupCode(String lobGroupCode) {
        this.lobGroupCode = lobGroupCode;
    }

    public String getMailboxName() {
        return mailboxName;
    }

    public void setMailboxName(String mailboxName) {
        this.mailboxName = mailboxName;
    }

    public String getReceipientEmailId() {
        return receipientEmailId;
    }

    public void setReceipientEmailId(String receipientEmailId) {
        this.receipientEmailId = receipientEmailId;
    }

    public String getTeamWorkbasket() {
        return teamWorkbasket;
    }

    public void setTeamWorkbasket(String teamWorkbasket) {
        this.teamWorkbasket = teamWorkbasket;
    }

    public String getWorkbasketCode() {
        return workbasketCode;
    }

    public void setWorkbasketCode(String workbasketCode) {
        this.workbasketCode = workbasketCode;
    }

    public String getWorkbasketName() {
        return workbasketName;
    }

    public void setWorkbasketName(String workbasketName) {
        this.workbasketName = workbasketName;
    }
}
