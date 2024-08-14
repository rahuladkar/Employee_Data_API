package com.rahul.employee_app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rahul.employee_app.dto.ResponseStructure;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(IdDoesNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> catchIdDoesNotFoundException(IdDoesNotFoundException e){
		
		ResponseStructure<String> responseStructure = new ResponseStructure<String>();
		
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		responseStructure.setMesage("Not Found...!");
		responseStructure.setData(e.getMessage());
		
		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.NOT_FOUND);
		
	}

}
