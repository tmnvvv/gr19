package ru.rudenko;

public class PowerOfTwo {
    public static boolean checkPowerOfTwo(int argument) {
        String binaryArgument = Integer.toBinaryString(argument);
        int counter = 0;
        for (int i = 0, n = binaryArgument.length(); i < n; i++) {
            char c = binaryArgument.charAt(i);
            if (c == '1') {
                counter++;
            }
        }

        return counter == 1;
    }
}
