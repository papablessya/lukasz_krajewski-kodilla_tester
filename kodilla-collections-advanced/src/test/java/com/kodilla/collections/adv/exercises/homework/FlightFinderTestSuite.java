package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindCity(){
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsTo("Stockholm");
    }

}