package com.cerner.FinalProject.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.cerner.FinalProject.model.Statement;

@ControllerAdvice
public class GlobalExceptionHandler {
	
@ExceptionHandler(StatementNotFoundException.class)
public ResponseEntity<Statement> statementNotFoundException(StatementNotFoundException ex, WebRequest request){
	ErrorDetails errorDetails  = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
	
	return new ResponseEntity<Statement>(HttpStatus.NOT_FOUND);
}

@ExceptionHandler(Exception.class)

public ResponseEntity<Statement> globalExceptionHandler(Exception ex, WebRequest request){
	
	ErrorDetails errorDetails  = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
	
	return new ResponseEntity<Statement>(HttpStatus.INTERNAL_SERVER_ERROR);
}


}