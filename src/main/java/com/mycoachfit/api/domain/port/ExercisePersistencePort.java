package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Exercise;

import java.util.List;
import java.util.Optional;

public interface ExercisePersistencePort {
    Exercise create(Exercise company);

    Exercise update(Exercise company);

    List<Exercise> getAll();

    Optional<Exercise> findById(Long id);
}
