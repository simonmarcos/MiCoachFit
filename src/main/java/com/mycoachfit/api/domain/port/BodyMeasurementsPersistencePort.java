package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.BodyMeasurements;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BodyMeasurementsPersistencePort {
    BodyMeasurements create(BodyMeasurements company);

    BodyMeasurements update(BodyMeasurements company);

    List<BodyMeasurements> getAll();

    BodyMeasurements findById(Long id);
}
