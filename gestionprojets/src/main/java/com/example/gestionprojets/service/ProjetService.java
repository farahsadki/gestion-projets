package com.example.gestionprojets.service;

import com.example.gestionprojets.entities.Projet;
import com.example.gestionprojets.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetService {
    @Autowired
    private ProjetRepository projetRepository;

    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }

    public Projet createProjet(Projet projet) {
        return projetRepository.save(projet);
    }
}
