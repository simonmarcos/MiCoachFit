package com.mycoachfit.api.infrastructure.adapter.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Entity
@Table(name = "muscleGroup")
@Data
@EqualsAndHashCode(callSuper = false)
public class MuscleGroupEntity extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column
    private String name;
}
