package com.graphql.remaining;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookrepo;

	@Override
	public Book create(Book book) {
		return bookrepo.save(book);
	}

	@Override
	public List<Book> getAll() {
		return bookrepo.findAll();
	}

	@Override
	public Book get(int bookId) {
		return bookrepo.findById(bookId).orElseThrow(() -> new RuntimeException("book not found"));
	}

}
