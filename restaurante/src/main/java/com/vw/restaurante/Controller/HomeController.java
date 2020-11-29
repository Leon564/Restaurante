package com.vw.restaurante.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home/Home";
	}
	
	@GetMapping("/New")
	public String home1() {
		return "home/NewFile";
	}
	
	@GetMapping("/user")
	public String Usuario() {
		return "home/Usuario";
	}
	
}
