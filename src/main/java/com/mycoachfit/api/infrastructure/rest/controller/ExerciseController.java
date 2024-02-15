package com.mycoachfit.api.infrastructure.rest.controller;

import com.mycoachfit.api.application.usercases.ExerciseService;
import com.mycoachfit.api.domain.model.Exercise;
import com.mycoachfit.api.domain.model.dto.request.ExerciseRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @PostMapping()
    public ResponseEntity<Exercise> createExercise(@RequestBody @Valid ExerciseRequestDTO exerciseRequestDTO) {
        Exercise exerciseResponse = exerciseService.create(exerciseRequestDTO);
        return ResponseEntity.ok(exerciseResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exercise> updateExercise(@PathVariable("id") Long id, @RequestBody ExerciseRequestDTO exerciseRequestDTO) {
        Exercise exerciseResponse = exerciseService.update(id, exerciseRequestDTO);
        return ResponseEntity.ok(exerciseResponse);
    }

    @GetMapping()
    public ResponseEntity<List<Exercise>> getAllExercises() {
        List<Exercise> exercisesResponse = exerciseService.getAll();
        return ResponseEntity.ok(exercisesResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercise> getExerciseById(@PathVariable("id") Long id) {
        Exercise exerciseResponse = exerciseService.findById(id);
        return ResponseEntity.ok(exerciseResponse);
    }
}
