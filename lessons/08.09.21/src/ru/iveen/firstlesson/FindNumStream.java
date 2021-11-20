package ru.iveen.firstlesson;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import static java.lang.Math.max;
import static java.lang.Math.abs;

public class FindNumStream {
    public OptionalInt findNum(int[] nums, int requestNum) {
    return ( Arrays.stream(nums).reduce((x, y) -> abs(x - requestNum) < abs(y - requestNum)
            ? x: abs(x - requestNum) == abs(y - requestNum) ? max(x, y) : y) );
    }
}