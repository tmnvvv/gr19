package ru.rudenko.task30_09.book;

/*
 * @author Rudenko, Latuskin
 * @created 30/09/2021
 * @project Title
 */

public class Title {
    private final String title;

    public Title(String title) {
        this.title = title;
    }

    /**
     * Выводит информацию о названии книги
     */
    public void show() {
        System.out.println("Название: " + title);
    }
}
