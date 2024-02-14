package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.MuscleGroup;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public interface MuscleGroupPersistencePort {
    MuscleGroup create(MuscleGroup company);

    MuscleGroup update(MuscleGroup company);

    List<MuscleGroup> getAll();

    MuscleGroup findById(Long id);
}
