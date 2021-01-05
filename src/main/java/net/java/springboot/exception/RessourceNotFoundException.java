package net.java.springboot.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class RessourceNotFoundException extends RuntimeException {

	private static final long serialVersiousUID = 1L ;
	
	public RessourceNotFoundException(String message)
	{
		super(message);
	}
	
	public RessourceNotFoundException(String message, Throwable throwable)
	{
		super(message);
	}
	
}
