package com.mycoachfit.api.domain.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BodyMeasurementsRequestDTO {
    private LocalDate date;
    private int weight;
    private int height;
    private String bodyMeasurements;
    private String imc;
}
