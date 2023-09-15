package com.jsp.person.account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nish");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("Nish");
		person.setEmail("n@mail.com");
		
		Account account1 = new Account();
		account1.setAcc_no(54313357);
		account1.setBank_name("HDFC");
		account1.setIfsc_code("HDFC0000575");
		
		Account account2 = new Account();
		account2.setAcc_no(24733357);
		account2.setBank_name("AXIS");
		account2.setIfsc_code("AXIX000075");
		
		account1.setPerson(person);
		account2.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(account1);
		entityManager.persist(account2);
		entityTransaction.commit();
	}
}
