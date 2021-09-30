package ru.rudenko.task30_09;

/*
 * @author Rudenko, Latuskin
 * @created 30/09/2021
 * @project Main
 */

import ru.rudenko.task30_09.book.Author;
import ru.rudenko.task30_09.book.Book;
import ru.rudenko.task30_09.book.Content;
import ru.rudenko.task30_09.book.Title;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.side1 = 10;
        rectangle.side2 = 30;
        System.out.println(rectangle.perimeterCalculator(rectangle.side1, rectangle.side2));
        System.out.println(rectangle.areaCalculator(rectangle.side1, rectangle.side2));

        Title title = new Title("Нейромант");
        Content content = new Content("Контет");
        Author author = new Author("Гибсон");

        Book book = new Book(title, content, author);
        book.show();
    }
}
