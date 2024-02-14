package com.mycoachfit.api.infrastructure.adapter.entity;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "exercise")
@Data
@EqualsAndHashCode(callSuper = false)
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
