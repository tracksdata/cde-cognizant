package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BootRestSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRestSecurityApplication.class, args);
		
		
		String pwd=new BCryptPasswordEncoder().encode("Praveen S");
		System.out.println("--> Pwd: "+pwd);
	}

}
