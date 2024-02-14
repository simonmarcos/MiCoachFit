package com.mycoachfit.api.infrastructure.adapter.entity;

import com.mycoachfit.api.domain.model.enumeration.ExerciseType;
import com.mycoachfit.api.domain.model.enumeration.RoutineDetailStatus;

import jakarta.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Entity
@Table(name = "routineDetail")
@Data
@EqualsAndHashCode(callSuper = false)
public class RoutineDetailEntity extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column
    private ExerciseType exerciseType;

    @NotNull
    @Column
    private String series;

    @NotNull
    @Column
    private String repetitions;

    @Column
    private Integer restTime;

    @Column
    private String expectedWeightLoad;

    @Column
    private String weightLoadDetail;

    @Column
    private String observations;

    @Column
    private RoutineDetailStatus status;
}
