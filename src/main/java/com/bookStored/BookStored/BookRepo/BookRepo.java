package com.bookStored.BookStored.BookRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStored.BookStored.bookentity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer>
{
	
}



