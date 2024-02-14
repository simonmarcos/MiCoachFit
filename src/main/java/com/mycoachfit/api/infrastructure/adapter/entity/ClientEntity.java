package com.mycoachfit.api.infrastructure.adapter.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "client")
@Data
@EqualsAndHashCode(callSuper = false)
public class ClientEntity extends AbstractAuditingEntity implements Serializable {
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

    @NotNull
    @Column
    private Boolean isActive;

    @JsonIgnoreProperties(value = {"clientEntity"}, allowSetters = true)
    @OneToOne
    @JoinColumn(unique = true)
    private PersonalTrainerEntity personalTrainerEntity;
}
