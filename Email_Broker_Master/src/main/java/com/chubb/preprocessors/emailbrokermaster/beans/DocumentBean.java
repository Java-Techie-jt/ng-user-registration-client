package com.chubb.preprocessors.emailbrokermaster.beans;

import java.io.InputStream;
import java.util.Date;

/**
 * Created by sxgonn on 22/03/2016. This is a Bean Class used throughout the
 * Execution for an Document/Attachment Object.
 */
public class DocumentBean {

    private String packageID;
    private String isParent;
    private String fileName;
    private String scanInfo;
    private String scanDate;
    private String scanTime;
    private String docDescription;
    private String folderTypeCode;
    private String fileTypeCode;
    private String docTypeCode;
    private String docProducer;
    private String ain;
    private Date docDate;
    private InputStream document;
    private String othereref;
    private InputStream doc;

    
    public InputStream getDoc() {
        return doc;
    }

    public void setDoc(InputStream doc) {
        this.doc = doc;
    }

    public String getOthereref() {
        return othereref;
    }

    public void setOthereref(String othereref) {
        this.othereref = othereref;
    }

    public String getPackageID() {
        return packageID;
    }

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    public String isParent() {
        return isParent;
    }

    public void setParent(String parent) {
        isParent = parent;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getScanInfo() {
        return scanInfo;
    }

    public void setScanInfo(String scanInfo) {
        this.scanInfo = scanInfo;
    }

    public String getScanDate() {
        return scanDate;
    }

    public void setScanDate(String scanDate) {
        this.scanDate = scanDate;
    }

    public String getScanTime() {
        return scanTime;
    }

    public void setScanTime(String scanTime) {
        this.scanTime = scanTime;
    }

    public String getDocDescription() {
        return docDescription;
    }

    public void setDocDescription(String docDescription) {
        this.docDescription = docDescription;
    }

    public String getFolderTypeCode() {
        return folderTypeCode;
    }

    public void setFolderTypeCode(String folderTypeCode) {
        this.folderTypeCode = folderTypeCode;
    }

    public String getDocTypeCode() {
        return docTypeCode;
    }

    public void setDocTypeCode(String docTypeCode) {
        this.docTypeCode = docTypeCode;
    }

    public String getDocProducer() {
        return docProducer;
    }

    public void setDocProducer(String docProducer) {
        this.docProducer = docProducer;
    }

    public String getAin() {
        return ain;
    }

    public void setAIN(String s) {
        this.ain = s;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public InputStream getDocument() {
        return document;
    }

    public void setDocument(InputStream document) {
        this.document = document;
    }

    public String getFileTypeCode() {
        return fileTypeCode;
    }

    public void setFileTypeCode(String fileTypeCode) {
        this.fileTypeCode = fileTypeCode;
    }
}
