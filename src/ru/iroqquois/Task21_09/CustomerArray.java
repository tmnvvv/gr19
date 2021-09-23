package ru.iroqquois.Task21_09;

/*
 * @created 21/9/2021
 * @project Task 21.09
 * @author Rudenko, Latushkin
 */

import ru.iroqquois.Task21_09.Task21_09;

import java.util.Arrays;

/**
 * Задача 1
 * Класс для реализаций различных действий с массивом
 */
public class CustomerArray {
    private final Integer[] arrayOfNumbers;

    /**
     * @param arrayOfNumbers Входной массив для всех задач
     */
    public CustomerArray(Integer[] arrayOfNumbers) {
        this.arrayOfNumbers = Task21_09.fillArrayByRandomValues(arrayOfNumbers);
    }

    /**
     * Выводит максимальное число среди элементов массива
     */
    public void maxValueOfArray() {
        Integer maxValue = null;

        for (int i = 0; i < this.arrayOfNumbers.length; i++) {
            if (i == 0) {
                maxValue = i;
                continue;
            }
            if (this.arrayOfNumbers[i] > maxValue) {
                maxValue = this.arrayOfNumbers[i];
            }
        }
        System.out.println(Arrays.toString(this.arrayOfNumbers));
        System.out.println(maxValue);
    }

    /**
     * Выводит минимальное число среди элементов массива
     */
    public void minValueOfArray() {
        Integer minValue = null;

        for (int i = 0; i < this.arrayOfNumbers.length; i++) {
            if (i == 0) {
                minValue = i;
                continue;
            }
            if (this.arrayOfNumbers[i] > minValue) {
                minValue = this.arrayOfNumbers[i];
            }
        }

        System.out.println(Arrays.toString(this.arrayOfNumbers));
        System.out.println(minValue);
    }

    /**
     * Выводит сумму всех элементов массива
     */
    public void sumValueOfArray() {
        Integer sum = 0;

        for (Integer number : this.arrayOfNumbers) {
            sum += number;
        }
        System.out.println(Arrays.toString(this.arrayOfNumbers));
        System.out.println(sum);
    }

    /**
     * Выводит среднее значение по массиву
     */
    public void averageValuesOfArray() {
        Integer sum = 0;

        for (Integer number : this.arrayOfNumbers) {
            sum += number;
        }

        Integer avg = Math.round(sum / this.arrayOfNumbers.length);

        System.out.println(Arrays.toString(this.arrayOfNumbers));
        System.out.println(avg);
    }

    /**
     * Выводит все нечётные значения по массиву
     */
    public void oddValueOfArray() {
        for (Integer number : this.arrayOfNumbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

}
