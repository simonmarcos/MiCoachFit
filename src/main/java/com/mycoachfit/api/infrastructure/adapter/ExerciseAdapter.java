package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.Exercise;
import com.mycoachfit.api.domain.port.ExercisePersistencePort;
import com.mycoachfit.api.infrastructure.adapter.repository.ExerciseRepository;

import java.util.List;

public class ExerciseAdapter implements ExercisePersistencePort {

    private final ExerciseRepository exerciseRepository;

    public ExerciseAdapter(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public Exercise create(Exercise company) {
        return null;
    }

    @Override
    public Exercise update(Exercise company) {
        return null;
    }

    @Override
    public List<Exercise> getAll() {
        return null;
    }

    @Override
    public Exercise findById(Long id) {
        return null;
    }
}
