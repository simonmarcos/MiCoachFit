package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.mapper.MuscleGroupDtoMapper;
import com.mycoachfit.api.application.usercases.MuscleGroupService;
import com.mycoachfit.api.domain.model.MuscleGroup;
import com.mycoachfit.api.domain.model.dto.request.MuscleGroupRequestDTO;
import com.mycoachfit.api.domain.port.MuscleGroupPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuscleGroupManagementService implements MuscleGroupService {

    private final MuscleGroupPersistencePort muscleGroupPersistencePort;
    private final MuscleGroupDtoMapper muscleGroupDtoMapper;

    public MuscleGroupManagementService(MuscleGroupPersistencePort muscleGroupPersistencePort, MuscleGroupDtoMapper muscleGroupDtoMapper) {
        this.muscleGroupPersistencePort = muscleGroupPersistencePort;
        this.muscleGroupDtoMapper = muscleGroupDtoMapper;
    }

    @Override
    public MuscleGroup create(MuscleGroupRequestDTO muscleGroupRequestDTO) {
        return muscleGroupPersistencePort.create(muscleGroupDtoMapper.toEntity(muscleGroupRequestDTO));
    }

    @Override
    public MuscleGroup update(MuscleGroupRequestDTO muscleGroupRequestDTO) {
        return muscleGroupPersistencePort.update(muscleGroupDtoMapper.toEntity(muscleGroupRequestDTO));
    }

    @Override
    public List<MuscleGroup> getAll() {
        return muscleGroupPersistencePort.getAll();
    }

    @Override
    public MuscleGroup findById(Long id) {
        return muscleGroupPersistencePort.findById(id);
    }
}
