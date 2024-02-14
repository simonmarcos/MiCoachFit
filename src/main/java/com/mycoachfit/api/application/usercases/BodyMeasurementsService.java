package com.mycoachfit.api.application.usercases;

import com.mycoachfit.api.domain.model.BodyMeasurements;
import com.mycoachfit.api.domain.model.dto.request.BodyMeasurementsRequestDTO;

import java.util.List;

public interface BodyMeasurementsService {
    BodyMeasurements create(BodyMeasurementsRequestDTO bodyMeasurementsRequestDTO);

    BodyMeasurements update(BodyMeasurementsRequestDTO bodyMeasurementsRequestDTO);

    List<BodyMeasurements> getAll();

    BodyMeasurements findById(Long id);
}
