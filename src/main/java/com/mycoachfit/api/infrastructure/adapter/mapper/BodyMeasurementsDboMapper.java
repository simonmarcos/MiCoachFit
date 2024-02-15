package com.mycoachfit.api.infrastructure.adapter.mapper;

import com.mycoachfit.api.domain.model.BodyMeasurements;
import com.mycoachfit.api.infrastructure.adapter.entity.BodyMeasurementsEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BodyMeasurementsDboMapper {
    BodyMeasurementsEntity toDbo(BodyMeasurements bodyMeasurements);

    @InheritInverseConfiguration
    BodyMeasurements toDomain(BodyMeasurementsEntity bodyMeasurementsEntity);
}
