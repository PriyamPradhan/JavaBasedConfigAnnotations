package com.priyam.learn.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike {

    @Value("200")                   //setting value here
    private int maxSpeed;

    public void ride(){

        System.out.println("Riding Daytona...!!");
    }

    public int getSpeed() {
        return maxSpeed;
    }

    public void setSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
