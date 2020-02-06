package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if(departure.equalsIgnoreCase(flight.getDeparture())){
                result.add(flight);
            }


        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equalsIgnoreCase(arrival)) {
                result.add(flight);
            }


        }
        return result;
    }
}
