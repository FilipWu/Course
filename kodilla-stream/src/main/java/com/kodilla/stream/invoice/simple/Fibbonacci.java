package com.kodilla.stream.invoice.simple;

public class Fibbonacci {

        public static long fibonacci(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Liczba musi być > 0");
            } else if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
//0	1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597	2584	4181
    public static void main(String[] args) {
        System.out.println(fibonacci(10));  // 55
        System.out.println(fibonacci(20));  //
        System.out.println(fibonacci(6));
    }
    }

