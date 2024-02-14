package com.mycoachfit.api.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Table(name = "exercise")
@Entity
@Data
public class Exercise extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private MuscleGroup muscleGroup;
}
