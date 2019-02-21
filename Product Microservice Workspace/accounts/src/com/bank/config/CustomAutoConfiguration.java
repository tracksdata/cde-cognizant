package com.bank.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnClass(name = "com.bank.SomeClass"),
//@ConditionalOnMissingClass(value = "com.bank.SomeClass")
//@ConditionalOnBean(name="txrService")
//@ConditionalOnMissingBean(name="txrService")
//@ConditionalOnProperty(name = "property", prefix = "custom")
public class CustomAutoConfiguration {

	@Autowired
	private CustomConfigProperties properties;

}
