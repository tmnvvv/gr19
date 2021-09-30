package ru.rudenko.task30_09.book;

/*
 * @author Rudenko, Latuskin
 * @created 30/09/2021
 * @project Book
 */

public class Book {
    private Title title;
    private Content content;
    private Author author;

    /**
     * @param title
     * @param content
     * @param author
     */
    public Book(Title title, Content content, Author author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    /**
     * Выводит информацию о книге
     */
    public void show() {
        title.show();
        content.show();
        author.show();
    }
}
