package ru.rudenko;

public class Parity {
    public static boolean checkParityByBinary(int argument) {
        String binaryArgument = Integer.toBinaryString(argument);
        char lastChar = binaryArgument.charAt(binaryArgument.length() - 1);
        return lastChar == '0';
    }
}
