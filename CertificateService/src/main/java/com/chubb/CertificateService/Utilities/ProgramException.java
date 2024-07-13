package com.chubb.CertificateService.Utilities;

/**
 * Created by sxgonn on 18/08/2016.Developed as part of Email Master
 * PreProcessor Component.
 */
@SuppressWarnings("serial")
public class ProgramException extends Exception {

    public ProgramException() {
        super();
    }

    public ProgramException(String message) {
        super(message);
    }

    public ProgramException(String message, Throwable t) {
        super(message, t);
    }

}
