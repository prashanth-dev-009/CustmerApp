package com.att.orders;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class OrderException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	OrderException(String message, HttpStatus status){
		super(message);
		this.message = message;
		this.status = status;
	}
	
	private String message;
	private HttpStatus status;
	

}
