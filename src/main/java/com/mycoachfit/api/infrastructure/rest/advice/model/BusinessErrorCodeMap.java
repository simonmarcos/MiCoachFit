package com.mycoachfit.api.infrastructure.rest.advice.model;

import java.util.HashMap;
import java.util.Map;

public class BusinessErrorCodeMap {
    private static final Map<BusinessErrorCodeEnum, String> BUSINESS_ERROR_MAP = new HashMap<>();

    static {
        BUSINESS_ERROR_MAP.put(BusinessErrorCodeEnum.CLIENTE_EXISTENTE, "Cliente existente");
        BUSINESS_ERROR_MAP.put(BusinessErrorCodeEnum.CLIENTE_INEXISTENTE, "Cliente inexistente");
    }

    public static String getMessage(BusinessErrorCodeEnum errorCode) {
        return BUSINESS_ERROR_MAP.getOrDefault(errorCode, "Error desconocido");
    }

}
