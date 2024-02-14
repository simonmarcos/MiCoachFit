package com.mycoachfit.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentHistory {
    private Long id;
    private LocalDate paymentDate;
    private LocalDate expirationDate;
    private BigDecimal amount;
    private Client client;
}
