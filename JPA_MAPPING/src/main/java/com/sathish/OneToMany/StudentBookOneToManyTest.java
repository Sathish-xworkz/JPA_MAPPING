//package com.sathish.OneToMany;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class StudentBookOneToManyTest {
//
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empDB");
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		// first create books
//		Book b1 = new Book(100, "DS", "Sathish");
//		Book b2 = new Book(200, "Spring", "Divya");
//		Book b3 = new Book(300, "JPA", "Jaya");
//		// save to db
//		em.persist(b1);
//		em.persist(b2);
//		em.persist(b3);
//
//		// to store books to one collection
//		Set<Book> books = new HashSet<>();
//		books.add(b1);
//		books.add(b2);
//		Student s1 = new Student(900, "Arun", "12", books);
//		em.persist(s1);
//
//		em.getTransaction().commit();
//	}
//
//}
