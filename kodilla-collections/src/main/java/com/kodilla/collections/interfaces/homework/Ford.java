package com.kodilla.collections.interfaces.homework;

import javax.print.DocFlavor;
import java.util.Objects;

public class Ford implements Car {

    private int speed;
    private int increase;
    private int decrease;

    public Ford(int speed, int increase, int decrease) {
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
        return "Ford{" +
                "speed=" + speed +
                ", increase=" + increase +
                ", decrease=" + decrease +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed &&
                increase == ford.increase &&
                decrease == ford.decrease;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, increase, decrease);
    }
}
