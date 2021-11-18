package ru.rudenko.task18_11.calculator;

/*
 * @created 18/11/2021
 * @project Calculator
 * @author Rudenko
 */

public class Calculator {
    public int add(int firstNumber, int secondNumber){
        return  firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) throws ArithmeticException  {
        try {
            return firstNumber / secondNumber;
        } catch (ArithmeticException exception) {
            throw new ArithmeticException();
        }
    }
}
