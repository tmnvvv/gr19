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
     * @param title   Название книги
     * @param content Контент книги
     * @param author  Автор книги
     */
    public Book(String title, String content, String author) {
        this.title = new Title(title);
        this.content = new Content(content);
        this.author = new Author(author);
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
