package ru.iveen.book;
/*
 * @created 30.09.2021 - 20:29
 * @project 30_09_21
 * @author Polyakov Anton
 */
public class Author {
    private final String author;

    public Author(String author) {
        this.author = author;
    }

    public void show() {
        System.out.println("Author: " + author);
    }
}