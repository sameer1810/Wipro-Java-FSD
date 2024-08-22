package com.sam.springprj_06aug.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sam.springprj_06aug.model.Book;

public class App {

	public static void main( String[] args )
    {
	
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Book book1 = (Book) context.getBean("book1");
        Book book2 = (Book) context.getBean("book2");
        Book book3 = (Book) context.getBean("book3");

        System.out.println(book1.getTitle() + " - " + book1.getAuthors().get(0).getAuthorName());
        System.out.println(book2.getTitle() + " - " + book2.getAuthors().get(0).getAuthorName());
        System.out.println(book3.getTitle() + " - " + book3.getAuthors().get(0).getAuthorName());
    }
}
