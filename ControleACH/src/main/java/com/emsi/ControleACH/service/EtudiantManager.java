package com.emsi.ControleACH.service;

import com.emsi.ControleACH.dao.Etudiant;
import com.emsi.ControleACH.dao.EtudiantRepository;
import com.emsi.ControleACH.dto.EtudiantDTO;
import com.emsi.ControleACH.mapper.EtudiantMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service // Ajout de cette annotation
public class EtudiantManager implements EtudiantService {
    private final EtudiantRepository etudiantRepository;
    private final EtudiantMapper etudiantMapper;

    public EtudiantManager(EtudiantRepository etudiantRepository, EtudiantMapper etudiantMapper) {
        this.etudiantRepository = etudiantRepository;
        this.etudiantMapper = etudiantMapper;
    }

    @Override
    public EtudiantDTO saveStudent(EtudiantDTO etudiantDTO) {
        Etudiant etudiant = etudiantMapper.toEntity(etudiantDTO);
        return etudiantMapper.toDTO(etudiantRepository.save(etudiant));
    }

    @Override
    public List<EtudiantDTO> getAllStudents() {
        return etudiantRepository.findAll()
                .stream()
                .map(etudiantMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<EtudiantDTO> getStudentsByDateNaissance(LocalDate dateNaissance) {
        return etudiantRepository.findByDateNaissance(dateNaissance)
                .stream()
                .map(etudiantMapper::toDTO)
                .collect(Collectors.toList());
    }
}
