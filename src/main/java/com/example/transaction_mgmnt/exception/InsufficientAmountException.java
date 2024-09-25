package com.example.transaction_mgmnt.exception;

public class InsufficientAmountException extends RuntimeException{

    public InsufficientAmountException(String message) {
        super(message);
    }
}
