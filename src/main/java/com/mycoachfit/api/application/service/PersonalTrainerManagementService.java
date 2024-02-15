package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.mapper.PersonalTrainerDtoMapper;
import com.mycoachfit.api.application.usercases.PersonalTrainerService;
import com.mycoachfit.api.domain.model.PersonalTrainer;
import com.mycoachfit.api.domain.model.dto.request.PersonalTrainerRequestDTO;
import com.mycoachfit.api.domain.port.PersonalTrainerPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public PersonalTrainer update(Long id, PersonalTrainerRequestDTO personalTrainerRequestDTO) {
        findById(id);

        PersonalTrainer personalTrainerToSave = personalTrainerDtoMapper.toEntity(personalTrainerRequestDTO);
        personalTrainerToSave.setId(id);

        return personalTrainerPersistencePort.update(personalTrainerToSave);
    }

    @Override
    public List<PersonalTrainer> getAll() {
        return personalTrainerPersistencePort.getAll();
    }

    @Override
    public PersonalTrainer findById(Long id) {
        return personalTrainerPersistencePort.findById(id).orElseThrow(() -> {
            throw new RuntimeException("No se encontró ningún entrenador personal con el ID " + id);
        });
    }
}
