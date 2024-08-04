package com.priyam.learn.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class GameRepository {

    public void save(){

        System.out.println("Game added to DB.");
    }
}
