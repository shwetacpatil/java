package com.example.demosession1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@GetMapping("/main")
	public String gotomain(@RequestParam String uname,Model model) {
		model.addAttribute("uname", uname);
		return "main";
	}
    
	@GetMapping("/movie")
	public String gotomovie(@RequestParam String uname,Model model) {
		model.addAttribute("uname", uname);
		return "movie";
	}
	
	@GetMapping("/sports")
	public String gotosports(@RequestParam String uname,Model model) {
		model.addAttribute("uname", uname);
		return "sports";
	}
}
