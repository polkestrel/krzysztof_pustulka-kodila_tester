package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem {

    public Windows10 (int publicationYear, String opsys) {
        super(publicationYear, opsys);
    }

    @Override
    public void turnOff() {
        System.out.println("Windows10 will be off soon.");
    }

    @Override
    public void turnOn() {
        System.out.println("Windows10 is fully on now! Welcome!");
    }
}
