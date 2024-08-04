package com.priyam.learn.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car {

    @Autowired
    private Ferrari ferrari;

    public void drive(){

        System.out.println("Driving!!");
        ferrari.zoom();
    }




    public Ferrari getFerrari() {
        return ferrari;
    }

    public void setFerrari(Ferrari ferrari) {
        this.ferrari = ferrari;
    }
}
