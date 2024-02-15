package com.mycoachfit.api.infrastructure.rest.advice.model;

public enum BusinessErrorCodeEnum {
    EXISTING_RECORD("C-1");
    private final String code;

    BusinessErrorCodeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
