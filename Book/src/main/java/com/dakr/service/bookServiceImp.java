package com.dakr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.entity.Book;
import com.dakr.repository.BookRepository;

@Service
public class bookServiceImp implements bookService
{
	@Autowired
	private BookRepository bookrepo;

	@Override
	public Book insertD(Book book) {
		
		return bookrepo.save(book);
	}

	@Override
	public Optional<Book> retrived(Integer bcode) {
				return bookrepo.findById(bcode);
	}
	@Override
	public List<Book> getAllBooks() {
		
		return bookrepo.findAll();
	}

	@Override
	public Book update(Book books) {
		
		return bookrepo.save(books);
	}

	@Override
	public String deleteD(Integer bcode) {
		String temp="";
		if(bookrepo.findById(bcode).isPresent())
		{
			bookrepo.deleteById(bcode);
			temp="Data Deleted successfully...";
		}
		else
		{
			temp="Delete Operation Fail...";
		}
		return temp;
		
	}

	

	
}