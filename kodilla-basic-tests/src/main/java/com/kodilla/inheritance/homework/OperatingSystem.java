package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int publicationYear;
    private String opsys;

    public OperatingSystem(int publicationYear, String opsys) {
        this.publicationYear = publicationYear;
        this.opsys = opsys;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getOpsSys() {
        return opsys;
    }

    public void turnOn() {
        System.out.println("System is on.");
    }

    public void turnOff() {
        System.out.println("System is off.");
    }

    public void displayPublicationYear () {
        System.out.println("The OS was published in: " + publicationYear + " year.");
    }
}
