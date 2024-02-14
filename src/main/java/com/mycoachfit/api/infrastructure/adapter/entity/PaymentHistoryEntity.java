package com.mycoachfit.api.infrastructure.adapter.entity;

import jakarta.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paymentHistory")
@Data
@EqualsAndHashCode(callSuper = false)
public class PaymentHistoryEntity extends AbstractAuditingEntity implements Serializable {
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
    private ClientEntity clientEntity;
}
