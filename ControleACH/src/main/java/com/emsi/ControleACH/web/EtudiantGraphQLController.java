package com.emsi.ControleACH.web;

import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Controller;
import com.emsi.ControleACH.service.EtudiantService;
import com.emsi.ControleACH.dto.EtudiantDTO;

import java.time.LocalDate;
import java.util.List;
@Controller
public class EtudiantGraphQLController {
    private final EtudiantService etudiantService;

    public EtudiantGraphQLController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @MutationMapping
    public EtudiantDTO saveStudent(@Argument String name,
                                   @Argument String email,
                                   @Argument String dateNaissance) {
        LocalDate birthDate = LocalDate.parse(dateNaissance);
        return etudiantService.saveStudent(new EtudiantDTO(name, email, birthDate));
    }

    @QueryMapping
    public List<EtudiantDTO> getAllStudents() {
        return etudiantService.getAllStudents();
    }

    @QueryMapping
    public List<EtudiantDTO> getStudentsByDateNaissance(@Argument String dateNaissance) {
        LocalDate birthDate = LocalDate.parse(dateNaissance);
        return etudiantService.getStudentsByDateNaissance(birthDate);
    }
}
