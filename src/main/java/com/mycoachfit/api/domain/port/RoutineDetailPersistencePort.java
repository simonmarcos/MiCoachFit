package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.RoutineDetail;

import java.util.List;

public interface RoutineDetailPersistencePort {
    RoutineDetail create(RoutineDetail company);

    RoutineDetail update(RoutineDetail company);

    List<RoutineDetail> getAll();

    RoutineDetail findById(Long id);
}
