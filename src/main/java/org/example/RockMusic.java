package org.example;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class RockMusic implements Music{
    @PostConstruct
    public void rockInit(){
        System.out.println("Initialization of Rock!");
    }
    @PreDestroy
    public void rockDestroy(){
        System.out.println("Rock never die!");
    }

    @Override
    public String getSong() {
        return "I stand alone";
    }
}
