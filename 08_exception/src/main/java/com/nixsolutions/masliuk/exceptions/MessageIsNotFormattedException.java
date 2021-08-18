package com.nixsolutions.masliuk.exceptions;

public class MessageIsNotFormattedException extends Exception {

    public MessageIsNotFormattedException(String message) {
        super(message);

    }

    @Override
    public String toString() {
        return "MESSAGE: " + super.toString();
    }
}
