package com.kodilla.exception.test;

public class FlightApp {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("WWA", "LAX");
        Flight flight2 = new Flight("JFK", "QWE");
        Flight flight3 = new Flight("QWE", "LAX");
        Flight flight4 = new Flight("WWA", "LAX");

        try{
            boolean fly = flightFinder.findFlight(flight1);
            System.out.println("Lot z: " + flight1.getArrivalAirport() + " dostępny: " + fly);
        }catch (RouteNotFoundException RNFE) {
            System.out.println("błąd " + RNFE.getMessage());
        }
        try{
            boolean fly = flightFinder.findFlight(flight2);
            System.out.println("Lot z: " + flight2.getArrivalAirport() + " dostępny: " + fly);
        }catch (RouteNotFoundException RNFE) {
            System.out.println("błąd " + RNFE.getMessage());
        }
        try{
            boolean fly = flightFinder.findFlight(flight3);
            System.out.println("Lot do: " + flight3.getDepartureAirport() + " dostępny: " + fly);
        }catch (RouteNotFoundException RNFE) {
            System.out.println("błąd " + RNFE.getMessage());
        }
        try{
            boolean fly = flightFinder.findFlight(flight4);
            System.out.println("Lot do: " + flight4.getDepartureAirport() + " dostępny: " + fly);
        }catch (RouteNotFoundException RNFE) {
            System.out.println("błąd " + RNFE.getMessage());
        }
    }
}
