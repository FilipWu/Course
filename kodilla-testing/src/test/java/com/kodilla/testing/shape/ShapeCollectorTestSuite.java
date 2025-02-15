package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("This is the end of tests.");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("This is the test " + testCounter);
    }

    @Test
    void testAddShape() {
        //given
        Circle circle = new Circle(4);
        ShapeCollector collector = new ShapeCollector();
        //where
        collector.addFigure(circle);
        //then
        Assertions.assertEquals(1, collector.getShapes().size());
        Assertions.assertEquals(circle, collector.getShapes().get(0));
    }
    @Test
    void testRemoveShape() {
        Triangle triangle = new Triangle(4,5);
        ShapeCollector collector = new ShapeCollector();
        //where
        collector.addFigure(triangle);
        collector.removeFigure(triangle);
        //then
        Assertions.assertEquals(0, collector.getShapes().size());
    }
    @Test
    void testGetShapes() {
        Square square = new Square(5);
        Circle circle = new Circle(5);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(square);
        collector.addFigure(circle);
        //when
        String shapeName = collector.getFigure(0).getName();
        //then
        Assertions.assertEquals("Square",shapeName);
    }
    @Test
    void testShowFigures() {
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Triangle triangle = new Triangle(5,5);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle);
        collector.addFigure(square);
        collector.addFigure(triangle);

        Assertions.assertEquals("Circle Square Triangle", collector.showFigures());
    }


}