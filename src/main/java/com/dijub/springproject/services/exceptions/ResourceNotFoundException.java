package com.dijub.springproject.services.exceptions;

/**
 * ResourceNotFoundException
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource Not Found. Id " + id);
    }

}
