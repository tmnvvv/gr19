package ru.rudenko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Rudenko, Latushkin
 * @created 24/09/2021
 * @project Task24_09
 */

public class Task24_09 {
    public static void main(String[] args) {
        Integer[] arrayOfInts = new Integer[6];

        for (int i = 0; i < arrayOfInts.length; i++) { // генерация рандомных чисел от -15 до 15
            arrayOfInts[i] = (int) Math.round((Math.random() * 30) - 15);
        }

        Set<Integer> mySet = new HashSet<Integer>();
        Collections.addAll(mySet, arrayOfInts);

        if (arrayOfInts.length > mySet.size()) {
            System.out.println("В массиве есть дубликаты");
        } else {
            System.out.println("В массиве нет дубликатов");
        }
    }
}
