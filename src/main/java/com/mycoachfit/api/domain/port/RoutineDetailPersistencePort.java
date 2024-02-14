package com.mycoachfit.api.domain.port;

import com.mycoachfit.api.domain.model.RoutineDetail;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoutineDetailPersistencePort {
    RoutineDetail create(RoutineDetail company);

    RoutineDetail update(RoutineDetail company);

    List<RoutineDetail> getAll();

    RoutineDetail findById(Long id);
}
