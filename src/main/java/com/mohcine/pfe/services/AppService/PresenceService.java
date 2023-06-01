package com.mohcine.pfe.services.AppService;

import com.mohcine.pfe.model.Presence;
import com.mohcine.pfe.model.Profil;

public interface PresenceService {
    Profil creerProfil(Profil profil);

    Presence creerPresence(Presence presence);
}
