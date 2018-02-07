package com.fireduptech.spring.rest.hero.config;

/*
*** NOTE ***
CURRENTLY NOT USING THIS CLASS AS UTILISING THE INHERITANCE AVAILABLE THROUGH
SETTING MULTIPLE PROFILE SPECIFIC APPLICATION PROPERTY FILES.


import com.fireduptech.spring.rest.hero.DatabaseConfig;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;


@Configuration
@Profile( {"development", "default"} )
@PropertySource( "classpath:/META-INF/config/dev_database.properties" )
public class DevDatabaseConfig extends DatabaseConfig {

    @Value( "${database.driverClassName}" )
    private String driverClass;

    @Value( "${database.url}2" )
    private String url;

    @Value( "${database.username}" )
    private String username;

    @Value( "${database.password}" )
    private String password;

    @Bean( destroyMethod = "close")
    public DataSource dataSource() {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName( driverClass );
        dataSource.setUrl( url );
        dataSource.setUsername( username );
        dataSource.setPassword( password );

        return dataSource;
    }



}
*/