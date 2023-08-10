package com.dakr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="BOOK_TABLE")
public class Book {  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bcode;
	private String bname;
	private String author;
	private Double price;
	private Integer qty;
}
