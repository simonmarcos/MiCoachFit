package com.mycoachfit.api.application.mapper;

import com.mycoachfit.api.domain.model.MuscleGroup;
import com.mycoachfit.api.domain.model.dto.request.MuscleGroupRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MuscleGroupDtoMapper {
    MuscleGroup toEntity(MuscleGroupRequestDTO muscleGroupRequestDTO);
}
