package com.mycoachfit.api.application.service;

import com.mycoachfit.api.application.mapper.CompanyDtoMapper;
import com.mycoachfit.api.application.usercases.CompanyService;
import com.mycoachfit.api.domain.model.Company;
import com.mycoachfit.api.domain.model.dto.request.CompanyRequestDTO;
import com.mycoachfit.api.domain.port.CompanyPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyManagementService implements CompanyService {

    private final CompanyPersistencePort companyPersistencePort;
    private final CompanyDtoMapper companyDtoMapper;

    public CompanyManagementService(CompanyPersistencePort companyPersistencePort, CompanyDtoMapper companyDtoMapper) {
        this.companyPersistencePort = companyPersistencePort;
        this.companyDtoMapper = companyDtoMapper;
    }

    @Override
    public Company create(CompanyRequestDTO companyRequestDTO) {
        return companyPersistencePort.create(companyDtoMapper.toEntity(companyRequestDTO));
    }

    @Override
    public Company update(CompanyRequestDTO companyRequestDTO) {
        return companyPersistencePort.update(companyDtoMapper.toEntity(companyRequestDTO));
    }

    @Override
    public List<Company> getAll() {
        return companyPersistencePort.getAll();
    }

    @Override
    public Company findById(Long id) {
        return companyPersistencePort.findById(id);
    }
}
