package com.mycoachfit.api.application.usercases;

import com.mycoachfit.api.domain.model.RoutineDetail;
import com.mycoachfit.api.domain.model.dto.request.RoutineDetailRequestDTO;

import java.util.List;

public interface RoutineDetailService {
    RoutineDetail create(RoutineDetailRequestDTO routineDetailRequestDTO);

    RoutineDetail update(Long id, RoutineDetailRequestDTO routineDetailRequestDTO);

    List<RoutineDetail> getAll();

    RoutineDetail findById(Long id);
}
