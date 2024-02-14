package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.mapper.ExerciseDtoMapper;
import com.mycoachfit.api.application.usercases.ExerciseService;
import com.mycoachfit.api.domain.model.Exercise;
import com.mycoachfit.api.domain.model.dto.request.ExerciseRequestDTO;
import com.mycoachfit.api.domain.port.ExercisePersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseManagementService implements ExerciseService {

    private final ExercisePersistencePort exercisePersistencePort;

    private final ExerciseDtoMapper exceptionMapper;

    public ExerciseManagementService(ExercisePersistencePort exercisePersistencePort, ExerciseDtoMapper exceptionMapper) {
        this.exercisePersistencePort = exercisePersistencePort;
        this.exceptionMapper = exceptionMapper;
    }

    @Override
    public Exercise create(ExerciseRequestDTO exerciseRequestDTO) {
        return exercisePersistencePort.create(exceptionMapper.toEntity(exerciseRequestDTO));
    }

    @Override
    public Exercise update(ExerciseRequestDTO exerciseRequestDTO) {
        return exercisePersistencePort.update(exceptionMapper.toEntity(exerciseRequestDTO));
    }

    @Override
    public List<Exercise> getAll() {
        return exercisePersistencePort.getAll();
    }

    @Override
    public Exercise findById(Long id) {
        return exercisePersistencePort.findById(id);
    }
}
