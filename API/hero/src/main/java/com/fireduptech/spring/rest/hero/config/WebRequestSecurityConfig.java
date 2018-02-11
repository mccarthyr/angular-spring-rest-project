package com.fireduptech.spring.rest.hero.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import com.fireduptech.spring.rest.hero.security.MyRestAuthenticationEntryPoint;
import com.fireduptech.spring.rest.hero.security.MyAuthenticationSuccessHandler;
import com.fireduptech.spring.rest.hero.security.MyAuthenticationFailureHandler;
import com.fireduptech.spring.rest.hero.security.MyLogoutSuccessHandler;


@Configuration
@EnableWebSecurity
public class WebRequestSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    MyRestAuthenticationEntryPoint myRestAuthenticationEntryPoint;

    @Autowired
    MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;

    @Autowired
    MyAuthenticationFailureHandler myAuthenticationFailureHandler;

    @Autowired
    MyLogoutSuccessHandler myLogoutSuccessHandler;

/*
  WORKING CONFIG THAT WILL RETURN A LOGIN PAGE - @EnableWebSecurity turn on also
 */

    @Override
    protected void configure( HttpSecurity http ) throws Exception {

        http.csrf().disable().authorizeRequests()
                .anyRequest().authenticated()
                .and().formLogin().permitAll()
                .and().formLogin().successHandler( myAuthenticationSuccessHandler )
                .and().formLogin().failureHandler( myAuthenticationFailureHandler )
                .and().logout().logoutSuccessHandler( myLogoutSuccessHandler )
                .and().logout().deleteCookies( "JSESSIONID" )
                .and().exceptionHandling().authenticationEntryPoint( myRestAuthenticationEntryPoint );

    }

//

/*
USE THIS TO BUILD IN-MEMORY AUTHENTICATION MANAGER BUILDER FOR INTIALY USERS AND ROLES UNTIL GET REST OF CONFIG WORKING
    http://www.baeldung.com/securing-a-restful-web-service-with-spring-security
*/


// *** ?????? THIS LINE STOPS THE LOGIN WORKING ???
// .and().exceptionHandling().authenticationEntryPoint( myRestAuthenticationEntryPoint );


    /*
                    .antMatchers("/").permitAll()
                .anyRequest().authenticated()

                    .and().formLogin().loginPage( "/login" )
                .and().formLogin().successHandler( myAuthenticationSuccessHandler )
                .and().formLogin().failureHandler( myAuthenticationFailureHandler )
                .and().logout().logoutSuccessHandler( myLogoutSuccessHandler )
                .and().logout().deleteCookies( "JSESSIONID" )

                .and().exceptionHandling().authenticationEntryPoint( myRestAuthenticationEntryPoint );
     */


/*
<intercept-url pattern="/api/athleteAccount/*" access="hasAnyRole('ROLE_ATHLETE', 'ROLE_ADMIN')" />
<intercept-url pattern="/api/*" access="hasAnyRole('ROLE_ATHLETE', 'ROLE_ADMIN')" />
 */

}
