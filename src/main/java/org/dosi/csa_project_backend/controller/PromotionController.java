package org.dosi.csa_project_backend.controller;


import org.dosi.csa_project_backend.entity.Etudiant;
import org.dosi.csa_project_backend.entity.Promotion;
import org.dosi.csa_project_backend.service.EtudiantService;
import org.dosi.csa_project_backend.service.PromotionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promotions")
public class PromotionController {
    private final PromotionService promotionService;

    public PromotionController(PromotionService promotionService){
        this.promotionService = promotionService;
    }
    @GetMapping
    public List<Promotion> getAllPromotions() {
        return promotionService.getPromotions();
    }

    @PostMapping
    public ResponseEntity<Promotion> createPromotion(@RequestBody Promotion promotion) {
        Promotion createdPromotion = promotionService.addPromotion(promotion);
        return new ResponseEntity<>(createdPromotion, HttpStatus.CREATED);
    }
}
