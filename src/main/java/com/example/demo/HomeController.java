package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String homeMethod() {
		System.out.println("in the home method");
		return "home.jsp";
	}
	
}
