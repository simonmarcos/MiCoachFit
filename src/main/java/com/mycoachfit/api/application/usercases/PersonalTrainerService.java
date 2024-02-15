package com.mycoachfit.api.application.usercases;

import com.mycoachfit.api.domain.model.PersonalTrainer;
import com.mycoachfit.api.domain.model.dto.request.PersonalTrainerRequestDTO;

import java.util.List;

public interface PersonalTrainerService {
    PersonalTrainer create(PersonalTrainerRequestDTO personalTrainerRequestDTO);

    PersonalTrainer update(Long id, PersonalTrainerRequestDTO personalTrainerRequestDTO);

    List<PersonalTrainer> getAll();

    PersonalTrainer findById(Long id);
}
