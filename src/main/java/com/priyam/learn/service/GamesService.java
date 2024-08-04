package com.priyam.learn.service;


import com.priyam.learn.model.Games;
import com.priyam.learn.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamesService {

        @Autowired
        private Games games;

        @Autowired
        private GameRepository repo;


        public void addGame(Games games, String name){
                System.out.println(name + " is added to my Collection!");
                games.play(name);
                repo.save();
        }
}
