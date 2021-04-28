package com.perscholas;

import com.perscholas.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MainRunner {
    public static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();


    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        em.close();

    }
}
