package com.mycoachfit.api.application.usercases;

import com.mycoachfit.api.domain.model.MuscleGroup;
import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.model.dto.request.MuscleGroupRequestDTO;
import com.mycoachfit.api.domain.model.dto.request.OfficeRequestDTO;

import java.util.List;

public interface MuscleGroupService {
    MuscleGroup create(MuscleGroupRequestDTO muscleGroupRequestDTO);

    MuscleGroup update(MuscleGroupRequestDTO muscleGroupRequestDTO);

    List<MuscleGroup> getAll();

    MuscleGroup findById(Long id);
}
