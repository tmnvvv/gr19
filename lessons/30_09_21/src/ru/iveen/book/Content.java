package ru.iveen.book;
/*
 * @created 30.09.2021 - 20:29
 * @project 30_09_21
 * @author Polyakov Anton
 */
public class Content {
    private final String content;

    public Content(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println("Content: " + content);
    }
}