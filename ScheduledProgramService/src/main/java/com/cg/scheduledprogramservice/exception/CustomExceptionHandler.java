package com.cg.scheduledprogramservice.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
	public class CustomExceptionHandler extends ResponseEntityExceptionHandler{

		private long currentTimeMillis = System.currentTimeMillis();
		private String errorMsg = "Some thing went wrong!";
		
		
		
		@ExceptionHandler(ResourceNotFoundException.class)
		public final ResponseEntity<ErrorMessage> resourceNotFound(ResourceNotFoundException ex){

			ErrorMessage exceptionResponse =
					new ErrorMessage(ex.getMessage(), 
							errorMsg,currentTimeMillis);
			return new ResponseEntity<ErrorMessage>(exceptionResponse,
					new HttpHeaders(),HttpStatus.NOT_FOUND);
		}
		
		
		@ExceptionHandler(CrudException.class)
		public final ResponseEntity<ErrorMessage> crudException(CrudException ex){

			ErrorMessage exceptionResponse =
					new ErrorMessage(ex.getMessage(), 
							errorMsg,currentTimeMillis);
			return new ResponseEntity<ErrorMessage>(exceptionResponse,
					new HttpHeaders(),HttpStatus.NOT_FOUND);
		}
		@ExceptionHandler(Exception.class)
		public final ResponseEntity<ErrorMessage> somethingWentWrong(Exception ex){
			
			ErrorMessage exceptionResponse =
					new ErrorMessage(ex.getMessage(), 
							errorMsg,currentTimeMillis);
			return new ResponseEntity<ErrorMessage>(exceptionResponse,
					new HttpHeaders(),HttpStatus.BAD_REQUEST);
			
		}
		
		
		
	}





