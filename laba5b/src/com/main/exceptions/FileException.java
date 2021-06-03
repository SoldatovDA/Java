package com.main.exceptions;

public class FileException extends Exception{
    public FileException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
