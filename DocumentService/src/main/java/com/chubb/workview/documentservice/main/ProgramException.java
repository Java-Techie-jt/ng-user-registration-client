package com.chubb.workview.documentservice.main;

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
