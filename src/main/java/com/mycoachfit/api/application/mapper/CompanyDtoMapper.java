package com.mycoachfit.api.application.mapper;

import com.mycoachfit.api.domain.model.Company;
import com.mycoachfit.api.domain.model.dto.request.CompanyRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompanyDtoMapper {
    @Mapping(source = "name", target = "name")
    @Mapping(source = "phone", target = "phone")
    Company toEntity(CompanyRequestDTO companyRequestDTO);

}
