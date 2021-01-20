package com.kodilla.exception;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportRepositoryTestSuite {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        // then
        assertTrue(isWarsawInUse);
    }

    /*
    Poniższy test testuje sytuację gdy lotniska nie ma w mapie i metoda
    'isAirportInUse' rzuci wyjątkiem.
    Jednak aby test wykonał sie poprawnie musimy poinformować JUnit, że rzucenie wyjątku jest
    sytuacją poprawną, której właśnie oczekujemy. Wystarczy do adnotacji @Test dodać
    informację o tym, że test powinien oczekiwać wyjątku podanej klasy (expected = AirportNotFoundException.class)
     */
    @Test(expected = AirportNotFoundException.class)
    public void testIsAirportInUse_withException() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Vienna");
        // then
        assertFalse(isWarsawInUse);
    }
}