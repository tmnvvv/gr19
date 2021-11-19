package ru.rudenko.task11_10.cat;

/*
 * @created 11/10/2021
 * @project Cat
 * @author Rudenko, Latushkin
 */

/*
 * ref: https://docs.google.com/document/d/1PymZPGVmXkfXIrJgvUJ-hogpxi1CW07lUOu1b2K8z08/edit
 */
public class Cat implements Cloneable {
    private double weight;
    private int meowCount = 0;
    private boolean liveStatus = true;
    private boolean tailStatus = true;
    private double foodWeight = 0;
    private static int count = 0;
    private final int eyesCount = 2;
    private final double minWeight = 1.1;
    private final double maxWeight = 5.0;
    private CatColor color;

    public Cat(double weight, CatColor color) {
        this.weight = weight;
        Cat.count++;
        this.color = color;
    }

    /**
     * @return Вес кошки
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @return Статус жизни
     */
    public boolean isLiveStatus() {
        return liveStatus;
    }

    /**
     * @return Статус хвоста
     */
    public boolean isTailStatus() {
        return tailStatus;
    }

    /**
     * @return Общий вес еды
     */
    public double getFoodWeight() {
        return foodWeight;
    }

    /**
     * @return количество кошек
     */
    public static int getCount() {
        return count;
    }

    /**
     * @return Цвет кошки
     */
    public CatColor getColor() {
        return color;
    }

    /**
     * Устанавливает цвет кошки
     *
     * @param color цвет кошки
     */
    public void setColor(CatColor color) {
        this.color = color;
    }

    /**
     * Кормит кошку
     *
     * @param foodWeight Вес еды
     */
    public void feed(double foodWeight) {
        if (!liveStatus) {
            System.out.println("Кошка замяукана");
        } else {
            if (this.weight > 5.0 || foodWeight - this.weight > 5.0) {
                System.out.println("Кошка перекормлена");
            }
            System.out.println(this.weight);
            this.weight += foodWeight;
            this.foodWeight += foodWeight;
        }
    }

    /**
     * Мяукает кошку
     */
    public void meow() {
        if (this.meowCount > 10) {
            this.liveStatus = false;
            System.out.println("Кошка замяукана");
            Cat.count--;
        } else {
            this.meowCount++;
        }
    }

    public void pee() {
        if (!liveStatus) {
            System.out.println("Кошка замяукана");
        } else {
            this.weight -= 10.0;
            System.out.println("Вес кошки уменьшился");
        }
    }

    @Override
    public Cat clone() {
        try {
            return (Cat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
