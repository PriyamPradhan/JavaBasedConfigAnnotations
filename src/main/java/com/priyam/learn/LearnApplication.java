package com.priyam.learn;

import com.priyam.learn.model.*;
import com.priyam.learn.service.GamesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class LearnApplication {

    public static void main(String[] args) {

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        AppConfig cfg = context.getBean(AppConfig.class);
//        cfg.configure();
//
//        System.out.println("---------------------------");
//
//        Car car = context.getBean(Car.class);
//        car.drive();
//        System.out.println("Object ref is : " + car);
//
//        //same object creation due to scope being singleton
//        Car car1 = context.getBean(Car.class);
//        car1.drive();
//        System.out.println("Object ref is : " + car1);
//
//        System.out.println("---------------------------");
//
//        Bike bike = context.getBean(Bike.class);
//        bike.ride();
//        System.out.println("Object ref is : " + bike);
//
//        //new object created since scope is prototype
//        Bike bike1 = context.getBean(Bike.class);
//        bike1.ride();
//        System.out.println("Object ref is : " + bike1);
//        System.out.println("Maximum speed of bike is : " + bike1.getSpeed());
//
//        System.out.println("---------------------------");
//
//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//
//        Laptop lt = context.getBean(Laptop.class);
//        lt.compile();

        ApplicationContext context1 = SpringApplication.run(LearnApplication.class);
        GamesService gs = context1.getBean(GamesService.class);

        System.out.println("Which game you want to install ?");
        Scanner sc = new Scanner(System.in);
        String saveName = sc.nextLine();


        Games games = context1.getBean(Games.class);
        gs.addGame(games, saveName);
//        games.play(saveName);
    }

}
