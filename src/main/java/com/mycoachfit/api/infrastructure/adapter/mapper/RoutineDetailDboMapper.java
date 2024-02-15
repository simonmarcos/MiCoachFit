package com.mycoachfit.api.infrastructure.adapter.mapper;

import com.mycoachfit.api.domain.model.RoutineDetail;
import com.mycoachfit.api.infrastructure.adapter.entity.RoutineDetailEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoutineDetailDboMapper {
    RoutineDetailEntity toDbo(RoutineDetail routineDetail);

    @InheritInverseConfiguration
    RoutineDetail toDomain(RoutineDetailEntity routineDetailEntity);
}
