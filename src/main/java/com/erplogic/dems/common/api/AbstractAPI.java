/**
 *
 */
package com.erplogic.dems.common.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.erplogic.dems.response.structure.ApiResponse;
import com.erplogic.dems.response.structure.Errors;
import com.erplogic.dems.response.structure.MetaData;
import com.erplogic.dems.response.structure.ResponseHandler;

/**
 * @author Admin
 *
 */

public abstract class AbstractAPI {

    protected ResponseEntity<Object> ok(final Object data, final MetaData meta) {

        final ApiResponse resp = new ApiResponse();
        resp.setData(data);
        resp.setMetaData(meta);
        resp.setError(null);

        return ResponseHandler.responseBuilder(HttpStatus.OK, resp);
    }

    protected ResponseEntity<Object> ok(final Object data) {
        return ok(data, null);
    }

    protected ResponseEntity<Object> fail(final HttpStatus status, final Errors error) {
        final ApiResponse resp = new ApiResponse();
        resp.setError(error);

        return ResponseHandler.responseBuilder(status, resp);
    }

    protected ResponseEntity<Object> badRequest(final Errors error) {
        return fail(HttpStatus.BAD_REQUEST, error);
    }

}
