package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.mapper.ExerciseDtoMapper;
import com.mycoachfit.api.application.usercases.ExerciseService;
import com.mycoachfit.api.domain.model.Exercise;
import com.mycoachfit.api.domain.model.dto.request.ExerciseRequestDTO;
import com.mycoachfit.api.domain.port.ExercisePersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseManagementService implements ExerciseService {

    private final ExercisePersistencePort exercisePersistencePort;
    private final ExerciseDtoMapper exerciseDtoMapper;

    public ExerciseManagementService(ExercisePersistencePort exercisePersistencePort, ExerciseDtoMapper exerciseDtoMapper) {
        this.exercisePersistencePort = exercisePersistencePort;
        this.exerciseDtoMapper = exerciseDtoMapper;
    }

    @Override
    public Exercise create(ExerciseRequestDTO exerciseRequestDTO) {
        return exercisePersistencePort.create(exerciseDtoMapper.toEntity(exerciseRequestDTO));
    }

    @Override
    public Exercise update(Long id, ExerciseRequestDTO exerciseRequestDTO) {
        findById(id);

        Exercise exerciseToSave = exerciseDtoMapper.toEntity(exerciseRequestDTO);
        exerciseToSave.setId(id);

        return exercisePersistencePort.update(exerciseToSave);
    }

    @Override
    public List<Exercise> getAll() {
        return exercisePersistencePort.getAll();
    }

    @Override
    public Exercise findById(Long id) {
        return exercisePersistencePort.findById(id).orElseThrow(() -> {
            throw new RuntimeException("No se encontró ningún ejercicio con el ID " + id);
        });
    }
}
