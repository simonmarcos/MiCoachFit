package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.Company;
import com.mycoachfit.api.domain.port.CompanyPersistencePort;
import com.mycoachfit.api.infrastructure.adapter.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyAdapter implements CompanyPersistencePort {

    private final CompanyRepository companyRepository;

    public CompanyAdapter(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company create(Company company) {
        return null;
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
