package com.mycoachfit.api.infrastructure.rest.advice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomException extends RuntimeException {
    private HttpStatus errorCode;
    private String reason;
    private String details;
}
