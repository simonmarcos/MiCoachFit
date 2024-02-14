package com.mycoachfit.api.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "client")
@Entity
@Data
public class Client extends AbstractAuditingEntity implements Serializable {
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

    @JsonIgnoreProperties(value = {"client"}, allowSetters = true)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(unique = true)
    private PersonalTrainer personalTrainer;
}
