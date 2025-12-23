package com.jersey.JerseyApi;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository1 {
	List<Student> studs;
	
	public StudentRepository1() {
		studs = new ArrayList<Student>();
		
		Student stud1 = new Student();
		stud1.setName("Rose");
		stud1.setRoll(01);
		
		Student stud2 = new Student();
		stud2.setName("Ashish");
		stud2.setRoll(02);
		
		studs.add(stud1);
		studs.add(stud2);
	}
	
	public List<Student> getStudents() {
		System.out.println("Get Students Called..");
		return studs;
	}
	
	public Student getStudent(int roll) {
		Student s = null;
		
		for(Student x: studs) {
			if(x.getRoll() == roll) {
				s = x;
				break;
			}
		}
		
		return s;
	}

	public void addStud(Student s) {
		
		studs.add(s);
	}
	
}
