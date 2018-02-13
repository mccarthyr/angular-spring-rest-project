package com.fireduptech.spring.rest.hero;

/*
*** NOTE ***
CURRENTLY NOT USING THIS CLASS AS UTILISING THE INHERITANCE AVAILABLE THROUGH
SETTING MULTIPLE PROFILE SPECIFIC APPLICATION PROPERTY FILES.
ALSO THE JPA AUTO-CONFIGURATION DEFAULTS ARE SUFFICIENT FOR NOW SO @BEAN
"LocalContainerEntityManagerFactoryBean" DEFINED BELOW IS BEEN KEPT FOR
CODE CONFIGURATION REFERENCE PURPOSES...


import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@Profile( "production" )
@PropertySource( "classpath:/META-INF/config/database.properties" )
@EnableTransactionManagement
@EnableJpaRepositories( basePackages = "com.fireduptech.spring.rest.hero.repository")
public class DatabaseConfig {





    @Autowired
    private Environment env;


    @Bean( destroyMethod = "close")
    public DataSource dataSource() {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName( env.getProperty( "database.driverClassName" ) );
        dataSource.setUrl( env.getProperty( "database.url" ) );
        dataSource.setUsername( env.getProperty( "database.username" ) );
        dataSource.setPassword( env.getProperty( "database.password" ) );

        return dataSource;
    }



    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory( DataSource dataSource ) {

        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource( dataSource );
        entityManagerFactory.setPackagesToScan( "com.fireduptech.spring.rest.hero" );
        entityManagerFactory.setJpaVendorAdapter( new HibernateJpaVendorAdapter() );

        Properties props = new Properties();
        props.put( "hibernate.show_sql", "true" );
        props.put( "hibernate.id.new_generate_mappings", "false" );

        entityManagerFactory.setJpaProperties( props );
        return entityManagerFactory;
    }

    @Bean( name = "transactionManager" )
    public PlatformTransactionManager platformTransactionManager( EntityManagerFactory entityManagerFactory ) {

        return new JpaTransactionManager( entityManagerFactory );
    }

}

*/