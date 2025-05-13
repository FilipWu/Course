package com.kodilla;

import com.kodilla.jdbc.MinMax;

public class Main {
    public static void main(String[] args) {
        MinMax minMax = new MinMax();
        int[] numbers = {3, 1, 5, 6, 7, 9, 15, 3, 4, 7, 10};
        System.out.println(minMax.max(numbers));
        System.out.println(minMax.min(numbers));

    }
}