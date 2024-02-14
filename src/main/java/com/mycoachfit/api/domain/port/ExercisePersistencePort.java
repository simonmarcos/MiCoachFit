package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.Exercise;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ExercisePersistencePort {
    Exercise create(Exercise company);

    Exercise update(Exercise company);

    List<Exercise> getAll();

    Exercise findById(Long id);
}
