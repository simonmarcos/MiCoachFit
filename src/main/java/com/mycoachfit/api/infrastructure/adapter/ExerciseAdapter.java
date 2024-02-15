package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.Exercise;
import com.mycoachfit.api.domain.port.ExercisePersistencePort;
import com.mycoachfit.api.infrastructure.adapter.entity.ExerciseEntity;
import com.mycoachfit.api.infrastructure.adapter.mapper.ExerciseDboMapper;
import com.mycoachfit.api.infrastructure.adapter.repository.ExerciseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ExerciseAdapter implements ExercisePersistencePort {

    private final ExerciseRepository exerciseRepository;
    private final ExerciseDboMapper exerciseDboMapper;

    public ExerciseAdapter(ExerciseRepository exerciseRepository, ExerciseDboMapper exerciseDboMapper) {
        this.exerciseRepository = exerciseRepository;
        this.exerciseDboMapper = exerciseDboMapper;
    }

    @Override
    public Exercise create(Exercise exercise) {
        ExerciseEntity exerciseEntitySaved = exerciseRepository.save(exerciseDboMapper.toDbo(exercise));
        return exerciseDboMapper.toDomain(exerciseEntitySaved);
    }

    @Override
    public Exercise update(Exercise exercise) {
        ExerciseEntity exerciseEntitySaved = exerciseRepository.save(exerciseDboMapper.toDbo(exercise));
        return exerciseDboMapper.toDomain(exerciseEntitySaved);
    }

    @Override
    public List<Exercise> getAll() {
        return exerciseRepository.findAll()
                .stream()
                .map(exerciseDboMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Exercise> findById(Long id) {
        return exerciseRepository.findById(id).map(exerciseDboMapper::toDomain);
    }
}
