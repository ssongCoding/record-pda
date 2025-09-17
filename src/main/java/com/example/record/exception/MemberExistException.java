package com.example.record.exception;

public class MemberExistException extends RuntimeException{
    public MemberExistException(String message) {
        super(message);
    }
}
