package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bank.config.BankAppConfiguration;
import com.bank.config.CustomConfigProperties;
import com.bank.service.TxrService;

public class App {

	public static void main(String[] args) {

		// --------------------------------------
		// init / boot
		// --------------------------------------

		System.out.println("=====================");

		SpringApplication.run(BankAppConfiguration.class, args);

		System.out.println("=====================");

	}
}
