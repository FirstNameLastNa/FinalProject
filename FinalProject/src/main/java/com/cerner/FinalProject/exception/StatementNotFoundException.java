package com.cerner.FinalProject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class StatementNotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public StatementNotFoundException(String message) {
		super(message);
	}

}
