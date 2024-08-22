package com.sam.springprj_06aug.model;

import java.util.List;

import com.sam.springprj_06aug.model.Author;

public class Book {
	    private int bookId;
	    private String title;
	    private String genre;
	    private String language;
	    private List<Author> authors;

	    public Book(int bookId, String title, String genre, String language, List<Author> authors) {
	        this.bookId = bookId;
	        this.title = title;
	        this.genre = genre;
	        this.language = language;
	        this.authors = authors;
	    }

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

		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", title=" + title + ", genre=" + genre + ", language=" + language
					+ ", authors=" + authors + "]";
		}
}
	    
