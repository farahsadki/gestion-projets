package com.example.gestionprojets.repository;

import com.example.gestionprojets.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
