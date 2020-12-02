package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorld {

	@GetMapping
	public String home() {
		return "Essa semana o foco é a comunicação";
	}
	
}
