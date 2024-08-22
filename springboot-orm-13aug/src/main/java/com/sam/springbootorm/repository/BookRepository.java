package com.sam.springbootorm.repository;

import org.springframework.data.repository.CrudRepository;

import com.sam.springbootorm.entity.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {

	List<Book> findByTitle(String title);
	
	
}




