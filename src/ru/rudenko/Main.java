/*
 * @created 9/9/2021
 * @project gr19
 * @author Rudenko, Latushkin
 */

package ru.rudenko;

public class Main {

    public static void main(String[] args) {
        System.out.println(PowerOfTwo.checkPowerOfTwo(4));

        LogicOperations.doOperations(5, 10, 15);

        Parity.checkParityByBinary(2);

        Premium.calculateThePremium(3, 10000);
    }

    public static class PowerOfTwo {
        public static boolean checkPowerOfTwo(int argument) {
            String binaryArgument = Integer.toBinaryString(argument);
            int counter = 0;
            for (int i = 0, n = binaryArgument.length(); i < n; i++) {
                char c = binaryArgument.charAt(i);
                if (c == '1') {
                    counter++;
                }
            }

            return counter == 1;
        }
    }

    public static class LogicOperations {
        public static void doOperations(int x, int y, int z) {
            x += y >> x++ * z;
            System.out.println(x);
            z = ++x & y * 5;
            System.out.println(z);
            y /= x + 5 | z;
            System.out.println(y);
            z = x++ & y * 5;
            System.out.println(z);
            x = y << x++ ^ z;
            System.out.println(x);
        }
    }

    public static class Parity {
        public static boolean checkParityByBinary(int argument) {
            String binaryArgument = Integer.toBinaryString(argument);
            char lastChar = binaryArgument.charAt(binaryArgument.length() - 1);

            return lastChar == '0';
        }
    }

    public static class Premium {
        public static void calculateThePremium(int seniority, int salary) {
            if (seniority < 5) {
                System.out.println(salary * 10 / 100);
            } else if (seniority >= 5 && seniority < 10) {
                System.out.println(salary * 15 / 100);
            } else if (seniority >= 10 && seniority < 15) {
                System.out.println(salary * 25 / 100);
            } else if (seniority >= 15 && seniority < 20) {
                System.out.println(salary * 35 / 100);
            } else if (seniority >= 20 && seniority < 25) {
                System.out.println(salary * 45 / 100);
            } else if (seniority >= 25) {
                System.out.println(salary * 50 / 100);
            }
        }
    }
}