package org.dosi.csa_project_backend.service;


import org.dosi.csa_project_backend.Repository.EtudiantRepository;
import org.dosi.csa_project_backend.entity.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {
    private final EtudiantRepository etudiantRepository;

    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    public List<Etudiant> getEtudiants() {
        return etudiantRepository.findAll();
    }

    public Etudiant addEtudiant(Etudiant etudiant) {

        return etudiantRepository.save(etudiant);
    }
}
