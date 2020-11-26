package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        //Principal firstprincipal = new Principal("John", "Smith", "II ZSZ");
        Principal secondpricipal = new Principal("Ann", "Kodinsky","IV Technikum");
        Principal thirdpricipal = new Principal("Gabriel", "Saint", "I LO");

        //School firstchool = new School(12,12,13,8,23,22);
        School seconschool = new School(25,12,22,11,1,3);
        School thirdschool = new School(22,34,12,3,5,4);

        school.put(new Principal("John", "Smith", "II ZSZ"),new School(12,12,13,8,23,22));
        school.put(secondpricipal,seconschool);
        school.put(thirdpricipal,thirdschool);

        //wyświetl informacje o dyrektorach placówek, nazwie szkoły którą kierują, oraz o łącznej liczbie uczniów w każdej szkole

        for (Map.Entry<Principal, School> schoolEntry : school.entrySet())
            System.out.println("Principal: " + schoolEntry.getKey().getPrincipalFirstName() + " " + schoolEntry.getKey().getPrincipalLastName() +
                    " is managing the following school: " + schoolEntry.getKey().getSchoolName() + "."
                    + " And this school has: " + schoolEntry.getValue().getTotalSum() + " pupils in total.");
    }
}
