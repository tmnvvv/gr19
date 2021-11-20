package ru.prac.utils;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @created 20.11.2021 - 15:18
 * @project 18_11_21 - prac
 * @author Polyakov Anton
 */

/**
 * Класс калькулятора
 */
public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public double add(){ // Метод сложения
        ArrayList<Double> nums = getRequestedNums();
        return nums.get(0) + nums.get(1);
    }

    public double sub(){ // Метод вычитания
        ArrayList<Double> nums = getRequestedNums();
        return nums.get(0) - nums.get(1);
    }

    public double mul(){// Метод умножения
        ArrayList<Double> nums = getRequestedNums();
        return nums.get(0) * nums.get(1);
    }

    public double div() throws ArithmeticException{ // Метод деления
        ArrayList<Double> nums = getRequestedNums();
        if (nums.contains(0.0)){
            throw new ArithmeticException("Делить на ноль нельзя!");
        }
        return nums.get(0) / nums.get(1);
    }
    private ArrayList<Double> getRequestedNums(){ // Метод для запроса чисел из консоли
        ArrayList<Double> arrayList = new ArrayList();
        System.out.println("Введите первое число: ");
        arrayList.add(scanner.nextDouble());
        System.out.println("Введите второе число: ");
        arrayList.add(scanner.nextDouble());
        return arrayList;
    }
}
