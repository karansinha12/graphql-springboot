package com.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphql.remaining.Book;
import com.graphql.remaining.BookService;

@SpringBootApplication
public class GraphqlApplication implements CommandLineRunner{

	@Autowired
	private BookService bookservice;
	
	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setAuthor("a1");
		b1.setDesc("java");
		b1.setPages(1);
		b1.setPrice(2.3);
		b1.setTitle("java");
		
		Book b2 = new Book();
		b2.setAuthor("a2");
		b2.setDesc("java2");
		b2.setPages(12);
		b2.setPrice(2.23);
		b2.setTitle("java2");
		
		
		bookservice.create(b2);
		bookservice.create(b1);
		
	}
	
	

}
