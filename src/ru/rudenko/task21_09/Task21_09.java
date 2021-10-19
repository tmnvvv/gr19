package ru.rudenko.task21_09;

/*
 * @created 21/9/2021
 * @project Task 21.09
 * @author Rudenko, Latushkin
 */

public class Task21_09 {
    /**
     * Входная точка для всех задач 21.09 числа
     * @param args
     */
    public static void main(String[] args) {
        Integer[] arrayOfNumbers = new Integer[10];
        fillArrayByRandomValues(arrayOfNumbers);

        CustomerArray customerArray = new CustomerArray(arrayOfNumbers);
        customerArray.averageValuesOfArray();
        customerArray.maxValueOfArray();
        customerArray.minValueOfArray();
        customerArray.oddValueOfArray();
        customerArray.sumValueOfArray();

        ReversedArray.myReverse(arrayOfNumbers);
        ReversedArray.subArray(arrayOfNumbers, 2, 10);

        UserArray.expandArray(arrayOfNumbers);
        UserArray.insertArray(arrayOfNumbers, 10);
    }

    /**
     * @param array Пустой массив
     * @return Возвращает массив из рандомных чисел от -15 до 15
     */
    public static Integer[] fillArrayByRandomValues (Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
        }

        return array;
    }
}
