package org.dosi.csa_project_backend.service;

import org.dosi.csa_project_backend.Repository.PromotionRepository;
import org.dosi.csa_project_backend.entity.Promotion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService {
    private final PromotionRepository promotionRepository;

    public PromotionService(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public List<Promotion> getPromotions() {
        return  promotionRepository.findAll();
    }

    public Promotion addPromotion(Promotion promotion) {

        return promotionRepository.save(promotion);
    }
}
