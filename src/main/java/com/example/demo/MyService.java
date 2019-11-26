package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyService {

	@GetMapping("/")
	public String getMessage() {
		return "Hello Welcome";
	}
	
}