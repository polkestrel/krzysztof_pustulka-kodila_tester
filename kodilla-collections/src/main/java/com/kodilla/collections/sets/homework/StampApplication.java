package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Polski",20.0,10.0,true));
        stamps.add(new Stamp("Niemiecki",250.0,5.0,false));
        stamps.add(new Stamp("Rosyjski",30.0,12.0,true));
        stamps.add(new Stamp("Czeski",40.0,11.0,false));
        stamps.add(new Stamp("Rosyjski",30.0,12.0,true));
        stamps.add(new Stamp("Rosyjski",30.0,12.0,false));

        System.out.println("Ilość znaczków niepowtarzalnych w zbiorze wynosi: " + stamps.size());
        System.out.println("-------------------------------------------");
        System.out.println("Wyświetlenie zawartości kolekcji 'stamps' poniżej: \n ");
        for (Stamp stamp: stamps)
            System.out.println(stamp);
    }
}
