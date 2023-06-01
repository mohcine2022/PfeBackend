package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Note;
import com.mohcine.pfe.model.ResponsableDeFormation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note,Long> {
    interface ResponsableDeFormationRepository extends JpaRepository<ResponsableDeFormation,Long> {
    }
}
