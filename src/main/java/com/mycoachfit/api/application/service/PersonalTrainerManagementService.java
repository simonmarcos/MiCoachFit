package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.mapper.PersonalTrainerDtoMapper;
import com.mycoachfit.api.application.usercases.PersonalTrainerService;
import com.mycoachfit.api.domain.model.PersonalTrainer;
import com.mycoachfit.api.domain.model.dto.request.PersonalTrainerRequestDTO;
import com.mycoachfit.api.domain.port.PersonalTrainerPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalTrainerManagementService implements PersonalTrainerService {
    private final PersonalTrainerPersistencePort personalTrainerPersistencePort;
    private final PersonalTrainerDtoMapper personalTrainerDtoMapper;

    public PersonalTrainerManagementService(PersonalTrainerPersistencePort personalTrainerPersistencePort, PersonalTrainerDtoMapper personalTrainerDtoMapper) {
        this.personalTrainerPersistencePort = personalTrainerPersistencePort;
        this.personalTrainerDtoMapper = personalTrainerDtoMapper;
    }

    @Override
    public PersonalTrainer create(PersonalTrainerRequestDTO personalTrainerRequestDTO) {
        return personalTrainerPersistencePort.create(personalTrainerDtoMapper.toEntity(personalTrainerRequestDTO));
    }

    @Override
    public PersonalTrainer update(PersonalTrainerRequestDTO personalTrainerRequestDTO) {
        return personalTrainerPersistencePort.update(personalTrainerDtoMapper.toEntity(personalTrainerRequestDTO));
    }

    @Override
    public List<PersonalTrainer> getAll() {
        return personalTrainerPersistencePort.getAll();
    }

    @Override
    public PersonalTrainer findById(Long id) {
        return personalTrainerPersistencePort.findById(id);
    }
}
