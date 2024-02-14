package com.mycoachfit.api.application.mapper;

import com.mycoachfit.api.domain.model.Exercise;
import com.mycoachfit.api.domain.model.dto.request.ExerciseRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExerciseDtoMapper {
    Exercise toEntity(ExerciseRequestDTO exerciseRequestDTO);
}
