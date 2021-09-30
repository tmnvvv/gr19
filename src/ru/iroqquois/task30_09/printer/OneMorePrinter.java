package ru.rudenko.task30_09.printer;

/**
 * @author Rudenko
 * @created 30/09/2021
 * @project OneMorePrinter
 */
public class OneMorePrinter extends Printer{
    @Override
    public void print(String arg) {
        System.out.println(ANSI_YELLOW + arg + ANSI_RESET);
    }
}
