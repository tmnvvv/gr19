package ru.iveen.book;
/*
 * @created 30.09.2021 - 20:29
 * @project 30_09_21
 * @author Polyakov Anton
 */
public class Book {
    private Author author;
    private Title title;
    private Content content;

    public Book(String author, String title, String content) {
        this.author = new Author(author);
        this.title = new Title(title);
        this.content = new Content(content);
    }

    public void show() {
        author.show();
        title.show();
        content.show();
    }
}