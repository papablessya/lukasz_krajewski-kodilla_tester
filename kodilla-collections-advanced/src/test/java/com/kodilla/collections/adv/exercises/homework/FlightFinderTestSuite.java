package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FlightFinderTestSuite {
    @Test
    public void testFindCity() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> results = flightFinder.findFlightsTo("Stockholm");
        assertTrue(results.size() > 0);
        for (Flight flight : results) {
            assertEquals("Stockholm", flight.getArrival());

        }
    }

    @Test
    public void testFindByDeparture() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> results = flightFinder.findFlightsFrom("Warsaw");
        assertTrue(results.size() > 0);
        for (Flight flight : results) {
            assertEquals("Warsaw", flight.getDeparture());
        }

    }

    @Test
    public void testEmptyFlightArrival() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> results = flightFinder.findFlightsTo("Uganda");
        assertEquals(0, results.size());
    }

    @Test
    public void testEmptyFlightDeparture() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> results = flightFinder.findFlightsFrom("Uganda");
        assertEquals(0, results.size());
    }
}