package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.BodyMeasurements;

import java.util.List;
import java.util.Optional;

public interface BodyMeasurementsPersistencePort {
    BodyMeasurements create(BodyMeasurements company);

    BodyMeasurements update(BodyMeasurements company);

    List<BodyMeasurements> getAll();

    Optional<BodyMeasurements> findById(Long id);
}
