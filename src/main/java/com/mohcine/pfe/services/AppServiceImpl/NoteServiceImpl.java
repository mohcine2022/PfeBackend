package com.mohcine.pfe.services.AppServiceImpl;

import com.mohcine.pfe.dao.NoteRepository;
import com.mohcine.pfe.model.Note;
import com.mohcine.pfe.services.AppService.NoteService;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;

    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }
    @Override
    public Note creerNote(Note note) {
        return noteRepository.save(note);
    }
}
