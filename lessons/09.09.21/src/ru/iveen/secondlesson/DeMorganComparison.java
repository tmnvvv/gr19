package ru.iveen.secondlesson;

public class DeMorganComparison {
    public static boolean comparison(boolean a, boolean b) {
        return (a | b) == !(!a & !b);
    }
}