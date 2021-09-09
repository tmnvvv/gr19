package ru.rudenko;

public class LogicOperations {
    public static void doOperations(int x, int y, int z) {
        x += y >> x++ * z;
        System.out.println(x);
        z = ++x & y * 5;
        System.out.println(z);
        y /= x + 5 | z;
        System.out.println(y);
        z = x++ & y * 5;
        System.out.println(z);
        x = y << x++ ^ z;
        System.out.println(x);
    }
}