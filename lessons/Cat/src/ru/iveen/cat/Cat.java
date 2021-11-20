package ru.iveen.cat;
/*
 * @created 12.10.2021 - 0:23
 * @project ru.iveen.cat.Cat
 * @author Polyakov Anton
 */

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Cat {
    private enum Colors {
        BLACK,
        RUSSET,
        WHITE,
        SPOTTED_WHITE,
        SPOTTED_BLACK
    }
    private final double minWeight = 1100;
    private final double maxWeight = 7500;
    private final int eyeCount = 2;

    private Colors color;
    private static int count;
    private int meowCount;
    private double weight;
    private double totalAte;
    private boolean isAlive;
    private boolean hasTail;
    private Random random = new Random();

    public Cat() { // Конструктор под создание объекта класса с характеристиками по умолчанию
        this.weight = 0;
        this.isAlive = true;
        this.color = Colors.values()[random.nextInt(Colors.values().length)]; // генерация рандомного цвета кошки из enum
        this.hasTail = true;
        count += 1;
    }

    public Cat(double weight) { // Конструктор под создание объекта класса с указанием веса
        this.weight = weight;
        this.isAlive = true;
        this.color = Colors.values()[random.nextInt(Colors.values().length)]; // генерация рандомного цвета кошки из enum
        this.hasTail = true;
        count += 1;
    }

    public Cat(Cat cat) { // Конструктор под копию кошки
        this.weight = cat.getWeight();
        this.isAlive = cat.isAlive();
        this.color = cat.getColor();
        this.hasTail = cat.hasTail();
        this.totalAte = cat.getTotalAte();
        this.meowCount = cat.getMeowCount();
        count += 1;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public boolean hasTail() {
        return this.hasTail;
    }

    public Colors getColor() {
        return this.color;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getMeowCount() {
        return this.meowCount;
    }

    public double getTotalAte() {
        return this.totalAte;
    }

    public void feed(double gram) {
        this.weight += gram;
        this.totalAte += gram;
        if (this.weight > this.maxWeight && random.nextBoolean()) {
            this.isAlive = false;
            System.out.println("Кошка взорвалась от переедания!");
        }
    }

    public void setColor(String color) {
        try {
            this.color = Colors.valueOf(color.toUpperCase(Locale.ROOT));
        } catch (Exception e) {
            System.out.println("Такого окраса нет. Выберите из списка: " + Arrays.toString(Colors.values()));
        }
    }

    public void pee() {
        double min = 10.0; // Минимальная потеря веса
        double max = 123.9; // Максимальная потеря веса

        double weightDifference = (min + (max - min) * random.nextDouble());
        this.weight -= weightDifference;
        System.out.println("Кошка стала легче на " + weightDifference + " грамм");
        if (this.weight < this.minWeight) {
            this.isAlive = false;
            System.out.println("Кошка умерла от недовеса.");
        }
    }

    public void meow() {
        if (this.meowCount > 100) {
            this.isAlive = false;
            count -= 1;
            System.out.println("Кошка замяукана до смерти.");
        } else {
          this.meowCount += 1;
        }
    }

    public static int getCount() {
        return count;
    }
}