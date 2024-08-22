package com.sam.springbootorm.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sam.springbootorm.entity.Book;
import com.sam.springbootorm.repository.BookRepository;


@Service
@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	//add a book
	
	@PostMapping("/books")
	public ResponseEntity<Book> createBook(@RequestBody Book book) {
		
		try {
		Book bookSaved= bookRepository.save(book);
		return new ResponseEntity<>(bookSaved, HttpStatus.CREATED);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//get all books
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks(@RequestParam(required=false) String title){
		
		try {
		List<Book> books = new ArrayList<Book>();
		
		if(title==null)
			bookRepository.findAll().forEach(books::add);
		else
			bookRepository.findByTitle(title).forEach(books::add);
		
		if(books.isEmpty()) {
			
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(books, HttpStatus.OK);
		
	} 
		catch (Exception e) {
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}

	
	}
}