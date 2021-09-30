package ru.rudenko.task30_09;

/*
 * @author Rudenko, Latuskin
 * @created 30/09/2021
 * @project Main
 */

import ru.rudenko.task30_09.book.Book;

/**
 * Входная точка для задач
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.perimeterCalculator());
        System.out.println(rectangle.areaCalculator());

        Book book = new Book("Нейромант", "Контет", "Гибсон");
        book.show();
    }
}
