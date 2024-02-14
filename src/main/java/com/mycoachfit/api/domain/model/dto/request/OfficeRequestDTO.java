package com.mycoachfit.api.domain.model.dto.request;

import com.mycoachfit.api.domain.model.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OfficeRequestDTO {
    private String address;
    private String latitude;
    private String longitude;
    private Company company;
}
