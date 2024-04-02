package com.spring.core;

public class Traveler {

//    Car car = null;
//    Bike bike = null;
    private Vehicle vehicle;

    public Traveler(Vehicle vehicle){
//        this.car = new Car();
//        this.bike = new Bike();
        this.vehicle = vehicle;
    }

    public void startJourney() {
//        this.car.move();
//        this.bike.move();
        this.vehicle.move();
    }

}
