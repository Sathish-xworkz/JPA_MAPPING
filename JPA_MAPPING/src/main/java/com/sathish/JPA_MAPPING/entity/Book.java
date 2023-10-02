package com.sathish.JPA_MAPPING.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	private int b_id;
	private String b_name;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int b_id, String b_name, String author) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.author = author;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [b_id=" + b_id + ", b_name=" + b_name + ", author=" + author + "]";
	}
	
}
