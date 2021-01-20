package com.kodilla.abstracts;

public class Dog extends Animal {

    public Dog() {                          //konstruktor klasy Dog, w którym
        super(4);                //przyjmujemy liczbę nóg numberOfLegs=4
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau hau");
    }
}
