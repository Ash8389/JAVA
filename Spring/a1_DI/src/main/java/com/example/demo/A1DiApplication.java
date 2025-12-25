package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class A1DiApplication {

	public static void main(String[] args) {
		ApplicationContext factory =  SpringApplication.run(A1DiApplication.class, args);
		
		Student stud = factory.getBean(Student.class);
		stud.study();
		
	}

}
