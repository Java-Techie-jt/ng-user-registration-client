package com.chubb.workview.documentservice.main;

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
