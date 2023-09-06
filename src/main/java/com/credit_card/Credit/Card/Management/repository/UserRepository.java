package com.credit_card.Credit.Card.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credit_card.Credit.Card.Management.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);
	
}
