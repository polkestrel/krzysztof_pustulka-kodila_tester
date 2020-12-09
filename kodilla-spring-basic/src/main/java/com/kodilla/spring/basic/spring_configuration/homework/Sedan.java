package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {

    private boolean hasHeadLightsTurnedOn;

    @Override
    public boolean hasHeadLightsTurnedOn() {
        return hasHeadLightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
