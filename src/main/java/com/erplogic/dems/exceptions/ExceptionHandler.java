package com.erplogic.dems.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.erplogic.dems.response.structure.ApiResponse;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<Object> handleException(final GlobalException e) {

        final ApiResponse apiResponse = new ApiResponse();
        apiResponse.setError(e.getErrors());

        return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {BadRequestException.class})
    public ResponseEntity<Object> handleBadRequestException(final BadRequestException badRequestException) {

        final ApiResponse apiResponse = new ApiResponse();
        apiResponse.setError(badRequestException.getErrors());

        return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);

    }

}
