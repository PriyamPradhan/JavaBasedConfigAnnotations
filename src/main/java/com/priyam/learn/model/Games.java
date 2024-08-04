package com.priyam.learn.model;

import org.springframework.stereotype.Component;

@Component
public class Games {

    public void play(String name){
        System.out.println("Installing :" + name);
    }
}
