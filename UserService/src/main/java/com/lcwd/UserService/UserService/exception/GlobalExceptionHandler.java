package com.lcwd.UserService.UserService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lcwd.UserService.UserService.payload.APIResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	public ResponseEntity<APIResponse> handleResourceNotFoundException(ResourceNotFound ex) {

		String message = ex.getMessage();
		APIResponse apiResponse = APIResponse.builder().message(message).success(false).build();
		return new ResponseEntity<APIResponse>(apiResponse, HttpStatus.NOT_FOUND);

	}
}
