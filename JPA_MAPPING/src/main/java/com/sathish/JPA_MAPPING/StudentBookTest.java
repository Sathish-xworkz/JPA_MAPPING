package com.sathish.JPA_MAPPING;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sathish.JPA_MAPPING.entity.Book;
import com.sathish.JPA_MAPPING.entity.Student;

public class StudentBookTest {

	public static void main(String[] args) {
		EntityManagerFactory emf=	Persistence.createEntityManagerFactory("empDB");
	     EntityManager em= emf.createEntityManager();
	     
//	     em.getTransaction().begin();
//	     // save book object
//	     Book b1=new Book(100, "java", "sathish");
//	     Book b2=new Book(101, "jPA", "Jaya");
//	     
//	     em.persist(b1);
//	     em.persist(b2);
//	     
//	     // create Student obj HAs_A Book Obj
//	     
//	     Student s1=new Student(1, "Deepti", "12", b1);
//	     Student s2=new Student(123, "Divya", "MTCH", b2);
//	     
//	     em.persist(s1);
//	     em.persist(s2);
//	     
//	     em.getTransaction().commit();
	     
	    Student res= em.find(Student.class, 123);
	    System.out.println(res.getS_name());
	    System.out.println(res.getBook());
	}

}
