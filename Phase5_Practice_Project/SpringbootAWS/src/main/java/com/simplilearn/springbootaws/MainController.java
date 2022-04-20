package com.simplilearn.springbootaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/hello")
	public String welcome() {
		return "Welcome to AWS Cloud.";
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "Good Morning.....!!!";
	}
}
