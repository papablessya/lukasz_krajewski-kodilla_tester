package com.kodilla.collections.adv.exercises.homework;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository {
    public static void getFlightsTable() {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("Sydney", "Tokyo"));
        flights.add(new Flight("Warsaw", "Stockholm"));
        flights.add(new Flight("Paris", "Stockholm"));
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("Berlin", "Warsaw"));

    }

}

