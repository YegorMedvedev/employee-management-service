package com.employee.managementService.exception;

public class EntityAlreadyExists extends RuntimeException {
    public EntityAlreadyExists(final String message) {
        super(message);
    }
}
