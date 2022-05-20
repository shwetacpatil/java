package com.example.demo1;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Demo1Application.class, args);
		CartRepository cart=context.getBean(CartRepository.class);
		
		ItemsRepository items=context.getBean(ItemsRepository.class);
		
		Cart c1= new Cart(1,"abc", null);
		cart.save(c1);
		Items s1=new Items(1,"keyboard",500,c1);
		items.save(s1);
		
	}

}
