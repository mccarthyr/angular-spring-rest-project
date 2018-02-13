package com.fireduptech.spring.rest.hero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//@EnableWebSecurity

import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;

//@EnableWebMvc
@RestController
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//@SpringBootApplication( exclude = WebMvcAutoConfiguration.class)
@SpringBootApplication
public class HeroApplication  {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run( HeroApplication.class, args );

        /*
        new SpringApplication().setWebEnvironment( false );
        ApplicationContext applicationContext = SpringApplication.run( HeroApplication.class, args );
        */



        /*
        for ( String name: applicationContext.getBeanDefinitionNames() ) {
            System.out.println( name );
        }
        */
    }


    @RequestMapping("/")
    String home() {
	    return "Hello World!";
    }



}
