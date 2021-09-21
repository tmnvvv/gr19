package ru.iveen.secondlesson;

import java.util.List;
import ru.iveen.secondlesson.tools.ToBinary;

public class PowerOfTwo {
    /**
     * Метод для проверки поступаемого числа @digit на причастность к 2 степени.
     *
     * Возвращает "true", если число является степенью двойки.
     * Возвращает "false", если число не является степенью двойки.
     */
    public static boolean powerOfTwo(int num){
        List<String> transformedToBinary = ToBinary.toBinary(num);
        return transformedToBinary.stream().filter(x -> Integer.parseInt(x) == 1).count() == 1;
    }
}