package com.bookStored.BookStored.bookentity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name="Book")
public class Book {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 
	 private   String bookname;
	 
	 private String authorname;
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	private  Integer price;	

}
