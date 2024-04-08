package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveler")
public class Traveler {

//    Car car = null;
//    Bike bike = null;
    private Vehicle vehicle;

//    public Traveler(Vehicle vehicle){
////        this.car = new Car();
////        this.bike = new Bike();
//        this.vehicle = vehicle;
//    }

    @Autowired
    public Traveler( Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney() {
//        this.car.move();
//        this.bike.move();
        this.vehicle.move();
    }

}
