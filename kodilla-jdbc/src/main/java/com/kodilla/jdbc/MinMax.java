package com.kodilla.jdbc;

public class MinMax {
    public int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min < numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
    public int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max > numbers[i]) {
                max = numbers[i];
            }
        }
    return max;
    }
}

