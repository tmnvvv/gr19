package ru.iveen.secondlesson;

import java.util.HashMap;
import java.util.Map;

public class LogicOperations {
    public static Map<String, Integer> operation(int x, int y, int z) {
        Map<String, Integer> out = new HashMap<String, Integer>();
        x += y >> x++ * z;
        z = ++x & y * 5;
        y /= x + 5 | z;
        z = x++ & y * 5;
        x = y << x++ ^ z;
        out.put("x", x);
        out.put("y", y);
        out.put("z", z);
        return out;
    }
}