package com.kodilla.exception.test;

public class Kalkulator {
    public static int power(int base, int exponent) {

        if (base == 0 && exponent == 0) {
            return 1;
        }
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
           //1  1 * 2 = 2       1 * 4 = 4
           //2  2 * 2 = 4       4 * 4 = 16
           //3  4 * 2 = 8       16 * 4 = 64
           //4                  64 * 4 = 256

        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(power(5, 0));
        System.out.println(power(0, 5));
        System.out.println(power(7, 1));
        System.out.println(power(0, 0));
        System.out.println(power(4, 4));
    }
}


