package com.kodilla.school;

public class Grades {

    private int[] values;
    private int size;

    public Grades() {
        this.values = new int[0];
    }

    /*
    W metodzie add(int value) najpierw inkrementujemy (zwiększamy o jeden)
    wartość size opisującą wielkość tablicy. Następnie tworzymy pustą tablicę
    z nowym rozmiarem. W kolejnej linii użyliśmy metody
    z klasy System: System.arraycopy(values, 0, newTab, 0, values.length);.
    Pozwala ona na skopiowanie tablicy źródłowej do tablicy docelowej,
    zachowując obecny układ elementów.
    W kolejnej linii przypisujemy nową wartość do ostatniego elementu w
    tablicy (konieczne było odjęcie cyfry jeden od rozmiaru tablicy,
    indeksy liczymy od zera). Ostatnia linia to przypisanie nowo utworzonej
    tablicy do tablicy przechowywanej w klasie.
     */

    public void add(int value) {        //w metodzie add
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values,0, newTab,0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }

    /*
    Dodanie metody zwracającej średnią ocen.
    */
    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
    }
}
