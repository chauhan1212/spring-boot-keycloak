package com.vijay.springbootkeycloak.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class HelloWorldController {

	@GetMapping({ "/test/all" })
	public String firstPage() {
		return "Hello World";
	}
	
	@GetMapping({ "/test/admin" })
	public String firstAdmin() {
		return "Hello Admin";
	}
	
	@GetMapping({ "/test/mod" })
	public String firstModerator() {
		return "Hello Moderator";
	}
	
	@GetMapping({ "/test/user" })
	public String firstUser() {
		return "Hello User";
	}
}
