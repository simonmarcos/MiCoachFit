package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.MuscleGroup;
import com.mycoachfit.api.domain.port.MuscleGroupPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.entity.MuscleGroupEntity;
import com.mycoachfit.api.infrastructure.adapter.mapper.MuscleGroupDboMapper;
import com.mycoachfit.api.infrastructure.adapter.repository.MuscleGroupRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class MuscleGroupAdapter implements MuscleGroupPersistencePort {

    private final MuscleGroupRepository muscleGroupRepository;
    private final MuscleGroupDboMapper muscleGroupDboMapper;

    public MuscleGroupAdapter(MuscleGroupRepository muscleGroupRepository, MuscleGroupDboMapper muscleGroupDboMapper) {
        this.muscleGroupRepository = muscleGroupRepository;
        this.muscleGroupDboMapper = muscleGroupDboMapper;
    }

    @Override
    public MuscleGroup create(MuscleGroup muscleGroup) {
        MuscleGroupEntity muscleGroupEntitySaved = muscleGroupRepository.save(muscleGroupDboMapper.toDbo(muscleGroup));
        return muscleGroupDboMapper.toDomain(muscleGroupEntitySaved);
    }

    @Override
    public MuscleGroup update(MuscleGroup muscleGroup) {
        MuscleGroupEntity muscleGroupEntitySaved = muscleGroupRepository.save(muscleGroupDboMapper.toDbo(muscleGroup));
        return muscleGroupDboMapper.toDomain(muscleGroupEntitySaved);
    }

    @Override
    public List<MuscleGroup> getAll() {
        return muscleGroupRepository.findAll()
                .stream()
                .map(muscleGroupDboMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<MuscleGroup> findById(Long id) {
        return muscleGroupRepository.findById(id).map(muscleGroupDboMapper::toDomain);
    }
}
