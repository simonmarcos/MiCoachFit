package com.mycoachfit.api.infrastructure.adapter.entity;


import javax.validation.constraints.NotNull;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Entity
@Table(name = "bodyMeasurements")
@Data
@EqualsAndHashCode(callSuper = false)
public class BodyMeasurementsEntity extends AbstractAuditingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column
    private LocalDate date;

    @NotNull
    @Column
    private int weight;

    @NotNull
    @Column
    private int height;

    @Column
    private String bodyMeasurements;

    @Column
    private String imc;
}
