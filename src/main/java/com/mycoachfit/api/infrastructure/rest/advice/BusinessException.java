package com.mycoachfit.api.infrastructure.rest.advice;

import com.mycoachfit.api.infrastructure.rest.advice.model.BusinessErrorCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BusinessException extends RuntimeException {
    private HttpStatus httpErrorCode;
    private BusinessErrorCodeEnum businessCode;
    private String businessDetail;
}
