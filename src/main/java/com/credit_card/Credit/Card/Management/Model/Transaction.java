package com.credit_card.Credit.Card.Management.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue
	private long transactionId;
	
	private String date;
	
	@Column(length = 2000)
	private String description;
	
	private int amount;

	@ManyToOne
	@JoinColumn(name="card_number")
	private CreditCard creditCard;
	
	
	
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(String date, String description, int amount, CreditCard creditCard) {
		this.date = date;
		this.description = description;
		this.amount = amount;
		this.creditCard = creditCard;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	
	
}
