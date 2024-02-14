package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.MuscleGroup;
import com.mycoachfit.api.domain.port.MuscleGroupPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.repository.MuscleGroupRepository;

import java.util.List;

public class MuscleGroupAdapter implements MuscleGroupPersistencePort {

    private final MuscleGroupRepository muscleGroupRepository;

    public MuscleGroupAdapter(MuscleGroupRepository muscleGroupRepository) {
        this.muscleGroupRepository = muscleGroupRepository;
    }

    @Override
    public MuscleGroup create(MuscleGroup company) {
        return null;
    }

    @Override
    public MuscleGroup update(MuscleGroup company) {
        return null;
    }

    @Override
    public List<MuscleGroup> getAll() {
        return null;
    }

    @Override
    public MuscleGroup findById(Long id) {
        return null;
    }
}
