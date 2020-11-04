package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    /*
    pole (typu ArrayList), które będzie przechowywało listę liczb uczniów w poszczególnych klasach
     */
    private List<Integer> school = new ArrayList<>();

    /*
       Konstruktor otwarty: (int ... school)
       oznacza, że jako argument można podać dowolnie dużo liczb typu 'int',
       oddzielając je przecinkami
    */
    public School(int... school) {
        for (int pupils : school)
            this.school.add(pupils);
    }

    public int getTotalSum() {
        int sum = 0;
        for (int pupils : school)
            sum += pupils;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "school=" + school +
                '}';
    }
}
