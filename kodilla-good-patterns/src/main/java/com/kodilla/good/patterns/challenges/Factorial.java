package com.kodilla.good.patterns.challenges;

public class Factorial {
    public static int Factorial(int base) {


    if (base == 0) {
        return 0;
    }


    int result = 1;
    for (int i = 1; i <= base; i++) {
        result *= i;

    }

        //1 dla 5     1. 1 * 1  =1
        //2 1 * 2 = 2
        //3 2 * 3 = 6
        //4 6* 4 = 24
        //5 24* 5 = 120


    return result;
}

        public static void main(String[] args) {
            System.out.println(Factorial(2 ));
            System.out.println(Factorial(5));
            System.out.println(Factorial(0));
            System.out.println(Factorial(7));
            System.out.println(Factorial(6));
            System.out.println(Factorial(4));
        }
}
