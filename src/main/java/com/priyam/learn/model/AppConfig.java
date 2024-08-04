package com.priyam.learn.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.priyam.learn")
public class AppConfig {

//    @Bean
//    public Car car(@Autowired Ferrari ferrari){
//        Car car = new Car();
//        car.setFerrari(ferrari);
//        return car;
//    }
//
//    @Bean
//    public Ferrari ferrari(){
//        return new Ferrari();
//    }
//
//    @Bean("Daytona")
//    @Scope("prototype")
//    public Bike bike(){
//        return new Bike();
//    }
//
    public void configure(){

        System.out.println("Inside AppConfig!!");
    }
//
//    @Bean
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }


}
