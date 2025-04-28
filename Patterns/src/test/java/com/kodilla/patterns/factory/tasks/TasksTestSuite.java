package com.kodilla.patterns.factory.tasks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TasksTestSuite {

    @Test
    void testFactoryShopping() {
        TaskFactory factory = new TaskFactory();

        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        assertEquals("grocery shopping", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        TaskFactory taskFactory = new TaskFactory();

        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();

        assertEquals("Wall painting", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        TaskFactory taskFactory = new TaskFactory();

        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();

        assertEquals("Taxi drive", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}
