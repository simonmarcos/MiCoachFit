package com.mycoachfit.api.infrastructure.rest.advice.model;

public enum BusinessErrorCodeEnum {
    CLIENTE_EXISTENTE("C-1"),
    CLIENTE_INEXISTENTE("C-2");
    private final String code;

    BusinessErrorCodeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
