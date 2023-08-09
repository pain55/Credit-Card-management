package com.credit_card.Credit.Card.Management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class HomeController {
	
	@GetMapping("/")
	public String getHomePage() {
		return "home";
	}
}
