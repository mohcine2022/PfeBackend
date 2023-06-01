package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
