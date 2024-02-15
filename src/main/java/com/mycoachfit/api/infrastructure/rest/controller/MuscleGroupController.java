package com.mycoachfit.api.infrastructure.rest.controller;

import com.mycoachfit.api.application.usercases.MuscleGroupService;
import com.mycoachfit.api.domain.model.MuscleGroup;
import com.mycoachfit.api.domain.model.dto.request.MuscleGroupRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/muscle-groups")
public class MuscleGroupController {

    private final MuscleGroupService muscleGroupService;

    public MuscleGroupController(MuscleGroupService muscleGroupService) {
        this.muscleGroupService = muscleGroupService;
    }

    @PostMapping()
    public ResponseEntity<MuscleGroup> createMuscleGroup(@RequestBody @Valid MuscleGroupRequestDTO muscleGroupRequestDTO) {
        MuscleGroup muscleGroupResponse = muscleGroupService.create(muscleGroupRequestDTO);
        return ResponseEntity.ok(muscleGroupResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MuscleGroup> updateMuscleGroup(@PathVariable("id") Long id, @RequestBody MuscleGroupRequestDTO muscleGroupRequestDTO) {
        MuscleGroup muscleGroupResponse = muscleGroupService.update(id, muscleGroupRequestDTO);
        return ResponseEntity.ok(muscleGroupResponse);
    }

    @GetMapping()
    public ResponseEntity<List<MuscleGroup>> getAllMuscleGroups() {
        List<MuscleGroup> muscleGroupsResponse = muscleGroupService.getAll();
        return ResponseEntity.ok(muscleGroupsResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MuscleGroup> getMuscleGroupById(@PathVariable("id") Long id) {
        MuscleGroup muscleGroupResponse = muscleGroupService.findById(id);
        return ResponseEntity.ok(muscleGroupResponse);
    }
}
