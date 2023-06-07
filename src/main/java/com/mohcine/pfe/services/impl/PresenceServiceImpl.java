package com.mohcine.pfe.services.impl;

import com.mohcine.pfe.dao.PresenceRepository;
import com.mohcine.pfe.model.Presence;
import com.mohcine.pfe.model.Profil;
import com.mohcine.pfe.services.PresenceService;
import org.springframework.stereotype.Service;

@Service
public class PresenceServiceImpl implements PresenceService {
    private final PresenceRepository presenceRepository;

    public PresenceServiceImpl(PresenceRepository presenceRepository) {
        this.presenceRepository = presenceRepository;
    }

    @Override
    public Profil creerProfil(Profil profil) {
        return null;
    }

    @Override
    public Presence creerPresence(Presence presence) {
        return presenceRepository.save(presence);
    }
}
