package com.example.gestionprojets.repositories;

import com.example.gestionprojets.entities.Role;
import com.example.gestionprojets.entities.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByNom(RoleType nom);
}
