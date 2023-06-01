package com.bobocode.oop.service;

import java.util.Set;

public interface Flights {
    public boolean register(String flightNumber);
    public Set<String> findAll() ;

    }
