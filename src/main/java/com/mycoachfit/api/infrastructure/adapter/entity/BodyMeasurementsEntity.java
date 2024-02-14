package com.mycoachfit.api.infrastructure.adapter.entity;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bodyMeasurements")
@Data
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
