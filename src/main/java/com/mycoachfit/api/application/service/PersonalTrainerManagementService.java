package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.usercases.PersonalTrainerService;
import com.mycoachfit.api.domain.model.PersonalTrainer;
import com.mycoachfit.api.domain.model.dto.request.PersonalTrainerRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalTrainerManagementService implements PersonalTrainerService {

    private final PersonalTrainerService personalTrainerService;

    public PersonalTrainerManagementService(PersonalTrainerService personalTrainerService) {
        this.personalTrainerService = personalTrainerService;
    }

    @Override
    public PersonalTrainer create(PersonalTrainerRequestDTO personalTrainerRequestDTO) {
        return null;
    }

    @Override
    public PersonalTrainer update(PersonalTrainerRequestDTO personalTrainerRequestDTO) {
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
