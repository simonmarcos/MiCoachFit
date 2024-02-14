package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.usercases.RoutineDetailService;
import com.mycoachfit.api.domain.model.RoutineDetail;
import com.mycoachfit.api.domain.model.dto.request.RoutineDetailRequestDTO;
import com.mycoachfit.api.domain.port.RoutineDetailPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutineDetailManagementService implements RoutineDetailService {

    private final RoutineDetailPersistencePort routineDetailPersistencePort;

    public RoutineDetailManagementService(RoutineDetailPersistencePort routineDetailPersistencePort) {
        this.routineDetailPersistencePort = routineDetailPersistencePort;
    }

    @Override
    public RoutineDetail create(RoutineDetailRequestDTO routineDetailRequestDTO) {
        return null;
    }

    @Override
    public RoutineDetail update(RoutineDetailRequestDTO routineDetailRequestDTO) {
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
