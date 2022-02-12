package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class HomeController {
	
	@GetMapping("/home")
	public String getHome() {
		return "This is home!!!";
	}

}
