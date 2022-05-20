package com.example.demoWeb2;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoWeb2Application {

	public static void main(String[] args) {
		ApplicationContext context;
		
		context=SpringApplication.run(DemoWeb2Application.class, args);
	
		StudentDetails st;
		st=context.getBean(StudentDetails.class);
		st.setData();
		st.shoData();
	}

}
