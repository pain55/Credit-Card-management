package com.credit_card.Credit.Card.Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {

	@Id
	private long bankId;
	private String bankName;
	private String address;
	private String phoneNumber;
	
	
	
	
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
