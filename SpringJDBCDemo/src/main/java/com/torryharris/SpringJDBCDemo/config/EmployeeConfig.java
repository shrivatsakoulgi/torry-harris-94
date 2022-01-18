package com.torryharris.SpringJDBCDemo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.torryharris.SpringJDBCDemo"})
public class EmployeeConfig {

	private String driver="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/company";
	private String userName="root";
	private String password="root";
	
	@Bean
	DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		return dataSource;
	}
}
