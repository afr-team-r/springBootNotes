package com.rfa.todo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rfa.todo.dao.NoteDAO;
import com.rfa.todo.model.Note;

@Repository
public class NoteDAOImpl implements NoteDAO {

	private List<Note> notesDatabase;
	
	public NoteDAOImpl() {
		this.notesDatabase = new ArrayList<Note>();
	}

	@Override
	public boolean saveNote(Note note) {
		return notesDatabase.add(note);
	}

	@Override
	public List<Note> getNotes() {
		return notesDatabase;
	}
}
