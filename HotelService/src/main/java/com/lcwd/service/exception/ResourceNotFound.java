package com.lcwd.service.exception;

public class ResourceNotFound extends RuntimeException{
	public ResourceNotFound() {
		super("resource not found on server !!!");
	}

	public ResourceNotFound(String message) {
		super(message);

	}
}
