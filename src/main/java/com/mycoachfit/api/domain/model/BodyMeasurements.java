package com.mycoachfit.api.domain.model;

import com.mycoachfit.api.domain.model.enumeration.ExerciseType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Table(name = "bodyMeasurements")
@Entity
@Data
public class BodyMeasurements extends AbstractAuditingEntity {
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
