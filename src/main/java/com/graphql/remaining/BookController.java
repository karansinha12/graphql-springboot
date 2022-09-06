package com.graphql.remaining;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BookController {

	@Autowired
	private BookService bookservice;

	
	@MutationMapping("createBook")
	public Book create(@Argument BookInput book) {
		Book b1 = new Book();
		b1.setAuthor(book.getAuthor());
		b1.setDesc(book.getDesc());
		b1.setPages(book.getPages());
		b1.setPrice(book.getPrice());
		b1.setTitle(book.getTitle());
		return bookservice.create(b1);
	}

	@QueryMapping("allBooks")
	public List<Book> getAll() {
		return bookservice.getAll();
	}

	@QueryMapping("getBook")
	public Book get(@Argument int bookId) {
		return bookservice.get(bookId);
	}
}

class BookInput{
	private String title;
	private String desc;
	private String author;
	private double price;
	private int pages;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
