package ru.rudenko.task30_09.printer;

/**
 * @author Rudenko
 * @created 30/09/2021
 * @project AnotherPrinter
 */
public class AnotherPrinter extends Printer {
    @Override
    public void print(String arg) {
        System.out.println(ANSI_GREEN + arg + ANSI_RESET);
    }
}
