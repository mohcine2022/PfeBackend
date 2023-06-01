package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}
