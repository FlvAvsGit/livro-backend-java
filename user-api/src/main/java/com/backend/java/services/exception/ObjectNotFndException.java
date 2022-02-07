package com.backend.java.services.exception;

public class ObjectNotFndException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFndException(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectNotFndException(String message) {
		super(message);
	}
}
