package com.example.demomovieassign;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/main")
	public String gotomain(@RequestParam String uname,HttpSession session) {
		session.setAttribute("fname", uname);
		return "main";
	}
	
	@GetMapping("/movie")
	public String gotomovie(HttpSession session) {
		String n=(String)session.getAttribute("fname");
		System.out.println("name of user");
		return "movie";
	}
	@GetMapping("/sports")
	public String gotosports() {
		return "sports";
	}

}
