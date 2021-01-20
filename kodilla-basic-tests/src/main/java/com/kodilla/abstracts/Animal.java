package com.kodilla.abstracts;

public abstract class Animal {

    private int numberOfLegs;       //zadeklarowana prywatna zmienna

    public Animal(int numberOfLegs) {       //zadeklarowany kosntruktor 'Animal'
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {          //zadeklarowany 'getter', wydobywający wartość
        return numberOfLegs;                //prywatnej zmiennej 'numberOfLegs'
    }

    public abstract void giveVoice();       //deklarowanie metody abstrakcyjnej
}                                           //metoada nie ma ciała - brak kodu do wykonania
