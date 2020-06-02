package com.project.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
        EntityManager em=emf.createEntityManager();
        users u=em.find(users.class, 1);
        System.out.println(u);
        
        users u1=new users();
        u1.setId(2);
        u1.setName("Sam");
        u1.setAge(23);
        em.getTransaction().begin();
        em.persist(u1);
        em.getTransaction().commit();
        
        
    }
}
