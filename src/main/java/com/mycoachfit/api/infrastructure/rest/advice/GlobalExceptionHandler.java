package com.mycoachfit.api.infrastructure.rest.advice;

import com.mycoachfit.api.infrastructure.rest.advice.model.BusinessErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(basePackages = "com.mycoachfit.api.infrastructure.rest.controller")
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

//    private static final Logger log = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Object> handleCustomException(BusinessException ex, WebRequest request) {
//        log.error("Error: {} - {}", ex.getHttpErrorCode(), ex.getMessage());

        String errorResult = String.format("%d %s", ex.getHttpErrorCode().value(), ex.getHttpErrorCode().name());

        BusinessErrorResponse errorResponse = new BusinessErrorResponse(
                errorResult,
                "",
                ex.getBusinessCode().getCode(),
                ex.getBusinessDetail()
        );

        return handleExceptionInternal(ex, errorResponse, new HttpHeaders(), ex.getHttpErrorCode(), request);
    }
}
