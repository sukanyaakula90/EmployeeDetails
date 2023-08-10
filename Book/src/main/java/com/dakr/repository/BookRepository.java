package com.dakr.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>
{

}
