package com.jersey.JerseyApi;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    public static final EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("myPU");
}