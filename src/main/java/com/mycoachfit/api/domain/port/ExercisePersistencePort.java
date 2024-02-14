package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Exercise;

import java.util.List;

public interface ExercisePersistencePort {
    Exercise create(Exercise company);

    Exercise update(Exercise company);

    List<Exercise> getAll();

    Exercise findById(Long id);
}
