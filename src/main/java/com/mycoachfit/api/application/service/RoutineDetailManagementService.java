package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.mapper.RoutineDetailDtoMapper;
import com.mycoachfit.api.application.usercases.RoutineDetailService;
import com.mycoachfit.api.domain.model.RoutineDetail;
import com.mycoachfit.api.domain.model.dto.request.RoutineDetailRequestDTO;
import com.mycoachfit.api.domain.port.RoutineDetailPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutineDetailManagementService implements RoutineDetailService {

    private final RoutineDetailPersistencePort routineDetailPersistencePort;
    private final RoutineDetailDtoMapper routineDetailDtoMapper;

    public RoutineDetailManagementService(RoutineDetailPersistencePort routineDetailPersistencePort, RoutineDetailDtoMapper routineDetailDtoMapper) {
        this.routineDetailPersistencePort = routineDetailPersistencePort;
        this.routineDetailDtoMapper = routineDetailDtoMapper;
    }

    @Override
    public RoutineDetail create(RoutineDetailRequestDTO routineDetailRequestDTO) {
        return routineDetailPersistencePort.create(routineDetailDtoMapper.toEntity(routineDetailRequestDTO));
    }

    @Override
    public RoutineDetail update(Long id, RoutineDetailRequestDTO routineDetailRequestDTO) {
        findById(id);

        RoutineDetail routineDetailToSave = routineDetailDtoMapper.toEntity(routineDetailRequestDTO);
        routineDetailToSave.setId(id);

        return routineDetailPersistencePort.update(routineDetailToSave);
    }

    @Override
    public List<RoutineDetail> getAll() {
        return routineDetailPersistencePort.getAll();
    }

    @Override
    public RoutineDetail findById(Long id) {
        return routineDetailPersistencePort.findById(id).orElseThrow(() -> {
            throw new RuntimeException("No se encontró ningún detalle de rutina con el ID " + id);
        });
    }
}
