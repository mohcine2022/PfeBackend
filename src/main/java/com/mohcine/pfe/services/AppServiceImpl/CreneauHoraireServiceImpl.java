package com.mohcine.pfe.services.AppServiceImpl;

import com.mohcine.pfe.dao.CreneauHoraireRepository;
import com.mohcine.pfe.model.CreneauHoraire;
import com.mohcine.pfe.services.AppService.CreneauHoraireService;
import org.springframework.stereotype.Service;

@Service
public class CreneauHoraireServiceImpl implements CreneauHoraireService {
    private final CreneauHoraireRepository creneauHoraireRepository;

    public CreneauHoraireServiceImpl(CreneauHoraireRepository creneauHoraireRepository) {
        this.creneauHoraireRepository = creneauHoraireRepository;
    }
    @Override
    public CreneauHoraire creerCreneauHoraire(CreneauHoraire creneauHoraire) {
        return creneauHoraireRepository.save(creneauHoraire);
    }
}
