package com.credit_card.Credit.Card.Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private long accountNumber;
	
	private String accountHolder;
	private String accountType;
	
	private String balance;

	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name = "card_number")
	private CreditCard creditCard;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accountHolder, String accountType, String balance, User user, CreditCard creditCard) {
		this.accountHolder = accountHolder;
		this.accountType = accountType;
		this.balance = balance;
		this.user = user;
		this.creditCard = creditCard;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	
	
	
	
}
