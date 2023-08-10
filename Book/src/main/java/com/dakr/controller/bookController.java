package com.dakr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.entity.Book;
import com.dakr.service.bookService;

@RestController
public class bookController 
{
	@Autowired
	private bookService bookser;
	
	//insert data in DB
	@PostMapping("/save")
	public Book insertData(@RequestBody Book book)
	{
		return bookser.insertD(book);
	}
	
	//retrieve one row from db
	@GetMapping("/retrive")
	public Optional<Book> getBook(@RequestParam Integer bcode)
	{
		return bookser.retrived(bcode);
	}
	@GetMapping("/getall")
	public List<Book>getAllBooks(){
		return bookser.getAllBooks();
	}
	@PutMapping("/update")
	public Book update(@RequestBody Book book){
		return bookser.update(book);
		}
	@DeleteMapping("/delete")
	public String deleteData(@RequestParam Integer bcode) {
        return bookser.deleteD(bcode);
		
	}
	
	
}
