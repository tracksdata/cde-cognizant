package com.bank.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;

@Service(value="txrService")
public class TxrServiceImpl implements TxrService {

	private static Logger logger = Logger.getLogger("bank");

	private AccountRepository accountRepository;

	@Autowired
	public TxrServiceImpl(AccountRepository accountRepository) {
		logger.info("TxrService instance created..");
		this.accountRepository = accountRepository;
	}

	@Transactional
	public void transfer(double amount, String fromAccNum, String toAccNum) {

		logger.info("Txr initiated..");

		// ..
		// load accounts
		Account fromAccount = accountRepository.loadAccount(fromAccNum);
		Account toAccount = accountRepository.loadAccount(toAccNum);

		// debit & credit
		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		// update accounts

//		System.out.println(fromAccount);
//		System.out.println(toAccount);

		accountRepository.updateAccount(fromAccount);
		accountRepository.updateAccount(toAccount);

		logger.info("Txr finished..");

	}

}
