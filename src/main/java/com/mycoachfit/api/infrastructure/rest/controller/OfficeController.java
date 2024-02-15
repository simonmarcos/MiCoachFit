package com.mycoachfit.api.infrastructure.rest.controller;

import com.mycoachfit.api.application.usercases.CompanyService;
import com.mycoachfit.api.application.usercases.OfficeService;
import com.mycoachfit.api.domain.model.Company;
import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.model.dto.request.CompanyRequestDTO;
import com.mycoachfit.api.domain.model.dto.request.OfficeRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offices")
public class OfficeController {

    private final OfficeService officeService;

    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @PostMapping()
    public ResponseEntity<Office> createCompany(@RequestBody @Valid OfficeRequestDTO officeRequestDTO) {
        Office officeResponse = officeService.create(officeRequestDTO);
        return ResponseEntity.ok(officeResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Office> updateCompany(@PathVariable("id") Long id, @RequestBody OfficeRequestDTO officeRequestDTO) {
        Office officeResponse = officeService.update(id, officeRequestDTO);
        return ResponseEntity.ok(officeResponse);
    }

    @GetMapping()
    public ResponseEntity<List<Office>> getAllCompanies() {
        List<Office> officesResponse = officeService.getAll();
        return ResponseEntity.ok(officesResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Office> getCompanyById(@PathVariable("id") Long id) {
        Office officeResponse = officeService.findById(id);
        return ResponseEntity.ok(officeResponse);
    }
}
