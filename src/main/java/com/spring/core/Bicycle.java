package com.spring.core;

import org.springframework.stereotype.Component;

@Component("bicycle")
public class Bicycle implements Vehicle{

    @Override
    public void move() {
        System.out.println("Bicycle is moving");
    }
}
