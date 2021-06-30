package com.eproc.eproc.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class LoginController {

	
	@GetMapping("/api")
	public String hello() {
		
		System.out.println("Inside controoler");
		return "Welcome E-proc Backend API !!";
	}
}
