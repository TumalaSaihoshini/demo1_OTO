package com.lti.springdemo.demo5jpabasics;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		Address a1 = new Address(111111L,"Pune","Maharashtra","India");
		Employee e1 = new Employee(101L,"Tina",1000000,a1);
		Address a2 = new Address(222222L,"mumbai","Maharashtra","India");
		Employee e2 = new Employee(102L,"Thane",2000000,a2);
		Address a3 = new Address(333333L,"delhi","delhi","India");
		Employee e3 = new Employee(103L,"gujarat",3000000,a3);
		/*em.getTransaction().begin();
		em.persist(e1);
		em.getTransaction().commit();
		*/
		em.getTransaction().begin();
		em.remove(e1);
		em.getTransaction().commit();
		
		
		
	}
}
