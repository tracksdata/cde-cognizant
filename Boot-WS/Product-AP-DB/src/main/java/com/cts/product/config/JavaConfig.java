package com.cts.product.config;


import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
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
    public DataSource mysqlDataSource() {
       // DriverManagerDataSource dataSource = new DriverManagerDataSource();
		BasicDataSource dataSource=new BasicDataSource();
        dataSource.setDriverClassName(env.getProperty("driver"));
        dataSource.setUrl(env.getProperty("url"));
        dataSource.setUsername(env.getProperty("user"));
        dataSource.setPassword(env.getProperty("password"));

        return dataSource;
    }
	
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);

		
	}
	
	

}
