package ru.iroqquois;

/*
 * @created 23/09/2021
 * @project ArrayTasks
 * @author Rudenko, Latushkin
 */

/**
 * Задача по
 */
public class Task23_09 {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[0] = "flower";
        str[1] = "floats";
        str[2] = "flag";
        str[3] = "fl";
        str[4] = "f1";

        searchPrefix(str);
    }

    /**
     * @param array Входной массив из строк
     */
    public static void searchPrefix(String[] array) {
        String firstStrFromArray = array[0];
        int index = firstStrFromArray.length();

        for (String strFromArray : array) {
            for (int i = 0; i < firstStrFromArray.length(); i++) {
                if (strFromArray.contains(firstStrFromArray)) {
                    continue;
                } else {
                    firstStrFromArray = firstStrFromArray.substring(0, --index);
                }
            }
        }

        System.out.print(firstStrFromArray);
    }
}
