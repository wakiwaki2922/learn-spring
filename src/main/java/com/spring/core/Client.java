package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {

        //Create the object in manual way
//        Vehicle vehicle = new Bike();
//
//        Traveler traveler = new Traveler(vehicle);
//        traveler.startJourney();

        //Create the object in Spring way
        //Creating Spring IoC Container
        //Read the configuration class
        //Create and manage the Spring Beans
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //Retrieve the bean from Spring IoC Container
        Car car = applicationContext.getBean(Car.class);
        car.move();

        Bike bike = applicationContext.getBean(Bike.class);
        bike.move();

        Bicycle bicycle = applicationContext.getBean(Bicycle.class);
        bicycle.move();

        Traveler traveler1 = applicationContext.getBean(Traveler.class);
        traveler1.startJourney();
    }
}
