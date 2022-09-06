package com.graphql.remaining;

import java.util.List;

public interface BookService {

	Book create(Book book);
	
	List<Book> getAll();
	
	Book get(int bookId);
}
