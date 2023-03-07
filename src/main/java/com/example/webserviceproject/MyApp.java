package com.example.webserviceproject;

import jakarta.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

public class MyApp extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public MyApp() {
        singletons.add(new PersonServiceImpl());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}