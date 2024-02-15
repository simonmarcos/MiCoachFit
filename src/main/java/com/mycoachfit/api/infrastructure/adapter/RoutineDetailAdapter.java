package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.RoutineDetail;
import com.mycoachfit.api.domain.port.RoutineDetailPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.entity.RoutineDetailEntity;
import com.mycoachfit.api.infrastructure.adapter.mapper.RoutineDetailDboMapper;
import com.mycoachfit.api.infrastructure.adapter.repository.RoutineDetailRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class RoutineDetailAdapter implements RoutineDetailPersistencePort {

    private final RoutineDetailRepository routineDetailRepository;
    private final RoutineDetailDboMapper routineDetailDboMapper;

    public RoutineDetailAdapter(RoutineDetailRepository routineDetailRepository, RoutineDetailDboMapper routineDetailDboMapper) {
        this.routineDetailRepository = routineDetailRepository;
        this.routineDetailDboMapper = routineDetailDboMapper;
    }

    @Override
    public RoutineDetail create(RoutineDetail routineDetail) {
        RoutineDetailEntity routineDetailEntitySaved = routineDetailRepository.save(routineDetailDboMapper.toDbo(routineDetail));
        return routineDetailDboMapper.toDomain(routineDetailEntitySaved);
    }

    @Override
    public RoutineDetail update(RoutineDetail routineDetail) {
        RoutineDetailEntity routineDetailEntitySaved = routineDetailRepository.save(routineDetailDboMapper.toDbo(routineDetail));
        return routineDetailDboMapper.toDomain(routineDetailEntitySaved);
    }

    @Override
    public List<RoutineDetail> getAll() {
        return routineDetailRepository.findAll()
                .stream()
                .map(routineDetailDboMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<RoutineDetail> findById(Long id) {
        return routineDetailRepository.findById(id).map(routineDetailDboMapper::toDomain);
    }
}
