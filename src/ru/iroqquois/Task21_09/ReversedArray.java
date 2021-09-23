package ru.iroqquois.Task21_09;

import java.util.Arrays;

/*
 * @created 21/9/2021
 * @project Task 21.09
 * @author Rudenko, Latushkin
 */

/**
 * Задача 2
 */
public class ReversedArray {

    /**
     * Разворачивает массив
     * @param array Входной массив
     */
    public static void myReverse(Integer[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            Integer num = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = num;
        }
    }

    /**
     * Выделяет подмассив от индекса и до конца count,
     * если счётчик выходит за рамки, добавляются единицы
     * @param array входной массив
     * @param index индекс начала отсчёта
     * @param count количество нужных элементов
     */
    public static void subArray(Integer[] array, Integer index, Integer count) {
        Integer[] newArray = new Integer[count];
        int newArrayCount = 0;
        Integer lastIndexOfArray = array.length - 1;

        if (lastIndexOfArray - index < count) {
            count = count - array.length;

            for (Integer i = index; i <= lastIndexOfArray; i++) {
                newArray[newArrayCount] = array[i];
                newArrayCount++;
            }

            for (int i = 0; i <= lastIndexOfArray + count - index; i++) {
                newArray[newArrayCount] = 1;
                newArrayCount++;
            }
        } else {
            for (Integer i = index; i < count + index; i++) {
                newArray[newArrayCount] = array[i];
                newArrayCount++;
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}
