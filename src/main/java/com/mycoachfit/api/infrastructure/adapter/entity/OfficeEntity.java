package com.mycoachfit.api.infrastructure.adapter.entity;

import jakarta.persistence.*;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Entity
@Table(name = "office")
@Data
@EqualsAndHashCode(callSuper = false)
public class OfficeEntity extends AbstractAuditingEntity implements Serializable {
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

    @ManyToOne(fetch = FetchType.LAZY)
    private CompanyEntity companyEntity;
}
