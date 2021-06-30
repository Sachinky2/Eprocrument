package com.eproc.eproc.controller;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Registration {

	
	@PostMapping("/api/signup/seller")
	public String signUp() {
	

		return "SignUp for Seller !!";
	}
	@PostMapping("/api/signup/buyer")
	public String SignUp() {
		
		return "SignUp for buyer !!";
	}
}
