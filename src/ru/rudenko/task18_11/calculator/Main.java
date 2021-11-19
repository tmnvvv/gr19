package ru.rudenko.task18_11.calculator;

/*
 * @created 18/11/2021
 * @project Calculator
 * @author Rudenko
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = in.nextInt();

        System.out.print("Input operator: ");
        String operator = in.next();

        System.out.print("Input second number: ");
        int secondNumber = in.nextInt();

        switch (operator) {
            case "+":
                System.out.println(calculator.add(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println(calculator.sub(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println(calculator.mul(firstNumber, secondNumber));
            case "/":
                try {
                    int result = calculator.div(firstNumber, secondNumber);
                    System.out.println(result);
                } catch (ArithmeticException exception) {
                    System.out.println("Делить на 0 нельзя");
                }
        }
    }
}
