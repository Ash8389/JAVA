package com.hibernate.HibeDemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//    	Address address = new Address();
//    	address.setState("bihar");
//    	address.setCity("Patna");
//    	address.setPinCode("734001");
//    	
//        Student stud = new Student();
//        stud.setName("Rose");
//        stud.setRoll(1);
//        stud.setMarks(101);
//        stud.setEmail("rose@gmail.com");
//        stud.setAddress(address);
    	
    	Laptop lap1 = new Laptop();
    	lap1.setId(1001);
    	lap1.setName("Asus");
    	
    	Laptop lap2 = new Laptop();
    	lap2.setId(1002);
    	lap2.setName("Mac");
    	
    	Employee emp = new Employee();
    	emp.setId(01);
    	emp.setName("Rose");
    	emp.getLap().add(lap1);
    	emp.getLap().add(lap2);
    	
    	lap1.setEmp(emp);
    	lap2.setEmp(emp);
    	
        
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.persist(emp);
//        session.persist(lap1);
//        session.persist(lap2);
//        stud = session.find(Student.class, 1);
//        System.out.println(stud);
        
        tx.commit();
    }
}
