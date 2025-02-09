package com.kodilla.testing;

import calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        /*  SimpleUser user = new SimpleUser("Filip");
            String result = user.getUsername();
        if (result.equals("Filip")) {
            System.out.println("Jest okej");
        } else {
            System.out.println("nie jest okej");
        }
        */

        Calculator calculatorAdd = new Calculator();
        Calculator calculatorSubtract = new Calculator();

        int add = calculatorAdd.calculatorAdd(2,2);
        int substract = calculatorSubtract.calculatorSubtract(2,2);

        if (add == 4) {
            System.out.println("Jest okej");
        } else {
            System.out.println("nie jest okej");
        }
        if (substract == 0){
            System.out.println("Jest okej");
        } else {
            System.out.println("nie jest okej");
        }

    }
}
