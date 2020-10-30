package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.*;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Opel(100,80,20));
        cars.add(new Lada(150,50,30));
        Car ford = new Ford(200,33,44);
        cars.add(ford);
        cars.add(new Lada(85,10,5));

        System.out.println("----------------------------------");
        System.out.println("Zawartość całej utworzonej kolekcji 'cars' poniżej: ");
        for (Car car: cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(3);
        cars.remove(ford);
        System.out.println("-------------------");
        System.out.println("A teraz wyświetlam ponownie zawartość kolekcji po usunięciu jej dwóch elementów: ");
        for (Car car: cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("...oraz na koniec wyświetlam informacje o \nrozmiarze kolekcji po wszystkich operacjach na niej.\nRozmiar kolekcji 'cars' jest równy teraz: " + cars.size());
    }
}
