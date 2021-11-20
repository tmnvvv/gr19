package ru.iveen.book;
/*
 * @created 30.09.2021 - 20:29
 * @project 30_09_21
 * @author Polyakov Anton
 */
public class Title {
    private final String title;

    public Title(String title) {
        this.title = title;
    }

    public void show() {
        System.out.println("Title: " + title);
    }
}