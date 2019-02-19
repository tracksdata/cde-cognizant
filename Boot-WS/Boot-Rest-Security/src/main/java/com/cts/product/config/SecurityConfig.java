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
		
		//http.csrf().disable().authorizeRequests().antMatchers("/api/user/**").hasAnyRole("admin","user").and().formLogin();
		//http.csrf().disable().authorizeRequests().antMatchers("/api/admin/**").hasAnyRole("admin").and().formLogin();
		
		http.csrf().disable().authorizeRequests().antMatchers("/api/user/**").hasAnyRole("admin","user").and().httpBasic();
		http.csrf().disable().authorizeRequests().antMatchers("/api/admin/**").hasAnyRole("admin").and().httpBasic();
		
	}
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {	
		
		//auth.inMemoryAuthentication().withUser("praveen").password("{noop}abc").roles("user");
		//auth.inMemoryAuthentication().withUser("james").password("{noop}xyz").roles("admin");
		
		auth.inMemoryAuthentication().withUser("praveen").password(encoder().encode("abc")).roles("user");
		auth.inMemoryAuthentication().withUser("james").password(encoder().encode("xyz")).roles("admin");

		
	}
	
	
	@Bean
	public PasswordEncoder encoder() {

		return new BCryptPasswordEncoder();
	}
	
	
	

}
