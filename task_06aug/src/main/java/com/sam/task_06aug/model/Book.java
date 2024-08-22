package com.sam.task_06aug.model;

import java.util.List;

public class Book {
    private int bookId;
    private String title;
    private String genre;
    private String language;
    private List<Author> authors;
    
    // Default constructor
    public Book() {
    	
    }
    
    public Book(int bookId, String title, String genre, String language, List<Author> authors) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.genre = genre;
		this.language = language;
		this.authors = authors;
	}
	//getter and setter
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}


    
}
