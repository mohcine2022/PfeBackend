package com.mohcine.pfe.dao;

import com.mohcine.pfe.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note,Long> {
}
