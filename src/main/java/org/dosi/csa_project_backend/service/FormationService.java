package org.dosi.csa_project_backend.service;

import org.dosi.csa_project_backend.Repository.FormationRepository;
import org.dosi.csa_project_backend.entity.Formation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormationService {
    private final FormationRepository formationRepository;

    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public List<Formation> getFormations() {
        return  formationRepository.findAll();
    }

    public Formation addFormation(Formation formation) {

        return formationRepository.save(formation);
    }
}
