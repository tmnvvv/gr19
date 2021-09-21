package ru.iveen.calculatorapp;

/*
 * @created 16.09.2021 - 22:33
 * @project calculatorApp
 * @author Polyakov Anton
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double[] array1 = {3.2, 5.6, 7.745, 4.3};
        System.out.println("3 + 2 = " + calculator.sumOf(3, 2));
        System.out.println("(3.2 + 5.6 + 7.745 + 4.3) = " + calculator.sumOf(array1));

        int[] array2 = {8, 9, 1, 5};
        System.out.println("6 - 9 = " + calculator.substractionOf(6, 9));
        System.out.println("(8 - 9 - 1 - 5) = " + calculator.substractionOf(array2));

        int[] array3 = {5, 5, 5};
        System.out.println("9 * 9 = " + calculator.multiplyOf(9, 9));
        System.out.println("(5 * 5 * 5) = " + calculator.multiplyOf(array3));

        double[] array4 = {4.3, 2.0, 2.0};
        System.out.println("10 / 2 = " + calculator.divisionOf(10, 2));
        System.out.println("(4,3 / 2 / 2) = " + calculator.divisionOf(array4));

        System.out.println("2^2 = " + calculator.power(2,2));
        System.out.println("5^10 = " + calculator.power(5, 10));
    }
}
