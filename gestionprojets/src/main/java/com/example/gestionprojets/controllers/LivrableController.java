package com.example.gestionprojets.controllers;

import com.example.gestionprojets.entities.Livrable;
import com.example.gestionprojets.service.LivrableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livrables")
public class LivrableController {
    @Autowired
    private LivrableService livrableService;

    @GetMapping
    public List<Livrable> getAllLivrables() {
        return livrableService.getAllLivrables();
    }

    @PostMapping
    public Livrable createLivrable(@RequestBody Livrable livrable) {
        return livrableService.createLivrable(livrable);
    }
}
