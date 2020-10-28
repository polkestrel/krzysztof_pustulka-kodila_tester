package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {

    public static void main(String[] args) {
        Windows10 windows10 = new Windows10(2005, "Windows10");
        WindowsXP windowsXP = new WindowsXP(2000, "WIndowsXP");

        ekstra(windows10);
        ekstra(windowsXP);
    }

    public static void ekstra(OperatingSystem operatingSystem) {
        operatingSystem.turnOff();
        operatingSystem.turnOn();
    }
}
