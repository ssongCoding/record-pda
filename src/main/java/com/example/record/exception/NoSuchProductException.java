package com.example.record.exception;

import java.util.NoSuchElementException;

public class NoSuchProductException extends NoSuchElementException {
    public NoSuchProductException(String s) {
        super(s);
    }
}
