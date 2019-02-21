package com.bank.repository;

import com.bank.model.Account;

public interface AccountRepository {

	Account loadAccount(String num);

	void updateAccount(Account account);

}