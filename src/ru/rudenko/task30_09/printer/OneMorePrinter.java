package ru.rudenko.task30_09.printer;

/**
 * @author Rudenko
 * @created 30/09/2021
 * @project OneMorePrinter
 */

/**
 * ref: https://docs.google.com/document/d/1X8c_KuZ8hvAo1krStu9UOi05icX950ZF1ETNYVOUojM/edit
 */
public class OneMorePrinter extends Printer{

    /**
     * Метод выводит переданное сообщение с определённым цветом текста
     *
     * @param arg Аргумент для вывода
     */
    @Override
    public void print(String arg) {
        System.out.println(ANSI_YELLOW + arg + ANSI_RESET);
    }
}
