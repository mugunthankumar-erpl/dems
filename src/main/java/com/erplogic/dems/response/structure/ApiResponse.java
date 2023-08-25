package com.erplogic.dems.response.structure;

public class ApiResponse {

    private Object data;
    private Errors error;

    MetaData metaData;

    public ApiResponse() {
        super();

    }

    public Object getData() {
        return data;
    }

    public void setData(final Object data) {
        this.data = data;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(final MetaData metaData) {
        this.metaData = metaData;
    }

    public Errors getError() {
        return error;
    }

    public void setError(final Errors error) {
        this.error = error;
    }

}
