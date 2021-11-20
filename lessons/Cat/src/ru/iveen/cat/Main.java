package ru.iveen.cat;

/*
 * @created 12.10.2021 - 0:22
 * @project ru.iveen.cat.Cat
 * @author Polyakov Anton
 */
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(3200);
        Cat cat2 = new Cat(2990);
        Cat cat3 = new Cat(4512);
        System.out.println(cat3.getColor());
        System.out.println("\nВес первой кошки до принятия пищи - " + cat1.getWeight());
        cat1.feed(150);
        System.out.println("Вес первой кошки после принятия пищи - " + cat1.getWeight());
        cat1.pee();
        cat1.pee();
        System.out.println("Первая кошка всего съела " + cat1.getTotalAte() + " грамм еды");

        System.out.println("\nВес второй кошки до принятия пищи - " + cat2.getWeight());
        cat2.feed(55);
        System.out.println("Вес второй кошки после принятия пищи - " + cat2.getWeight());

        System.out.println("\nКоличество экземпляров класса Cat до замяукивания кошки cat1 - " + Cat.getCount());
        while (cat1.isAlive()) {
            cat1.meow();
        }
        System.out.println("Количество экземпляров класса Cat после замяукивания кошки cat1 - " + Cat.getCount());

        System.out.println("\nПроцесс перекармлевания кошки cat2");
        while (cat2.isAlive()) {
            cat2.feed(200);
        }
    }

    private static Cat getKitten() {
        return new Cat(1100);
    }
}
