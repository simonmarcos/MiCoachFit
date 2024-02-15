package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.BodyMeasurements;
import com.mycoachfit.api.domain.port.BodyMeasurementsPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.entity.BodyMeasurementsEntity;
import com.mycoachfit.api.infrastructure.adapter.mapper.BodyMeasurementsDboMapper;
import com.mycoachfit.api.infrastructure.adapter.repository.BodyMeasurementsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class BodyMeasurementsAdapter implements BodyMeasurementsPersistencePort {

    private final BodyMeasurementsRepository bodyMeasurementsRepository;
    private final BodyMeasurementsDboMapper bodyMeasurementsDboMapper;

    public BodyMeasurementsAdapter(BodyMeasurementsRepository bodyMeasurementsRepository, BodyMeasurementsDboMapper bodyMeasurementsDboMapper) {
        this.bodyMeasurementsRepository = bodyMeasurementsRepository;
        this.bodyMeasurementsDboMapper = bodyMeasurementsDboMapper;
    }

    @Override
    public BodyMeasurements create(BodyMeasurements bodyMeasurements) {
        BodyMeasurementsEntity bodyMeasurementsEntitySaved = bodyMeasurementsRepository.save(bodyMeasurementsDboMapper.toDbo(bodyMeasurements));
        return bodyMeasurementsDboMapper.toDomain(bodyMeasurementsEntitySaved);
    }

    @Override
    public BodyMeasurements update(BodyMeasurements bodyMeasurements) {
        BodyMeasurementsEntity bodyMeasurementsEntitySaved = bodyMeasurementsRepository.save(bodyMeasurementsDboMapper.toDbo(bodyMeasurements));
        return bodyMeasurementsDboMapper.toDomain(bodyMeasurementsEntitySaved);
    }

    @Override
    public List<BodyMeasurements> getAll() {
        return bodyMeasurementsRepository.findAll()
                .stream()
                .map(bodyMeasurementsDboMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<BodyMeasurements> findById(Long id) {
        return bodyMeasurementsRepository.findById(id).map(bodyMeasurementsDboMapper::toDomain);
    }
}
