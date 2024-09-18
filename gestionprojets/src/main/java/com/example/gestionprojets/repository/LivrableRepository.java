package com.example.gestionprojets.repository;

import com.example.gestionprojets.entities.Livrable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrableRepository extends JpaRepository<Livrable, Long> {
}
