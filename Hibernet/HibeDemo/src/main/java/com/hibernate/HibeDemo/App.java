package com.hibernate.HibeDemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.stat.Statistics;

public class App {
    public static void main(String[] args) {
        // Address address = new Address();
        // address.setState("bihar");
        // address.setCity("Patna");
        // address.setPinCode("734001");
        //
        // Student stud = new Student();
        // stud.setName("Rose");
        // stud.setRoll(1);
        // stud.setMarks(101);
        // stud.setEmail("rose@gmail.com");
        // stud.setAddress(address);

        // ---- CREATE SESSION ----
        // ! If we use this then we need to use hibernate.cfg.xml file.
        // . Configuration cfg = new
        // Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);

        // @New, Efficient and modern way
        Configuration cfg = new Configuration();

        // @DB Configuration
        cfg.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/mydb");
        cfg.setProperty("hibernate.connection.username", "root");
        cfg.setProperty("hibernate.connection.password", "8389861365");

        // @Hibernate Configuration
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        cfg.setProperty("hibernate.hbm2ddl.auto", "update");
        cfg.setProperty("hibernate.show_sql", "true");

        // @Second Level Cache
        cfg.setProperty("hibernate.cache.region.factory_class",
                "org.hibernate.cache.jcache.JCacheRegionFactory");
        cfg.setProperty("hibernate.javax.cache.provider",
                "org.ehcache.jsr107.EhcacheCachingProvider");
        cfg.setProperty("hibernate.cache.use_second_level_cache", "true");
        cfg.setProperty("hibernate.cache.use_query_cache", "true");
        cfg.setProperty("hibernate.generate_statistics", "true");

        cfg.addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);

        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        // * STORING DATA*//
        // ---- TRANSIENT STATE ----
        // .Employee emp = new Employee();
        // .emp.setName("AJ");

        // .Laptop l1 = new Laptop();
        // .l1.setBrand("Dell");

        // .Laptop l2 = new Laptop();
        // .l2.setBrand("HP");

        // ---- SET RELATIONSHIP (IMPORTANT) ----
        // .l1.setEmployee(emp);
        // .l2.setEmployee(emp);

        // .emp.getLaptops().add(l1);
        // .emp.getLaptops().add(l2);

        // ---- SAVE ----
        // .session.persist(emp); // cascades laptops automatically

        // ---- DIRTY CHECKING ----
        // .emp.setName("AJ Kumar"); // auto update

        // * FETCHING DATA*//

        // . Employee emp1 = session.find(Employee.class, 1L); // hits DB immediately
        // . System.out.println(emp1);
        // . System.out.println(emp1.getLaptops()); // Again DB hit when laptop object
        // is accessed

        // -----------------------------
        // 2️⃣ First-Level Cache
        // -----------------------------

        // .Employee e1 = session.find(Employee.class, 1L);
        // .Employee e2 = session.find(Employee.class, 1L); // NO DB hit (cache)

        // -----------------------------
        // 4️⃣ LazyInitializationException
        // -----------------------------
        // .session.close();
        // emp.getLaptops().size(); ❌ Exception (session closed)

        // -----------------------------
        // Re-open session
        // -----------------------------
        // .session = sf.openSession();

        // -----------------------------
        // 5️⃣ JOIN FETCH (Solves N+1)
        // -----------------------------

        // .List<Employee> employees =
        // . session.createQuery(
        // . "SELECT e FROM Employee e JOIN FETCH e.laptops",
        // . Employee.class
        // . ).getResultList();

        // -----------------------------
        // 6️⃣ N+1 Problem Example
        // -----------------------------
        // .List<Employee> list =
        // . session.createQuery("FROM Employee", Employee.class)
        // . .getResultList();

        // .for (Employee e : list) {
        // . System.out.println(e.getLaptops().size()); // N queries
        // .}

        // -----------------------------
        // 7️⃣ Pagination
        // -----------------------------
        // .List<Employee> pagedEmployees =
        // . session.createQuery("FROM Employee", Employee.class)
        // . .setFirstResult(0)
        // . .setMaxResults(5)
        // . .getResultList();

        // -----------------------------
        // 8️⃣ DTO Projection
        // -----------------------------
        // . List<Object[]> dtoList = session.createQuery(
        // . "SELECT e.id, e.name FROM Employee e", Object[].class).getResultList();
        tx.commit(); // DATA STORED
        session.close();

        // ---------------------------
        // SECOND LEVEL CACHE
        // ---------------------------

        Statistics stats = sf.getStatistics(); // . For checking if second level cache is working or not
        stats.setStatisticsEnabled(true);

        Session s1 = sf.openSession();
        Employee e1 = s1.find(Employee.class, 1L); // DB hit
        s1.close();

        Session s2 = sf.openSession();
        Employee e2 = s2.find(Employee.class, 1L); // L2 cache hit
        s2.close();

        System.out.println("L2 puts  = " + stats.getSecondLevelCachePutCount());
        System.out.println("L2 hits  = " + stats.getSecondLevelCacheHitCount());
        System.out.println("L2 miss  = " + stats.getSecondLevelCacheMissCount());

        sf.close();
    }
}
