package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.port.OfficePersistencePort;
import com.mycoachfit.api.infrastructure.adapter.repository.OfficeRepository;

import java.util.List;

public class OfficeAdapter implements OfficePersistencePort {

    private final OfficeRepository officeRepository;

    public OfficeAdapter(OfficeRepository officeRepository) {
        this.officeRepository = officeRepository;
    }

    @Override
    public Office create(Office company) {
        return null;
    }

    @Override
    public Office update(Office company) {
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
