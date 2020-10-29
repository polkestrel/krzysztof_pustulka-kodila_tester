package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Lada;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        // pusta tablica, która będzie przechowywać elementy od 1 do 15
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        //wywołajmy metodę drawCar tyle razy, ile elementów będzie w tablicy
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        //wyświetlamy informacje o wartościach każdego elemntu w tablicy
        for (Car car : cars)
            CarUtils.describeCar(car);
    }


    public static Car drawCar() {
        Random random = new Random();
        // draw a kind of the car
        int drawnCarKind = random.nextInt(3);     //possible values: 0,1,2
        // draw random values of speed, increase of speed, and decrease of speed
        int a = random.nextInt(151);          //possible values: 0-150
        int b = random.nextInt(71);            //possible values: 0-70
        int c = random.nextInt(51);
        if (drawnCarKind == 0)
            return new Ford(a,b,c);
        else if (drawnCarKind == 1)
            return new Lada(a,b,c);
        else
            return new Opel(a,b,c);
    }
}