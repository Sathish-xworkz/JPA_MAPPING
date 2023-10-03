package com.sathish.ManyToMany;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student_info")
public class Student {
	@Id
	private int sid;
	private String s_name;
	private String std;

	@ManyToMany
	@JoinTable(name = "studentBook", joinColumns = @JoinColumn(name = "sidFk"), inverseJoinColumns = @JoinColumn(name = "biFK"))
	private Set<Book> books;

	public Student(int sid, String s_name, String std, Set<Book> books) {
		super();
		this.sid = sid;
		this.s_name = s_name;
		this.std = std;
		this.books = books;
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

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", s_name=" + s_name + ", std=" + std + ", books=" + books + "]";
	}

}
