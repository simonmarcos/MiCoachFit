package com.mycoachfit.api.domain.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyRequestDTO {
    private String name;
    private String phone;
}
