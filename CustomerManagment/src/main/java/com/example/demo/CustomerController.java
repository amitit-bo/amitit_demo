package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("/hello")
	public String m1()
	{
		return  "abc";
		
	}
	
	
	
	
	
}
