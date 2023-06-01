package com.mohcine.pfe.services.AppServiceImpl;

import com.mohcine.pfe.dao.CahierDeTexteInteractifRepository;
import com.mohcine.pfe.model.CahierDeTexteInteractif;
import com.mohcine.pfe.services.AppService.CahierDeTexteInteractifService;
import org.springframework.stereotype.Service;

@Service
public class CahierDeTexteInteractifImpl implements CahierDeTexteInteractifService {
    private final CahierDeTexteInteractifRepository cahierDeTexteInteractifRepository;

    public CahierDeTexteInteractifImpl(CahierDeTexteInteractifRepository cahierDeTexteInteractifRepository) {
        this.cahierDeTexteInteractifRepository = cahierDeTexteInteractifRepository;
    }

    @Override
    public CahierDeTexteInteractif creerCahierDeTexteInteractif(CahierDeTexteInteractif cahierDeTexteInteractif) {
        return cahierDeTexteInteractifRepository.save(cahierDeTexteInteractif);
    }
}
