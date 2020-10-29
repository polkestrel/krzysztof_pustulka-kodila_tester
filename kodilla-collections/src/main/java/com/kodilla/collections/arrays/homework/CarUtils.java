package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Lada;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("----------------------");
        System.out.println("Car kind is: " + getCarName(car));
        System.out.println("Car speed is: " + car.getSpeed());
        System.out.println("Car increased speed by: " + car.increaseSpeed());
        System.out.println("Car decreased speed by: " + car.decreaseSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Lada)
            return "Lada";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car name";
    }
}
