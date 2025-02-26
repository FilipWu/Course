package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
@Test
    void testGetPeopleQuantity() {
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent southAmerica = new Continent("South America");


        europe.addCountry(new Country("Poland", new BigDecimal("40000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("80000000")));
        asia.addCountry(new Country("China", new BigDecimal("140000000")));

        world.addContinent(europe);
        world.addContinent(asia);

        BigDecimal peopleNumber = new BigDecimal("260000000");

        assertEquals(peopleNumber,world.getPeopleQuantity());
    }
}
