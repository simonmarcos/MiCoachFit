package com.mycoachfit.api.application.mapper;

import com.mycoachfit.api.domain.model.RoutineDetail;
import com.mycoachfit.api.domain.model.dto.request.RoutineDetailRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoutineDetailDtoMapper {
    RoutineDetail toEntity(RoutineDetailRequestDTO routineDetailRequestDTO);
}
