package com.emsi.ControleACH.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtudiantDTO {

    private String name;
    private String email;
    private LocalDate dateNaissance;



    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

}
