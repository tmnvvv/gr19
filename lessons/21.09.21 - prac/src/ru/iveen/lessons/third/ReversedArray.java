package ru.iveen.lessons.third;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * @created 21.09.2021 - 10:30
 * @project lessons.3
 * @author Polyakov Anton
 */
public class ReversedArray {
    public int[] myReverse(int [] array) {
        for (int i=0; i<array.length / 2; i++) {
          int tmp = array[i];
          array[i] = array[array.length-1-i];
          array[array.length-1-i] = tmp;
        }
        return array;
    }

    public int[] subArray(int [] array, int index, int count) { // какую-то херню написал
        int[] out = new int[count];
        ArrayList<Integer> temp = new ArrayList();

        for (int i = index; index+count-1 >= i && i < array.length; i++) {
            temp.add(array[i]);
        }

        Arrays.fill(out, 1);
        for (int i = 0; i < temp.size(); i++) {
            out[i] = temp.get(i);
        }
        return out;
    }
}