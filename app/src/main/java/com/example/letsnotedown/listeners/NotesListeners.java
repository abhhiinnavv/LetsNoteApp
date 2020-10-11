package com.example.letsnotedown.listeners;

import com.example.letsnotedown.entities.Note;

public interface NotesListeners {

    void onNoteClicked(Note note, int position);
}
