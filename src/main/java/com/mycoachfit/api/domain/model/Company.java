package com.mycoachfit.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company {

    private Long id;
    private String name;
    private String phone;
    private Set<Office> offices = new HashSet<>();
}
