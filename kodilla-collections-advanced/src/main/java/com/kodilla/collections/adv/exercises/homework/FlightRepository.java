package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    /*
    metodą statyczną getFlightsTable(), która zwraca
    listę lotów obsługiwanych przez dane lotnisko
    (wypełnij tę listę przykładowymi lotami)
     */
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Toronto"));
        flights.add(new Flight("Georgetown", "New York"));
        flights.add(new Flight("Port of Spain", "London Heathrow"));
        flights.add(new Flight("Frankfurt", "Bangkok"));
        flights.add(new Flight("Yangoon", "Bangkok"));
        return flights;
    }

    //public static void main(String[] args) {
    //    System.out.println(getFlightsTable().size());
    //}
}
