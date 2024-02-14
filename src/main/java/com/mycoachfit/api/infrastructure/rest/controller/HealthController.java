package com.mycoachfit.api.infrastructure.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    @GetMapping()
    public ResponseEntity<String> checkHealth() {
        String message = "Hi everyone. It's My Coach Fit";
        return ResponseEntity.ok(message);
    }
}
