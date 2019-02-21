package com.bank.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bank.model.Account;

@Repository
public class JpaAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("bank");

	@PersistenceContext
	private EntityManager em;

	@Autowired
	public JpaAccountRepository() {
		logger.info("JpaAccountRepository instance created...");
	}

	public Account loadAccount(String num) {
		// ..
		logger.info("loading account " + num);
		Account account = em.find(Account.class, num);
		return account;
	}

	public void updateAccount(Account account) {
		logger.info("updating account ");
		em.merge(account);
		// ..
	}

}
