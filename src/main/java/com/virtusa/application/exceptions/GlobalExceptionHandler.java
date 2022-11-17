package com.virtusa.application.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException (Exception ex) {
		return new ResponseEntity<String>("Sent from Global ExceptionHandler...\n"
				+ ex.toString(), null, 400);
	}
}
