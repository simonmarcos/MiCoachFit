package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.usercases.MuscleGroupService;
import com.mycoachfit.api.domain.model.MuscleGroup;
import com.mycoachfit.api.domain.model.dto.request.MuscleGroupRequestDTO;
import com.mycoachfit.api.domain.port.MuscleGroupPersistencePort;

import java.util.List;

public class MuscleGroupManagementService implements MuscleGroupService {

    private final MuscleGroupPersistencePort muscleGroupPersistencePort;

    public MuscleGroupManagementService(MuscleGroupPersistencePort muscleGroupPersistencePort) {
        this.muscleGroupPersistencePort = muscleGroupPersistencePort;
    }

    @Override
    public MuscleGroup create(MuscleGroupRequestDTO muscleGroupRequestDTO) {
        return null;
    }

    @Override
    public MuscleGroup update(MuscleGroupRequestDTO muscleGroupRequestDTO) {
        return null;
    }

    @Override
    public List<MuscleGroup> getAll() {
        return null;
    }

    @Override
    public MuscleGroup findById(Long id) {
        return null;
    }
}
