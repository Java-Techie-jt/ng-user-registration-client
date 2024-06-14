package com.chubb.workview.documentloader.service;

/**
 * Created by sxgonn on 10/05/2016. This is an Custom exception class created to
 * halt the processing of current email and handle it further at the root level.
 */
public class ProcessingFailedException extends Exception {

	ProcessingFailedException() {
		super();
	}

	ProcessingFailedException(String message) {
		super(message);
	}

	public ProcessingFailedException(String message, Throwable t) {
		super(message, t);
	}

}
