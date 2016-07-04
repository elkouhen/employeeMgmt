package com.softeam.employees.configuration;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by elkouhen on 05/06/16.
 */
@Configuration
public class FlywayConfig {

    @Autowired
    private DataSource dataSource;

    @Bean(initMethod = "migrate")
    Flyway flyway() {

        Flyway flyway = new Flyway();

        flyway.setDataSource(dataSource);
        flyway.setBaselineOnMigrate(true);

        return  flyway;
    }
}
