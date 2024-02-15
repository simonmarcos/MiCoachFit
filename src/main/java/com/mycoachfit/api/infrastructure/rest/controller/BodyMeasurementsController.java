package com.mycoachfit.api.infrastructure.rest.controller;

import com.mycoachfit.api.application.usercases.BodyMeasurementsService;
import com.mycoachfit.api.domain.model.BodyMeasurements;
import com.mycoachfit.api.domain.model.dto.request.BodyMeasurementsRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/body-measurements")
public class BodyMeasurementsController {

    private final BodyMeasurementsService bodyMeasurementsService;

    public BodyMeasurementsController(BodyMeasurementsService bodyMeasurementsService) {
        this.bodyMeasurementsService = bodyMeasurementsService;
    }

    @PostMapping()
    public ResponseEntity<BodyMeasurements> createBodyMeasurements(@RequestBody @Valid BodyMeasurementsRequestDTO bodyMeasurementsRequestDTO) {
        BodyMeasurements bodyMeasurementsResponse = bodyMeasurementsService.create(bodyMeasurementsRequestDTO);
        return ResponseEntity.ok(bodyMeasurementsResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BodyMeasurements> updateBodyMeasurements(@PathVariable("id") Long id, @RequestBody BodyMeasurementsRequestDTO bodyMeasurementsRequestDTO) {
        BodyMeasurements bodyMeasurementsResponse = bodyMeasurementsService.update(id, bodyMeasurementsRequestDTO);
        return ResponseEntity.ok(bodyMeasurementsResponse);
    }

    @GetMapping()
    public ResponseEntity<List<BodyMeasurements>> getAllBodyMeasurements() {
        List<BodyMeasurements> bodyMeasurementsResponse = bodyMeasurementsService.getAll();
        return ResponseEntity.ok(bodyMeasurementsResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BodyMeasurements> getBodyMeasurementsById(@PathVariable("id") Long id) {
        BodyMeasurements bodyMeasurementsResponse = bodyMeasurementsService.findById(id);
        return ResponseEntity.ok(bodyMeasurementsResponse);
    }
}
