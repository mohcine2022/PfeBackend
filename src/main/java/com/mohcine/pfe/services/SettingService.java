package com.mohcine.pfe.services;

import com.mohcine.pfe.model.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SettingService {
    Page<Profil> getProfils(Pageable pageable);

    Profil enregistrerProfil(Profil profil);

    Boolean supprimerProfil(Long id);

    List<Profil> getListeProfils();

    List<Personne> getListePersonnes();

    User enregistrerUtilisateur(User user);

    List<User> getUtlisateurs();

    Boolean supprimerUtilisateur(Long id);

    Salle enregistrerSalle(Salle salle);

    List<Salle> getSalles();

    Boolean supprimerSalle(Long id);

    Enseignant enregistrerEnseignant(Enseignant enseignant);

    List<Enseignant> getEnseignants();

    Boolean supprimerEnseignant(Long id);

    Cours enregistrerCours(Cours cours);

    List<Cours> getCourses();

    Boolean supprimerCours(Long id);

    ResponsableDeFormation enregistrerResponsable(ResponsableDeFormation responsable);

    List<ResponsableDeFormation> getResponsables();

    Boolean supprimerResponsable(Long id);
}
