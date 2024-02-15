package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.PersonalTrainer;

import java.util.List;
import java.util.Optional;

public interface PersonalTrainerPersistencePort {
    PersonalTrainer create(PersonalTrainer company);

    PersonalTrainer update(PersonalTrainer company);

    List<PersonalTrainer> getAll();

    Optional<PersonalTrainer> findById(Long id);
}
