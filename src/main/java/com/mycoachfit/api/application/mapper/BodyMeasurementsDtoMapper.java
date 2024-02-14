package com.mycoachfit.api.application.mapper;

import com.mycoachfit.api.domain.model.BodyMeasurements;
import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.model.dto.request.BodyMeasurementsRequestDTO;
import com.mycoachfit.api.domain.model.dto.request.OfficeRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BodyMeasurementsDtoMapper {
    BodyMeasurements toEntity(BodyMeasurementsRequestDTO bodyMeasurementsRequestDTO);
}
