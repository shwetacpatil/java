package com.example.demoonlineshop;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/index2")
	public String gotomain(@RequestParam String uname,Model model) {
		model.addAttribute("uname", uname);
		return "index2";
	}
	@GetMapping("/cart")
	public String gotomovie(@RequestParam String uname,Model model) {
		model.addAttribute("uname", uname);
		return "cart";
	}
	
		

}
