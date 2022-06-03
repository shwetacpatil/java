package com.example.demologin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MyController {
@Autowired
UsersRepository userrepo;

@PostMapping("/registeruser")
public String registerUser1(@ModelAttribute Users user) {
	userrepo.save(user);
	return "index";
}

@PostMapping("/check")
public String loginUser(@ModelAttribute Users user) {
	
	String path="valid";
	
	List<Users> list1=userrepo.findAll();
	
	String uname=user.getUname();
	String pass=user.getPassword();
	for(Users ob:list1) {
		if(ob.getUname().equals(uname) && ob.getPassword().equals(pass)) {
			path="result";
			break;
		}
		
	}
	
	return path;
}

@GetMapping("/newuser")
public String goToRegister() {

	return "register";
}


}
