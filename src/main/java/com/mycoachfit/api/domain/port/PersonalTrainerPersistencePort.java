package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.PersonalTrainer;

import java.util.List;

public interface PersonalTrainerPersistencePort {
    PersonalTrainer create(PersonalTrainer company);

    PersonalTrainer update(PersonalTrainer company);

    List<PersonalTrainer> getAll();

    PersonalTrainer findById(Long id);
}
