package com.kodilla;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;

import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);
/*
        Executor codeToExecute = () -> System.out.println("This is an example text.");  // [7]
        processor.execute(codeToExecute);

        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(1,2, (a,b) -> a + b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Hello World", poem -> "ABC" + poem + "ABC");
        poemBeautifier.beautify("Filip", poem -> poem.toUpperCase());
        poemBeautifier.beautify("Hello World", poem -> poem.toLowerCase());
        poemBeautifier.beautify("Hello World   ", poem -> poem.trim());
*/
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}