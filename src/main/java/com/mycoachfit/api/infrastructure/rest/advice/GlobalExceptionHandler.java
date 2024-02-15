package com.mycoachfit.api.infrastructure.rest.advice;

import com.mycoachfit.api.infrastructure.rest.advice.model.CustomErrorResponse;
import com.mycoachfit.api.infrastructure.rest.advice.model.CustomException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(basePackages = "com.mycoachfit.api.infrastructure.rest.controller")
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<Object> handleCustomException(CustomException ex, WebRequest request) {
        CustomErrorResponse errorResponse = new CustomErrorResponse(
                ex.getErrorCode(),
                ex.getReason(),
                ex.getDetails()
        );

        return handleExceptionInternal(ex, errorResponse, new HttpHeaders(), ex.getErrorCode(), request);
    }
}
