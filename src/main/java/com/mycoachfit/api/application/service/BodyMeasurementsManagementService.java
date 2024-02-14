package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.usercases.BodyMeasurementsService;
import com.mycoachfit.api.application.usercases.ExerciseService;
import com.mycoachfit.api.domain.model.BodyMeasurements;
import com.mycoachfit.api.domain.model.Exercise;
import com.mycoachfit.api.domain.model.dto.request.BodyMeasurementsRequestDTO;
import com.mycoachfit.api.domain.model.dto.request.ExerciseRequestDTO;
import com.mycoachfit.api.domain.port.BodyMeasurementsPersistencePort;
import com.mycoachfit.api.domain.port.ExercisePersistencePort;

import java.util.List;

public class BodyMeasurementsManagementService implements BodyMeasurementsService {

    private final BodyMeasurementsPersistencePort bodyMeasurementsPersistencePort;

    public BodyMeasurementsManagementService(BodyMeasurementsPersistencePort bodyMeasurementsPersistencePort) {
        this.bodyMeasurementsPersistencePort = bodyMeasurementsPersistencePort;
    }

    @Override
    public BodyMeasurements create(BodyMeasurementsRequestDTO bodyMeasurementsRequestDTO) {
        return null;
    }

    @Override
    public BodyMeasurements update(BodyMeasurementsRequestDTO bodyMeasurementsRequestDTO) {
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
