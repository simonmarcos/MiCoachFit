package com.mycoachfit.api.application.mapper;

import com.mycoachfit.api.domain.model.PersonalTrainer;
import com.mycoachfit.api.domain.model.dto.request.PersonalTrainerRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonalTrainerDtoMapper {
    PersonalTrainer toEntity(PersonalTrainerRequestDTO personalTrainerRequestDTO);
}
