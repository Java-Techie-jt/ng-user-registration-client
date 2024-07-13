package com.chubb.workview.documentloader.service;

/**
 * Created by sxgonn on 18/08/2016.Developed as part of Email Master
 * PreProcessor Component.
 */
public class DBConnectionError extends Throwable {

	public DBConnectionError() {
		super();
	}

	public DBConnectionError(String message) {
		super(message);
	}

	public DBConnectionError(String message, Throwable t) {
		super(message, t);
	}

}
