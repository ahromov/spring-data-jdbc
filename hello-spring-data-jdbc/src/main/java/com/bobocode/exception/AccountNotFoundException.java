package com.bobocode.exception;

public class AccountNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6438649524143281907L;

	public AccountNotFoundException(String message) {
		super(message);
	}

}
