package com.mycoachfit.api.infrastructure.adapter.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "personalTrainer")
@Data
@EqualsAndHashCode(callSuper = false)
public class PersonalTrainerEntity extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column
    private String firstname;

    @NotNull
    @Column
    private String lastname;

    @NotNull
    @Column
    private String document;

    @NotNull
    @Column
    private LocalDate birthday;

    @NotNull
    @Column
    private String phone;

    @NotNull
    @Column
    private String address;

    @JsonIgnoreProperties(value = {"personalTrainerEntity"}, allowSetters = true)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(unique = true)
    private OfficeEntity officeEntity;
}
