package com.fireduptech.spring.rest.hero.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;

import com.fireduptech.spring.rest.hero.service.AthleteAccountService;
import com.fireduptech.spring.rest.hero.domain.AthleteAccount;


/**
 *  - DEVELOPMENT NOTES -
 * Example use from command line - when on development database
 *
 * curl -GET 'localhost:8080/athleteAccount?acAction=view&athleteAccountId=35'
 * curl -GET 'localhost:8080/athleteAccount?acAction=viewByJpa&athleteFirstName=RichardXXX'
 * curl -GET 'localhost:8080/athleteAccount?acAction=viewByIdJpa&athleteAccountIdJpa=35'
 */


@Controller
@RequestMapping( value = "/athleteAccount" )
public class AthleteAccountController {

    @Autowired
    private AthleteAccountService athleteAccountService;


    @RequestMapping( params = "acAction=view", method = RequestMethod.GET )
    public ResponseEntity<AthleteAccount> viewAthleteAccount( @RequestParam( value = "athleteAccountId") int aaId ) {

        return new ResponseEntity<AthleteAccount>( athleteAccountService.getAthleteAccount( aaId ), HttpStatus.OK );
    }


    // JPA Retrieval
    @RequestMapping( params = "acAction=viewByJpa", method = RequestMethod.GET )
    public ResponseEntity<AthleteAccount> viewAthleteAccountByJpa( @RequestParam( value = "athleteFirstName") String firstName ) {

        return new ResponseEntity<AthleteAccount>( athleteAccountService.findByFirstName( firstName ), HttpStatus.OK );
    }


    // JPA Retrieval
    @RequestMapping( params = "acAction=viewByIdJpa", method = RequestMethod.GET )
    public ResponseEntity<AthleteAccount> viewAthleteAccountByIdJpa( @RequestParam( value = "athleteAccountIdJpa") int aaIdJpa ) {

        return new ResponseEntity<AthleteAccount>( athleteAccountService.findById( aaIdJpa ), HttpStatus.OK );
    }

}
