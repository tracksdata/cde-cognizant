package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSecurityApplication.class, args);
		
		String pwd=new BCryptPasswordEncoder().encode("praveen reddy s");
		System.out.println("Password "+pwd);
	}

}
