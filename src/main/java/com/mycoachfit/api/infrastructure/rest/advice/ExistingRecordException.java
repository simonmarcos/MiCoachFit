package com.mycoachfit.api.infrastructure.rest.advice;

import com.mycoachfit.api.infrastructure.rest.advice.model.BusinessErrorCodeEnum;
import com.mycoachfit.api.infrastructure.rest.advice.model.BusinessErrorCodeMap;
import org.springframework.http.HttpStatus;

public class ExistingRecordException extends BusinessException {

    public ExistingRecordException() {
        super(
                HttpStatus.CONFLICT,
                BusinessErrorCodeEnum.EXISTING_RECORD,
                BusinessErrorCodeMap.getMessage(BusinessErrorCodeEnum.EXISTING_RECORD));
    }
}
