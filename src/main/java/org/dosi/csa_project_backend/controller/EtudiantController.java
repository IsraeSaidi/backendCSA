package org.dosi.csa_project_backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/etudiant")
@RequiredArgsConstructor
public class EtudiantController {

    @GetMapping
    public ResponseEntity<String> SayHello(){
        return ResponseEntity.ok("Hi Etudiant");
    }
}
