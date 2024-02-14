package com.mycoachfit.api.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "paymentHistory")
@Entity
@Data
public class PaymentHistory extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column
    private LocalDate paymentDate;

    @NotNull
    @Column
    private LocalDate expirationDate;

    @NotNull
    @Column
    private BigDecimal amount;

    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
}
