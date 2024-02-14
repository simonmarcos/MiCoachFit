package com.mycoachfit.api.domain.model.dto.request;

import com.mycoachfit.api.domain.model.Office;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonalTrainerRequestDTO {
    private String firstname;
    private String lastname;
    private String document;
    private LocalDate birthday;
    private String phone;
    private String address;
    private Office office;
}
