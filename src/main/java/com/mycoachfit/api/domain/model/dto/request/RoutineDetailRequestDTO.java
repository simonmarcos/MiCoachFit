package com.mycoachfit.api.domain.model.dto.request;

import com.mycoachfit.api.domain.model.enumeration.ExerciseType;
import com.mycoachfit.api.domain.model.enumeration.RoutineDetailStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoutineDetailRequestDTO {
    private Long id;
    private ExerciseType exerciseType;
    private String series;
    private String repetitions;
    private Integer restTime;
    private String expectedWeightLoad;
    private String weightLoadDetail;
    private String observations;
    private RoutineDetailStatus status;
}
