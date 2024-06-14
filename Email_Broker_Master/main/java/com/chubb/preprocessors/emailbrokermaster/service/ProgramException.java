package com.chubb.preprocessors.emailbrokermaster.service;

/**
 * Created by sxgonn on 18/08/2016.Developed as part of Email Master
 * PreProcessor Component.
 */
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
