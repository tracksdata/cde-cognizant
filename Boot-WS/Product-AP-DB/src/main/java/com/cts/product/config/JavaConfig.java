package com.cts.product.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
//@ComponentScan(basePackages= {"com.cts.product.service,com.cts.product.dao"})
@ComponentScans(value= {@ComponentScan("com.cts.product.service"),@ComponentScan("com.cts.product.dao")})
@PropertySource("application.properties")
public class JavaConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
    public DriverManagerDataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("driver"));
        dataSource.setUrl(env.getProperty("url"));
        dataSource.setUsername(env.getProperty("user"));
        dataSource.setPassword(env.getProperty("password"));
       // System.out.println("Password "+env.getProperty("password"));
       // JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
       // System.out.println(jdbcTemplate.getMaxRows());

        return dataSource;
    }
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		
		return new JdbcTemplate(mysqlDataSource());

		
	}
	
	

}
