package com.mycoachfit.api.application.usercases;

import com.mycoachfit.api.domain.model.Client;
import com.mycoachfit.api.domain.model.Exercise;
import com.mycoachfit.api.domain.model.dto.request.ClientRequestDTO;
import com.mycoachfit.api.domain.model.dto.request.ExerciseRequestDTO;

import java.util.List;

public interface ExerciseService {
    Exercise create(ExerciseRequestDTO exerciseRequestDTO);

    Exercise update(Long id, ExerciseRequestDTO exerciseRequestDTO);

    List<Exercise> getAll();

    Exercise findById(Long id);
}
