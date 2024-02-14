package com.mycoachfit.api.infrastructure.adapter.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "company")
@Data
public class CompanyEntity extends AbstractAuditingEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column
    private String name;

    @NotNull
    @Column
    private String phone;

    @OneToMany(mappedBy = "companyEntity", fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"companyEntity"}, allowSetters = true)
    private Set<OfficeEntity> officeEntities = new HashSet<>();
}
