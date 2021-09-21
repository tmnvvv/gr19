package ru.iveen.lessons.third;

/*
 * @created 21.09.2021 - 11:20
 * @project lessons.3
 * @author Polyakov Anton
 */
public class UserArray {
    public int[] modifyArray(int[] array, int value){
        int[] out = new int[array.length+1];
        out[0] = value;
        for (int i = 1; i < out.length; i++) {
            out[i] = array[i-1];
        }
        return out;
    }
}