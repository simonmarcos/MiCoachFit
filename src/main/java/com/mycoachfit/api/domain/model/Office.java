package com.mycoachfit.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Office {
    private Long id;
    private String address;
    private String latitude;
    private String longitude;
    private Company company;
}
