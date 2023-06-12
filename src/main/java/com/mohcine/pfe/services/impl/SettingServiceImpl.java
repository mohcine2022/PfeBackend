package com.mohcine.pfe.services.impl;

import com.mohcine.pfe.dao.*;
import com.mohcine.pfe.model.*;
import com.mohcine.pfe.services.SettingService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SettingServiceImpl implements SettingService {

    private final ProfilRepository profilRepository;
    private final PersonneRepository personneRepository;
    private final UserRepository userRepository;
    private final SalleRepository salleRepository;
    private final EnseignantRepository enseignantRepository;
    private final CoursRepository coursRepository;
    private final ResponsableDeFormationRepository responsableDeFormationRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public Page<Profil> getProfils(Pageable pageable) {
        return profilRepository.findAll(pageable);
    }

    @Override
    public Profil enregistrerProfil(Profil profil) {
        return profilRepository.save(profil);
    }

    @Override
    public Boolean supprimerProfil(Long id) {
        try {
            profilRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Profil> getListeProfils() {
        return profilRepository.findAll();
    }

    @Override
    public List<Personne> getListePersonnes() {
        return personneRepository.findAll();
    }

    @Override
    public User enregistrerUtilisateur(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        return userRepository.save(user);
    }

    @Override
    public List<User> getUtlisateurs() {
        return userRepository.findAll();
    }

    @Override
    public Boolean supprimerUtilisateur(Long id) {
        try {
            userRepository.deleteById(id.intValue());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Salle enregistrerSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public List<Salle> getSalles() {
        return salleRepository.findAll();
    }

    @Override
    public Boolean supprimerSalle(Long id) {
        try {
            salleRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Enseignant enregistrerEnseignant(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

    @Override
    public List<Enseignant> getEnseignants() {
        return enseignantRepository.findAll();
    }

    @Override
    public Boolean supprimerEnseignant(Long id) {
        try {
            enseignantRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Cours enregistrerCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public List<Cours> getCourses() {
        return coursRepository.findAll();
    }

    @Override
    public Boolean supprimerCours(Long id) {
        try {
            coursRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ResponsableDeFormation enregistrerResponsable(ResponsableDeFormation responsable) {
        return responsableDeFormationRepository.save(responsable);
    }

    @Override
    public List<ResponsableDeFormation> getResponsables() {
        return responsableDeFormationRepository.findAll();
    }

    @Override
    public Boolean supprimerResponsable(Long id) {
        try {
            responsableDeFormationRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
