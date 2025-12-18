package com.JpaDemo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        
        
     // ---------- STORING DATA ---------
        tx.begin();
        Employee emp = new Employee();
        emp.setName("AJ");
        Laptop l1 = new Laptop();
        l1.setBrand("Dell");
        l1.setEmployee(emp);
        Laptop l2 = new Laptop();
        l2.setBrand("HP");
        l2.setEmployee(emp);
        emp.getLaptops().add(l1);
        emp.getLaptops().add(l2);
        em.persist(emp);
        tx.commit(); // cascades laptops
        
        
        // ---------- FETCHING DATA --------- //
        Employee e = em.find(Employee.class, emp.getId());
        System.out.println(e.getName());

        
        // LAZY loading
        System.out.println(e.getLaptops().size());
        
        // ---------- JPQL QUERY --------- //
        TypedQuery<Employee> query = em.createQuery(
        "SELECT e FROM Employee e WHERE e.name = :name",
        Employee.class
        );
        
        query.setParameter("name", "AJ");
        
        List<Employee> result = query.getResultList();
        
        em.close();
        emf.close();
    }
}
