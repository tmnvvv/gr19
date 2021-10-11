package ru.rudenko.task11_10.cat;

/*
 * @created 11/10/2021
 * @project Cat
 * @author Rudenko
 */

/*
 * ref: https://docs.google.com/document/d/1PymZPGVmXkfXIrJgvUJ-hogpxi1CW07lUOu1b2K8z08/edit
 */
public class Main {
    public static void main(String[] args) {
        // Урок 1
        Cat cat = new Cat(3.0);

        System.out.println("Вес кошки: " + cat.getWeight());
        cat.feed(1.0);
        System.out.println("Вес кошки: " + cat.getWeight());
        cat.feed(5.0);
        System.out.println("Вес кошки: " + cat.getWeight());
        cat.feed(5.0);
        System.out.println("Вес кошки: " + cat.getWeight());

        for (int i = 0; i < 20; i++) {
            cat.meow();
            if (cat.getLiveStatus()) {
                System.out.println("Кошка жива");
            } else {
                System.out.println("Кошка замяукана");
            }
        }
    }
}
