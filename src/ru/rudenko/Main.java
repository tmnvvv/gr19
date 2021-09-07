package ru.rudenko;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        int flagA = 0;
        int flagB = 0;
        for (int number : arrayOfNumbers) {
            if (number > flagA && flagA < 10) {
                flagA = number;

                if (number > 10) {
                    flagB = number;
                }
                if (flagB < 10) {
                    flagB = number;
                }
            }

            if (Arrays.asList(arrayOfNumbers).indexOf(number) == arrayOfNumbers.length) { // не понимаю что тут не так
                if (abs(10 - flagA) > abs(10 - flagB)) {
                    System.out.println(flagB);
                } else {
                    System.out.println(flagA);
                }
            }
        }
    }
}
