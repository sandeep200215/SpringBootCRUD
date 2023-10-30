package com.bookStored.BookStored.bookentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Mybook")
public class MyBook {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String author;
  public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public MyBook() {
	super();
	// TODO Auto-generated constructor stub
}
public void setName(String name) {
	this.name = name;
}
public MyBook(Integer id, String name, String author, double price) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.price = price;
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
private double price;
  

}
