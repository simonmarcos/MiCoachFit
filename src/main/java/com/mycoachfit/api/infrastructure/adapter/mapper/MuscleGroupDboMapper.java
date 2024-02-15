package com.mycoachfit.api.infrastructure.adapter.mapper;

import com.mycoachfit.api.domain.model.MuscleGroup;
import com.mycoachfit.api.infrastructure.adapter.entity.MuscleGroupEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MuscleGroupDboMapper {
    MuscleGroupEntity toDbo(MuscleGroup muscleGroup);

    @InheritInverseConfiguration
    MuscleGroup toDomain(MuscleGroupEntity muscleGroupEntity);
}
