package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightRepositoryTestSuite {

    @Test
    public void doesItFindFlightsFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> flightList = flightFinder.findFlightsFrom("Warsaw");
        // then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Warsaw", "Toronto"));
        assertEquals(expectedFlights.size(), flightList.size());
        //assertEquals(1,flightList.size());
    }

    @Test
    public void doesItFindFlightsTo() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> flightList = flightFinder.findFlightsTo("Bangkok");
        // then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Frankfurt", "Bangkok"));
        expectedFlights.add(new Flight("Yangoon", "Bangkok"));
        assertEquals(expectedFlights.size(), flightList.size());
        //assertEquals(2,flightList.size());
    }

    @Test
    public void doesItFindFlightsFromIfItDoesntExist() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> flightList = flightFinder.findFlightsFrom("Kraków");
        // then
        List<Flight> expectedFlights = new ArrayList<>();
        assertEquals(expectedFlights.size(), flightList.size());
        //assertEquals(0, flightList.size());
    }

    @Test
    public void doesItFindFlightsToIfItDoesntExist() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> flightList = flightFinder.findFlightsFrom("Kraków");
        // then
        List<Flight> expectedFlights = new ArrayList<>();
        assertEquals(expectedFlights.size(), flightList.size());
        //assertEquals(0, flightList.size());
    }
}
