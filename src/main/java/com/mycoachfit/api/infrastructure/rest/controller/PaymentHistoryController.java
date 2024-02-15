package com.mycoachfit.api.infrastructure.rest.controller;

import com.mycoachfit.api.application.usercases.PaymentHistoryService;
import com.mycoachfit.api.domain.model.PaymentHistory;
import com.mycoachfit.api.domain.model.dto.request.PaymentHistoryRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment-histories")
public class PaymentHistoryController {

    private final PaymentHistoryService paymentHistoryService;

    public PaymentHistoryController(PaymentHistoryService paymentHistoryService) {
        this.paymentHistoryService = paymentHistoryService;
    }

    @PostMapping()
    public ResponseEntity<PaymentHistory> createPaymentHistory(@RequestBody @Valid PaymentHistoryRequestDTO paymentHistoryRequestDTO) {
        PaymentHistory paymentHistoryResponse = paymentHistoryService.create(paymentHistoryRequestDTO);
        return ResponseEntity.ok(paymentHistoryResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaymentHistory> updatePaymentHistory(@PathVariable("id") Long id, @RequestBody PaymentHistoryRequestDTO paymentHistoryRequestDTO) {
        PaymentHistory paymentHistoryResponse = paymentHistoryService.update(id, paymentHistoryRequestDTO);
        return ResponseEntity.ok(paymentHistoryResponse);
    }

    @GetMapping()
    public ResponseEntity<List<PaymentHistory>> getAllPaymentHistories() {
        List<PaymentHistory> paymentHistoriesResponse = paymentHistoryService.getAll();
        return ResponseEntity.ok(paymentHistoriesResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentHistory> getPaymentHistoryById(@PathVariable("id") Long id) {
        PaymentHistory paymentHistoryResponse = paymentHistoryService.findById(id);
        return ResponseEntity.ok(paymentHistoryResponse);
    }
}
