package com.bank.service;

public interface TxrService {

	void transfer(double amount, String fromAccNum, String toAccNum);

}