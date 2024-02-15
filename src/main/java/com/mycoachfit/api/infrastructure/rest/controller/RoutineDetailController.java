package com.mycoachfit.api.infrastructure.rest.controller;

import com.mycoachfit.api.application.usercases.RoutineDetailService;
import com.mycoachfit.api.domain.model.RoutineDetail;
import com.mycoachfit.api.domain.model.dto.request.RoutineDetailRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/routine-details")
public class RoutineDetailController {

    private final RoutineDetailService routineDetailService;

    public RoutineDetailController(RoutineDetailService routineDetailService) {
        this.routineDetailService = routineDetailService;
    }

    @PostMapping()
    public ResponseEntity<RoutineDetail> createRoutineDetail(@RequestBody @Valid RoutineDetailRequestDTO routineDetailRequestDTO) {
        RoutineDetail routineDetailResponse = routineDetailService.create(routineDetailRequestDTO);
        return ResponseEntity.ok(routineDetailResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RoutineDetail> updateRoutineDetail(@PathVariable("id") Long id, @RequestBody RoutineDetailRequestDTO routineDetailRequestDTO) {
        RoutineDetail routineDetailResponse = routineDetailService.update(id, routineDetailRequestDTO);
        return ResponseEntity.ok(routineDetailResponse);
    }

    @GetMapping()
    public ResponseEntity<List<RoutineDetail>> getAllRoutineDetails() {
        List<RoutineDetail> routineDetailsResponse = routineDetailService.getAll();
        return ResponseEntity.ok(routineDetailsResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoutineDetail> getRoutineDetailById(@PathVariable("id") Long id) {
        RoutineDetail routineDetailResponse = routineDetailService.findById(id);
        return ResponseEntity.ok(routineDetailResponse);
    }
}
