package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.PersonalTrainer;
import com.mycoachfit.api.domain.port.PersonalTrainerPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.repository.PersonalTrainerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalTrainerAdapter implements PersonalTrainerPersistencePort {


    @Override
    public PersonalTrainer create(PersonalTrainer company) {
        return null;
    }

    @Override
    public PersonalTrainer update(PersonalTrainer company) {
        return null;
    }

    @Override
    public List<PersonalTrainer> getAll() {
        return null;
    }

    @Override
    public PersonalTrainer findById(Long id) {
        return null;
    }
}
