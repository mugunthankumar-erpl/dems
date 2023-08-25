package com.erplogic.dems.response.structure;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	public static ResponseEntity<Object> responseBuilder(HttpStatus status,ApiResponse apiResponse) {

		return new ResponseEntity<Object>(apiResponse, status);
	}
}
