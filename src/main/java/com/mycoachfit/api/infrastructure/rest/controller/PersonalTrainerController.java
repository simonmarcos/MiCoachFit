package com.mycoachfit.api.infrastructure.rest.controller;

import com.mycoachfit.api.application.usercases.PersonalTrainerService;
import com.mycoachfit.api.domain.model.PersonalTrainer;
import com.mycoachfit.api.domain.model.dto.request.PersonalTrainerRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personal-trainers")
public class PersonalTrainerController {

    private final PersonalTrainerService personalTrainerService;

    public PersonalTrainerController(PersonalTrainerService personalTrainerService) {
        this.personalTrainerService = personalTrainerService;
    }

    @PostMapping()
    public ResponseEntity<PersonalTrainer> createPersonalTrainer(@RequestBody @Valid PersonalTrainerRequestDTO personalTrainerRequestDTO) {
        PersonalTrainer personalTrainerResponse = personalTrainerService.create(personalTrainerRequestDTO);
        return ResponseEntity.ok(personalTrainerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonalTrainer> updatePersonalTrainer(@PathVariable("id") Long id, @RequestBody PersonalTrainerRequestDTO personalTrainerRequestDTO) {
        PersonalTrainer personalTrainerResponse = personalTrainerService.update(id, personalTrainerRequestDTO);
        return ResponseEntity.ok(personalTrainerResponse);
    }

    @GetMapping()
    public ResponseEntity<List<PersonalTrainer>> getAllPersonalTrainers() {
        List<PersonalTrainer> personalTrainersResponse = personalTrainerService.getAll();
        return ResponseEntity.ok(personalTrainersResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonalTrainer> getPersonalTrainerById(@PathVariable("id") Long id) {
        PersonalTrainer personalTrainerResponse = personalTrainerService.findById(id);
        return ResponseEntity.ok(personalTrainerResponse);
    }
}
