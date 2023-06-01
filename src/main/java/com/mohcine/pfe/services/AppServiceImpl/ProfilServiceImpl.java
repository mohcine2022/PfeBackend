package com.mohcine.pfe.services.AppServiceImpl;

import com.mohcine.pfe.dao.ProfilRepository;
import com.mohcine.pfe.model.Profil;
import com.mohcine.pfe.services.AppService.ProfilService;
import org.springframework.stereotype.Service;

@Service
public class ProfilServiceImpl  implements ProfilService {
    private final ProfilRepository profilRepository;

    public ProfilServiceImpl(ProfilRepository profilRepository) {
        this.profilRepository = profilRepository;
    }
    @Override
    public Profil creerProfil(Profil profil) {
        return profilRepository.save(profil);
    }
}
