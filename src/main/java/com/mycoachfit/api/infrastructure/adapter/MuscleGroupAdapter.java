package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.MuscleGroup;
import com.mycoachfit.api.domain.port.MuscleGroupPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.repository.MuscleGroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuscleGroupAdapter implements MuscleGroupPersistencePort {


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
