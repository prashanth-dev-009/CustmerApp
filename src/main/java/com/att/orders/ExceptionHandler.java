package com.att.orders;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(assignableTypes = {OrderApiController.class})
public class ExceptionHandler extends ResponseEntityExceptionHandler{
	
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value= {OrderException.class})
	protected ResponseEntity<Object> handleServiceExcep(OrderException ex){
		
		return new ResponseEntity<>(ex.getMessage(), ex.getStatus());
		
	}

}
