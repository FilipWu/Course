package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Test sprawdzający działanie gdy lista jest pusta")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //when
        List<Integer> result = exterminator.exterminate(emptyList);
        //then
        Assertions.assertTrue(result.isEmpty(), "Empty list is empty");

    }
    @DisplayName("Test sprawdzający działanie gdy lista zawiera liczby parzyste i nieparzyste")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> list = Arrays.asList(1, 2, 3);

        //when
        List<Integer> result = exterminator.exterminate(list);
        //then
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        Assertions.assertEquals(expected, result);
    }
}
