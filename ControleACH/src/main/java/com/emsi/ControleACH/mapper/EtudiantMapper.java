package com.emsi.ControleACH.mapper;

import com.emsi.ControleACH.dao.Etudiant;
import com.emsi.ControleACH.dto.EtudiantDTO;
import org.springframework.stereotype.Component;

@Component
public class EtudiantMapper {
    public Etudiant toEntity(EtudiantDTO dto) {
        return new Etudiant(null, dto.getName(), dto.getEmail(), dto.getDateNaissance());
    }

    public EtudiantDTO toDTO(Etudiant etudiant) {
        return new EtudiantDTO(etudiant.getName(), etudiant.getEmail(), etudiant.getDateNaissance());
    }
}
