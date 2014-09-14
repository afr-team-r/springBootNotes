package com.rfa.todo.dao;

import java.util.List;
import com.rfa.todo.model.Note;

public interface NoteDAO {
	public boolean saveNote(Note note);
	public List<Note> getNotes();
}
