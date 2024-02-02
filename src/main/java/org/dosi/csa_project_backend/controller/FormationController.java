package org.dosi.csa_project_backend.controller;

import org.dosi.csa_project_backend.entity.Etudiant;
import org.dosi.csa_project_backend.entity.Formation;
import org.dosi.csa_project_backend.service.EtudiantService;
import org.dosi.csa_project_backend.service.FormationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formations")
public class FormationController {

    private final FormationService formationService;

    public FormationController(FormationService formationService){
        this.formationService = formationService;
    }
    @GetMapping
    public List<Formation> getAllFormations() {
        return formationService.getFormations();
    }

    @PostMapping
    public ResponseEntity<Formation> createFormation(@RequestBody Formation formation) {
        Formation createdFormation = formationService.addFormation(formation);
        return new ResponseEntity<>(createdFormation, HttpStatus.CREATED);
    }
}
