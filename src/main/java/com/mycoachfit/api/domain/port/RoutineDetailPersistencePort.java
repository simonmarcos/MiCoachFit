package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.RoutineDetail;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

public interface RoutineDetailPersistencePort {
    RoutineDetail create(RoutineDetail company);

    RoutineDetail update(RoutineDetail company);

    List<RoutineDetail> getAll();

    Optional<RoutineDetail> findById(Long id);
}
