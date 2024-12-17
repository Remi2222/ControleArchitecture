package com.emsi.ControleACH;

import com.emsi.ControleACH.dto.EtudiantDTO;
import com.emsi.ControleACH.service.EtudiantService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ControleAchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleAchApplication.class, args);
	}
	@Bean
	CommandLineRunner initDatabase(EtudiantService etudiantService) {
		return args -> {
			System.out.println("Initialisation de la base de données avec 4 étudiants...");

			etudiantService.saveStudent(new EtudiantDTO("art", "art@example.com", LocalDate.of(2000, 5, 10)));
			etudiantService.saveStudent(new EtudiantDTO("maryam", "maryam@example.com", LocalDate.of(2001, 6, 15)));
			etudiantService.saveStudent(new EtudiantDTO("chaimae", "chaimae@example.com", LocalDate.of(2002, 7, 20)));
			etudiantService.saveStudent(new EtudiantDTO("malak", "malak@example.com", LocalDate.of(2003, 8, 25)));

			System.out.println("Base de données initialisée avec succès !");
		};
	}
}
