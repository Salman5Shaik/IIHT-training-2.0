package com.author.model;

import java.util.List;



public class Author {
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private Integer id;
	
	private String userName;
	
	private String password;
	
	private List<Book> books;
	

	public Author(Integer id, String userName, String password, List<Book> books) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.books = books;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	

}
