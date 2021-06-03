package com.main.exceptions;

public class ParameterException extends Exception {
    public ParameterException(String message) {
        super(message);
    }

    public String getMessage() {
        return super.getMessage();
    }
}
