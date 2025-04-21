package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    public void testLogger() {
        Logger logger = Logger.INSTANCE;
        String test = "test";

        logger.log(test);
        String loggerTest = logger.getLastLog();

        assertEquals(test, loggerTest);
    }
}
