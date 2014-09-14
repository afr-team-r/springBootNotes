package com.rfa.todo.model;

public class Note {

	private static Integer ID;

	private Integer id;
	private String author;
	private String text;

	static {
		Note.ID = 1;
	}

	public Note() {
		this("", "");
	}

	public Note(String author, String text) {
		this.id = ID++;
		this.setAuthor(author);
		this.setText(text);
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public String toString() {
		return String.format("%d: %s ---- %s", this.id, this.getText(),
				this.getAuthor());
	}
}
