package com.kodilla.spring.calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculation() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double adding = calculator.add(2,4);
        double subtracting = calculator.sub(8,4);
        double division = calculator.div(2,4);
        double multiplaying = calculator.mul(3,3);

        assertEquals(6,adding);
        assertEquals(4,subtracting);
        assertEquals(0.5,division);
        assertEquals(9,multiplaying);



    }
}
