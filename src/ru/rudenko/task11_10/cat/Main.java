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
//        first();
//        second();
        third();
    }

    /**
     * Второе задание
     */
    public static void first() {
        Cat cat = new Cat(3.0, CatColor.BLACK);

        System.out.println("Вес кошки: " + cat.getWeight());
        cat.feed(1.0);
        System.out.println("Вес кошки: " + cat.getWeight());
        cat.feed(5.0);
        System.out.println("Вес кошки: " + cat.getWeight());
        cat.feed(5.0);
        System.out.println("Вес кошки: " + cat.getWeight());

        for (int i = 0; i < 20; i++) {
            cat.meow();
            if (cat.isLiveStatus()) {
                System.out.println("Кошка жива");
            } else {
                System.out.println("Кошка замяукана");
            }
        }
    }

    /**
     * Второе задание
     */
    public static void second() {
        Cat cat = new Cat(5.0, CatColor.RED);
        cat.feed(150.0);
        cat.feed(150.0);
        cat.pee();
        cat.pee();
        System.out.println("Колиство съеденной еды второй кошки: " + cat.getFoodWeight());
        System.out.println("Вес кошки: " + cat.getWeight());
    }

    /**
     * Третья задача
     */
    public static void third() {
        Cat cat = new Cat(4.0, CatColor.YELLOW);
        Cat secondCat = cat.clone();
        System.out.println(cat.hashCode());
        System.out.println(secondCat.hashCode());
    }
}
