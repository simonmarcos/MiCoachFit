package com.mycoachfit.api.infrastructure.adapter.entity;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "exercise")
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
