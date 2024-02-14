package com.mycoachfit.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonalTrainer {
    private Long id;
    private String firstname;
    private String lastname;
    private String document;
    private LocalDate birthday;
    private String phone;
    private String address;
    private Office office;
}
