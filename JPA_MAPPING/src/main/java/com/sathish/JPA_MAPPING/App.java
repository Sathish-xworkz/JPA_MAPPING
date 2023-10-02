package com.sathish.JPA_MAPPING;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sathish.JPA_MAPPING.entity.Account;
import com.sathish.JPA_MAPPING.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    EntityManagerFactory emf=	Persistence.createEntityManagerFactory("empDB");
     EntityManager em= emf.createEntityManager();
     
     em.getTransaction().begin();
     
     

     Account a1=new Account(10202, "SB", "HDFC");
    
     Employee e1=new Employee(100, "Sathish", "sat@gmail",a1);
     
     em.persist(e1);
     
     em.getTransaction().commit();
     
     
     
     
    }
}
