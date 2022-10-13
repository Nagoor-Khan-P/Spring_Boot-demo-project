package com.fullstack.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fullstack.demo.entity.ErrorResponse;

@ControllerAdvice //to handle all the exceptions over the spring application
public class GlobalExceptionHandler {
	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleEmployeeNotFoundException(EmployeeNotFoundException e){
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setErrorId(404);
		errorResponse.setErrorMessage("Employee Not Found in the Database"+e.getMessage());
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
		
	}
	
}
