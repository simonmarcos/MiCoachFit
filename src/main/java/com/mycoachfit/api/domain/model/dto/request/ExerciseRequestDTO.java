package com.mycoachfit.api.domain.model.dto.request;

import com.mycoachfit.api.domain.model.MuscleGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExerciseRequestDTO {
    private String name;
    private MuscleGroup muscleGroup;
}
