package com.jspring.test.service;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dog not found")
public class DogNotFound extends RuntimeException {
	
	public DogNotFound() {
}
	public DogNotFound(String message) {
		super(message);
	}
}
