package com.mycoachfit.api.infrastructure.adapter.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Table(name = "company")
@Entity
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

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"company"}, allowSetters = true)
    private Set<OfficeEntity> officeEntities = new HashSet<>();
}
