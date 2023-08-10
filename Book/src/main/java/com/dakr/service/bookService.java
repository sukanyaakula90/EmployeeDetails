package com.dakr.service;

import java.util.List;
import java.util.Optional;

import com.dakr.entity.Book;

public interface bookService 
{

	Book insertD(Book book);

	Optional<Book> retrived(Integer bcode);

	

	List<Book> getAllBooks();


	Book update(Book books);

	

	 public String deleteD(Integer bcode);

	




	
}
