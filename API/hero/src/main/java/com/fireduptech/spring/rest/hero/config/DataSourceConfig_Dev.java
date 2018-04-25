package com.fireduptech.spring.rest.hero.config;

/*
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;




@Order( 1 )
@Profile( {"development", "default"} )
@Configuration
@PropertySource( "classpath:/application-development.properties" )
public class DataSourceConfig_Dev {

    //@Value( "${spring.datasource.driver-class-name}" )
    private String driverClass;

    //@Value( "${spring.datasource.url}" )
    private String url;

    //@Value( "${spring.datasource.username}" )
    private String username;

    //@Value( "${spring.datasource.password}" )
    private String password;

    @Bean( name = "dataSource", destroyMethod = "close")
    @Primary
    @ConfigurationProperties( prefix = "spring.datasource")
    public DataSource dataSource() {

        return DataSourceBuilder.create().build();


        //BasicDataSource dataSource = new BasicDataSource();
        //dataSource.setDriverClassName( driverClass );
        //dataSource.setUrl( url );
        //dataSource.setUsername( username );
        //dataSource.setPassword( password );
        //return dataSource;

    }


}
*/