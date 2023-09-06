package com.credit_card.Credit.Card.Management.Model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;

	private String username;
	private String password;
	private String email;
	@Column(length = 1000)
	private String address;
	private String phoneNumber;

	
	
//	Creating the mapping b/w user and creditCard 
//	assuming one user can have many cards
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private Set<CreditCard> creditCards;
	
	@ManyToOne
	@JoinColumn(name = "bank_id")
	private Bank bank;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Account> accounts;
	
	

	public User() {
		
	}
	
	
	public User(String username, String password, String email, String address, String phoneNumber,
			Set<CreditCard> creditCards, Bank bank, List<Account> accounts) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.creditCards = creditCards;
		this.bank = bank;
		this.accounts = accounts;
	}


	public long getUserId() {
		return userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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


	public Set<CreditCard> getCreditCard() {
		return creditCards;
	}


	public void setCreditCard(Set<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}


	public Bank getBank() {
		return bank;
	}


	public void setBank(Bank bank) {
		this.bank = bank;
	}


	public Set<CreditCard> getCreditCards() {
		return creditCards;
	}


	public void setCreditCards(Set<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}


	public List<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
