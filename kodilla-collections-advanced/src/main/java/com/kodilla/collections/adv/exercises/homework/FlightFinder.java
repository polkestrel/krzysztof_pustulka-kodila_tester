package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    /*
    Wyszukiwanie lotów z podanego miasta
    */
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> departureTable = new ArrayList<>();
        //FlightRepository.getFlightsTable().stream().filter(flight -> flight.getDeparture().equals(departure)).findAny().
        for (Flight flight : FlightRepository.getFlightsTable())
            if (flight.getDeparture().equals(departure))
                departureTable.add(flight);
        return departureTable;
    }

    /*
    Wyszukiwanie lotów do podanego miasta
    */
        public List<Flight> findFlightsTo(String arrival) {
            List<Flight> arrivalTable = new ArrayList<>();
            for (Flight flight: FlightRepository.getFlightsTable())
                if (flight.getArrival().equals(arrival))
                    arrivalTable.add(flight);
            return arrivalTable;
    }
}