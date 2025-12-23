package com.jersey.JerseyApi;


import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {
	
	StudentRepository repo = new StudentRepository();
	
	//Get All Students
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Student> getStudents() {
		
		
		return repo.getStudents();
	}
	
	//Get a specific student with roll
	@GET
	@Path("getStud/{roll}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Student getStudentById(@PathParam("roll") int roll) {
		
		
		return repo.getStudent(roll);
	}
	
	//Add new student
	@Path("add")
	@POST
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Student addStudent(Student s) {
		
		System.out.println(s);
		repo.addStud(s);
		
		return s;
	}
	
	@Path("delete/{roll}")
	@DELETE
	public boolean deleteStudent(@PathParam("roll") int roll) {
		
		boolean res = repo.delStudent(roll);
		
		return res;
	}
	
	@Path("update/{roll}")
	@PUT
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Student updateStudent(@PathParam("roll") int roll, Student s) {
		
		Student res = repo.updateStudent(roll, s);
		
		
		return res;
	}
}
