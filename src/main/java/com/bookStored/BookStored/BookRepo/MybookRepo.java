package com.bookStored.BookStored.BookRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookStored.BookStored.bookentity.MyBook;

public interface MybookRepo extends JpaRepository<MyBook,Integer> {

}
