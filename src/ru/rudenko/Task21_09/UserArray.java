package ru.rudenko.Task21_09;

/*
 * @created 21/9/2021
 * @project Task 21.09
 * @author Rudenko, Latushkin
 */

/**
 * Задача 3
 * ref https://docs.google.com/document/d/1ejeD-30QkFhH6sOZsZgbv3K90qvZPdxtMPi6YpROtEs/edit
 */
public class UserArray {

    /**
     * Расширяет массив на 1 элемент
     * @param array Входной массив
     */
    public static void expandArray(Integer[] array) {
        Integer[] copyOfArray = array;
        array = new Integer[array.length + 1];

        System.arraycopy(copyOfArray, 0, array, 0, copyOfArray.length);
    }

    /**
     * Сдвигает массив вправо, на 0 индекс записывает значение из value
     * @param array Входной массив
     * @param value Значение, которое нужно вставить на 0 индекс
     */
    public static void insertArray(Integer[] array, Integer value) {
        Integer[] copyOfArray = array;
        array = new Integer[array.length + 1];
        System.arraycopy(copyOfArray, 0, array, 1, array.length - 1);
        array[0] = value;
    }
}
