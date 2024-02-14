package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.usercases.ExerciseService;
import com.mycoachfit.api.domain.model.Exercise;
import com.mycoachfit.api.domain.model.dto.request.ExerciseRequestDTO;
import com.mycoachfit.api.domain.port.ExercisePersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseManagementService implements ExerciseService {

    private final ExercisePersistencePort exercisePersistencePort;

    public ExerciseManagementService(ExercisePersistencePort exercisePersistencePort) {
        this.exercisePersistencePort = exercisePersistencePort;
    }

    @Override
    public Exercise create(ExerciseRequestDTO exerciseRequestDTO) {
        return null;
    }

    @Override
    public Exercise update(ExerciseRequestDTO exerciseRequestDTO) {
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
