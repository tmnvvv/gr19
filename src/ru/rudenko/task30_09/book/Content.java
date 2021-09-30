package ru.rudenko.task30_09.book;

/*
 * @author Rudenko, Latuskin
 * @created 30/09/2021
 * @project Content
 */

public class Content {
    private final String content;

    public Content(String content) {
        this.content = content;
    }

    /**
     * Выводит информацию о контенте
     */
    public void show() {
        System.out.println("Контент: " + content);
    }
}
