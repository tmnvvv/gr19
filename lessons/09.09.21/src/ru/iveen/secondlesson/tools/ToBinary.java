package ru.iveen.secondlesson.tools;

import java.util.Arrays;
import java.util.List;

public class ToBinary {
    /**
     * Метод для перевода десятичного числа в двоичную систему счисления.
     *
     * Разбивает число по цифрам. Возвращает List<String>.
     */
    public static List<String> toBinary(int num) {
        return Arrays.asList(Integer.toBinaryString(num).split(""));
    }
}