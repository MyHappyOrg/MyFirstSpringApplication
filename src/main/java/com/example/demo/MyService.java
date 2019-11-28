package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyService {

	@GetMapping("/v1/util/health")
	public String getMessage() {
		String json = "{status: 'UP',healthInfo: { status: 'UP', appName: 'My First Spring Application' }}";
		return json;
	}
	
}