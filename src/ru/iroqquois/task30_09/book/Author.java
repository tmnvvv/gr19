package ru.rudenko.task30_09.book;

/*
 * @author Rudenko, Latuskin
 * @created 30/09/2021
 * @project Author
 */

public class Author {
    private final String author;

    public Author(String author) {
        this.author = author;
    }

    /**
     * Выводит информцию о авторе
     */
    public void show() {
        System.out.println("Автор: " + author);
    }
}
