package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String,Boolean> getListOfAirports() {
        Map<String,Boolean> airports = new HashMap<>();
        airports.put("Miami",true);
        airports.put("Malta",true);
        airports.put("Las Palmas",false);
        airports.put("Warsaw",true);
        return airports;
    }

    /*
    Klasa ta posiada metodę isAirportInUse(), której zadaniem jest zwrócenie
    true lub false w zależności od tego, czy dane lotnisko ma ustawioną flagę typu
    Boolean (w mapie wewnątrz metody getListOfAirports()) na true czy na false.
    W sytuacji, gdy użytkownik poda lotnisko "spoza systemu", czyli takie, którego
    nie ma we wspomnianej mapie, rzucony zostanie nasz nowo zdefiniowany wyjątek.
    Do rzucania wyjątku służy polecenie throw i jako argument przyjmuje obiekt wyjątku,
    który ma zostać rzucony. Może to być oczywiście wyjątek, który przed chwilą sami
    zdefiniowaliśmy.
     */
    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if (getListOfAirports().containsKey(airport))
            return getListOfAirports().get(airport);
        throw new AirportNotFoundException();
    }
}
