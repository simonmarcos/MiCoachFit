package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.BodyMeasurements;
import com.mycoachfit.api.domain.port.BodyMeasurementsPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.repository.BodyMeasurementsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodyMeasurementsAdapter implements BodyMeasurementsPersistencePort {

    private final BodyMeasurementsRepository bodyMeasurementsRepository;

    public BodyMeasurementsAdapter(BodyMeasurementsRepository bodyMeasurementsRepository) {
        this.bodyMeasurementsRepository = bodyMeasurementsRepository;
    }

    @Override
    public BodyMeasurements create(BodyMeasurements company) {
        return null;
    }

    @Override
    public BodyMeasurements update(BodyMeasurements company) {
        return null;
    }

    @Override
    public List<BodyMeasurements> getAll() {
        return null;
    }

    @Override
    public BodyMeasurements findById(Long id) {
        return null;
    }
}
