package com.rfa.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rfa.todo.dao.NoteDAO;
import com.rfa.todo.model.Note;

@Controller
@RequestMapping("/notes")
public class NoteController {
	
	@Autowired
	private NoteDAO noteDAO;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public List<Note> allNotes() {
		return noteDAO.getNotes();
	}
	
	@RequestMapping(value="/add/{author}/{text}", method=RequestMethod.GET)
	@ResponseBody
	public boolean addNote(@PathVariable String author, @PathVariable String text) {
		return noteDAO.saveNote(new Note(author, text));
	}
	
	public void setNoteDAO(NoteDAO noteDAO) {
		this.noteDAO = noteDAO;
	}
}
