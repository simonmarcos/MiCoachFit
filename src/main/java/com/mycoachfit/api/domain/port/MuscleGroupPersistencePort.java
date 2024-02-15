package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.MuscleGroup;

import java.util.List;
import java.util.Optional;


public interface MuscleGroupPersistencePort {
    MuscleGroup create(MuscleGroup company);

    MuscleGroup update(MuscleGroup company);

    List<MuscleGroup> getAll();

    Optional<MuscleGroup> findById(Long id);
}
