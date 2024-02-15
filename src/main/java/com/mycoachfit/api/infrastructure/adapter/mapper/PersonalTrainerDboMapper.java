package com.mycoachfit.api.infrastructure.adapter.mapper;

import com.mycoachfit.api.domain.model.PersonalTrainer;
import com.mycoachfit.api.infrastructure.adapter.entity.PersonalTrainerEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonalTrainerDboMapper {
    PersonalTrainerEntity toDbo(PersonalTrainer personalTrainer);

    @InheritInverseConfiguration
    PersonalTrainer toDomain(PersonalTrainerEntity personalTrainerEntity);
}
