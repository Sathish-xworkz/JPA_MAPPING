package com.sathish.JPA_MAPPING.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int acId;
	private String ac_Type;
	private String bankName;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int acId, String ac_Type, String bankName) {
		super();
		this.acId = acId;
		this.ac_Type = ac_Type;
		this.bankName = bankName;
	}
	public int getAcId() {
		return acId;
	}
	public void setAcId(int acId) {
		this.acId = acId;
	}
	public String getAc_Type() {
		return ac_Type;
	}
	public void setAc_Type(String ac_Type) {
		this.ac_Type = ac_Type;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "Account [acId=" + acId + ", ac_Type=" + ac_Type + ", bankName=" + bankName + "]";
	}
	
	
}
