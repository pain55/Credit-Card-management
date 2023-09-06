package com.credit_card.Credit.Card.Management.Model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
	private Set<CreditCard> creditCard;
	
	

	public User() {
		
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
		return creditCard;
	}


	public void setCreditCard(Set<CreditCard> creditCard) {
		this.creditCard = creditCard;
	}
}
