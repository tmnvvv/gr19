package ru.rudenko.task30_09.printer;

import java.util.Random;

/*
 * @author Rudenko
 * @created 30/09/2021
 * @project Printer
 */
public class Printer {
    protected static final String ANSI_RESET = "\u001B[0m";
    protected static final String ANSI_GREEN = "\u001B[32m";
    protected static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Printer");

        AnotherPrinter anotherPrinter = new AnotherPrinter();
        anotherPrinter.print("Extends Printer");

        OneMorePrinter oneMorePrinter = new OneMorePrinter();
        oneMorePrinter.print("Extends Printer");
    }

    public void print(String arg) {
        System.out.println(arg);
    }
}
