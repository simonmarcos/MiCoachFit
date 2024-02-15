package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.mapper.MuscleGroupDtoMapper;
import com.mycoachfit.api.application.usercases.MuscleGroupService;
import com.mycoachfit.api.domain.model.MuscleGroup;
import com.mycoachfit.api.domain.model.dto.request.MuscleGroupRequestDTO;
import com.mycoachfit.api.domain.port.MuscleGroupPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public MuscleGroup update(Long id, MuscleGroupRequestDTO muscleGroupRequestDTO) {
        findById(id);

        MuscleGroup muscleGroupToSave = muscleGroupDtoMapper.toEntity(muscleGroupRequestDTO);
        muscleGroupToSave.setId(id);

        return muscleGroupPersistencePort.update(muscleGroupToSave);
    }

    @Override
    public List<MuscleGroup> getAll() {
        return muscleGroupPersistencePort.getAll();
    }

    @Override
    public MuscleGroup findById(Long id) {
        return muscleGroupPersistencePort.findById(id).orElseThrow(() -> {
            throw new RuntimeException("No se encontró ningún grupo muscular con el ID " + id);
        });
    }
}
