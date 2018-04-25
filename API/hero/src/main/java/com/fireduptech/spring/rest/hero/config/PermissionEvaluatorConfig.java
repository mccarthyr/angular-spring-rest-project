package com.fireduptech.spring.rest.hero.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.acls.AclPermissionEvaluator;
import org.springframework.security.acls.jdbc.JdbcMutableAclService;


/*

@Order( 200 )
@Configuration
public class PermissionEvaluatorConfig {

    @Autowired
    @Qualifier( "myAclService" )
    JdbcMutableAclService jdbcMutableAclService;

    @Bean( name = "myPermissionEvaluator")
    public AclPermissionEvaluator aclPermissionEvaluator() {
        AclPermissionEvaluator permissionEvaluator = new AclPermissionEvaluator( jdbcMutableAclService );
        return permissionEvaluator;
    }

}






*/






