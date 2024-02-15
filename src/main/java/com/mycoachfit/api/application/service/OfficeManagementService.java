package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.mapper.OfficeDtoMapper;
import com.mycoachfit.api.application.usercases.OfficeService;
import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.model.dto.request.OfficeRequestDTO;
import com.mycoachfit.api.domain.port.OfficePersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfficeManagementService implements OfficeService {

    private final OfficePersistencePort officePersistencePort;
    private final OfficeDtoMapper officeDtoMapper;

    public OfficeManagementService(OfficePersistencePort officePersistencePort, OfficeDtoMapper officeDtoMapper) {
        this.officePersistencePort = officePersistencePort;
        this.officeDtoMapper = officeDtoMapper;
    }

    @Override
    public Office create(OfficeRequestDTO officeRequestDTO) {
        return officePersistencePort.create(officeDtoMapper.toEntity(officeRequestDTO));
    }

    @Override
    public Office update(Long id, OfficeRequestDTO officeRequestDTO) {
        findById(id);

        Office officeToSave = officeDtoMapper.toEntity(officeRequestDTO);
        officeToSave.setId(id);

        return officePersistencePort.update(officeToSave);
    }

    @Override
    public List<Office> getAll() {
        return officePersistencePort.getAll();
    }

    @Override
    public Office findById(Long id) {
        return officePersistencePort.findById(id).orElseThrow(() -> {
            throw new RuntimeException("No se encontró ninguna oficina con el ID " + id);
        });
    }
}
