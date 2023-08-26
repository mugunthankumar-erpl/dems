package com.erplogic.dems.exceptions;

import com.erplogic.dems.response.structure.Errors;

public class BadRequestException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static final String BAD_REQUEST = "Bad Request";
    private Errors errors;

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(final Errors errors) {
        this.errors = errors;
    }

    public BadRequestException(final String message, final Errors errors) {
        super(message);

        this.errors = errors;
    }

}
