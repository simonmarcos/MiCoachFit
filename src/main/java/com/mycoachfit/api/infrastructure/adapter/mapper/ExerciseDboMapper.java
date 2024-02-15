package com.mycoachfit.api.infrastructure.adapter.mapper;

import com.mycoachfit.api.domain.model.Exercise;
import com.mycoachfit.api.infrastructure.adapter.entity.ExerciseEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExerciseDboMapper {
    ExerciseEntity toDbo(Exercise exercise);

    @InheritInverseConfiguration
    Exercise toDomain(ExerciseEntity exerciseEntity);
}
