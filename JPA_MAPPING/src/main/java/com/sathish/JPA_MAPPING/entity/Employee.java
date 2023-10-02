package com.sathish.JPA_MAPPING.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Employee {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String name;
	private String email;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "Accoint_Id")
	private Account account; //  HAS_A
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int eid, String name, String email, Account account) {
		super();
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", account=" + account + "]";
	}
	
}
