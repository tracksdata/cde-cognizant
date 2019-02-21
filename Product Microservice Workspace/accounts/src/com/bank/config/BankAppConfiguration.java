package com.bank.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//@Configuration
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.bank.config", "com.bank.web", "com.bank.service", "com.bank.repository" })
@SpringBootApplication(scanBasePackages={"com.bank.config", "com.bank.web", "com.bank.service", "com.bank.repository" })
@EntityScan(basePackages = { "com.bank.model" })
@EnableTransactionManagement
public class BankAppConfiguration {
	

}


