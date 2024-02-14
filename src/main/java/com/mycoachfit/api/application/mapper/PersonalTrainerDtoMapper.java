package com.mycoachfit.api.application.mapper;

import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.model.PersonalTrainer;
import com.mycoachfit.api.domain.model.dto.request.OfficeRequestDTO;
import com.mycoachfit.api.domain.model.dto.request.PersonalTrainerRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonalTrainerDtoMapper {
    PersonalTrainer toEntity(PersonalTrainerRequestDTO personalTrainerRequestDTO);
}
