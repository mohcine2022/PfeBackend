package com.mohcine.pfe.services.AppServiceImpl;

import com.mohcine.pfe.dao.ResponsableDeFormationRepository;
import com.mohcine.pfe.model.ResponsableDeFormation;
import com.mohcine.pfe.services.AppService.ResponsableDeFormationService;
import org.springframework.stereotype.Service;

@Service
public class ResponsableDeFormationServiceImpl implements ResponsableDeFormationService {
    private final ResponsableDeFormationRepository responsableDeFormationRepository;

    public ResponsableDeFormationServiceImpl(ResponsableDeFormationRepository responsableDeFormationRepository) {
        this.responsableDeFormationRepository = responsableDeFormationRepository;
    }
    @Override
    public ResponsableDeFormation creerResponsableDeFormation(ResponsableDeFormation responsableDeFormation) {
        return responsableDeFormationRepository.save(responsableDeFormation);
    }
}
