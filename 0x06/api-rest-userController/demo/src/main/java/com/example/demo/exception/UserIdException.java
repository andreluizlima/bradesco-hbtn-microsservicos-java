package com.example.demo.exception;

public class UserIdException extends RuntimeException {

    public UserIdException(String userId) {
        super(userId);
    }

}
