package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private List<Double> grades = new ArrayList<>();

    /*
    Konstruktor otwarty: (double ... grades)
    oznacza, że jako argument można podać dowolnie dużo liczb typu 'double',
    oddzielając je przecinkami
     */

    public Grades(double ... grades) {
        for (double grade : grades)
            this.grades.add(grade);
    }

    /*
    metoda wyliczająca średnią z ocen zapisanych w kolekcji 'grades'
     */
    public double getAverage() {
        double sum = 0.0;
        for (double grade : grades)
            sum += grade;
        return (sum / grades.size());
    }

    @Override
    public String toString() {
        return "Grades{" +
                "grades=" + grades +
                '}';
    }
}
