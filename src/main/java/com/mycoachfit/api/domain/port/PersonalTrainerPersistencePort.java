package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.PersonalTrainer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PersonalTrainerPersistencePort {
    PersonalTrainer create(PersonalTrainer company);

    PersonalTrainer update(PersonalTrainer company);

    List<PersonalTrainer> getAll();

    PersonalTrainer findById(Long id);
}
