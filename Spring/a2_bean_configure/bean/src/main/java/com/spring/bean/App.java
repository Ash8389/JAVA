package com.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        
        Student stud1 = (Student)factory.getBean("student");
        stud1.study();
        
        System.out.println(stud1.getAge());
        
//        Student stud2 = (Student)factory.getBean("student");
//        stud2.study();
//        System.out.println(stud2.age);
        
        
    }
}
