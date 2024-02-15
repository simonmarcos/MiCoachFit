package com.mycoachfit.api.infrastructure.rest.advice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomErrorResponse {
    private String httpErrorCode;
    private String reason;
    private String businessCode;
    private String businessDetail;
}