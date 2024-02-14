package com.mycoachfit.api.infrastructure.adapter.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Table(name = "exercise")
@Entity
@Data
public class ExerciseEntity extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private MuscleGroupEntity muscleGroupEntity;
}
