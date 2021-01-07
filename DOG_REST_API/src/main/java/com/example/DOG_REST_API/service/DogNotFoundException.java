package com.example.DOG_REST_API.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*When an endpoint returns successfully, Spring provides an HTTP 200 (OK) response.

If we want to specify the response status of a controller method, we can mark that method with @ResponseStatus.
It has two interchangeable arguments for the desired response status: code, and value or reason .*/
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dog not found")
public class DogNotFoundException extends RuntimeException {

    public DogNotFoundException() {
    }

    public DogNotFoundException(String message) {
        super(message);
    }
}
