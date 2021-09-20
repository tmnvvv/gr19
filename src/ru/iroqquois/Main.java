/*
 * @created 17/09/2021
 * @project calculator
 * @author Rudenko, Latushkin, Ilin
 */

package ru.iroqquois;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Main.calculate();
    }

    public static void calculate() throws IOException {
        Integer result = null;
        Scanner in = new Scanner(System.in);

        while (true) {
            Integer firstNumber;

            if (result != null) {
                firstNumber = result;
            } else {
                System.out.print("Введите первое число: ");
                firstNumber = in.nextInt();
            }

            System.out.print("Введите второе число: ");
            Integer secondNumber = in.nextInt();

            System.out.print("Введите операцию (+, -, *, /): ");
            String operation = in.next();

            try {
                switch (operation) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":

                        try {
                            result = firstNumber / secondNumber;
                        } catch (ArithmeticException e) {
                            e.printStackTrace();
                            System.out.println("Нельзя делить на ноль");
                        }

                        break;
                    default:
                        throw new IllegalStateException("Неверный оператор: " + operation);
                }
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }

            while (true) {
                System.out.printf("Результат %d. Сохранить результат?(y/n/e): ", result);
                char answer = in.next().charAt(0);

                if (answer == 'y') {
                    break;
                } else if (answer == 'n') {
                    result = null;
                    break;
                } else if (answer == 'e') {
                    Runtime.getRuntime().exec("shutdown -s -t 0");
                    System.exit(0);
                } else {
                    System.out.println("Неверный ввод. Повторите");
                }
            }
        }
    }
}
