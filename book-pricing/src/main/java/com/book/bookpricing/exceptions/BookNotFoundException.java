package com.book.bookpricing.exceptions;

public class BookNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public BookNotFoundException() {
		super();
	}

	public BookNotFoundException(String message, Exception exception) {
		super(message, exception);
	}

	public BookNotFoundException(String message) {
		super(message);
	}
	public BookNotFoundException(Exception exception) {
		super(exception);
	}
	

}
