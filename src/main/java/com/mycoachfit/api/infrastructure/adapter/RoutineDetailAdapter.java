package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.RoutineDetail;
import com.mycoachfit.api.domain.port.RoutineDetailPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.repository.RoutineDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutineDetailAdapter implements RoutineDetailPersistencePort {


    @Override
    public RoutineDetail create(RoutineDetail company) {
        return null;
    }

    @Override
    public RoutineDetail update(RoutineDetail company) {
        return null;
    }

    @Override
    public List<RoutineDetail> getAll() {
        return null;
    }

    @Override
    public RoutineDetail findById(Long id) {
        return null;
    }
}
