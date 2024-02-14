package com.mycoachfit.api.domain.model.dto.request;

import com.mycoachfit.api.domain.model.PersonalTrainer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientRequestDTO {
    private String firstname;
    private String lastname;
    private String document;
    private LocalDate birthday;
    private String phone;
    private String address;
    private PersonalTrainer personalTrainer;
}
