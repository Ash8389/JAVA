package com.jersey.JerseyApi;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

public class StudentRepository {
	
	public List<Student> getStudents() {
		
		EntityManager em = JPAUtil.emf.createEntityManager();
		
		try {
			
			TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s", Student.class);
			return query.getResultList();
		}finally{			
			em.close();
		}
		
		
	}
	
	public Student getStudent(int roll) {
		Student s = null;
		
		EntityManager em = JPAUtil.emf.createEntityManager();
		
		s = em.find(Student.class, roll);
		
		em.close();
		
		return s;
	}

	public void addStud(Student s) {
		EntityManager em = JPAUtil.emf.createEntityManager();
		
		EntityTransaction ts = em.getTransaction();
		
		ts.begin();
		
		em.persist(s);
		
		ts.commit();
		
		em.close();
	}

	public boolean delStudent(int roll) {
		
		EntityManager em = JPAUtil.emf.createEntityManager();
		EntityTransaction ts = em.getTransaction();
		
		try {
			ts.begin();
			Student s = em.find(Student.class, roll);
			if(s==null) return false;
			
			em.remove(s);
			
			
			ts.commit();
			
			return true;
		}finally {
			em.close();
		}

	}

	public Student updateStudent(int roll, Student s) {
		
		EntityManager em = JPAUtil.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			Student exist = em.find(Student.class, roll);
			
			if(exist == null) return null;
			
			exist.setName(s.getName());
			
			tx.commit();
			
			return exist;
			
		} finally {
			em.close();
		}
	}
}
