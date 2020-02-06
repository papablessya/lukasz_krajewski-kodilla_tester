package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictonary.EnglishWord;

import java.util.*;

public class FlightRepository {
    public static Set<Flight> getFlightsTable() {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("Sydney", "Tokyo"));
        flights.add(new Flight("Warsaw", "Stockholm"));
        flights.add(new Flight("Paris", "Stockholm"));
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("Berlin", "Warsaw"));

        return flights;
    }

}

