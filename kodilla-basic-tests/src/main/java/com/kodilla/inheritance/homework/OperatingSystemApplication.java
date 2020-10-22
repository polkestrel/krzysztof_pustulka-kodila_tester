package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {

    public static void main(String[] args) {
        Windows10 windows10 = new Windows10(2005, "Windows10");
        windows10.turnOff();
        windows10.turnOn();

        WindowsXP windowsXP = new WindowsXP(2000, "WIndowsXP");
        windowsXP.turnOff();
        windowsXP.turnOn();
    }
}
