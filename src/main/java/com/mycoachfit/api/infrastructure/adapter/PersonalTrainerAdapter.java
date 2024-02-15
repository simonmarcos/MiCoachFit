package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.PersonalTrainer;
import com.mycoachfit.api.domain.port.PersonalTrainerPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.entity.PersonalTrainerEntity;
import com.mycoachfit.api.infrastructure.adapter.mapper.PersonalTrainerDboMapper;
import com.mycoachfit.api.infrastructure.adapter.repository.PersonalTrainerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class PersonalTrainerAdapter implements PersonalTrainerPersistencePort {

    private final PersonalTrainerRepository personalTrainerRepository;
    private final PersonalTrainerDboMapper personalTrainerDboMapper;

    public PersonalTrainerAdapter(PersonalTrainerRepository personalTrainerRepository, PersonalTrainerDboMapper personalTrainerDboMapper) {
        this.personalTrainerRepository = personalTrainerRepository;
        this.personalTrainerDboMapper = personalTrainerDboMapper;
    }

    @Override
    public PersonalTrainer create(PersonalTrainer personalTrainer) {
        PersonalTrainerEntity personalTrainerEntitySaved = personalTrainerRepository.save(personalTrainerDboMapper.toDbo(personalTrainer));
        return personalTrainerDboMapper.toDomain(personalTrainerEntitySaved);
    }

    @Override
    public PersonalTrainer update(PersonalTrainer personalTrainer) {
        PersonalTrainerEntity personalTrainerEntitySaved = personalTrainerRepository.save(personalTrainerDboMapper.toDbo(personalTrainer));
        return personalTrainerDboMapper.toDomain(personalTrainerEntitySaved);
    }

    @Override
    public List<PersonalTrainer> getAll() {
        return personalTrainerRepository.findAll()
                .stream()
                .map(personalTrainerDboMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<PersonalTrainer> findById(Long id) {
        return personalTrainerRepository.findById(id).map(personalTrainerDboMapper::toDomain);
    }

    // Puedes agregar métodos adicionales según tus necesidades
}
