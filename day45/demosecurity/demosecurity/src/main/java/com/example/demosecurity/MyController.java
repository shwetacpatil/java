package com.example.demosecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@GetMapping("/")
public String home() {
	String s1="<h1> hello world</h1>";
	String s2="<br><a href=/login>login</a>";
	
	return s1+s2;
	
}
	
}
