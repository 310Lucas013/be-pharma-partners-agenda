package com.pharmapartners.agenda.exeptions;

public class IllegalInputException extends RuntimeException {
    public IllegalInputException() {
    }

    public IllegalInputException(String message){
        super(message);
    }
}
