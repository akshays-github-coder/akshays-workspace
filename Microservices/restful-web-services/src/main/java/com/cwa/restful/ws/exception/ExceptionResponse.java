package com.cwa.restful.ws.exception;

import java.util.Date;

public class ExceptionResponse {

	Date date; 
	String message; 
	String description;
	
	public ExceptionResponse(Date date, String message, String description) {
		super();
		this.date = date;
		this.message = message;
		this.description = description;
	}
	

}
