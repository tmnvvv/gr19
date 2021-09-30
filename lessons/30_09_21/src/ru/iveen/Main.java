package ru.iveen;

import ru.iveen.book.Book;

/*
 * @created 30.09.2021 - 20:25
 * @project 30_09_21
 * @author Polyakov Anton
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10);
        System.out.println(rectangle.areaCalculator());
        System.out.println(rectangle.perimeterCalculator());

        Book book = new Book("Стив Макконнелл", "Совершенный код", "контееент");
        book.show();
    }
}