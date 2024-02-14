package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.usercases.CompanyService;
import com.mycoachfit.api.domain.model.Company;
import com.mycoachfit.api.domain.model.dto.request.CompanyRequestDTO;
import com.mycoachfit.api.domain.port.CompanyPersistencePort;

import java.util.List;

public class CompanyManagementService implements CompanyService {

    private final CompanyPersistencePort companyPersistencePort;

    public CompanyManagementService(CompanyPersistencePort companyPersistencePort) {
        this.companyPersistencePort = companyPersistencePort;
    }

    @Override
    public Company create(CompanyRequestDTO companyRequestDTO) {
        return null;
    }

    @Override
    public Company update(CompanyRequestDTO company) {
        return null;
    }

    @Override
    public List<Company> getAll() {
        return null;
    }

    @Override
    public Company findById(Long id) {
        return null;
    }
}
