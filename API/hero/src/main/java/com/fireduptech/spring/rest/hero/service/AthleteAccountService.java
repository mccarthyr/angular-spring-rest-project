package com.fireduptech.spring.rest.hero.service;

import com.fireduptech.spring.rest.hero.domain.AthleteAccount;

public interface AthleteAccountService {

    AthleteAccount getAthleteAccount( int athleteAccountId );

    // JPA Retrieval
    AthleteAccount findByFirstName( String firstName );

    // JPA Retrieval
    AthleteAccount findById( int id );

}