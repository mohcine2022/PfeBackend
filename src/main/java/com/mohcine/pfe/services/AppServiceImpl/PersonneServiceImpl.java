package com.mohcine.pfe.services.AppServiceImpl;

import com.mohcine.pfe.dao.PersonneRepository;
import com.mohcine.pfe.model.Personne;
import com.mohcine.pfe.services.AppService.PersonneService;
import org.springframework.stereotype.Service;

@Service
public class PersonneServiceImpl implements PersonneService {
    private final PersonneRepository personneRepository;

    public PersonneServiceImpl(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }
    @Override
    public Personne creerPersonne(Personne personne) {
        return personneRepository.save(personne);
    }
}
