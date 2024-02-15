package com.mycoachfit.api.domain.model.dto.request;

import com.mycoachfit.api.domain.model.Client;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentHistoryRequestDTO {
    private LocalDate paymentDate;
    private LocalDate expirationDate;
    private BigDecimal amount;
    private Client client;
}
