package com.app.registration.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Book {
	private String bookname;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	private String Author;
	private String Description;
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book(String bookname, String author, String description, int id) {
		super();
		this.bookname = bookname;
		Author = author;
		Description = description;
		this.id = id;
	}
	public Book() {
		
	}

}
