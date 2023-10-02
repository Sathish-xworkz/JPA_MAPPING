package com.sathish.JPA_MAPPING.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int sid;
	private String s_name;
	private String std;
	
	@OneToOne
	@JoinColumn(name = "Book_id")
	private Book book;

	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String s_name, String std, Book book) {
		super();
		this.sid = sid;
		this.s_name = s_name;
		this.std = std;
		this.book = book;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", s_name=" + s_name + ", std=" + std + ", book=" + book + "]";
	}
	
}
