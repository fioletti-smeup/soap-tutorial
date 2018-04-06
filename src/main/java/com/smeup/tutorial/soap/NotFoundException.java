package com.smeup.tutorial.soap;

public class NotFoundException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public NotFoundException() {
    }

    public NotFoundException(final String message) {
        super(message);
    }
}
