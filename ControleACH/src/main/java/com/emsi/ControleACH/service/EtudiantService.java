package com.emsi.ControleACH.service;

import com.emsi.ControleACH.dto.EtudiantDTO;

import java.time.LocalDate;
import java.util.List;

public interface EtudiantService {
    EtudiantDTO saveStudent(EtudiantDTO etudiantDTO); // Méthode pour sauvegarder un étudiant
    List<EtudiantDTO> getAllStudents();              // Méthode pour récupérer tous les étudiants
    List<EtudiantDTO> getStudentsByDateNaissance(LocalDate dateNaissance); // Récupérer par date
}

