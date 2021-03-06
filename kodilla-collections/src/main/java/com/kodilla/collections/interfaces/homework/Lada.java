package com.kodilla.collections.interfaces.homework;

public class Lada implements Car {

    private int speed;
    private int increase;
    private int decrease;

    public Lada(int speed, int increase, int decrease) {
        this.speed = speed;
        this.increase = increase;
        this.decrease = decrease;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        speed = speed + increase;
        return speed;
    }

    @Override
    public int decreaseSpeed() {
        speed = speed - decrease;
        return speed;
    }

    @Override
    public String toString() {
        return "Lada{" +
                "speed=" + speed +
                ", increase=" + increase +
                ", decrease=" + decrease +
                '}';
    }
}