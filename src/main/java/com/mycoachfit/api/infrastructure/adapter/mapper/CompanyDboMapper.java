package com.mycoachfit.api.infrastructure.adapter.mapper;

import com.mycoachfit.api.domain.model.Company;
import com.mycoachfit.api.infrastructure.adapter.entity.CompanyEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyDboMapper {
    CompanyEntity toDbo(Company company);

    @InheritInverseConfiguration
    Company toDomain(CompanyEntity companyEntity);
}
