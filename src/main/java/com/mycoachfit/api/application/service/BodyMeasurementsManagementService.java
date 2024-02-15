package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.mapper.BodyMeasurementsDtoMapper;
import com.mycoachfit.api.application.usercases.BodyMeasurementsService;
import com.mycoachfit.api.domain.model.BodyMeasurements;
import com.mycoachfit.api.domain.model.dto.request.BodyMeasurementsRequestDTO;
import com.mycoachfit.api.domain.port.BodyMeasurementsPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodyMeasurementsManagementService implements BodyMeasurementsService {

    private final BodyMeasurementsPersistencePort bodyMeasurementsPersistencePort;
    private final BodyMeasurementsDtoMapper bodyMeasurementsDtoMapper;

    public BodyMeasurementsManagementService(BodyMeasurementsPersistencePort bodyMeasurementsPersistencePort, BodyMeasurementsDtoMapper bodyMeasurementsDtoMapper) {
        this.bodyMeasurementsPersistencePort = bodyMeasurementsPersistencePort;
        this.bodyMeasurementsDtoMapper = bodyMeasurementsDtoMapper;
    }

    @Override
    public BodyMeasurements create(BodyMeasurementsRequestDTO bodyMeasurementsRequestDTO) {
        return bodyMeasurementsPersistencePort.create(bodyMeasurementsDtoMapper.toEntity(bodyMeasurementsRequestDTO));
    }

    @Override
    public BodyMeasurements update(Long id, BodyMeasurementsRequestDTO bodyMeasurementsRequestDTO) {
        findById(id);

        BodyMeasurements bodyMeasurementsToSave = bodyMeasurementsDtoMapper.toEntity(bodyMeasurementsRequestDTO);
        bodyMeasurementsToSave.setId(id);

        return bodyMeasurementsPersistencePort.update(bodyMeasurementsToSave);
    }

    @Override
    public List<BodyMeasurements> getAll() {
        return bodyMeasurementsPersistencePort.getAll();
    }

    @Override
    public BodyMeasurements findById(Long id) {
        return bodyMeasurementsPersistencePort.findById(id).orElseThrow(() -> {
            throw new RuntimeException("No se encontraron medidas corporales con el ID " + id);
        });
    }
}
