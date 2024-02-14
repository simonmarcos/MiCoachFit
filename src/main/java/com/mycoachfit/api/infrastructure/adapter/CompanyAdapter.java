package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.Company;
import com.mycoachfit.api.domain.port.CompanyPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.mapper.CompanyDboMapper;
import com.mycoachfit.api.infrastructure.adapter.repository.CompanyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CompanyAdapter implements CompanyPersistencePort {

    private final CompanyRepository companyRepository;
    private final CompanyDboMapper companyDboMapper;

    public CompanyAdapter(CompanyRepository companyRepository, CompanyDboMapper companyDboMapper) {
        this.companyRepository = companyRepository;
        this.companyDboMapper = companyDboMapper;
    }

    @Override
    public Company create(Company company) {
        var companyEntitySaved = companyRepository.save(companyDboMapper.toDbo(company));
        return companyDboMapper.toDomain(companyEntitySaved);
    }

    @Override
    public Company update(Company company) {
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
