package com.kodilla.inheritance.homework;

public class WindowsXP extends OperatingSystem {

    public WindowsXP (int publicationYear, String opsys) {
        super(publicationYear, opsys);
    }

    @Override
    public void turnOff() {
        System.out.println("WindowsXP will be off soon.");
    }

    @Override
    public void turnOn() {
        System.out.println("WindowsXP is fully on now! Welcome!");
    }
}
