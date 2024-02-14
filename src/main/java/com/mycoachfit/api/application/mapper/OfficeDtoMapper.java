package com.mycoachfit.api.application.mapper;

import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.model.dto.request.OfficeRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OfficeDtoMapper {
    @Mapping(source = "address", target = "address")
    @Mapping(source = "latitude", target = "latitude")
    @Mapping(source = "longitude", target = "longitude")
    Office toEntity(OfficeRequestDTO officeRequestDTO);
}
