package com.fireduptech.spring.rest.hero.config;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

import org.springframework.core.annotation.Order;

import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;


/* ****** NOTE NOTE NOTE ******
 * If @Order (1000) , with value NOT of 100 so set it to 1000 is not set then get an error:
 * " Caused by: java.lang.IllegalStateException: @Order on WebSecurityConfigurers must be unique.
 * Order of 100 was already used on com.fireduptech.spring.rest.hero.config.UserAuthenticationConfig$$EnhancerBySpringCGLIB$$b07a70d3@63b022a0"
 */
/*
LOOK INTO THIS ERROR WHEN SHUTTING DOWN TOMCAT - THIS IS NOT URGENT AS NOT STOPPING FUNCTIONALITY:
        Failed to unregister the JMX name: org.apache.commons.dbcp2:name=dataSource,type=BasicDataSource

        javax.management.InstanceNotFoundException: org.apache.commons.dbcp2:name=dataSource,type=BasicDataSource
*/


@Order( 1000 )
@Configuration
@PropertySource( "classpath:/application-development.properties" )
public class UserAuthenticationConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure( final AuthenticationManagerBuilder authenticationManagerBuilder ) throws Exception {
        authenticationManagerBuilder.authenticationProvider( authenticationProvider() );
    }


    @Bean
    public JdbcDaoImpl jdbcDao() {

        JdbcDaoImpl jdbcDao = new JdbcDaoImpl();
        jdbcDao.setDataSource( dataSource() );
        return jdbcDao;
    }


    @Bean
    public DaoAuthenticationProvider authenticationProvider() {

        final DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService( jdbcDao() );
        authenticationProvider.setPasswordEncoder( encoder() );
        return authenticationProvider;
    }


    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder( 11 );
    }

    @Value( "${spring.datasource.driver-class-name}" )
    private String driverClass;

    @Value( "${spring.datasource.url}" )
    private String url;

    @Value( "${spring.datasource.username}" )
    private String username;

    @Value( "${spring.datasource.password}" )
    private String password;

    @Bean( )
    public DataSource dataSource() {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName( driverClass );
        dataSource.setUrl( url );
        dataSource.setUsername( username );
        dataSource.setPassword( password );

        return dataSource;
    }




}