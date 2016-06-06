package com.softeam.employees.configuration;

import com.softeam.employees.mappers.EmployeeMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by elkouhen on 05/06/16.
 */
@Configuration
public class MapperConfig {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Bean
    public MapperFactoryBean employeeMapperFactory() {

        MapperFactoryBean mapperFactoryBean = new MapperFactoryBean();

        mapperFactoryBean.setMapperInterface(EmployeeMapper.class);
        mapperFactoryBean.setSqlSessionFactory(sqlSessionFactory);

        return mapperFactoryBean;
    }
}
