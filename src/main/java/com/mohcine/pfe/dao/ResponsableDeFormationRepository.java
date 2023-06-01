package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.ResponsableDeFormation;
import org.springframework.data.jpa.repository.JpaRepository;
@RepositoryRestResource
public interface ResponsableDeFormationRepository extends JpaRepository<ResponsableDeFormation,Long> {
}
