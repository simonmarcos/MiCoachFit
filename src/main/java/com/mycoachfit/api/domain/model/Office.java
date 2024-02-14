package com.mycoachfit.api.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Table(name = "office")
@Entity
@Data
public class Office extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column
    private String address;

    @NotNull
    @Column
    private String latitude;

    @NotNull
    @Column
    private String longitude;

    @ManyToOne
    private Company company;
}
