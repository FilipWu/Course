package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String,Boolean> flightMap = new HashMap<>();
    public FlightFinder(){
        flightMap.put("LAX",true);
        flightMap.put("WWA",true);
        flightMap.put("JFK",true);
        flightMap.put("SZS",false);
        flightMap.put("ZSS",true);
    }
    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (!flightMap.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("przylot do Lotniska " + flight.getArrivalAirport() + " nie istnieje, nie ma takiego lotniska");
        } else if (!flightMap.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Odlot z Lotniska " + flight.getDepartureAirport() + " nie istnieje, nie ma takiego lotniska");
        } else {
            return flightMap.get(flight.getArrivalAirport());
        }
    }

    }

