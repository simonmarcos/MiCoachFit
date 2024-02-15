package com.mycoachfit.api.infrastructure.adapter.mapper;

import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.infrastructure.adapter.entity.OfficeEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OfficeDboMapper {
    OfficeEntity toDbo(Office office);

    @InheritInverseConfiguration
    Office toDomain(OfficeEntity officeEntity);
}
