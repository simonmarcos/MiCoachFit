package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.usercases.OfficeService;
import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.model.dto.request.OfficeRequestDTO;
import com.mycoachfit.api.domain.port.OfficePersistencePort;

import java.util.List;

public class OfficeManagementService implements OfficeService {

    private final OfficePersistencePort officePersistencePort;

    public OfficeManagementService(OfficePersistencePort officePersistencePort) {
        this.officePersistencePort = officePersistencePort;
    }

    @Override
    public Office create(OfficeRequestDTO officeRequestDTO) {
        return null;
    }

    @Override
    public Office update(OfficeRequestDTO officeRequestDTO) {
        return null;
    }

    @Override
    public List<Office> getAll() {
        return null;
    }

    @Override
    public Office findById(Long id) {
        return null;
    }
}
