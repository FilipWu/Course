package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String poem, PoemDecorator decorator) {
        String beautified = decorator.decorate(poem);
        System.out.println("upiekszony tekst: " + beautified);
    }
}
