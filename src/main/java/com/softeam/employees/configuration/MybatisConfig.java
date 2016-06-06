package com.softeam.employees.configuration;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by elkouhen on 05/06/16.
 */
@Configuration
public class MybatisConfig {

	@Value("${spring.database.driverClassName}")
	String driver;

	@Value("${spring.datasource.url}")
	String datasource;

	@Value("${spring.datasource.username}")
	String username;

	@Value("${spring.datasource.password}")
	String password;

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() {
		final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

		sqlSessionFactoryBean.setDataSource(datasource());
		return sqlSessionFactoryBean;
	}

	@Bean
	public DataSource datasource() {

		final DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

		driverManagerDataSource.setDriverClassName(driver);
		driverManagerDataSource.setUrl(datasource);
		driverManagerDataSource.setUsername(username);
		driverManagerDataSource.setPassword(password);

		return driverManagerDataSource;
	}

}
