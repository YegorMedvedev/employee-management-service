package com.employee.hub.exception;

public class EntityAlreadyExists extends RuntimeException {
    public EntityAlreadyExists(final String message) {
        super(message);
    }
}
