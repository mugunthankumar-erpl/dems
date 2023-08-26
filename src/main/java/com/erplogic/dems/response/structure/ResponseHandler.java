package com.erplogic.dems.response.structure;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public final class ResponseHandler {
    private ResponseHandler() {

    }

    public static ResponseEntity<Object> responseBuilder(final HttpStatus status, final ApiResponse apiResponse) {

        return new ResponseEntity<Object>(apiResponse, status);
    }
}
