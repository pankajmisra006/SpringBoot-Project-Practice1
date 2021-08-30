package com.practice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.demo.model.Employee;

@SpringBootApplication
public class PracticeBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext obj=SpringApplication.run(PracticeBootApplication.class, args);
		System.out.println("Welcome to SpringBoot babe!");

		String s=new String("pankaj");
		String k=new String("pankaj");
		if(s==k)
		System.out.println("yes");
		
	
		
//		Employee emp=obj.getBean(Employee.class);
//		emp.show();
		//we can also create object like this using scope singleton or prototype
        
	}

}
