/**
 *
 */
package com.erplogic.dems.exceptions;

import com.erplogic.dems.response.structure.Errors;

/**
 * @author Admin
 *
 */
public class GlobalException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Errors errors;

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(final Errors errors) {
        this.errors = errors;
    }

    public GlobalException(final String message, final Errors errors) {
        super(message);
        // TODO Auto-generated constructor stub
        this.errors = errors;
    }

}
