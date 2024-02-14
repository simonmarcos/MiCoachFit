package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.port.OfficePersistencePort;
import com.mycoachfit.api.infrastructure.adapter.repository.OfficeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeAdapter implements OfficePersistencePort {


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
