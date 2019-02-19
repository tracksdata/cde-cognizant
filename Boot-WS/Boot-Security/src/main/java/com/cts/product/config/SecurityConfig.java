package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
	//	http.authorizeRequests().antMatchers("/css/**","/index").permitAll();
		http.csrf().disable().authorizeRequests().antMatchers("/api/user/**").hasAnyRole("admin","client").and().httpBasic();
		http.csrf().disable().authorizeRequests().antMatchers("/api/admin/**").hasAnyRole("admin").and().httpBasic();

		//super.configure(http);
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//auth.
		auth.inMemoryAuthentication().withUser("spr").password(encoder().encode("123")).roles("client");
		auth.inMemoryAuthentication().withUser("abc").password(encoder().encode("xyz")).roles("admin");

		//super.configure(auth);
	}
	
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	
}
