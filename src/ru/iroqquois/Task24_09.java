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
        ArrayList<Integer> arrayOfIntegers = new ArrayList<>();

        arrayOfInts[0] = 1;
        arrayOfInts[1] = 2;
        arrayOfInts[2] = 4;
        arrayOfInts[3] = 7;
        arrayOfInts[4] = 24;
        arrayOfInts[5] = 0;

        Set<Integer> mySet = new HashSet<Integer>();
        Collections.addAll(mySet, arrayOfInts);

        System.out.println(mySet.size());

        if (arrayOfInts.length > mySet.size()) {
            System.out.println("В массиве есть дубликаты");
        } else {
            System.out.println("В массиве нет дубликатов");
        }
    }
}
