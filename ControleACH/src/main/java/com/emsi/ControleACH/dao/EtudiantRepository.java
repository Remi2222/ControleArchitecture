package com.emsi.ControleACH.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findByDateNaissance(LocalDate dateNaissance);
}
