package ru.iveen.secondlesson;

import java.util.List;
import ru.iveen.secondlesson.tools.ToBinary;

public class Parity {
    /**
     * Метод для проверки поступаемого числа @digit на чётность.
     *
     * Возвращает "true", если число является чётным.
     * Возвращает "false", если число не является чётным.
     */
    public static boolean parity(int num) {
        List<String> transformedToBinary = ToBinary.toBinary(num);
        return Integer.parseInt(transformedToBinary.get(transformedToBinary.size()-1)) == 0;
    }
}