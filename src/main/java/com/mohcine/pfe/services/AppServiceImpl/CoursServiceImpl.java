package com.mohcine.pfe.services.AppServiceImpl;

import com.mohcine.pfe.dao.CoursRepository;
import com.mohcine.pfe.model.Cours;
import com.mohcine.pfe.services.AppService.CoursService;
import org.springframework.stereotype.Service;

@Service
public class CoursServiceImpl implements CoursService {
    private final CoursRepository coursRepository;

    public CoursServiceImpl(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }
    @Override
    public Cours creerCours(Cours cours) {
        return coursRepository.save(cours);
    }
}
