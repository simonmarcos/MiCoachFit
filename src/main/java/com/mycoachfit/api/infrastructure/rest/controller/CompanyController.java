package com.mycoachfit.api.infrastructure.rest.controller;

import com.mycoachfit.api.application.usercases.CompanyService;
import com.mycoachfit.api.domain.model.Company;
import com.mycoachfit.api.domain.model.dto.request.CompanyRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping()
    public ResponseEntity<Company> createCompany(@RequestBody CompanyRequestDTO companyRequestDTO) {
        Company companyResponse = companyService.create(companyRequestDTO);
        return ResponseEntity.ok(companyResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> updateCompany(@PathVariable("id") Long id, @RequestBody CompanyRequestDTO companyRequestDTO) {
        Company companyResponse = companyService.update(id, companyRequestDTO);
        return ResponseEntity.ok(companyResponse);
    }

    @GetMapping()
    public ResponseEntity<List<Company>> getAllCompanies() {
        List<Company> companyResponse = companyService.getAll();
        return ResponseEntity.ok(companyResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable("id") Long id) {
        Company companyResponse = companyService.findById(id);
        return ResponseEntity.ok(companyResponse);
    }
}
