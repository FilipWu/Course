package com.kodilla.spring.portfolio;

public class Fibonacci {
    public static int Fibonacci(int N) {
        int number1 = 0;
        int number2 = 1;
        for (int i = 0; i < N; i++) {
            System.out.print(number1 + " ");
            int number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }
        return number1;
    }
    public static void main(String[] args) {
        int N = 10;
        Fibonacci(N);
    }
}

