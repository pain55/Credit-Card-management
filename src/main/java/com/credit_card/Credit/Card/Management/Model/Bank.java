package com.credit_card.Credit.Card.Management.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bank {

	@Id
	private long bankId;
	private String bankName;
	private String address;
	private String phoneNumber;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bank")
	private List<User> users;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bank")
	private List<CreditCard> creditcards;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Bank(long bankId, String bankName, String address, String phoneNumber, List<User> users,
			List<CreditCard> creditcards) {
		this.bankId = bankId;
		this.bankName = bankName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.users = users;
		this.creditcards = creditcards;
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





	public List<User> getUsers() {
		return users;
	}





	public void setUsers(List<User> users) {
		this.users = users;
	}





	public List<CreditCard> getCreditcards() {
		return creditcards;
	}





	public void setCreditcards(List<CreditCard> creditcards) {
		this.creditcards = creditcards;
	}
	
	
	
}
