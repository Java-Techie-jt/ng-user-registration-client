package com.chubb.preprocessors.emailbrokermaster.beans;

/**
 * Created by sxgonn on 23/03/2016.Developed as part of Email Master
 * PreProcessor Component.
 */
public class DataBean {

    private String wvdocid;
    private String wvftypeid;
    private String wvfiletypeid;


    private Integer emailBrokerRoutingId;
    private String workbasketName;
    private Integer workbasketCode;
    private String countryCode;
    private Integer actionCode;
    private Character iccEnabled;
    private String iccRoute;
    private String mailboxName;
    private String docProducer;
    private String recipientEmailId;
    private String tollFreeFaxNumber;
    private Integer workPriority;

    public String getWvfiletypeid() {
        return wvfiletypeid;
    }

    public void setWvfiletypeid(String wvfiletypeid) {
        this.wvfiletypeid = wvfiletypeid;
    }

    public String getWvdocid() {
        return wvdocid;
    }

    public void setWvdocid(String wvdocid) {
        this.wvdocid = wvdocid;
    }

    public String getWvftypeid() {
        return wvftypeid;
    }

    public void setWvftypeid(String wvftypeid) {
        this.wvftypeid = wvftypeid;
    }

    public Integer getEmailBrokerRoutingId() {
        return emailBrokerRoutingId;
    }

    public void setEmailBrokerRoutingId(Integer emailBrokerRoutingId) {
        this.emailBrokerRoutingId = emailBrokerRoutingId;
    }

    public String getWorkbasketName() {
        return workbasketName;
    }

    public void setWorkbasketName(String workbasketName) {
        this.workbasketName = workbasketName;
    }

    public Integer getWorkbasketCode() {
        return workbasketCode;
    }

    public void setWorkbasketCode(Integer workbasketCode) {
        this.workbasketCode = workbasketCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getActionCode() {
        return actionCode;
    }

    public void setActionCode(Integer actionCode) {
        this.actionCode = actionCode;
    }

    public Character getIccEnabled() {
        return iccEnabled;
    }

    public void setIccEnabled(Character iccEnabled) {
        this.iccEnabled = iccEnabled;
    }

    public String getIccRoute() {
        return iccRoute;
    }

    public void setIccRoute(String iccRoute) {
        this.iccRoute = iccRoute;
    }

    public String getMailboxName() {
        return mailboxName;
    }

    public void setMailboxName(String mailboxName) {
        this.mailboxName = mailboxName;
    }

    public String getDocProducer() {
        return docProducer;
    }

    public void setDocProducer(String docProducer) {
        this.docProducer = docProducer;
    }

    public String getRecipientEmailId() {
        return recipientEmailId;
    }

    public void setRecipientEmailId(String recipientEmailId) {
        this.recipientEmailId = recipientEmailId;
    }

    public String getTollFreeFaxNumber() {
        return tollFreeFaxNumber;
    }

    public void setTollFreeFaxNumber(String tollFreeFaxNumber) {
        this.tollFreeFaxNumber = tollFreeFaxNumber;
    }

    public Integer getWorkPriority() {
        return workPriority;
    }

    public void setWorkPriority(Integer workPriority) {
        this.workPriority = workPriority;
    }
}
