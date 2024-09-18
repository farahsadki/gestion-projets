package com.example.gestionprojets.service;

import com.example.gestionprojets.entities.Livrable;
import com.example.gestionprojets.repository.LivrableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrableService {
    @Autowired
    private LivrableRepository livrableRepository;

    public List<Livrable> getAllLivrables() {
        return livrableRepository.findAll();
    }

    public Livrable createLivrable(Livrable livrable) {
        return livrableRepository.save(livrable);
    }
}
