package com.softeam.employees.configuration;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by elkouhen on 05/06/16.
 */
@Configuration
public class MybatisConfig {

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() {
		final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

		sqlSessionFactoryBean.setDataSource(datasource());
		return sqlSessionFactoryBean;
	}

    @Bean
	public DataSource datasource() {

		final DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

		driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
		driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/");
		driverManagerDataSource.setUsername("postgres");
		driverManagerDataSource.setPassword("password");

		return driverManagerDataSource;
	}

}
